import java.util.*;

public class DistinctElementInArr {
    public static void main(String[] args) {
        int arr[] = {1,2,3,1};

        //System.out.println(isDistictElementInArray(arr));
        System.out.println(isDistictElementInArrayOptimized(arr));
    }

    static boolean isDistictElementInArray(int arr[]) {
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    return false;
                }
            }
        }
        return true;
    }

    static boolean isDistictElementInArrayOptimized(int arr[]) {

        Set<Integer> st = new HashSet<>(); 
        for(int i=0;i<arr.length;i++){
            if(st.contains(arr[i])){
                return false;
            }
            st.add(arr[i]);
        }
        return true;
    }
}
