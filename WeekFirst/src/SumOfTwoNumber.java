
import java.util.Scanner;

public class SumOfTwoNumber {

    public static int addTwoNumber(int a,int b){
        return a+b;
    }
    public  static void main(String[] args){
        Scanner scn= new Scanner(System.in);
        System.out.println("enter a number:");
        int a= scn.nextInt();
        System.out.println("enter second number:");
        int b= scn.nextInt();
        System.out.println("sum of two number is "+addTwoNumber(a,b));
    }
}