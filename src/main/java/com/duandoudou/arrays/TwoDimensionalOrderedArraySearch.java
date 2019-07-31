package com.duandoudou.arrays;

/**
 * DataStructuresAndAlgorithms
 * Date: 2019/7/30
 * Time: 9:45
 * 二维数组中查询元素是否存在
 * 二维数组必须列数必须完全一致
 *
 * @author duandoudou
 */
public class TwoDimensionalOrderedArraySearch {
    public static void main(String[] args) {
        int[][] array = new int[4][];
        array[0] = new int[]{1, 2, 8, 9};
        array[1] = new int[]{2, 4, 9, 12};
        array[2] = new int[]{4, 7, 10, 13};
        array[3] = new int[]{6, 8, 11, 15};

        System.out.println(find(array, 14));
    }

    public static boolean find(int[][] array, int num) {
        if (array.length != 0) {
            int row = 0;
            int column = array[0].length - 1;
            while (row < array.length && column >= 0) {
                if (array[row] == null) {
                    return false;
                }
                if (array[row][column] > num) {
                    column--;
                } else if (array[row][column] < num) {
                    row++;
                } else {
                    return true;
                }
            }
        }
        return false;
    }
}
