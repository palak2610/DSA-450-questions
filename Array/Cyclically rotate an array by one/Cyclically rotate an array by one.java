import java.util.*;

public class Test
{
    // Method for rotation
    static void rotate(int arr[], int n)
    {
       int x = arr[n-1], i;
       for (i = n-1; i > 0; i--)
          arr[i] = arr[i-1];
       arr[0] = x;
    }
    
    /* Driver program */
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i] = sc.nextInt();
            }
            
            int x = arr[n-1], i;
            for (i = n-1; i > 0; i--)
                {
                  arr[i] = arr[i-1];
                }
            arr[0] = x;
            for(i=0;i<n;i++)
            {
                System.out.print(arr[i]+ " ");
            }
        System.out.println();
        }
    }
}
