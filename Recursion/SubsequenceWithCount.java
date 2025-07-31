package Recursion;

public class SubsequenceWithCount {
    public static void main(String[] args) {
        String s="abc";
        System.out.println(PrintSubSequence(s,0,""));
        System.out.println();

    }

   // static int count=0;
    public static int PrintSubSequence( String ques,int i, String ans){
        if(i==ques.length()){
            System.out.print(ans+" ");
            return 1;
        }

        char ch=ques.charAt(i);
        int a=PrintSubSequence(ques, i+1, ans);
        int b=PrintSubSequence(ques, i+1, ans+ch);
        return a+b;
    }
}
