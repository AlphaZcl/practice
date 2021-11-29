package top.zhuchl.dataStructureAndAlgorithm.tooffer.medium;

/**
 * 给定一个m x n 二维字符网格board 和一个字符串单词word 。如果word 存在于网格中，返回 true ；否则，返回 false 。
 * 单词必须按照字母顺序，通过相邻的单元格内的字母构成，其中“相邻”单元格是那些水平相邻或垂直相邻的单元格。
 * 同一个单元格内的字母不允许被重复使用
 *
 * @Author AlphaZcl
 * @Date 2021/7/8
 **/
public class ExistRoute {

    public boolean exist(char[][] board, String word) {
        char[] words = word.toCharArray();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (dfs(board, words, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, char[] word, int i, int j, int k) {
        if (i < 0 || i > board.length - 1 || j < 0 || j > board[0].length - 1 ||board[i][j] != word[k]) {
            return false;
        }
        if (k == word.length-1){
            return true;
        }
        board[i][j] = '\0';
        boolean res = dfs(board, word, i + 1, j, k + 1) || dfs(board, word, i, j + 1, k + 1)
                || dfs(board, word, i - 1, j, k + 1) || dfs(board, word, i, j - 1, k + 1);
        board[i][j] = word[k];
        return res;
    }

    public static void main(String[] args) {
        char[][] board = {
                {'A','B','C','E'},
                {'B','F','C','S'},
                {'A','D','E','E'}
        };
        String word = "BFDC";
        ExistRoute er = new ExistRoute();
        System.out.println(er.exist(board,word));
    }
}
