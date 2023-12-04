import java.util.HashSet;

public class union_of_2_Array {
    public static int union(int num1[],int num2[]){//O(n)
        HashSet<Integer>set = new HashSet<>();
        for(int i=0;i<num1.length;i++)
        {
            set.add(num1[i]);
        }
         for(int j=0;j<num2.length;j++)
        {
            set.add(num2[j]);
        }
        return set.size();
    }
    public static void main(String[] args) {
        int num1[] = {7,3,9};
        int num2[] = {6,3,9,2,9,4};
        System.out.println(union(num1, num2));
    }
}
