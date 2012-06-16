package com.eblackwelder.date;

public class CreateLetterRules {

  /**
   * Prints out all alpha characters for creating case-insensitive ANTLR tokens.
   * @param args ignored
   */
  public static void main(String[] args) {
    for (int ii = 0; ii < 26; ii++) {
      char lc = (char) ('a' + ii);
      char uc = (char) ('A' + ii);
      System.out.println(uc + ": '" + uc + "'|'" + lc + "' ;");
    }
  }

}
