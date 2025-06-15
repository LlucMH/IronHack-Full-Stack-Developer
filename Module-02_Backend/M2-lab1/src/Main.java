public class Main {
    public static void main(String[] args) {
        int[] array = {4, 2, 7, 1, 9};

        // Task 1
        int diff = MathTasks.diffMaxMin(array);
        System.out.println("Difference between max and min: " + diff);

        // Task 2
        MathTasks.findTwoSmallest(array);

        // Task 3
        double x = 3;
        double y = 5;
        double result = MathTasks.calculateExpression(x, y);
        System.out.println("Result of expression: " + result);
    }
}

class MathTasks {
    // Task 1
    // Write a Java method that returns the difference between the largest and smallest values in an array of integers.
    // The length of the array must be at least 1.
    public static int diffMaxMin(int[] array) {
        if (array.length < 1) throw new IllegalArgumentException("Array must have at least one element.");
        int max = array[0];
        int min = array[0];
        for (int num : array) {
            if (num > max) max = num;
            if (num < min) min = num;
        }
        return max - min;
    }

    // Task 2
    // Write a Java method that finds the smallest and second smallest elements of a given array and prints them to
    // the console.
    public static void findTwoSmallest(int[] array) {
        if (array.length < 2) {
            System.out.println("Array must contain at least two elements.");
            return;
        }
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int num : array) {
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }
        System.out.println("Smallest: " + smallest);
        System.out.println("Second Smallest: " + secondSmallest);
    }

    // Task 3
    // Write a Java method that calculates the result of the following mathematical expression, where x and y are
    // two variables that have been pre-set in your code: x^2 + ((4y/5) - x)^2
    public static double calculateExpression(double x, double y) {
        return Math.pow(x, 2) + Math.pow((4 * y / 5 - x), 2);
    }
}
0