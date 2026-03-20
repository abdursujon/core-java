public class BinarySearch {
    /**
     * else if (target < phoneList[mid]) {
     *       high = mid - 1;  // target is in LEFT half, so move HIGH down
     *   }
     *   else {
     *       low = mid + 1;   // target is in RIGHT half, so move LOW up
     *   }
     *
     *   - Left half → you move high down (shrink from the right)
     *   - Right half → you move low up (shrink from the left)
     *
     *   [11223344, 12345678, 55512345, 98765432, 99887766]
     *    low                   mid                   high
     *
     *   Target in LEFT half?  → high = mid - 1
     *   [11223344, 12345678]
     *    low          high
     *
     *   Target in RIGHT half? → low = mid + 1
     *                           [98765432, 99887766]
     *                             low         high
     * For last element they point to same element
     * @param phoneList
     * @param target
     * @return
     */
    public static int binarySearch(int[] phoneList, int n, int target) {
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (phoneList[mid] == target) {
                return mid;
            } else if (target < phoneList[mid]) {
                high = mid - 1;
            } else{
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(new int[]{12345678, 98765432, 55512345, 11223344, 99887766}, 5, 99887766));
        System.out.println(binarySearch(new int[]{12345678, 98765432, 55512345, 11223344, 99887766}, 5, 96887766));
    }
}
