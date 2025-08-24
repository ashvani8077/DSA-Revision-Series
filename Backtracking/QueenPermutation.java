package Backtracking;

public class QueenPermutation {
    public static void main(String[] args) {
        int n=4;
        int totalQueen=2;
        boolean arr[]=new boolean[n];
        permutation(arr,n,totalQueen,0,"");
    }

    public static void permutation(boolean board[],int n, int tq,int qpsf, String ans){
        if(qpsf==tq){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<board.length;i++){
            if(board[i]==false){
                board[i]=true;
                permutation(board,n,tq,qpsf+1,ans+"b"+i+"q"+qpsf);
                board[i]=false;
            }
        }
    }
}
