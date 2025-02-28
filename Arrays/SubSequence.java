import java.util.*;
public class SubSequence {
    public static void main(String[] args) {
        int arr[] = {3,1,2};

        ArrayList<Integer> subarr = new ArrayList<>();
        printSubSequence(arr, subarr, 0);
    }

    static void printSubSequence(int arr[], ArrayList<Integer> subarr, int index){
        if(index == arr.length){
            System.out.println(subarr);
            return;
        }

        subarr.add(arr[index]);
        printSubSequence(arr, subarr, index+1);
        subarr.remove(subarr.size() -1);
        printSubSequence(arr, subarr, index+1);
    }

    
}