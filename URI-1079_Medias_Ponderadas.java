/*-------------------*
| Rodrigo CavanhaMan |
| URI 1079           |
| Medias Ponderadas  |
*--------------------*/
import java.io.IOException;import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)  throws IOException {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		int n;
		double x,y,z, mediapond;
		
		n = sc.nextInt();
		
		while (n > 0){
			x = sc.nextDouble();
			y = sc.nextDouble();
			z = sc.nextDouble();
			mediapond = (x * 2 + y * 3 + z * 5) / 10;
			System.out.printf("%.1f\n",mediapond);
			n = n - 1;
		}
		sc.close();
	}
}