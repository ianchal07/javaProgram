import java.util.Scanner;
public class DivideTwoNumber {
    public static double divideTwoNumber(int a,int b){
        if(b==0) return 0;
        double i;
        i = a /(float) b;
        return i;
    }
    public  static void main(String[] args){
        Scanner scn= new Scanner(System.in);
        System.out.println("enter a number:");
        int a= scn.nextInt();
        System.out.println("enter second number:");
        int b= scn.nextInt();
        scn.close();
        System.out.println("divison of two number is "+divideTwoNumber(a,b));
    }
}