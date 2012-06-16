package com.eblackwelder.date;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateDelegateDemo {
  private static DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.MEDIUM);

  /**
   * Demonstrates the correctness of various public (API) DateDelegate methods.
   * @param args
   */
  public static void main(String[] args) {
    
    DateDelegate demo = new DateDelegate();
    showDate(demo.getDate(), "today");
    demo.yesterday();
    showDate(demo.getDate(), "yesterday");
    demo.today();
    showDate(demo.getDate(), "today");

    demo.tomorrow();
    demo.setNextOccurrenceDayOfWeek(Calendar.MONDAY);
    showDate(demo.getDate(), "next monday");
    demo.tomorrow();
    demo.setNextOccurrenceDayOfWeek(Calendar.TUESDAY);
    showDate(demo.getDate(), "next tuesday");
    demo.tomorrow();
    demo.setNextOccurrenceDayOfWeek(Calendar.WEDNESDAY);
    showDate(demo.getDate(), "next wednesday");
    demo.tomorrow();
    demo.setNextOccurrenceDayOfWeek(Calendar.THURSDAY);
    showDate(demo.getDate(), "next thursday");
    demo.tomorrow();
    demo.setNextOccurrenceDayOfWeek(Calendar.FRIDAY);
    showDate(demo.getDate(), "next friday");
    demo.tomorrow();
    demo.setNextOccurrenceDayOfWeek(Calendar.SATURDAY);
    showDate(demo.getDate(), "next saturday");
    demo.tomorrow();
    demo.setNextOccurrenceDayOfWeek(Calendar.SUNDAY);
    showDate(demo.getDate(), "next sunday");

    demo.yesterday();
    demo.setLastOccurrenceDayOfWeek(Calendar.MONDAY);
    showDate(demo.getDate(), "last monday");
    demo.yesterday();
    demo.setLastOccurrenceDayOfWeek(Calendar.TUESDAY);
    showDate(demo.getDate(), "last tuesday");
    demo.yesterday();
    demo.setLastOccurrenceDayOfWeek(Calendar.WEDNESDAY);
    showDate(demo.getDate(), "last wednesday");
    demo.yesterday();
    demo.setLastOccurrenceDayOfWeek(Calendar.THURSDAY);
    showDate(demo.getDate(), "last thursday");
    demo.yesterday();
    demo.setLastOccurrenceDayOfWeek(Calendar.FRIDAY);
    showDate(demo.getDate(), "last friday");
    demo.yesterday();
    demo.setLastOccurrenceDayOfWeek(Calendar.SATURDAY);
    showDate(demo.getDate(), "last saturday");
    demo.yesterday();
    demo.setLastOccurrenceDayOfWeek(Calendar.SUNDAY);
    showDate(demo.getDate(), "last sunday");
  }
  
  public static void showDate(Date date, String description) {
    System.out.println(description + ": " + dateFormat.format(date));
  }
}
