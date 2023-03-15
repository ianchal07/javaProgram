package GenricClass;

 class GenricC<T1> {
    int val = 0;
    private T1 t1;

    public void setVal(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }

    public T1 getT1() {
        return t1;
    }

    public GenricC(int val, T1 t1) {
        this.val = val;
        this.t1 = t1;
    }
}
public class ThusGenric {
    public static void main(String[] args) {
        GenricC<String> g=new GenricC<>(13,"hello this is genric class");
        System.out.println(g.getT1()+" "+g.getVal());
    }
}
