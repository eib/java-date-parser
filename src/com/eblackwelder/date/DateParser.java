package com.eblackwelder.date;

import java.util.Calendar;
import java.util.Date;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.TokenStream;

/**
 * A helper-class for performing natural-language date-parsing.
 * 
 * Accepted date formats (case insensitive):
 * <dl>
 * <dt>Date "literals":</dt>
 * <dd>tomorrow|yesterday|today|now</dd>
 * 
 * <dt>"Next" or "Last":</dt>
 * <dd>next|last &lt;weekday&gt;</dd>
 * <dd>next|last week|month|year</dd>
 * 
 * <dt>"Before", "After", "From"</dt>
 * <dd>one month from now</dd>
 * <dd>the week before last tuesday</dd>
 * <dd>the &lt;unit&gt; before|after &lt;date-expression&gt;</dd>
 * 
 * <dt>Numeric expressions</dt>
 * <dd>3 years ago</dd>
 * <dd>&lt;number-expression&gt; &lt;unit&gt;s ago</dd>
 * <dd>1 week before yesterday</dd>
 * <dd>[number] &lt;unit&gt;[s]? before|after &lt;date-expression&gt;</dd>
 * 
 * <dt>Numeric addition/subtraction:</dt>
 * <dd>today + 5 weeks</dd>
 * <dd>&lt;expression&gt; &lt;binary-operator&gt; &lt;number&gt; &lt;unit&gt;[s]?</dd>
 * </dl>
 * 
 * Un-accepted date formats:
 * <pre>
 * concatenated +/- INTERVAL expressions: (TODO)
 * today - 1 month - 3 weeks - 2 days
 * today - 1 month 3 weeks 2 days
 * today - 1 month, 3 weeks, and 2 days
 * Essentially, something like this:
 * &lt;date-expression&gt; (&lt;binary-operator&gt; &lt;number&gt; &lt;unit&gt;[s]? ([,]? [and]? &lt;number&gt; &lt;unit&gt;)? ) 
 * 
 * Holidays: (TODO)
 * last Christmas
 * New Year's [Eve|Day]
 * next Easter, Mother's Day, etc.
 *   
 * Time:
 * this time last year
 * five o'clock on wednesday
 * tomorrow at noon
 * 5:00 pm
 * 0400 hours
 * half-past two
 * a quarter past five
 * ...
 * </pre>
 * 
 * @author EthanB
 */
public class DateParser {

	/**
	 * Attempts to parse a natural-language date-string.
	 * @param dateString Some natural-language date-string.
	 * @return A correctly parsed date.
	 * @throws RecognitionException If there are parsing errors.
	 * @see #safeParseDate(String)
	 */
	public static Date parseDate(String dateString) throws RecognitionException {
		CharStream charStream = new ANTLRStringStream(dateString);
		DateParser_enLexer lexer = new DateParser_enLexer(charStream);
		TokenStream tokenStream = new CommonTokenStream(lexer);
		ErrorReportingDateParser parser = new ErrorReportingDateParser(tokenStream);
		Date date = parser.date_string();
		if (parser.exception != null) {
			throw parser.exception;
		}
		return date;
	}
	
	/**
	 * Parses dateString, but doesn't throw RecognitionExceptions. 
	 * @param dateString Some natural-language date string
	 * @return A correctly parsed date; if there were parsing errors, then returns the current date.
	 * @see #parseDate(String)
	 */
	public static Date safeParseDate(String dateString) {
		Date date;
		try {
			date = parseDate(dateString);
		} catch (RecognitionException e) {
			date = Calendar.getInstance().getTime();
		}
		return date;
	}
	
	static class ErrorReportingDateParser extends DateParser_enParser {

		public RecognitionException exception;
		
		public ErrorReportingDateParser(TokenStream input) {
			super(input);
		}

		public ErrorReportingDateParser(TokenStream input, RecognizerSharedState state) {
			super(input, state);
		}
		
		@Override
		public void reportError(RecognitionException e) {
			exception = e;
		}
		
	}
}
