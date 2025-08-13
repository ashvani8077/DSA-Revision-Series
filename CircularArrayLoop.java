import java.beans.Introspector;
import java.util.HashSet;

public class CircularArrayLoop {
    public static void main(String[] args) {
        int arr[]={-1,-2,-3,-4,-5,6};
        System.out.println(isCycle(arr));
    }
    public static boolean isCycle(int arr[]){
        HashSet<Integer>hs=new HashSet<>();
        int i=0;
        while (true){
            if(hs.contains(i)){
                return true;
            }
            hs.add(i);
            i=i+arr[i];
            i=((i%arr.length)+arr.length)%arr.length;
            if(hs.size()>arr.length){
                break;
            }
        }
        return false;
    }

}
