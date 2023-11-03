# User Management System

## Overview
This User Management System is a simple Java application designed to manage user records. It stores user data such as name, ID, and balance. It utilizes a custom array list implementation to handle dynamic user lists.  

## Features
- **User IDs Generation**: Ensures unique ID for every user with a singleton pattern.
- **Dynamic User Array**: Automatically resizes the array when the capacity is reached.
- **Custom Exception Handling**: Throws a   `UserNotFoundException` for attempts to retrieve  non-existent user IDs.  

## Classes

### `User`
Represents a user with properties such as name, ID, and balance.  

### `UserIdsGenerator` 
A singleton class that generates unique IDs for each user.

### `UsersList` (Interface)
Defines the structure for user list implementations.  

### `UsersArrayList`
Implements the `UsersList` interface, manages the addition of users, and searches for users by ID or index.  

### `UserNotFoundException`
An unchecked exception that is thrown when attempts are made to access a user with an ID that does not exist in the list. 
