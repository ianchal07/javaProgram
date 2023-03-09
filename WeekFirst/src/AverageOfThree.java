
import java.util.Scanner;

public class AverageOfThree {
    public static double average(int a,int b,int c){
        return (a+b+c)/3.0;
    }
    public static void  main(String[] args){
        Scanner scn= new Scanner(System.in);
        System.out.println("enter a number:");
        int a= scn.nextInt();
        System.out.println("enter second number:");
        int b= scn.nextInt();
        System.out.println("enter third number:");
        int c= scn.nextInt();
        System.out.println("average of three number is"+ average(a,b,c));
    }
}