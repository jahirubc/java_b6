import java.sql.SQLOutput;

public class SecondClassAssignement {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 50, 60, 100, 80};
        int[] b = {1, 2, 3, 3, 4, 5};
        int n = 5;
        String s = "madam";

        System.out.println("Sum of Array: " + sumOfArray(a));
        System.out.println("Max value of array: " + maxvalueofarray(a));
        countevenodd(a);
        reverseArray(a);
        System.out.println();
        System.out.println("Factorial: " + factorial(n));
        System.out.println("Palindrome for Madam is " + checkPalindrom(s));
        checkPrime(n);
        Fibonacci(n);
        System.out.println();
        if (linearSearch(a, n)) System.out.println("Linear Search value " + n + " found");
        else System.out.println("Linear Search value " + n + " not found");

        if (binarySearch(a, n)) System.out.println("Binary Search value " + n + " found");
        else System.out.println("Binary Search value " + n + " not found");

        System.out.println("Duplicate element in array: " + duplicateElement(b));

        vowelCheck(s);
        System.out.println("Multiplication Table for " + n + "is: ");
        multiplicationTable(n);


        //  int[] a = {50,50,51};
        int[][] x = {{1, 2, 3}, {4, 5, 6}};
        int[][] y = {{1, 2, 3}, {4, 5, 6}};
        System.out.println("Matrix Addition Result: ");
        matrixAddition(x, y);
        System.out.println("Average value of array element: " + averageofArray(a));
        int year = 2018;
        leapyear(year);

        System.out.println("Pyramid Pattern:");
        pyramidpattern(5);
        reverseString(s);
        System.out.println();
        int z = 153;
        System.out.println("Armstrong check: "+isArmstrong(z));

        maxminCheck(a);
    }

    public static int sumOfArray(int[] b) {
        int sum = 0;
        for (int i = 0; i < b.length; i++) {
            sum = sum + b[i];
        }
        return sum;
    }

    public static int maxvalueofarray(int[] b) {
        int max = -1;
        for (int i = 0; i < b.length; i++) {
            if (max < b[i]) {
                max = b[i];
            }
        }
        return max;
    }

    public static void countevenodd(int[] a) {
        int evenCount = 0;
        int oddCount = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                evenCount++;
            } else oddCount++;
        }
        System.out.println("Even Count is: " + evenCount);
        System.out.println("Odd Count is: " + oddCount);
    }

    public static void reverseArray(int[] a) {
        int[] b = new int[a.length];
        int j = 0;

        for (int i = a.length - 1; i >= 0; i--) {
            b[j] = a[i];
            j++;
        }
        System.out.print("Reverse Array Result: ");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + ",");
        }
    }

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static boolean checkPalindrom(String s) {
        String temp = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            temp = temp + s.charAt(i);
        }
        //System.out.println(temp);
        if (temp.equals(s)) return true;
        else return false;
    }

    public static void checkPrime(int n) {
        int m = 0, flag = 0;
        if (n == 0 || n == 1) {
            System.out.println(n + " is not prime number");
        } else {
            for (int i = 2; i <= n; i++) {
                if (n % i == 0) {
                    System.out.println(n + " is not prime number");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(n + " is prime number");
            }
        }
    }

    public static void Fibonacci(int n) {
        int firstValue = 1, secondValue = 1;
        System.out.print("Fibonacci: ");
        for (int i = 0; i < n; i++) {
            System.out.print(firstValue + " ");
            int nextValue = firstValue + secondValue;
            firstValue = secondValue;
            secondValue = nextValue;
        }
    }

    public static boolean linearSearch(int[] a, int x) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) return true;
        }
        return false;
    }

    public static boolean binarySearch(int[] a, int x) {
        int l = 0;
        int h = a.length - 1;
        while (l <= h) {
            int mid = (l + h) / 2;
            if (a[mid] == x) return true;
            else if (a[mid] > x) h = mid - 1;
            else l = mid + 1;
        }
        return false;
    }

    public static boolean duplicateElement(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) return true;
            }
        }
        return false;
    }

    public static void vowelCheck(String s) {
        int vowel = 0;
        int cons = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u' ||
                    s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U') {
                vowel++;
            } else cons++;
        }
        System.out.println("Total Vowel: " + vowel);
        System.out.println("Total Cons: " + cons);
    }

    public static void multiplicationTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }
    }

    public static void matrixAddition(int[][] a, int[][] b) {
        int[][] result = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static float averageofArray(int[] a) {
        float sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        return (sum / a.length);
    }

    public static void leapyear(int n) {
        if ((n % 4 == 0 && n % 100 != 0) || (n % 400 == 0)) System.out.println("The year " + n + " is a leap year");
        else System.out.println("The year " + n + " is not a leap year");
    }

    public static void pyramidpattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void reverseString(String s) {
        System.out.println("Reverse of given string is: ");
        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.print(s.charAt(i));
        }
    }

    public static boolean isArmstrong(int n){
        int digtis = 0, temp;
        temp = n;
        int sum = 0;
        while (temp > 0){
            temp = temp /10;
            digtis++;
        }
        temp = n;
        while(temp > 0){
            int lastDigits = temp % 10;
            sum = (int) (sum + Math.pow(lastDigits, digtis));
            temp = temp/10;
        }
        if (sum == n) return true;
        return false;
    }

    public static void maxminCheck(int[] a){
        int max = a[0];
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) max = a[i];
            else if (a[i] < min) min = a[i];
        }
        System.out.println("Max value of Array: "+ max);
        System.out.println("Min value of Array: "+ min);
    }
}
