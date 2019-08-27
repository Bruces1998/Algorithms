import java.util.Scanner;
public class ThreeSum
{
	public static int count(int[] a)
	{
		int N = a.length;
		int count = 0;

		for(int i=0;i<N;i++)
			for(int j=i+1;j<N; j++)
				for(int k=j+1; k<N; k++)
					if (a[i]+a[j]+a[k] == 0)
						count++;

		return count;
	}


	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i] = s.nextInt();
		}

		System.out.println(count(a));
	}
}