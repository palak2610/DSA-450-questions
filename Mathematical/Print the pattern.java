import java.util.Scanner;
class PrintPattern
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			GFG g = new GFG();
			g.printPat(n);
			System.out.println();
			
		t--;
		}
	}
}

class GfG
{
    void printPat(int n)
    {
        int count=n;
        for(int i=0;i<n;i++)
        {
            count=n;
            for(int k=0;k<n;k++)
            {
                for(int j=0;j<(n-i);j++)
                System.out.print(count+" ");
                count--;
            }
            System.out.print("$");
        }
    }
}
