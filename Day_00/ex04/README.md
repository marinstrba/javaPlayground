# Character Occurrences Histogram Tool

This tool is designed to count the occurrences of characters in a text and display the results in a histogram. The histogram will show the 10 most frequently occurring characters in descending order.

## Description

- The program takes a single string as input, with a single "\n" character at the end.
- The histogram will display the 10 most frequently occurring characters in descending order.
- If characters have the same number of occurrences, they will be sorted in lexicographic order.
- The maximum height of the displayed chart is 10, and the minimum is 0.
- Each character may occur in text a great number of times, with the maximum number of occurrences being 999.

## Important Notes

- The program must not use multiple iterations over the source text for sorting and removing repetitions, as these methods will significantly slow down the application. Other information processing methods should be used.

## Example of Program Operation

$ java Program  

->   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAASSSSSSSSSSSSSSSSSSSSSSSSDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDWEWWKFKKDKKDSKAKLSLDKSKALLLLLLLLLLRTRTETWTWWWWWWWWWWOOOOOOO42

 36  
  #  35  
  #   #
  #   #  27  
  #   #   #  
  #   #   #    
  #   #   #  
  #   #   #  14  12  
  #   #   #   #   #   9  
  #   #   #   #   #   #   7   4  
  #   #   #   #   #   #   #   #   2   2  
  D   A   S   W   L   K   O   T   E   R  