import java.io.*;
import java.util.*;

class GFG
{
	public static void main(String args[])throws IOException
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0)
		{
			int N = sc.nextInt();
			Solution ob = new Solution();
			ArrayList<Integer> ans = ob.getTable(N);
			for(Integer val: ans)
				System.out.print(val+" ");
			System.out.println();
		}
	}
}
class Solution{
    static ArrayList<Integer> getTable(int N){
        // code here
        ArrayList a = new ArrayList();
        for(int i=1;i<=10;i++)
        {
            a.add(i*N);
        }
        return a;
    }
}
