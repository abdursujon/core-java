import java.util.Arrays;

/**
 *  It's called "2D" because you need two numbers to find a value — row and column.
 */
public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4,5}, {4, 5, 6, 7, 8}, {3, 354, 948, 7457}, {992, 12, 344}};

        for(int i = 0; i< arr.length; i++){
            for(int j = 0; j< arr[i].length; j++){
                System.out.print(arr[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

        int[] [] marks = {{55, 77, 67, 88, 88}, {45, 77, 67, 88, 88}, {59, 77, 67, 88, 88}};
        System.out.println(Arrays.deepToString(getAllMarks(marks)));
        System.out.println(Arrays.toString(getStudentAllModuleMarkByTheirId(marks, 0)));
    }


    public static int[][] getAllMarks(int[][] marks){
        int[][] result = new int[marks.length][5];
        for(int i = 0; i< marks.length; i++){
            for(int j = 0; j< marks[i].length; j++){
                result[i][j] = marks[i][j];
            }
        }
        return result;
    }

    public static int[] getStudentAllModuleMarkByTheirId(int[][] marks, int id){
        int[][] result = getAllMarks(marks);
        return result[id];
    }

}
