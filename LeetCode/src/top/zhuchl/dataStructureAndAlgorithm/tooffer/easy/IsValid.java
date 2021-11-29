package top.zhuchl.dataStructureAndAlgorithm.tooffer.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']'的字符串 s ，判断字符串是否有效。
 * 有效字符串需满足：
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 *
 * @Author AlphaZcl
 * @Date 2021/8/6
 **/
public class IsValid {

    private static Map<Character,Character> map;

    static {
        map = new HashMap<>();
        map.put('(',')');
        map.put('[',']');
        map.put('{','}');
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if('(' == c || '{' == c || '[' == c){
                /*左符号做入栈操作*/
                stack.push(c);
            }else if(')' == c && stack.peek() == '('){
                stack.pop();
            }else if ('}' == c && stack.peek() == '{'){
                stack.pop();
            }else if(']' == c && stack.peek() == '['){
                stack.pop();
            }
        }
        boolean res = false;
        if(stack.isEmpty()){
            res = true;
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "()]{}";
        IsValid iv = new IsValid();
        System.out.println(iv.isValid(s));
    }
}
