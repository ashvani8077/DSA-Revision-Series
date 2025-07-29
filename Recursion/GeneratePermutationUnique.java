package Recursion;

public class GeneratePermutationUnique {
    public static void main(String[] args) {
        String st="abca";
        printPermutation(st,"");
    }
    public static void printPermutation(String st, String ans){
        if(st.length()==0){
            System.out.println(ans+" ");
            return;
        }
        for(int i=0;i<st.length();i++){
            char ch=st.charAt(i);
            boolean isRecursive=true;
            for(int j=i+1;j<st.length();j++){
                if(st.charAt(j)==ch){
                    isRecursive=false;
                    break;
                }
            }

            if(isRecursive){
                String s1=st.substring(0,i);
                String s2=st.substring(i+1);
                printPermutation(s1+s2,ans+ch);
            }
        }
    }
}
