import java.io.*;
import java.util.*;

class GFG
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(read.readLine());
		while(t-- > 0)
		{
			String S[] = read.readLine().split(" ");
			int N = Integer.parseInt(S[0]);
			int M = Integer.parseInt(S[1]);
			
			Solution ob = new Solution();
			System.out.println(ob.closestNumber(N,M));
		}
	}
}
class Solution {
    static int closestNumber(int N , int M) {
        // code here
        int q=N/M;
	    int n1=q*M;
	    int n2;
	    if(N*M>0)
	        n2=(M*(q+1));
	    else
	        n2=(M*(q-1));
	    if(Math.abs(n2-N)>Math.abs(N-n1))
    	    return n1;
    	else
    	    return n2;
    }
};
