Use of dependency injection and IoC:

Every Service states their dependencies instead of fulfilling it direclty, and Spring IOC Container takes care of
dependency injection

-> instead of the developer fulfilling the classes dependencies, he leaves it to the IoC container, and this is
inversion of control.

Dependency injection is achieved through the @Autowired annotation

-- Entities:

- Task (many to many with Category)
- Category
- Priority (Enum)

-- Dockerization:

First, run build the project with `mvn clean package -Dmaven.test.skip=true -X`

Then use `docker compose up -d --build` to build and then run the MySQL and the app containers in one command