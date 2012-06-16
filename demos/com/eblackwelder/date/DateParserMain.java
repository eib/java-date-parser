package com.eblackwelder.date;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.util.Date;

import org.antlr.runtime.RecognitionException;

/**
 * Interactive date-parsing demo:
 * Reads lines from standard in; writes the parsed dates to standard out.
 * 
 * @param args
 * @throws IOException
 */
public class DateParserMain {
	private static DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.MEDIUM);

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String nextLine;
		System.out.println("Date parser demo");
		System.out.println("================");
		System.out.println("Type a natural-language date, following by <Enter>");
		System.out.println("Type \"exit\", followed by <Enter> to close.");
		System.out.println();
		while ((nextLine = reader.readLine()) != null) {
			if (nextLine.isEmpty()) {
				continue;
			} else if ("exit".equalsIgnoreCase(nextLine) || "quit".equalsIgnoreCase(nextLine)) {
				break;
			} else {
				try {
					Date date = DateParser.parseDate(nextLine);
					System.out.println(dateFormat.format(date));
				} catch (RecognitionException e) {
					System.out.println("Invalid date string.");
				}
			}
		}
	}
	
}
