import java.util.Arrays;

public class FruitIntoBasket2 {
    public static void main(String[] args) {
        int fruits[]={4,2,5};
        int baskets[]={3,5,4};
        int count=0;
        boolean isPlaced[]=new boolean[baskets.length];
        Arrays.fill(isPlaced, false);
        for(int i=0;i<fruits.length;i++){
            for(int j=0;j<baskets.length;j++){
                if(baskets[j]>=fruits[i]&&!isPlaced[j]){
                    isPlaced[j]=true;
                    count++;
                    break;
                }
            }
        }
        System.out.println(fruits.length-count);
    }
}
