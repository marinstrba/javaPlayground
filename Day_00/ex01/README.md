# Prime Number Checker
This Java program takes a number input from the user and determines whether it is a prime number or not. A prime number is a number that has no dividers other than 1 and itself. In addition to checking for prime numbers, the program also displays the number of iterations (comparison operations) required to perform the check.

# Notes
The program will display the "Illegal Argument" message and exit with a status code of -1 if a non-integer value is entered or if the entered integer is less than or equal to 1.
The program uses a simple loop to check for prime numbers, starting from 2 up to the square root of the entered integer. If any factor is found, the program immediately exits the loop and displays "False" along with the number of iterations it took to determine the result.
If no factors are found, the program displays "True" along with the number of iterations it took to determine the result.