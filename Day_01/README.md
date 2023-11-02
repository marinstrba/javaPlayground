# Money Transfer System

This project simulates an internal money transfer system, where users can transfer money to each other and the system stores a record of all transactions as debit/ credit pairs. The goal is to ensure that the history of incoming and outgoing transfers for any user can be recovered, even if some data is lost.  
  
## Task

The task is to automate a business process associated with transferring amounts between participants of the system. We need to ensure that even if we lose the history  of incoming and outgoing transfers for a specific user, we can still  recover this information.    

## System Description

Each user can transfer a certain amount to another user. The system saves a record of the transaction for both users in   the form of debit/credit pairs.  
   
For example, if John transfers $500 to Mike, the system will save the transaction as follows:  
- John -> Mike, -500, OUTCOME, transaction ID  
- Mike -> John, +500, INCOME, transaction ID  
  
The identifiers of each transaction are used to recover the  connection within these pairs.  

## Exercises  

Here is a set of exercises to solve the task:  
1. Create a data structure to store the transaction history for each user.  
2. Implement functionality to perform a money transfer  between two users, updating their transaction history  accordingly.  
3. Implement functionality to display all transactions for   a specific user.  
4. Implement functionality to emulate and debug the loss of  a transfer entry for a user.  
5. Implement functionality to display all "unacknowledged   transfers" (transactions recorded for one user only).  
6. Implement functionality to resolve issues with   "unacknowledged transfers" by restoring the lost data.  