package top.zhuchl.juc.hash;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

/**
 * @Author AlphaZcl
 * @Date 2021/11/22
 **/
public class HashtableTest {

    @Test
    @DisplayName("Hashtable")
    public void test1(){
        Hashtable<String, String> table1 = new Hashtable<>();
        table1.put("1","1");
        table1.put("2","2");
        table1.put("3","3");
        rangeEnumeration(table1);

        System.out.println("=================");

        Hashtable<String, String> table2 = new Hashtable<>();
        table2.put("1","1");
        table2.put("2","2");
        table2.put("3","3");
        rangeIterator(table2);
    }

    @Test
    @DisplayName("HashMap")
    public void test2(){
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("1",null);
        String putRes = hashMap.put("1", "1");
        String put2 = hashMap.put("1", "11");
        System.out.println("putRes = "+putRes);
        System.out.println("key = 1 ,value = " + hashMap.get("1"));

    }

    @Test
    @DisplayName("HashSet")
    public void test3(){
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("aa");
        boolean aa = hashSet.add("aa");
        System.out.println(aa);
    }

    @Test
    @DisplayName("listIterator")
    public void test4(){
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        ListIterator<String> listIterator = list.listIterator();
    }

    public void rangeEnumeration(Hashtable<String,String> table){
        Enumeration<String> enumeration = table.keys();
        while (enumeration.hasMoreElements()){
            table.remove("1");
            String s = enumeration.nextElement();
            System.out.println(s);
        }
    }

    private void rangeIterator(Hashtable<String, String> table) {
        Iterator<String> iterator = table.keySet().iterator();
        while(iterator.hasNext()){
            table.remove("1");
            String next = iterator.next();
            System.out.println(next);
        }
    }
}
