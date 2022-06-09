# How to Start project

## Prerequisites
-IntelliJ IDEA
- JDK11
- Docker

Environment setup
1. Open IntelliJ IDEA
2. File -> New -> Project from version control
3. insert on URL field: https://github.com/Miguel-99/ecommerce-backend-java-springboot-postgres.git an press clone

Database setup
1. open terminal
2. execute the next commands
3. `docker run --name postgres -e POSTGRES_PASSWORD=postgres -p 5432:5432 -d postgres`
4. `docker exec -it postgres bash`
5. `psql -U postgres`
6. `create database ecommerce;`
7. you can close the terminal 

Now you can start the app on intellij
