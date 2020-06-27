
next →← prev
Java PrintStream printf() method
The printf() method of java PrintStream consists of 2 types with parameters :-

printf(String format, Object... args)
printf(Locale l, String format, Object... args)
Java PrintStream printf(String format, Object... args) Method
The printf() method of Java PrintStream class is a convenience method to write a String which is formatted to this output Stream. It uses the specified format string and arguments.



import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
                System.out.printf("%-15s%03d%n",s1,x);
            }
            System.out.println("================================");

    }
}



