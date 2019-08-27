import java.util.Scanner;
class test{

	public static void main(String[] args) {

		int N = StdIn.readInt();

		// Scanner sc = new Scanner(System.in);
		// System.out.println("Enter The first NUmber:");

		// num1 = sc.nextInt();

		// System.out.println("Enter Second Number:");

		// num2 = sc.nextInt();

		// sc.close();

		// sum = num2+num1;

		// System.out.println("Sum of these Numbers : "+ sum);
		

		UF uf =new UF(N);

		while(!StdIn.isEmpty())
		{
			int p = StdIn.readInt();

			int q = StdIn.readInt();
			if(!uf.connected(p, q)){
				uf.union(p, q);
				StdOut.println(p+""+q);
			}

		}
	}
}