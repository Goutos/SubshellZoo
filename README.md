# Goutos Zoo Application


## Description
This application is about a Zoo where the user can:
- Add animals
- Remove a specific animal
- Get a list of all stored animals
- Get a list of animals filtered by name
- Feed an animal (Increase it's weight)

### JDK version
The application makes use of OpenJDK-22

## How to test the API:
You can test all endpoints using Postman/Insomnia or any other Api testing platform of your choice.

For simplicity reasons I've included a http file under:
/main/resources/generated-requests.http

Make sure the application is running on port 8080 or modify the url to the port that you're using.

You can create your first animals using the /Animal POST endpoint. 
Then you can use the /Animals GET endpoint to retrieve the list of animals you have posted. 
There you will see the animals' UUID which you can use to test the other endpoints.
