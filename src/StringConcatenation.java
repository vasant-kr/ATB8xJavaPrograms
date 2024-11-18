public class StringConcatenation {

    public static void main(String[] args) {
        //String is a class in java
        /*
        String is non-primitive
         */

        String s = "hello ";
        String ss = "world";
        System.out.println(s+ss); // prints hello world

        String s1 = "100";
        System.out.println(s1+20); // prints 10020

        int a =100;
        int b = 200;
        String x = "Hello";
        String y = "Selenium";
        System.out.println(a+b+x+y); // prints 300HelloSelenium
        System.out.println(x+y+a+b); // prints HelloSelenium100200
        System.out.println(x+y+(a+b)); //// prints HelloSelenium300

        byte h = 065;
        System.out.println(h); // prints 53 as any num that starts with 0 is octal number

    }


}
