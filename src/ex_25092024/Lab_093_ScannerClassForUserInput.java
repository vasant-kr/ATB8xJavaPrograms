package ex_25092024;

import java.util.Scanner;

public class Lab_093_ScannerClassForUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        System.out.println(num+1);

        System.out.println("Enter the name: ");
        String name = sc.next();
        System.out.println(name+num);

    }
}

