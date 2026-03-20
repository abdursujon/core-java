public class SequentialSearch {
    public static int sequentialSearchAlg(int[] phoneList, int n, int target){
        for(int i = 0; i < n; i++){
            if(phoneList[i] == target){
                System.out.println(phoneList[i]);
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(sequentialSearchAlg(new int[]{12345678, 98765432, 55512345, 11223344, 99887766}, 5, 99887766));
        System.out.println(sequentialSearchAlg(new int[]{12345678, 98765432, 55512345, 11223344, 99887766}, 5, 96887766));
    }
}
