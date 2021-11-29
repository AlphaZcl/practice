package top.zhuchl.dataStructureAndAlgorithm.array.easy;

import java.util.ArrayList;
import java.util.List;

/**
 *给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
 * 在杨辉三角中，每个数是它左上方和右上方的数的和。
 *
 **/
public class GenerateYHTri {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> resList = new ArrayList<>(numRows);
        for(int i=0;i<numRows;i++){
            List<Integer> elmList = new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j == i){
                    elmList.add(1);
                    continue;
                }
                elmList.add(resList.get(i-1).get(j-1)+resList.get(i-1).get(j));
            }
            resList.add(elmList);
        }
        return resList;
    }

    public static void main(String[] args) {
        int numRows = 5;
        GenerateYHTri gyh = new GenerateYHTri();
        List res = gyh.generate(numRows);
        System.out.println(res);
    }


}
