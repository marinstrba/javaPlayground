# Student Progress Visualization Tool

This tool is designed for educational organizations and online schools to visualize students' progress over several weeks. It displays a chart showing the minimum grade for five tests within each week.

## Description

The customer evaluates the student's progress based on the minimum grade for five tests within each week. Each test can be graded between 1 and 9. The maximum number of weeks for the analysis is 18.

Once the program has obtained information for each week, it displays a graph on the console to show the minimum grades for that specific week.

## Important Notes

- The order of weekly data input is not guaranteed. Week 1's data can be entered after Week 2's data.
- If the data input order is wrong, an "IllegalArgument" message will be displayed, and the program will shut down with a -1 code.
- The exact guaranteed number of tests in a week is 5.
- Do not use string concatenation inside a loop to generate a result, as it may slow down the application significantly.

## Example of Program Operation

$ java Main  
-> Week 1  
-> 4 5 2 4 2  
-> Week 2  
-> 7 7 7 7 6  
-> Week 3  
-> 4 3 4 9 8  
-> Week 4  
-> 9 9 4 6 7  
Week 1 ==>  
Week 2 ======>  
Week 3 ===>  
Week 4 ====>  