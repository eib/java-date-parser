java-date-parser
================

A natural-language date-parser (ANTLR-based).


Examples
========
Date literals:
* now
* today
* tomorrow
* yesterday

Next/last:
* next Friday
* last Tuesday
* last week
* next year
* next month

Before/after:
* the week before last Tuesday
* the day after tomorrow
* 2 days before yesterday

From/ago:
* 2 days from now
* one month from tomorrow
* 3 years ago

Addition/subtraction:
* today + 5 weeks
* yesterday - 2 weeks


Notes
-----
* The grammar is case insensitive.
* Interval units include: days, weeks, months, and years.
* Interval values can be specified with numbers or with text (but only "one" to "ten" are supported).


License
=======

MIT license: http://eib.mit-license.org/

