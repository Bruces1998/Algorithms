import java.util.Scanner;
public class Binary
{



  public static int Min(int a[],int l,int r)
  {
    int min1;
    int min2;
    int mid;
    if(l<r)
    {
      mid=(l+r)/2;
      min1=Min(a,l,mid);
      min2=Min(a,mid+1,r);

      if(min1 < min2)
      {
        return min1;
      }

      else
      {
        return min2;
      }
    }

    else {
      return a[l];
    }
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
    System.out.println("\n");

    for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}

    System.out.println(Min(a,0,n-1));


    // binsearch(a,n,27);





  }


}
