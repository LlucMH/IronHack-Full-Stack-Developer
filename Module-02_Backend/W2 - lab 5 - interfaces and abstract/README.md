# 1.08: Interfaces and Abstract Classes

## Instructions
1. Create a new GitHub repository named Enterprise-Java-Development-1.08.
2. Add your instructor and the class graders as collaborators to your repository. Make sure that your repository is set to private. Public repositories will receive a zero on the assignment. If you are unsure who your class graders are, ask your instructor or refer to the day 1 slide deck.
3. In the repository, create a Java project and add the code for the following prompts.
4. Once you have finished the assignment, submit a URL link to your repository below.

## Specifications

### BigDecimal Operations
1. Using the `BigDecimal documentation`, create a method that accepts a `BigDecimal` and returns a `double` of the `BigDecimal` number rounded to the nearest hundredth. For example, `4.2545` should return `4.25`.
2. Using the `BigDecimal documentation`, create a method that accepts a `BigDecimal`, reverses the sign (if the parameter is positive, the result should be negative and vice versa), rounds the number to the nearest tenth and returns the result. For example, `1.2345` should return `-1.2` and `-45.67` should return `45.7`.

### Car Inventory System
1. Suppose you are building a car inventory system. All cars have a `vinNumber`, `make`, `model` and `mileage`. But no car is just a car. Each car is either a `Sedan`, a `UtilityVehicle` or a `Truck`.
2. Create an abstract class named `Car` and define the following properties and behaviors:
    - `vinNumber`: a `String` representing the VIN number of the car
    - `make`: a `String` representing the make of the car
    - `model`: a `String` representing the model of the car
    - `mileage`: an `int` representing the mileage of the car
    - `getInfo()`: a `method` that returns a `String` containing all of the car’s properties in a readable format
3. Create three classes that extend `Car`: `Sedan`, `UtilityVehicle` and `Truck`.
4. `UtilityVehicle` objects should have an additional `fourWheelDrive` property, a `boolean` that represents whether the vehicle has four-wheel drive.
5. `Truck` objects should have an additional `towingCapacity` property, a `double` that represents the towing capacity of the truck.

### Video Streaming Service
1. Suppose you are building a video streaming service. All videos are either TV series or movies.
2. Create an abstract class named Video and define the following properties and behaviors:
    - `title`: a `String` representing the title of the video
    - `duration`: an `int` representing the duration of the video in minutes
    - `getInfo()`: a `method` that returns a `String` containing all of the video’s properties in a readable format
3. Create two classes that extend `Video`: `TvSeries` and `Movie`.
4. `TvSeries` objects should have an additional `episodes` property, an `int` representing the number of episodes in the series.
5. `Movie` objects should have an additional `rating` property, a `double` representing the rating of the movie.

### IntList Interface
1. Create an `IntList` interface with the following methods:
    - `add(int number)`: a method that adds a new number to the list
    - `get(int id)`: a method that retrieves an element by its ID
2. Create two implementations of `IntList`: `IntArrayList` and `IntVector`.
3. `IntArrayList` should store numbers in an array with a length of 10 by default. When the `add` method is called, you must first determine if the array is full. If it is, create a new array that is 50% larger, move all elements over to the new array and add the new element. (For example, an array of length 10 would be increased to 15.)
4. `IntVector` should store numbers in an array with a length of 20 by default. When the `add` method is called, you must first determine if the array is full. If it is, create a new array that is double the size of the current array, move all elements over to the new array and add the new element. (For example, an array of length 10 would be increased to 20.)
5. In your `README.md`, include an example of when `IntArrayList` would be more efficient and when `IntVector` would be more efficient.