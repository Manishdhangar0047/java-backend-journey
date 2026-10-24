public class Methods {

    public static boolean isEven(int n) {

        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int square(int n) {
        return n * n;
    }

    public static int cube(int n) {
        return n * n * n;
    }

    public static void greet(String name) {
        System.out.println("Hello " + name + "!");

    }

    public static long factorial(int n) {

        long fact = 1; //use long to solve  integer overflow
        for (int i = n; i >= 1; i--) {
            fact = fact * i;

        }

        return fact;

    }

    public static void main(String[] args) {

        System.out.println(isEven(4));
        System.out.println(isEven(7));
        System.out.println(isEven(0));
        System.out.println(square(5));
        System.out.println(cube(5));
        greet("Manish");
        greet("Nishant");
        System.out.println(factorial(5));
        System.out.println(factorial(0));
        System.out.println(factorial(13));
        System.out.println(factorial(20));
        System.out.println(factorial(21));
    }
}

