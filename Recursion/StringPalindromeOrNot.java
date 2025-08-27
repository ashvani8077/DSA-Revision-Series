package Recursion;

public class StringPalindromeOrNot {
    public static void main(String[] args) {
        String st="naman";
        System.out.println(isPalindrome(st,0,st.length()-1));
    }

    public static boolean isPalindrome(String st, int i, int j){
        if(i>j){
            return true;
        }
        if(st.charAt(i)!=st.charAt(j)){
            return false;
        }
        return isPalindrome(st,i+1,j-1);
    }
}
