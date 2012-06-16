grammar DateParser_en;

tokens {
	PLUS			= '+' ;
	MINUS			= '-' ;
	COMMA			= ',' ;
}

@header {
package com.eblackwelder.date;

import java.util.Calendar;
}
@lexer::header {
package com.eblackwelder.date;
}

@members {
    private final DateDelegate delegate = new DateDelegate();
}


/**
 * Parser Rules
 */

date_string returns [java.util.Date date]:
	(
		EOF
		| date_expression date_modifier?
		| date_modifier
	)
	{ date = delegate.getDate(); }
;

binary_operator returns [int direction]:
	PLUS	{ direction = 1; }
	| MINUS	{ direction = -1; }
;

date_modifier:
	binary_operator numberExpression unitsOfTime { delegate.add($unitsOfTime.unit, $binary_operator.direction * $numberExpression.value); }
;

date_expression:
	date_literal
	| nextOrLastExpression
	| weekdayExpression
	| numberExpression unitsOfTime (
		ago { delegate.add($unitsOfTime.unit, -1 * $numberExpression.value); }
		| from date_expression { delegate.add($unitsOfTime.unit, 1 * $numberExpression.value); }
		| beforeOrAfter date_expression { delegate.add($unitsOfTime.unit, $beforeOrAfter.direction * $numberExpression.value); }
	)
;

weekdayExpression:
	weekday { delegate.setDayOfWeek($weekday.value); }
;

numberExpression returns [int value]:
	(the | A)			{ value = 1; }
	| number_literal	{ value = Integer.parseInt($number_literal.text); }
	| number_word		{ value = $number_word.value; }
;

number_word returns [int value]:
	one		{ value = 1; }
	| two	{ value = 2; }
	| three	{ value = 3; }
	| four	{ value = 4; }
	| five	{ value = 5; }
	| six	{ value = 6; }
	| seven	{ value = 7; }
	| eight	{ value = 8; }
	| nine	{ value = 9; }
	| ten	{ value = 10; }
;

number_literal:
	NUMBER_LITERAL
;

/**
 * Matches "Now", "yesterday", "today", "tomorrow" (case-insensitive).
 * Sets delegate to the specific literal date.
 */
date_literal:
	now			{ delegate.today(); }
	| yesterday	{ delegate.yesterday(); }
	| today		{ delegate.today(); }
	| tomorrow	{ delegate.tomorrow(); }
;

/**
 * Matches a day-of-the-week: Monday, etc. (case-insensitive).
 * Returns the int value corresponding to the appropriate Calendar.DAY_OF_WEEK. 
 */
weekday returns [int value]:
	monday		{ $value = Calendar.MONDAY; }
	| tuesday	{ $value = Calendar.TUESDAY; }
	| wednesday	{ $value = Calendar.WEDNESDAY; }
	| thursday	{ $value = Calendar.THURSDAY; }
	| friday	{ $value = Calendar.FRIDAY; }
	| saturday	{ $value = Calendar.SATURDAY; }
	| sunday	{ $value = Calendar.SUNDAY; }
;

/**
 * Matches "before" or "after" (case-insensitive).
 * Returns 1 (after) or -1 (before).
 */
beforeOrAfter returns [int direction]:
	before	{ direction = -1; }
	| after	{ direction = 1; }
;

/**
 * Matches strings like "next week" or "last Tuesday" (case-insensitive).
 * 
 */
nextOrLastExpression:
	next (
		unitsOfTime	{ delegate.add($unitsOfTime.unit, 1); }
		| weekday	{ delegate.setNextOccurrenceDayOfWeek($weekday.value); }
	)
	| last (
		unitsOfTime	{ delegate.add($unitsOfTime.unit, -1); }
		| weekday	{ delegate.setLastOccurrenceDayOfWeek($weekday.value); }
	)
;

unitsOfTime returns [int unit]:
	(day|days)			{ unit = Calendar.DAY_OF_YEAR; }
	| (week|weeks)		{ unit = Calendar.WEEK_OF_YEAR; }
	| (month|months)	{ unit = Calendar.MONTH; }
	| (year|years)		{ unit = Calendar.YEAR; }
;

yesterday:	Y E S T E R D A Y ;
today:		T O D A Y ;
tomorrow:	T O M O R R O W ;

day:		D A Y ;
days:		D A Y S ;
week:		W E E K ;
weeks:		W E E K S ;
month:		M O N T H ;
months:		M O N T H S ;
year:		Y E A R ;
years:		Y E A R S ;

monday:		M O N D A Y	;
tuesday:	T U E S D A Y ;
wednesday:	W E D N E S D A Y ;
thursday:	T H U R S D A Y ;
friday:		F R I D A Y ;
saturday:	S A T U R D A Y ;
sunday:		S U N D A Y ;

one:	O N E ;
two:	T W O ;
three:	T H R E E ;
four:	F O U R ;
five:	F I V E ;
six:	S I X ;
seven:	S E V E N ;
eight:	E I G H T ;
nine:	N I N E ;
ten:	T E N ;

next:		N E X T ;
last:		L A S T ;
before:		B E F O R E ;
after:		A F T E R ;

the:		T H E ;
ago:		A G O ;
from:		F R O M ;
now:		N O W ;

NUMBER_LITERAL	: ('0'..'9')+ ;
NEWLINE			: '\r'? '\n'		{ $channel = HIDDEN; } ;
WS				: (' '|'\t')+		{ $channel = HIDDEN; } ;

A: 'A'|'a' ;
B: 'B'|'b' ;
C: 'C'|'c' ;
D: 'D'|'d' ;
E: 'E'|'e' ;
F: 'F'|'f' ;
G: 'G'|'g' ;
H: 'H'|'h' ;
I: 'I'|'i' ;
J: 'J'|'j' ;
K: 'K'|'k' ;
L: 'L'|'l' ;
M: 'M'|'m' ;
N: 'N'|'n' ;
O: 'O'|'o' ;
P: 'P'|'p' ;
Q: 'Q'|'q' ;
R: 'R'|'r' ;
S: 'S'|'s' ;
T: 'T'|'t' ;
U: 'U'|'u' ;
V: 'V'|'v' ;
W: 'W'|'w' ;
X: 'X'|'x' ;
Y: 'Y'|'y' ;
Z: 'Z'|'z' ;
