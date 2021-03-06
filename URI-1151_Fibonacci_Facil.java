/*-------------------*
| Rodrigo CavanhaMan |
| URI 1151           |
| Fibonacci Facil    |
*--------------------*/
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n, f1=1, f2=1, fn=0;

		n = sc.nextInt();
		
		while (n >= 46 || n <= 0){
			n = sc.nextInt();
		}
		
		System.out.printf("0 %d %d ",f1,f2);

		for (int aux = 3; aux < n-1; aux++){
			fn = f1 + f2;
			System.out.printf("%d ",fn);
			f1 = f2;
			f2 = fn;
		}
		fn = f1 + f2;
		System.out.println(fn);
		sc.close();
	}
}