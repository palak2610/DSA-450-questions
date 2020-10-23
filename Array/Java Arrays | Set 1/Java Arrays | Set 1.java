import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-- > 0)
		{
		    int n = sc.nextInt();
		    int arr[] = new int[n];
		    for(int i=0;i<n;i++)
		    {
		        arr[i] = sc.nextInt();
		    }
		    double sum=0;
		    double avg=0;
		    for(int i=0;i<n;i++)
		    {
		        sum+=arr[i];
		    }
		    avg = sum/(double)n;
		    System.out.print((int)sum+" ");
		    System.out.format("%.2f",avg);
		   	System.out.println();
		}
	}
}
