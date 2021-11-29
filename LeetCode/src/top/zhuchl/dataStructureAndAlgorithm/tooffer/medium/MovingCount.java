package top.zhuchl.dataStructureAndAlgorithm.tooffer.medium;

/**
 * 地上有一个m行n列的方格，从坐标 [0,0] 到坐标 [m-1,n-1] 。
 * 一个机器人从坐标 [0, 0] 的格子开始移动，它每次可以向左、右、上、下移动一格（不能移动到方格外），
 * 也不能进入行坐标和列坐标的数位之和大于k的格子。例如，当k为18时，机器人能够进入方格 [35, 37] ，
 * 因为3+5+3+7=18。但它不能进入方格 [35, 38]，因为3+5+3+8=19。请问该机器人能够到达多少个格子？
 *
 * @Author AlphaZcl
 * @Date 2021/7/8
 **/
public class MovingCount {

    int m, n, k;
    boolean[][] visited;

    public int movingCount(int m, int n, int k) {
        this.m = m;
        this.n = n;
        this.k = k;
        /*标记该格已读取*/
        visited = new boolean[m][n];
        return dfs(0, 0, 0, 0);
    }

    private int dfs(int i, int j, int si, int sj) {
        if (i >= m || j >= n || si + sj > k || visited[i][j]) {
            return 0;
        }
        visited[i][j] = true;
        /*往下和右边搜索*/
        return 1 + dfs(i + 1, j,(i + 1) % 10 == 0 ? si - 8 : si + 1,sj ) + dfs(i,j+1,si,(j + 1) % 10 == 0 ? sj - 8 : sj + 1);
    }

    public static void main(String[] args) {
        MovingCount mc = new MovingCount();
        System.out.println(mc.movingCount(3,4,2));
    }
}
