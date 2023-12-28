import java.io.*;
import java.util.*;

// run this through powershell if you can

class Factorial{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        int answer = 1;
        while (num > 0){
            answer = answer * num;
            num--;
        }
        System.out.println(answer);
        sc.close();
    }
}