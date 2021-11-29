package top.zhuchl.dataStructureAndAlgorithm.tooffer.medium;

/**
 *在一个 n * m 的二维数组中，每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。请完成一个高效的函数，输入这样的一个二维数组和一个整数，
 * 判断数组中是否含有该整数。
 *
 * @Author AlphaZcl
 * @Date 2021/6/30
 **/
public class FindNumberIn2DArray {

    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        int row = matrix.length-1;
        int col = 0;
        while(row >=0 && col <= matrix[0].length-1){
            if(target > matrix[row][col]){
                col++;
            }else if(target < matrix[row][col]){
                row--;
            }else{
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1,   4,  7, 11, 15},
                {2,   5,  8, 12, 19},
                {3,   6,  9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        int target = 13;
        FindNumberIn2DArray fnd = new FindNumberIn2DArray();
        System.out.println(fnd.findNumberIn2DArray(matrix,target));
    }
}
