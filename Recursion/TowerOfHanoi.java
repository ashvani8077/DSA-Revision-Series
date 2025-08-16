package Recursion;

public class TowerOfHanoi {
    public static void main(String[] args) {
        int n=5;
        towerOfHanoi(n,"A","B","C");
    }

    public static void towerOfHanoi(int n, String src, String hlp, String dest){
        if(n==0)return;
        towerOfHanoi(n-1,src,dest,hlp);
        System.out.println(n+"th disk transfer from "+src+" to "+dest);
        towerOfHanoi(n-1,hlp,src,dest);
    }
}
