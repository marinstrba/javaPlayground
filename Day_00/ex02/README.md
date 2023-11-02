# Coffee Query Counter ☕️
Welcome to the Coffee Query Counter program! This project is designed to process a flow of search queries related to coffee preparation in real-time.
  
## How it works
The program reads a sequence of natural numbers (excluding 0 and 1) as search queries. Each query is analyzed to   determine if it is related to coffee preparation. A query is deemed related to coffee preparation if the sum of the digits of the query is a prime number. The program then counts the number of queries that are related to coffee preparation and outputs the total.

## Implementation
The Main class in Main.java contains the main logic of the program. The run method reads the input sequence of queries and processes each query to determine if it is related to coffee preparation. It does this by first validating the input, then summing the digits of the query, and finally checking if the sum is a prime number. If the sum is prime, the query is counted as related to coffee preparation. The program continues to process queries until it reads the number 42, which is the last element of the sequence.

Thank you for using the Coffee Query Counter program! Enjoy counting your coffee-related queries! ☕️📊