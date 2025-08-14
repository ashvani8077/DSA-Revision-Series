package Recursion;

import java.awt.*;

public class LexiographicallyCounting {
    public static void main(String[] args) {
        printCounting(0,1000);
    }


    public static void printCounting(int curr, int n){

        if(curr>n){
            return;
        }
        System.out.println(curr);
        int i=0;
        if(curr==0){
            i=1;
        }
        for(;i<=9;i++){
            printCounting(curr*10+i,n);
        }

    }
}
