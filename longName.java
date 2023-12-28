import java.io.*;
import java.util.*;

// run this through powershell if you can

class longName{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = 0;
        String name = "";
        while (true){
            String input = sc.nextLine();
            if (input.equals("X")){
                System.out.println(name);
                break;
            }
            else{
                if (input.length() > length){
                    name = input;
                    length = input.length();
                }
            }
        }
        sc.close();
    }
}