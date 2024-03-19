# COVID-19 vaccination with REST API 
I have developed REST API for Covid-19 Application. Application is able to perform all CRUD operation by Rest API.

## Tech Used 
- *Java* 
- *Spring Framework*
- *Spring Boot*
- *Spring Data JPA*
- *Hibernate*
- *MySQL*
- *Swagger*

## Modules
Login, Logout,  User Module, Admin Module

## Functions 

- User and Admin authentication & validation with session uuid having.
Admin Features:
- Administrator Role of the entire application
- Only registered admins with valid session token can add/update/delete driver or customer from main database
- Admin can access the details of different Appointment, Member ,Vaccine Center ,Vaccine Inventory and Vaccine Ragistration.
User Features:
- A user can register himself or herself on the platform.
- He/She can check the vaccine centres and vaccine availabilty.
- If vaccine is available, can book an appointment slot.
After booking an appointment, he will get appointment details for the vaccine dose.

# How to install 

Before running the API server, we have to update the database config inside the [application.properties](https://github.com/kafeelkh/vaccination_system/blob/main/src/main/resources/application.properties) file.
Update the port number, username and password as per your local database config.







