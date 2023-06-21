class Calculator
{
    int r;
    public int add(int n1,int n2)
    {
        r=n1+n2;
        return r;
    }
}
public class ObjectClassConcept {
    public static void main(String[] args) {
        Calculator b=new Calculator();
        int result=b.add(4,5);
        System.out.println(result);
    }
}
