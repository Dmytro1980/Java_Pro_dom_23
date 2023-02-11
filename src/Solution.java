
public class Solution {
    public static void main(String[] args) {

        // проверка чисел типа int
        System.out.println("isOdd() 2 3 int");
        checkInt(1, 2);
        checkInt(1, 3);
        System.out.println();

        System.out.println("isPrime() 7 9 10 11 int");
        checkInt(2, 7);
        checkInt(2, 9);
        checkInt(2, 10);
        checkInt(2, 11);
        System.out.println();

        System.out.println("isPalindrome() 111, 112, 12321 int");
        checkInt(3, 111);
        checkInt(3, 112);
        checkInt(3, 12321);
        System.out.println();

        // проверка строки
        System.out.println("isOdd() 2 3 String");
        checkStr("1 2");
        checkStr("1 3");
        System.out.println();

        System.out.println("isPrime() 7 9 10 11 String");
        checkStr("2 7");
        checkStr("2 9");
        checkStr("2 10");
        checkStr("2 11");
        System.out.println();

        System.out.println("isPalindrome() 111, 112, 12321 String");
        checkStr("3 111");
        checkStr("3 112");
        checkStr("3 12321");
        System.out.println();

        // проверка длинной строки, с указанием количества тестов
        System.out.println("long string: 6 1 2 1 3 2 9 2 11 3 112 3 12321");
        String stringFromInput = "6 1 2 1 3 2 9 2 11 3 112 3 12321";
        checkStr2(stringFromInput);

    }

    public static void checkInt(int x, int y) {
        switch (x) {
            case 1 -> {
                if (isOdd().check(y)) {
                    System.out.println("ODD"); // не четный
                } else {
                    System.out.println("EVEN"); // четный
                }
            }
            case 2 -> {
                if (isPrime().check(y)) {
                    System.out.println("PRIME");
                } else {
                    System.out.println("COMPOSITE");
                }
            }
            case 3 -> {
                if (isPalindrome().check(y)) {
                    System.out.println("PALINDROME");
                } else {
                    System.out.println("NOT PALINDROME");
                }
            }
        }
    }

    public static void checkStr(String s) {

        int x = Integer.parseInt(s.substring(0, 1));
        int y = Integer.parseInt(s.substring(1).trim());
        switch (x) {
            case 1 -> {
                if (isOdd().check(y)) {
                    System.out.println("ODD"); // не четный
                } else {
                    System.out.println("EVEN"); // четный
                }
            }
            case 2 -> {
                if (isPrime().check(y)) {
                    System.out.println("PRIME");
                } else {
                    System.out.println("COMPOSITE");
                }
            }
            case 3 -> {
                if (isPalindrome().check(y)) {
                    System.out.println("PALINDROME");
                } else {
                    System.out.println("NOT PALINDROME");
                }
            }
        }
    }

    public static void checkStr2(String s) {
        int num = Integer.parseInt(s.substring(0, 1));
        String[] parts = (s.substring(1)).trim().split(" ");
        for (int i = 0; i < num; i += 2, num++) {
            int x = Integer.parseInt(parts[i]);
            int y = Integer.parseInt(parts[i + 1]);
            switch (x) {
                case 1 -> {
                    if (isOdd().check(y)) {
                        System.out.println("ODD"); // не четный
                    } else {
                        System.out.println("EVEN"); // четный
                    }
                }
                case 2 -> {
                    if (isPrime().check(y)) {
                        System.out.println("PRIME");
                    } else {
                        System.out.println("COMPOSITE");
                    }
                }
                case 3 -> {
                    if (isPalindrome().check(y)) {
                        System.out.println("PALINDROME");
                    } else {
                        System.out.println("NOT PALINDROME");
                    }
                }
            }
        }
    }

    public static PerformOperation isOdd() {
        return s -> s % 2 != 0;
    }

    public static PerformOperation isPrime() {
        return ((num) -> {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        });
    }

    public static PerformOperation isPalindrome() {
        return s -> String.valueOf(s).equals(new StringBuilder(String.valueOf(s)).reverse().toString());
    }
}

