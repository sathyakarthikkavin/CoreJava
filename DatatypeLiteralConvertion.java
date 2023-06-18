public class DatatypeLiteralConvertion {
    public static void main(String[] args) {

        byte b=23; //1 byte,Range calculation 2pow7 to 2pow7-1
        short c=22; //2 byte
        int a=12;//4 byte
        long d=40; //8byte
        float e=10.2f; //4 byte
        double f=22;//8byte
        double g=10e10;
        int h=0b1111;//binary
        int i=0X7E;//hexa
        int j=100;
        byte k=(byte)j;
        int z=257;
        byte y = (byte) z;//explicit conversion 257%256
        char l='c';
        c++;
        boolean u=true;
        System.out.println(l);
        System.out.println(b);
        System.out.println(h);
        System.out.println(k);
        System.out.println(y);











    }


}
