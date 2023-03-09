import java.util.Scanner;

public class CalculatorAll {
    public static double divideTwoNumber(int a,int b){
        if(b==0) return 0;
        double i;
        i = a /(float) b;
        return i;
    }
    public static int addTwoNumber(int a,int b){
        return a+b;
    }
    public static int subtractTwoNumber(int a,int b){
        return a-b;
    }
    public static int reminderTwoNumber(int a,int b){
        return a%b;
    }
    public static int multiplyTwoNumber(int a,int b){
        return a*b;
    }
    public  static void main(String[] args){
        Scanner scn= new Scanner(System.in);
        System.out.println("enter a number:");
        int a= scn.nextInt();
        System.out.println("enter second number:");
        int b= scn.nextInt();
        scn.close();
        System.out.println("divison of two number is "+divideTwoNumber(a,b));
        System.out.println("product of two number is "+multiplyTwoNumber(a,b));
        System.out.println("addition of two number is "+addTwoNumber(a,b));
        System.out.println("subtracion of two number is "+subtractTwoNumber(a,b));
        System.out.println("reminder of two number is "+reminderTwoNumber(a,b));
    }
}