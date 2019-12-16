build application
```cmd
mvnw -f r2dbc/app
```
up database
```cmd
mvnw -f r2dbc/postgres/pom.xml docker-compose:up
```
migration
```cmd
mvnw -f r2dbc/app process-resources flyway:migrate
```
run application
```cmd
java -jar r2dbc/app/target/app-0.0.1-SNAPSHOT.jar
```
run tests
```cmd
mvnw -f r2dbc/app -Ptest
```
down database
```cmd
mvnw -f r2dbc/postgres/pom.xml docker-compose:down
```
