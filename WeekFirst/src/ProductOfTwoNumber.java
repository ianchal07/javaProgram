import java.util.Scanner;

public class ProductOfTwoNumber {
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
        System.out.println("multiply of two number is "+multiplyTwoNumber(a,b));
    }
}