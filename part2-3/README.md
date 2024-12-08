## Use of dependency injection and IoC:

Every Service states their dependencies instead of fulfilling it direclty, and Spring IOC Container takes care of
dependency injection

-> instead of the developer fulfilling the classes dependencies, he leaves it to the IoC container, and this is
inversion of control.

Dependency injection is achieved through the @Autowired annotation (we could've done it through setter injection too)

## Entities:

- Task (many to many with Category)
- Category
- Priority (Enum)

The entities will be created automatically thanks to `spring.jpa.hibernate.ddl-auto=create
spring.jpa.generate-ddl=true` and the property `?createDatabaseIfNotExist=true` in `application.properties`
## Dockerization:

First, run build the project with `mvn clean package -Dmaven.test.skip=true -X`

Then use `docker compose up -d --build` to build and then run the MySQL and the app containers in one command
