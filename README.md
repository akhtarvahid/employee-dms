# employee-dms


Postgres configuration

```json
# Paste in application.properties
spring.application.name=employee-dms
server.port=8888

# postgres configuration
spring.datasource.url=jdbc:postgresql://localhost:5454/postgres
spring.datasource.username=postgres
spring.datasource.password=postgres
spring.jpa.hibernate.ddl-auto=update

# Define specific driver to make it faster otherwise it will search default by going through entire
# spring.datasource.driver-class-name=org.postgresql.Driver
## Not required to use it explicitly
# spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.PostgreSQLDialect

# Hibernate ddl auto (create, create-drop, validate, update)
```

Run command to start postgres using docker

```json
docker run --name employee-dms -p 5454:5432 -e POSTGRES_PASSWORD=postgres -d postgres
```