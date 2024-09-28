package tasks_20092024;

import java.util.Scanner;

public class Task_LeapYear {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year to check LeapYear or not : ");
        int year = sc.nextInt();

        if((year%4 ==0)&& (year % 100 != 0 || year % 400 == 0)){
            System.out.println(year+" is a Leap Year");
        }
        else{
            System.out.println(year+" is not a Leap Year");
        }
    }
}


/*
Output:

Enter the year to check LeapYear or not :
1900
1900 is not a Leap Year

 */

/*
Output:

Enter the year to check LeapYear or not :
2024
2024 is a Leap Year

 */