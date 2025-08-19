# Lab 4.02: Intro to Spring Boot 

## Instructions

1. Create a new GitHub repository named `Enterprise-Java-Development-4.02`.
2. Add your instructor and the class graders to your repository and ensure that your repository is private. Public repositories will receive a zero on the assignment.
3. If you are unsure who your class graders are, ask your instructor or refer to the day 1 slide deck.
4. Upload the code for all of the following prompts to your repository.
5. Submit a URL link to your repository below.

## Set up

For this lab, you will need to create two database tables and seed them with some sample data. The database data represents mock clients for a multi-city hospital.

**Employee Table**

| employee_id | department    | name              | status   |
|-------------|---------------|-------------------|----------|
| 356712      | cardiology    | Alonso Flores     | ON_CALL  |
| 564134      | immunology    | Sam Ortega        | ON       |
| 761527      | cardiology    | German Ruiz       | OFF      |
| 166552      | pulmonary     | Maria Lin         | ON       |
| 156545      | orthopaedic   | Paolo Rodriguez   | ON_CALL  |
| 172456      | psychiatric   | John Paul Armes   | OFF      |

<small> Note that admitted_by is a foreign key to the employee table. </small>

**Patient Table**

| patient_id | name                | date_of_birth | admitted_by |
|------------|---------------------|---------------|-------------|
| 1          | Jaime Jordan        | 1984-03-02    | 564134      |
| 2          | Marian Garcia       | 1972-01-12    | 564134      |
| 3          | Julia Dusterdieck   | 1954-06-11    | 356712      |
| 4          | Steve McDuck        | 1931-11-10    | 761527      |
| 5          | Marian Garcia       | 1999-02-15    | 172456      |

## Specifications
1. **Get all doctors:** Create a route to get all doctors.
2. **Get doctor by ID:** Create a route to get a doctor by `employee_id`.
3. **Get doctors by status:** Create a route to get doctors by `status`.
4. **Get doctors by department:** Create a route to get doctors by `department`.
5. **Get all patients:** Create a route to get all patients.
6. **Get patient by ID:** Create a route to get a patient by `patient_id`.
7. **Get patients by date of birth range:** Create a route to get patients date of birth within a specified range.
8. **Get patients by admitting doctor’s department:** Create a route to get patients by the department that their admitting doctor is in (For example, get all patients admitted by a doctor in cardiology).
9. **Get all patients with a doctor whose status is OFF:** Create a route to get all patients with a doctor whose `status` is OFF.

## FAQs

- **I am stuck and don't know how to solve the problem or where to start. What should I do?**

    If you are stuck in your code and don’t know how to solve the problem or where to start, you should take a step back and try to form a clear, straight forward question about the specific issue you are facing. The process you will go through while trying to define this question, will help you narrow down the problem and come up with potential solutions.

    For example, are you facing a problem because you don’t understand the concept or are you receiving an error message that you don’t know how to fix? It is usually helpful to try to state the problem as clearly as possible, including any error messages you are receiving. This can help you communicate the issue to others and potentially get help from classmates or online resources.

    Once you have a clear understanding of the problem, you should be able to start working toward the solution.


- **How do I create a Spring boot project?**

    Spring boot is a framework for creating stand-alone, production-grade applications that are easy to launch and run. The best way to create a Spring boot project is to use the Spring Initializer website. The website provides a convenient way to generate a basic project structure with all the necessary dependencies and configurations.

    - Step 1: Go to start.spring.io
    - Step 2: Choose the type of project you want to create, such as Maven or Gradle.
    - Step 3: Select the version of Spring Boot you want to use.
    - Step 4: Choose the dependencies you need for your project. Some common dependencies include web, jpa and data-jpa.
    - Step 5: Click the “Generate” button to download the project files.

    Alternatively, you can use an Integrated Development Environment (IDE) such as Eclipse or IntelliJ IDEA. These IDEs have plugins for creating Spring boot projects, making it easy to set up the environment and get started with coding.


- **What is JPA and how can I use it in Java?**

    JPA stands for Java Persistence API, which is a Java specification for accessing, persisting and managing data between Java objects and a relational database. JPA provides a standard interface for accessing databases, reducing the need for custom data access code and enabling efficient management of database connections.

    To use JPA in Java, you will need to include the necessary dependencies in your project, such as the Hibernate JPA implementation and create entity classes to represent your data. These entity classes will be annotated with JPA-specific annotations, such as @Entity and @Id, to indicate the mapping between the Java class and the database table.

    Here is a code snippet to show you how to create a JPA entity class in Java:

    ```java
    @Entity
    public class Employee {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    private String name;
    private int age;
    private String position;

    // Getters and Setters for the attributes
    }
    ```

    In this example, the `ExampleController` class is defined as a RESTful web service controller using the `@RestController` annotation. The `exampleMethod` is mapped to a specific HTTP GET request using the `@GetMapping("/example")` annotation and the HTTP status code for the response is set to `HTTP 200` OK using the `@ResponseStatus(HttpStatus.OK)` annotation.

- **What is the purpose of using the "@Entity", "@Table" and "@Column" annotations in JPA (Java Persistence API)?**

    The `@JsonIgnore` annotation is used in Jackson (a popular library for JSON processing) to ignore a property when serializing or deserializing an object to/from JSON. This means that when the object is converted to JSON, the property marked with `@JsonIgnore` will not be included in the JSON representation.

    The `@JsonIgnore` annotation is applied to a property in a Java class to ignore it during JSON serialization or deserialization. For example, consider a class named Employee with a property named “password”. To ignore the “password” property, we can annotate it with `@JsonIgnore`:

    ```java
    public class Employee {
    private String name;
    private int age;
    @JsonIgnore
    private String password;

    // getters and setters for the properties
    }
    ```

    When this class is serialized to JSON, the “password” property will not be included in the JSON representation.

