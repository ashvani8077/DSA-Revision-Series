import javax.swing.plaf.IconUIResource;

public class MaximumDepth {
    public static void main(String[] args) {
        String s="(1+(2*3)+((8)/4))";
        int mx=0;
        int c1=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(') c1++;
            if(s.charAt(i)==')'){
                mx=Math.max(mx,c1);
                c1--;
            }
        }
        System.out.println(mx);
    }
}
