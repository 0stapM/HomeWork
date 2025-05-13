import java.util.Scanner;

 class Homework {

    public static String getNameAndAge() {
        String name = "Name: Alexander";
        int age = 25;
        return name + ", Age: " + age;
    }

    public static void printMathOperations() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();

        System.out.println("Sum: " + (a + b));
        System.out.println("Difference: " + (a - b));
        System.out.println("Product: " + (a * b));
    }
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static boolean isDivisibleBy3And5(int number) {
        return number % 3 == 0 && number % 5 == 0;
    }

    public static double cube(double number) {
        return Math.pow(number, 3);
    }

    public static double squareRoot(double number) {
        return Math.sqrt(number);
    }

    public static boolean isRightTriangle(int a, int b, int c) {
        int x = Math.max(a, Math.max(b, c));
        int y, z;

        if (x == a) {
            y = b;
            z = c;
        } else if (x == b) {
            y = a;
            z = c;
        } else {
            y = a;
            z = b;
        }

        return x * x == y * y + z * z;
    }

    public static void main(String[] args) {
        System.out.println(getNameAndAge());

        printMathOperations();

        System.out.println("Is 4 even? " + isEven(4));
        System.out.println("Is 15 divisible by 3 and 5? " + isDivisibleBy3And5(15));
        System.out.println("Cube of 3: " + cube(3));
        System.out.println("Square root of 16: " + squareRoot(16));
        System.out.println("Can 3, 4, 5 form a right triangle? " + isRightTriangle(3, 4, 5));
    }
}