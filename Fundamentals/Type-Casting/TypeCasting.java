public class TypeCasting{
    public static void main(String [] args){

        // 1. Widening (automatic)
        int i = 42;
        long l = i;
        float f = l;
        double d = f;
        System.out.println(d);

        // 2. Narrowing (manual)
        double x = 99.9;
        int y = (int) x;
        System.out.println(y);

        long big = 1000L;
        int small = (int) big;
        System.out.println(small);

        // 3. String to Number
        int a = Integer.parseInt("22");
        short b = Short.parseShort("334");
        long c = Long.parseLong("249");
        float dd = Float.parseFloat("1.123f");
        double e = Double.parseDouble("44.33333322");
        System.out.println(a + " " + b + " " + c + " " + dd + " " + e);


        // 4. Number to String
        String s1 = Integer.toString(42);
        String s2 = String.valueOf(42);
        String s3 = 42 + "";

        // 5. Char to Int (ASCII value)
        char ch = 'A';
        int ascii = ch;
        System.out.println(ascii);

        // 6. Int to Char
        int num = 65;
        char letter = (char) num;
        System.out.println(letter);

        // 7. Object Casting
        Object obj = "hello";
        if(obj instanceof String){
            String str = (String) obj;
            System.out.println(str);
        }
    }
}
