# mysql-demo
Demo of Mysql JPA Lombok Web


1. Install Mysql 
2. Create a database in the mysql shell
     create database mysql_demo; 

If you give your root user a password other than root you need to change it in the properties file.

The port is set to 8081

To create a user:

http://localhost:8081/create?email=emailname@yahoo.com&name=Jerry

To find by email address:

http://localhost:8081//get-by-email?email=emailname@yahoo.com

To delete a user:

http://localhost:8081/delete?id=2

To Update a user:

http://localhost:8081/update?id=1&email=joe@joe.com&name=Joseph


Key places to look 
Pom file has the mysql and jpa starter


Lombok is a great tool to include in your projects. The @Data creates the getters and setters for you.
Properties file has the connection and config parameters.





