package top.sun;

/**
 * Created by SunnyGrocery on 2020/1/12 20:27
 */
public class Quest4 {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 8, 9},
                {2, 4, 9, 12},
                {4, 7, 10, 13},
                {6, 8, 11, 15}
        };
        System.out.println(find(7, array));
    }

    public static boolean find(int target, int[][] array) {
        int row = 0;
        int column = array[0].length - 1;

        while (column >= 0 && row < array.length) {
            if (array[row][column] == target) {
                return true;
            } else if (target > array[row][column]) {
                row++;
            } else {
                column--;
            }
        }
        return false;
    }

}
