package Recursion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;

public class LetterCombination {
    public static void main(String[] args) {
        HashMap<Character,String>map=new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        List<String >li=new ArrayList<>();
        pattern(map, "23","",li);
        System.out.println(li);

    }

    public static void pattern(HashMap<Character,String>map, String st,String ans, List<String>li){

        if(st.isEmpty()){
            li.add(ans);
            return;
        }
        char ch=st.charAt(0);
       if(!map.containsKey(ch)){
           pattern(map,st.substring(1),ans,li);
           return;
       }
       String letter=map.get(ch);
        for(int i=0;i<letter.length();i++){
            pattern(map,st.substring(1),ans+letter.charAt(i),li);
        }
    }
}
