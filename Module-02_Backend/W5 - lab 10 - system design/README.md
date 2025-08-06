# Lab 2.06: System Design 

## Instructions

1. Create a new GitHub repository named `Enterprise-Java-Development-2.06`
2. Add your instructor and the class graders to your repository and ensure that your repository is private. Public repositories will receive a zero on the assignment.
3. If you are unsure who your class graders are, ask your instructor or refer to the day 1 slide deck.
4. Upload the code for all of the following prompts to your repository.
5. Submit a URL link to your repository below.

## Specifications
1. Create a new Java project in your preferred development environment.
2. In the project, create a class called Student that contains the following properties:
    - `name`: String
    - `grade`: int (in the range 0-100)
3. Create a `Map` with a key of the student’s name (String) and a value of a `Student` object.
4. Create a method called `increaseGrades` that takes a `Map<String, Student>` as a parameter, increases every student’s grade by 10% and returns the updated map.
5. Create 4 Student objects for your classmates and add them to the `Map`.
6. Create a use case diagram and a class diagram for an online banking system. The system should have the following features:
    - Users can transfer funds, withdraw from their accounts and deposit to their accounts.
    - Admins can freeze accounts in the event of fraud.
    - Use the Money class in your class diagram.
