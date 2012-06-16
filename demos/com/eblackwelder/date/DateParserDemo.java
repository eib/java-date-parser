package com.eblackwelder.date;

import java.text.DateFormat;
import java.util.Date;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;

public class DateParserDemo {

  private static DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.MEDIUM);

  /**
   * Demonstrates DateParser correctly parsing various human-readable dates. 
   * @param args
   */
  public static void main(String[] args) throws Exception {
    String[] weekdays = {
        "sunday", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday"
    };
    String[][] dateGroups = {
        { "yesterday", "now", "today", "tomorrow" },
        { "next week", "next month", "next year" },
        {
          "a week before yesterday",
          "the day after tomorrow",
          "a week after sunday",
          "a week before last sunday"
        },
        {
          "5 weeks ago",
          "the day after tomorrow",
          "a week after sunday",
          "a week before last sunday",
          "three years from now",
          "three weeks from tomorrow",
        },
        {
          "now + 5 weeks",
          "a week ago + 7 days",
          "+ 1 year"
        }
    };
    
    for (String[] dateGroup : dateGroups) {
      for (String string : dateGroup) {
        demoString(string);
      }
      System.out.println();
    }

    for (String weekday : weekdays) {
      demoString(weekday);
    }
    System.out.println();
    
    for (String weekday : weekdays) {
      demoString("next " + weekday);
    }
    System.out.println();
    
    for (String weekday : weekdays) {
      demoString("last " + weekday);
    }
    System.out.println();
  }

  private static void demoString(String input) throws RecognitionException {
    System.out.print(input + ": ");
    Date date = parseDate(input);
    System.out.println(dateFormat.format(date));
  }

  private static Date parseDate(String dateString) throws RecognitionException {
    Date date = DateParser.parseDate(dateString);
    return date;
  }
}
