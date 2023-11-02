# User ID Generator

This project provides a way to generate unique user IDs, similar to the autoincrement principle used in modern database management systems. Each new ID is the value of the previously generated ID + 1.  

## Classes

The project consists of two main classes:  

### `UserIdsGenerator`
 
The `UserIdsGenerator` class is responsible for generating unique user IDs. It contains a single instance variable, `lastGeneratedId`, which stores the last generated ID. The class provides a single method, `generateId`, which returns a newly generated ID each time it is called.  

### `User`

The `User` class represents a user and contains three instance variables: `ID`, `name`, and `balance`. The `ID` variable is unique for each user and is generated using the `UserIdsGenerator` class. The `name` and `balance` variables store the user's name and account balance, respectively. The class also provides a `printConsole` method, which prints the user's details to the console. 

### `Program` 

The `Program` class contains the `main` method, which  creates, initializes, and prints the contents of `User`   objects to the console.  

## Example Usage  

Here's an example of how to use the classes:  

```java  
public class Program    
{
    public static void main(String[] args)  
    {
        User p1 = new User("Mike",  2600);  
        User p2 = new User("John",  1000);  
        User p3 = new User("Nikol", 1500);  

        p1.printConsole();  
        p2.printConsole();  
        p3.printConsole();  
    }  
}  