- **What is "JpaRepository" and how can I use it in Java?**
    JpaRepository is a Spring Data interface that extends the PagingAndSortingRepository interface. It provides all the basic CRUD (Create, Read, Update, Delete) operations and additional methods to work with JPA (Java Persistence API) to interact with the database.

    To use JpaRepository in your project, follow the below steps:

    Step 1: Import the necessary libraries

    ```java
    import org.springframework.data.jpa.repository.JpaRepository;
    ```
    Step 2: Create an interface that extends JpaRepository
    ```java
    public interface MyRepository extends JpaRepository<MyEntity, Long> {
    }
    ```
    **Note:** In the above code, MyEntity is the entity class that you want to interact with the database and Long is the type of the primary key of MyEntity.

    Step 3: Inject the interface in the class where you want to use it.

    ```java
    @Autowired
    private MyRepository myRepository;
    ```
    Step 4: You can now use the methods provided by JpaRepository to interact with the database, for example:

    ```java
    MyEntity myEntity = new MyEntity();
    myRepository.save(myEntity);
    ```
    With the above steps, you can now use JpaRepository to interact with the database in your Java project.

- **What are derived query methods in JPA and how do I use them in Java?**
    Derived query methods in JPA are methods in a JPA repository that are automatically generated by the framework based on method names. These methods allow developers to perform common database operations such as finding entities based on specific criteria, sorting, pagination and more, without having to manually write the corresponding SQL query.

    To use derived query methods in Java with JPA, follow these steps:

    1. Create a JPA repository interface: To start, create an interface that extends JpaRepository and specifies the entity class and the primary key data type. For example: 

    ```java
    import org.springframework.data.jpa.repository.JpaRepository;
    import org.example.domain.User;

    public interface UserRepository extends JpaRepository<User, Long> {
    }
    ```
    2. Define the method name: Next, you can define the method name based on the query you want to perform. There are several conventions that JPA follows to determine the query to be executed, such as keywords such as findBy, readBy, queryBy, countBy and deleteBy, followed by the name of the entity’s properties. For example, to find all users with a specific first name, you can define the method name as follows:

    ```java
    List<User> findByFirstName(String firstName);
    ```
    3. Inject the repository: Finally, you can inject the repository into your service or component class and call the methods to perform the query operations.
    ```java
    @Autowired
    private UserRepository userRepository;

    public List<User> getUsersByFirstName(String firstName) {
    return userRepository.findByFirstName(firstName);
    }
    ```
    **Note:** The exact implementation of derived query methods may vary depending on the JPA implementation you are using (e.g., Hibernate, EclipseLink, etc.). However, the basic concept of using method names to generate queries remains the same.

- **How can I use the JPA annotations "@OneToOne", "@OneToMany", "@ManyToOne", "@ManyToMany", "@JoinColumn" and "@JoinTable" in Java?**

    The Java Persistence API (JPA) provides several annotations for mapping relationships between entities in Java applications. These annotations include:

    1. **@OneToOne:** This annotation is used to define a one-to-one relationship between two entities. The following code shows how to use the @OneToOne annotation:

    ```java
    @Entity
    public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Address address;

    // Getters and setters ...
    }

    @Entity
    public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String street;

    private String city;

    // Getters and setters ...
    }
    ```

    2. **@OneToMany & @ManyToOne:** These annotations are used to define one-to-many and many-to-one relationships between two entities.

    The following code shows how to use the @OneToMany and the @ManyToOne annotation:

    ```java
    @Entity
    public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "department")
    private List<Employee> employees;

    // Getters and setters ...
    }

    @Entity
    public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "department_id", referencedColumnName = "id")
    private Department department;

    // Getters and setters ...
    }
    ```
    3. **@ManyToMany & @JoinColumn & @JoinTable:** The @ManyToMany annotation is used in Java to define a many-to-many relationship between two entities. This means that multiple instances of one entity can be related to multiple instances of another entity.

    The @JoinColumn annotation is used in Java to specify the foreign key column that will be used to join the two entities. The foreign key column is used to establish a relationship between the entities.

    The @JoinTable annotation is used in Java to define a join table for a many-to-many relationship. The join table is used to store the relationship information between the two entities.

    The following code shows how to use the @ManyToMany, @JoinColumn and @JoinTable annotations:
    
    ```java
    @Entity
    public class User {

        @ManyToMany
        @JoinTable(name = "user_role",
        joinColumns = @JoinColumn(name = "user_id"),
        inverseJoinColumns = @JoinColumn(name = "role_id"))
        private List<Role> roles;

    }

    @Entity
    public class Role {

        @ManyToMany(mappedBy = "roles")
        private List<User> users;

    }
    ```
- **I am unable to push changes to my repository. What should I do?**

    If you are unable to push changes to your repository, here are a few steps that you can follow:

    1. Check your internet connection: Ensure that your internet connection is stable and working.
    2. Verify your repository URL: Make sure that you are using the correct repository URL to push your changes.
    3. Check Git credentials: Ensure that your Git credentials are up-to-date and correct. You can check your credentials using the following command:

    ```java
    git config --list
    ```
    4. Update your local repository: Before pushing changes, make sure that your local repository is up-to-date with the remote repository. You can update your local repository using the following command:
    ```java
    git fetch origin
    ```
    5. Check for conflicts: If there are any conflicts between your local repository and the remote repository, resolve them before pushing changes.
    6. Push changes: Once you have resolved any conflicts and updated your local repository, you can try pushing changes again using the following command:

    ```java
    git push origin <branch_name>
    ```