/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.accumulo.core.util.shell;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * A token is a word in a command in the shell.  The tree that this builds is used for
 * tab-completion of tables, users, commands and certain other parts of the shell that
 * can be realistically and quickly gathered. Tokens can have multiple commands grouped 
 * together and many possible subcommands, although they are stored in a set so duplicates
 * aren't allowed.
 */

public class Token {
  static int GLOBAL_ID = 0;
  private int id = ++GLOBAL_ID;
  private Set<String> command = new HashSet<String>();
  private Set<Token> subcommands = new HashSet<Token>();
  boolean caseSensitive = false;
  
  Token() {}
  
  Token(String commandName) {
    this();
    command.add(commandName);
  }
  
  Token(Collection<String> commandNames) {
    this();
    command.addAll(commandNames);
  }
  
  Token(Set<String> commandNames, Set<Token> subCommandNames) {
    this();
    command.addAll(commandNames);
    subcommands.addAll(subCommandNames);
  }
  
  /*
   * Does a search on the command tree to find the command with the right id under the start Token;
   */
  public static Token findCommand(Token start, int find_id) {
    if (start != null) {
      if (start.getID() == find_id)
        return start;
      
      if (start.getSubcommandList() != null) {
        for (Token t : start.getSubcommandList()) {
          Token f = findCommand(t, find_id);
          if (f != null)
            return f;
        }
      }
    }
    return null;
  }
  
  public void setCaseSensitive(boolean cs) {
    caseSensitive = cs;
  }
  
  public boolean getCaseSensitive() {
    return caseSensitive;
  }
  
  public int getID() {
    return id;
  }
  
  public Set<String> getCommandNames() {
    return command;
  }
  
  public Set<String> getCommandNames(String match) {
    Set<String> set = new HashSet<String>();
    for (String s : command) {
      if (s.startsWith(match)) {
        set.add(s);
      }
    }
    return set;
  }
  
  public Set<Token> getSubcommandList() {
    return subcommands;
  }
  
  public Token getSubcommand(String name) {
    Iterator<Token> iter = subcommands.iterator();
    while (iter.hasNext()) {
      Token t = iter.next();
      if (t.containsCommand(name))
        return t;
    }
    return null;
  }
  
  public Set<String> getSubcommandNames() {
    HashSet<String> set = new HashSet<String>();
    for (Token t : subcommands)
      set.addAll(t.getCommandNames());
    return set;
  }
  
  public Set<String> getSubcommandNames(String startsWith) {
    Iterator<Token> iter = subcommands.iterator();
    HashSet<String> set = new HashSet<String>();
    while (iter.hasNext()) {
      Token t = iter.next();
      Set<String> subset = t.getCommandNames();
      for (String s : subset) {
        if (!t.getCaseSensitive()) {
          if (s.toLowerCase().startsWith(startsWith.toLowerCase())) {
            set.add(s);
          }
        } else {
          if (s.startsWith(startsWith)) {
            set.add(s);
          }
        }
      }
    }
    return set;
  }
  
  public boolean containsCommand(String match) {
    Iterator<String> iter = command.iterator();
    while (iter.hasNext()) {
      String t = iter.next();
      if (caseSensitive) {
        if (t.equals(match))
          return true;
      } else {
        if (t.equalsIgnoreCase(match))
          return true;
      }
    }
    return false;
  }
  
  public void addSubcommand(Token t) {
    subcommands.add(t);
  }
  
  public void addSubcommand(Collection<String> t) {
    for (String a : t) {
      addSubcommand(new Token(a));
    }
  }
  
  public void addSubcommand(Set<Token> t) {
    for (Token a : t) {
      addSubcommand(a);
    }
  }
  
}
