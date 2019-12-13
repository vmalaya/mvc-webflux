build application
```cmd
mvnw -pl r2dbc/app
```
up database
```cmd
mvnw -f r2dbc/postgres/pom.xml docker-compose:up
```
migration
```cmd
mvnw -pl r2dbc/app process-resources flyway:migrate
```
run application
```cmd
java -jar r2dbc/app/target/app.jar
```
down database
```cmd
mvnw -f r2dbc/postgres/pom.xml docker-compose:down
```
