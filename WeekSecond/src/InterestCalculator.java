public class InterestCalculator {
    public static void compoundInterest(double p,double r,double t) {
        System.out.println("Principal = "+p);
        System. out. println("Annual Rate of Interest = "+r);
        System. out. println("Time (years) = "+t);

        double c_interest;
        c_interest = p * Math.pow(1.0+r/100.0,t) - p;
        System.out. println("Compound Interest: "+c_interest);
        return;
    }
    public static void simpleInterest(double p,double r,double t) {
        System.out.println("Principal = "+p);
        System. out. println("Annual Rate of Interest = "+r);
        System. out. println("Time (years) = "+t);

        double s_interest;
        s_interest = p *r*t/100;
        System.out.println("Simple Interest: "+s_interest);
        return ;
    }
    public static void main(String[] args) {
        double p, r, t;
        p = 40000;
        r = 34;
        t = 6;

       simpleInterest(p,r,t);
       compoundInterest(p,r,t);

    }
}
