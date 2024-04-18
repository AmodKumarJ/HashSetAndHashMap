import java.util.HashSet;

public class subset {
    public static void main(String[] args) {
       long  a1[] = {11, 7, 1, 13, 21, 3, 7, 3};
       long a2[] = {11, 3, 7, 1, 7};

        int count=0;
        HashSet<Long> set = new HashSet<>();
        for(int i=0;i<a2.length;i++)
        {
            set.add(a2[i]);
        }
        for(int j=0;j<a1.length;j++)
        {
            if(set.contains(a1[j]));
            {
               count += 1;
            }
        }
        if(count == a2.length)
        {
            System.out.println("Yes"+count);
        }
        else{
            System.out.println("No"+count);
        }
    }
}
