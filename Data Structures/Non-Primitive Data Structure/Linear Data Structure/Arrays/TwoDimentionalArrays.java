public class TwoDimentionalArrays {
    public static void main(String args[]) {
        int[][] twoD = new int[10][10];
        int value = 1;
        for(int i = 0; i < twoD.length; i++) {
            for(int j = 0; j < twoD[i].length; j++) {
                twoD[i][j] = value;
                value += 2;
                System.out.print(twoD[i][j] + "\t");
            }
            System.out.println();
        }

        /**
        Create a 5x5 2D array, fill it with numbers 1 to 25, then print only the diagonal elements (where row index == column index).

            Expected output:
            1  7  13  19  25
        */
        int[][] diagonal = new int[5][5];
        int num = 1;
        for(int i = 0; i < diagonal.length; i++) {
            for(int j = 0; j< diagonal[i].length; j++) {
                diagonal[i][j] = num++;
                if(i == j) {
                    System.out.print(diagonal[i][j] + "\t");
                }
            }
        }
        System.out.println();
    }
}
