import java.util.Arrays;

public class Objects {
    String name = "Sujon";
    @Override
    public String toString(){
      return "User: " + name;
    }
    public static void main(String[] args) {
        // 1. toString()
        Object obj = new Object();
        System.out.println(obj.toString());
        System.out.println(new Objects());

        // 2. equals()
        String a = "hello";
        String b = "hello";
        System.out.println(a.equals(b));

        // 3. hashCode()
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());

        // 4. getClass() return what class variable from!
        Integer num = 322;
        System.out.println(a.getClass());
        System.out.println(obj.getClass());
        System.out.println(num.getClass());

        // 5. instanceof
        System.out.println(a instanceof String);
        System.out.println(a instanceof Object);
        System.out.println(num instanceof Integer);

    }
}