import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int sum=0;
		while(t-- > 0)
		{
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i] = sc.nextInt();
            }
            int localsum=arr[0];
            int globalsum=arr[0];
            for(int i=1;i<n;i++)
            {
                localsum = Math.max(arr[i], localsum + arr[i]);
                globalsum = Math.max(localsum, globalsum);
            }
            System.out.println(globalsum);
		}
	}
}

/* Kadane's Algorithm

1) Initialize two variables with first element of an array
        localsum = arr[0]
        and  globalsum = arr[0]
2) Run the loop from index 1 to n
        localsum = Maximum(arr[i],localsum+arr[i])
        globalsum = Maximum(localsum, globalsum)
3) Print the globalsum.

*/
