public class Maths {
    /**
     * 1. Math.max(78, 89) -> returns the larger value
     * 2. Math.min(4, 44) -> returns the smaller value
     * 3. Math.abs(-77) -> returns absolute value
     * 4. Math.round(7.7) -> rounds to nearest integer
     * 5. Math.ceil(4.1) -> rounds up
     * 6. Math.floor(4.9) -> rounds down
     * 7. Math.pow(2, 3) -> a to the power of b
     * 8. Math.sqrt(16) -> square root
     * 9. Math.random() -> random double between 0.0 - 0.99
     * 10. Math.log(8) -> natural log
     */
    public static void main(String[] args) {
        float a = 78.8f;
        float b = 98.1f;
        int c = 859;
        int d = 3;

        // 1. Math.max
        System.out.println(Math.max(Math.max(a, b), c));

        // 2. Math.min
        System.out.println(Math.min(Math.min(a, b), d));

        // 3. Math.abs (return absolute value)
        System.out.println(Math.abs(-33));

        // 4. Math.round -> round to nearest integer
        System.out.println(Math.round(a));

        // 5. Math.ceil -> round up
        System.out.println(Math.ceil(b)); // 99 not 98

        // 6. Math.floor -> round down
        System.out.println(Math.floor(b)); // 98 not 99

        // 7. Math.pow -> a to the power b
        System.out.println(Math.pow(a, d));

        // 8. Math.sqrt -> square root
        System.out.println(Math.sqrt(3));

        // 9. Math.random -> random double between 0.0 - 0.99
        System.out.println(Math.random() * d);

        // 10. Math.log(a)
        System.out.println(Math.log(a));
    }
}