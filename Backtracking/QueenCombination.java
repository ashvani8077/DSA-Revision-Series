package Backtracking;

public class QueenCombination {
    public static void main(String[] args) {
        int n=4;
        int totalQueen=2;
        boolean arr[]=new boolean[n];
        combination(arr,totalQueen,0,"",0);
    }

    public static void combination(boolean board[], int tq,int qpsf, String ans, int idx){
        if(qpsf==tq){
            System.out.println(ans);
            return;
        }
        for(int i=idx;i<board.length;i++){
            if(board[i]==false){
                board[i]=true;
                combination(board,tq,qpsf+1,ans+"b"+i+"q"+qpsf, idx+1);
                board[i]=false;
            }
        }
    }
}
