Author: Tal Weissler

This program reads data of office reservations from a .csv file and with the input of a specific month it produces statistics regarding that month, including revenue and the total capacity of the unreserved offices.

Running instructions:

1. Clone the project to your workspace (import it as a Maven project)
2. Run the project as a Java Application (the main class is home.assignment.office_manager.App)
3. Input a date (month and year) and receive the monthly statistics!
***The project needs to use Java 1.7 and above, please see that your IDE supports that (if you're having trouble with it please contact me).

Results:

2013-01: expected revenue: $8,100.00, expected total capacity of the unreserved offices: 254
2013-06: expected revenue: $15,150.00, expected total capacity of the unreserved offices: 241
2014-03: expected revenue: $37,214.52, expected total capacity of the unreserved offices: 203
2014-09: expected revenue: $86,700.00, expected total capacity of the unreserved offices: 120
2015-07: expected revenue: $76,225.81, expected total capacity of the unreserved offices: 135


Answers to given questions: 

1. It took about 2.5 hours to design and write the code and then another hour for testing, writing the README, creating a repository, ext.
2. How to handle the .csv file (is it a DB? should I retrieve data using "queries"? does it change?).
3. I would test it more throughly (it takes forever to manually check every input).


Assumptions:

1. Valid input is assumed and not verified (of both the .csv file and the date input)
2. The .csv file, as a real DB, may change with time so the data is never stored locally for longer than one call.
