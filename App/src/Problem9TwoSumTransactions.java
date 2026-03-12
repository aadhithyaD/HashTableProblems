import java.util.*;

public class Problem9TwoSumTransactions {

    public void findTwoSum(int[] arr,int target){

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){

            int complement = target - arr[i];

            if(map.containsKey(complement)){

                System.out.println("Pair: "+arr[i]+" + "+complement);
            }

            map.put(arr[i],i);
        }
    }

    public static void main(String[] args){

        Problem9TwoSumTransactions obj = new Problem9TwoSumTransactions();

        int[] arr = {500,300,200};

        obj.findTwoSum(arr,500);
    }
}