/*----------------------------*
| Rodrigo CavanhaMan          |
| URI 1101                    |
| Sequencia de Numeros e Soma |
*-----------------------------*/
import java.io.IOException;import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)  throws IOException {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		int n, m, stop=1, aux, soma = 0;
		
		while (stop != 0){
			n = sc.nextInt();
			m = sc.nextInt();
			
			if (n <= 0 || m <= 0){
				stop = 0;
			}
			else {
				stop = 1;
				if (n > m){
					aux = n;
					n = m;
					m = aux;
				}
				for (int x = n; x <= m; x++){
					System.out.printf("%d ",x);
					soma = soma + x;
				}
				System.out.printf("Sum=%d\n",soma);
				soma = 0;
			}
		}
		sc.close();
	}
}