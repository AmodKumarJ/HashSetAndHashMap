// frequency grater then the n/3

import java.util.HashMap;

public class problem1 {
    public static void mejority(int nums[]){
        int n= nums.length;
         HashMap<Integer,Integer>map = new HashMap<>();
         for(int i =0;i<n;i++)
         {
            if (map.containsValue(nums[i])) {
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
         }
         for(int key:map.keySet())
         {
            if(map.get(key)>n/3){
                System.out.println(key);
            }
         }
    }
    public static void main(String[] args) {
        int nums[] = {1,2};
       
        mejority(nums);
    }
    
}
