# RESTChatAPI

## Problem Statement
We need a basic but configurable chat API to push and retrieve messages inputted in live time by the user.

## Solution
Make the thing! We'll use IntelliJ with Jersey to create a basic REST service that implements message insert/retrieval, as well as accommodating app-side user authentication and attaching users to each message.

## Technologies

 Database - MySql
    Store tables for Users and Messages
 Api
     /All
     /Delete - removes message from DB/display
     /Recent - shows all message "history" up to 50 messages
     
 Logging
        Log4J
        
 Unit Testing
        Junit
        
 Database CRUD
        Hibernate
        
 Return formats
        JSON
        text
        HTML
        jQuery


## Database:
Chat

## Tables:

### Messages
ID - int(20) AUTO PRIMARY KEY
message - varchar(200)
timestamp - TIMESTAMP
userID - int(20) FOREIGN KEY (Users)

### Users
userID - int(20) AUTO PRIMARY KEY
username - varchar(20)


## First Checkpoint: 

* GET message - Return list of last 20 messages, sorted by most recent first.
Returns JSON array of message objects.

## Second Checkpoint

* POST message - Add a new message to the table.
Returns confirmation code.

## Third Checkpoint

* GET message - Return list of all 50 messages
* update PUT to trim oldest messages if 50+ exist
* add userID parameter to PUT message insert, and GET to get all messages by userID

## Fourth Checkpoint

* GET - most recent message, listens and sends only on new message insert

