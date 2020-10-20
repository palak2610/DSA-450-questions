import java.io.*;
import java.util.*;

class GFG{
	public static void main(String args[]) throws IOException
	{
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in());
		int t = Integer.parseInt(read.readLine());
		while(t-- > 0)
		{
			Strin[] S = read.readLine().split(" ");
			int A = Integer.parseInt(S[0]);
			int B = Integer.parseInt(S[0]);
			int C = Integer.parseInt(S[0]);
			Solution ob = new Solution();
			System.out.println(ob.middle(A,B,C));
		}
	}
}

class Solution{
    int middle(int A, int B, int C){
        //code here
        int min=(A>B)?(B>C?B:C):(B>C?(C>A?C:A):B);
        return min;
        
    }
}
