1. Fixed size — once created, size cannot change
2. Zero-indexed — first element is at index 0
3. Homogeneous — all elements must be same type
4. Default values — int → 0, boolean → false, String → null
5. Stored in contiguous memory — that's why random access is O(1)
   contiguous means array elements are stored next to each other in memory, with no gaps.
   Memory addresses:                                                                                                     
   [100] [104] [108] [112] [116]                                                                                         
   1     2     3     4     5
6. length is a field, not a method — arr.length (no parentheses)
7. ArrayIndexOutOfBoundsException — accessing invalid index throws this
8. Can hold primitives and objects — int[], String[] both work
9. Arrays are objects — even int[] is an object in Java
10. Pass by reference — modifying array inside a method affects the original
11. [] syntax only — no .get() or .set() like ArrayList
12. Multidimensional arrays — int[][] (array of arrays, rows can have different lengths)
13. Cannot use generics — new T[] is not allowed
14. Arrays utility class methods:
    - Arrays.toString(arr) — readable print
    - Arrays.sort(arr) — sort ascending
    - Arrays.fill(arr, val) — fill all with one value
    - Arrays.copyOf(arr, len) — copy with new length
    - Arrays.copyOfRange(arr, from, to) — copy a slice
    - Arrays.equals(arr1, arr2) — compare two arrays
    - Arrays.deepEquals(arr1, arr2) — compare multidimensional arrays
    - Arrays.binarySearch(arr, key) — find index (must be sorted)
    - Arrays.asList(arr) — convert to List (only works with object arrays)
    - Arrays.stream(arr) — convert to Stream
    - Arrays.mismatch(arr1, arr2) — first index where they differ
    - Arrays.compare(arr1, arr2) — lexicographic comparison
    - Arrays.deepToString(arr) — readable print for multidimensional arrays