import java.util.ArrayList;

public class sum {
    int nums[] ={3,2,4};
    int target = 6;

    int sum = 0;
    int j=0;
    ArrayList<Integer>res = new ArrayList<>();
    
   for(int i=0;i<nums.length;i++)
    {
        sum += nums[i];
        if(sum>target)
        {
            sum -= j;
            j += 1;
        }
        if(sum == target)
        {
            res.add(j);
            res.add(i);
            break;
        }
    }
    return new int[]{res.get(0),res.get(1)};
}
