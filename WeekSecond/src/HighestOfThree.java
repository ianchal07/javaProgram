public class HighestOfThree {
    public static int highestOfthree(int a,int b,int c) {
        a=a<b?b:a;
        a=a<c?c:a;
        return a;
    }
    public static void main(String[] args) {
        System.out.println("highest of three number is "+highestOfthree(34,31,21));
    }
}
