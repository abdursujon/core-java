public class BuiltInOneDimensionalArray {
    public static void main(String[] args){
        // One dimensional array
        int[] arr = {1, 3, 5, 7, 8}; // 1. Number one, way of creating array
        int[] arr2 = new int[5]; // 2. Number two, way of creating array
        for(int i = 0; i< arr.length; i++){
            arr2[i] = arr[i];
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
        // 3. Number 3, way of creating array
        int[] arr3 = new int[5];
        arr3[0] = 1;
        arr3[1] = 2;
        arr3[2] = 3;
        arr3[3] = 4;
        arr3[4] = 5;
        for(int i = 0; i< arr3.length; i++){
            System.out.print(arr3[i] + " ");
        }

        // 4. Number 4, way of creating array
        printArray(new int[] {1,2,3,4,5});
    }
    public static void printArray(int[] arr){
        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
