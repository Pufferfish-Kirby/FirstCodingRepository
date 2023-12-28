import java.io.*;
import java.util.*;

// run this through powershell if you can

class Duplicates{
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            String input = sc.nextLine();
            if (input.equals("X")) {
                break;
            } else {
                nums.add(Integer.parseInt(input));
            }
        }
        ArrayList<Integer> cleared = new ArrayList<Integer>();
        for (int i : nums) {
            if (cleared.contains(i)) {
                continue;
            } else {
                cleared.add(i);
            }
        }
        System.out.println(cleared);
        sc.close();
    }
}
