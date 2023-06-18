public class ConditionalOperator {
    //To check condition and choose the flow
    //find max number among three numbers
    public static void main(String[] args) {

       int x=10,y=9,z=8;
        if(x>y && x>z)
        System.out.println(x);
        else if(y>x && y>z)
        System.out.println(y);
        else if(z>x && z>y)
        System.out.println(z);

    }
}
