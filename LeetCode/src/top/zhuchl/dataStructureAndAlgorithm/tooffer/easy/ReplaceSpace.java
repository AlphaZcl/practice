package top.zhuchl.dataStructureAndAlgorithm.tooffer.easy;

/**
 * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 *
 * @Author AlphaZcl
 * @Date 2021/6/30
 **/
public class ReplaceSpace {

    public String replaceSpace(String s) {
        char[] charStr = s.toCharArray();
        StringBuilder builder = new StringBuilder();
        for(char c : charStr){
            if(c == ' '){
                builder.append("%20");
            }else{
                builder.append(c);
            }
        }
        return builder.toString();
    }
}
