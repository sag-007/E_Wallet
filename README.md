# E_Wallet




This Project contain two independent micro services. They are WalletService & UserService.

"WalletService" is a Spring Boot JPA application that stores user wallet information.I have used MySql. On successful transaction we send sms and email to sender and receiver. WalletService communicate with UserService using RestTemplate . Also, written a transaction job that run every month and send transation history of a user on his mail id with proper file attachment .
"UserService" is a Spring Boot JPA application that stores user information. We have used MySql Databse.

This project is a built using Spring boot, Mysql.

Also, integrate with Swagger for API documentation.

![](/allusers.PNG)

**ALL USERS DATABASE**

![](/userservice.PNG)

**USER SERVICE**Microservice
