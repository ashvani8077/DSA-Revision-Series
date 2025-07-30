package Recursion;

public class Subsequence {
    public static void main(String[] args) {
        String s="abc";
        PrintSubSequence(s,0,"");
    }

    public static void PrintSubSequence( String ques,int i, String ans){
        if(i==ques.length()){
            System.out.println(ans+" ");
            return;
        }

        char ch=ques.charAt(i);
        PrintSubSequence(ques, i+1, ans);
        PrintSubSequence(ques, i+1, ans+ch);
    }
}
