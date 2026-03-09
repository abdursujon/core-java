/**
 * Enum: Enumeration — meaning a complete, numbered listing of items.
 * Enum is a fixed set of constants. We use it when a value should only be one of a few options.
 * Without enum:
 * String status = "active";  // what stops someone from typing "actvie" or "banana"?
 * <p>
 * With enum:
 * enum Status { ACTIVE, INACTIVE, BANNED }
 * <p>
 * Status status = Status.ACTIVE;  // can only be one of the three
 * Status status = Status.BANANA;  // compile error — caught immediately
 * <p>
 * Common real-world uses:
 * <p>
 * - Order status: PENDING, SHIPPED, DELIVERED, CANCELLED
 * - User role: ADMIN, USER, MODERATOR
 * - HTTP method: GET, POST, PUT, DELETE
 * - Days, months, directions, etc.
 * <p>
 * The purpose is type safety — the compiler enforces that you can only use valid values, so typos and invalid states are
 * impossible.
 */

public class Enums {
    enum Status {PENDING, SHIPPED, DELIVERED, CANCELLED, RETURNED}

    public static void main(String[] args) {
        // 1. Access a value
        Status order = Status.PENDING;
        Status order2 = Status.SHIPPED;
        System.out.println("Order Status: " + order);

        // 2. Status.values() -> returns all values as array
        for (Status s : Status.values()) {
            System.out.print(s + " ");
        }

        // 3. Day.valueOf(arg) -> String to Enum
        Status driver_input = Status.valueOf("DELIVERED"); // enum.Object to String useful in spring boot etc when we get json as "SHIPPED" we can convert that to user it in our program

        // 4. .name() -> returns name as String
        System.out.println(order.name());

        // 5. .ordinal() -> returns index position
        System.out.println(order2.ordinal());

        // 6. Use in switch
        Status order3 = Status.DELIVERED;
        switch (order3) {
            //PENDING, SHIPPED, DELIVERED, CANCELLED, RETURNED
            case SHIPPED:
                System.out.println("Order is SHIPPED");
                break;
            case DELIVERED:
                System.out.println("Order is  DELIVERED");
                break;
            case CANCELLED:
                System.out.println("Order is CANCELLED");
                break;
            case RETURNED:
                System.out.println("Order is  RETURNED");
                break;
            default:
                System.out.println("Order is PENDING");
                break;
        }
    }
}

