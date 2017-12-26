package hackerrank;

import java.util.Scanner;

public class Introduction {

    /**
     * The code stubs in your editor declare a Solution class and a main method.
     * Complete the main method by copying the two lines of code below and pasting them
     * inside the body of your main method.
     */
    public static void welcome(String[] args) {
        System.out.println("Hello, World.");
        System.out.println("Hello, Java.");
    }

    /**
     * In this challenge, you must read  integers from stdin and then print them to stdout.
     * Each integer must be printed on a new line.
     * To make the problem a little easier, a portion of the code is provided for you in the editor below.
     */
    public static void stdInStdOut1(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        System.out.println(a + "\n" + b + "\n" + c);
    }

    /**
     * Given an integer, n, perform the following conditional actions:
     * If n is odd, print Weird
     * If n is even and in the inclusive range of 2 to 5, print Not Weird
     * If n is even and in the inclusive range of 6 to 20, print Weird
     * If n is even and greater than 20, print Not Weird
     * Complete the stub code provided in your editor to print whether or not n is weird.
     */
    public static void ifElse(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String ans = "";
        if (n % 2 == 1) {
            ans = "Weird";
        } else {
            if ((2 <= n && n <= 5) ||
                    (n > 20)) {
                ans = "Not Weird";
            }
            if (6 <= n && n <= 20) {
                ans = "Weird";
            }
        }
        System.out.println(ans);

    }

    /**
     * In this challenge, you must read an integer, a double, and a String from stdin,
     * then print the values according to the instructions in the Output Format section below.
     * To make the problem a little easier, a portion of the code is provided for you in the editor.
     */
    public static void stdInStdOut2(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }

    /**
     * Java's System.out.printf function can be used to print formatted output.
     * The purpose of this exercise is to test your understanding of formatting output using printf.
     * To get you started, a portion of the solution is provided for you in the editor; you must format
     * and print the input to complete the solution.
     */
    public static void outputFormatting(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            System.out.printf("%-15s" + "%03d" + "\n", s1, x);
        }
        System.out.println("================================");
    }

    /**
     * In this challenge, we're going to use loops to help us do some simple math.
     */
    public static void loops1(String[] args) {
        Scanner in = new Scanner(System.in);
        final int N = in.nextInt();
        for (int i = 1; i <= 10; ++i) {
            System.out.println(N + " x " + i + " = " + N * i);
        }
    }

    public static void loops2(String []argh){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; ++i) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for (int j = 0; j < n; ++j) {
                a += (int)Math.pow(2, j) * b;
                System.out.print(a + " ");
            }
            System.out.println();
        }
        in.close();
    }




}