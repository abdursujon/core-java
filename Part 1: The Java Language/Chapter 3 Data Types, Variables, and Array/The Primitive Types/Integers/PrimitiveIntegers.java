// long > int > short > byte
public class PrimitiveIntegers {
    long l = 77438L;
    int i =  (int) l;
    short s = (short) i;
    byte b = (byte) s;

    public static void main(String[] args) {
        PrimitiveIntegers p = new PrimitiveIntegers();
        System.out.println(p.l);
        System.out.println(p.i);
        System.out.println(p.s);
        System.out.println(p.b);
    }
}
