import java.util.*;

class Methods {
    /**
     * Turns an input into an integer
     *
     * @param no parameters needed
     *
     * @return a string converted into an integer, converted
     */
    public static int convertToInteger() {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        int converted = Integer.parseInt(num);
        sc.close();
        return converted;
    }

    /**
     * Adds three double inputs
     *
     * @param 3 doubles; num1, 2, and 3
     *
     * @return the sum of the doubles
     */
    public static double addThreeDoubles(double num1, double num2, double num3) {
        return num1 + num2 + num3;
    }

    /**
     * Checks if a number is prime
     *
     * @para an integer, num
     *
     * @return true if the number is prime, false otherwise
     */
    public static boolean isPrime(int num) {
        int counter = 0;
        for (int i = 2; i <= (int) num / 2; i++) {
            if (num % i == 0) {
                counter++;
            }
        }
        if (counter == 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * If inputted number is a factor of another inputted number
     *
     * @param 2 integers, a and b
     *
     * @return true is b is a factor of a, false otherwise
     */
    public static boolean isFactor(int a, int b) {
        if (a % b == 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Factors in an ArrayList of an Integer
     *
     * @param an integer, num
     *
     * @return an arraylist with all of num's factors
     */
    public static ArrayList listOfFactors(int num) {
        ArrayList<Integer> factors = new ArrayList<Integer>();
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors.add(i);
            }
        }
        return factors;
    }

    /**
     * Number of vowels in a String
     *
     * @param a string, text
     *
     * @return the number of vowels in the string as an integer
     */
    public static int numOfVowels(String text) {
        text = text.toUpperCase();
        char[] letters = text.toCharArray();
        int total = 0;
        for (char i : letters) {
            if (i == 'A' || i == 'E' || i == 'I' || i == 'O' || i == 'U') {
                total++;
            }
        }
        return total;
    }

    /**
     * Palindrome checker
     *
     * @param a String, word
     *
     * @return true if word is a palindrome, false otherwise
     */
    public static boolean palindromeChecker(String word) {
        char[] letters = word.toCharArray();
        char[] reversed = new char[word.length()];
        int counter = 0;
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed[counter] = letters[i];
            counter++;
        }
        String reverse = new String(reversed);
        if (word.equals(reverse)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Mean of doubles in an array
     *
     * @param a double array, nums
     *
     * @return a double, mean, representing the mean of these numbers
     */
    public static double mean(double[] nums) {
        double sum = 0;
        for (double i : nums) {
            sum += i;
        }
        double mean = sum / nums.length;
        return mean;
    }

    /**
     * Reverses an integer
     *
     * @param an integer, num
     *
     * @return num reversed
     */
    public static int reverseInt(int num) {
        double number = (double) num;
        double reversed = 0;
        for (int exponent = Integer.toString(num).length() - 1; exponent >= 0; exponent--) {
            double current_value = (number % 10) * Math.pow(10, exponent);
            reversed = reversed + current_value;
            number = Math.floor(number / 10);
        }
        return (int) reversed;
    }

    /**
     * Bubble sort an arraylist of integers
     *
     * @param an integer arraylist, ints
     *
     * @return the sorted list
     */
    public static ArrayList<Integer> bubbleSort(ArrayList<Integer> ints) {
        while (true) {
            int check = 0;
            int counter = 1;
            int indexcounter = 0;
            for (int i : ints) {
                if (counter == ints.size()) {
                    break;
                }
                if (i > ints.get(counter)) {
                    int temp = ints.get(counter);
                    ints.set(counter, i);
                    ints.set(indexcounter, temp);
                    counter++;
                    indexcounter++;
                } else {
                    counter++;
                    indexcounter++;
                }
            }

            counter = 1;
            for (int i : ints) {
                if (counter == ints.size()) {
                    break;
                }
                if (i < ints.get(counter)) {
                    check++;
                    counter++;
                } else {
                    counter++;
                }
            }
            if (check == 4) {
                return ints;
            } else {
                continue;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] nums = { 1, 2, 3, 4, 5 };
        System.out.println(isPrime(32));
        sc.close();
    }
}