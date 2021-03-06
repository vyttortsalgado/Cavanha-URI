/*-------------------*
| Rodrigo CavanhaMan |
| URI 1187           |
| Area Superior      |
*--------------------*/
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		//MATRIZ[LINHA][COLUNA]
		
		char T = sc.next().charAt(0);
		double SOMA=0, MEDIA=0;
		double[][] n = new double[12][12];

		for(int l=0; l<12; l++)
			for(int c=0; c<12; c++)
				n[l][c] = sc.nextDouble();

		for(int l=0; l<12; l++)
			for(int c=0; c<12; c++){
				if (c > l && (c+l < 11)) {
				SOMA += n[l][c];
				if (n[l][c] != 0)
					MEDIA++;
				}
			}
			
		if (T == 'S')
			System.out.printf("%.1f\n",SOMA);
		if (T == 'M')
			System.out.printf("%.1f\n",SOMA/MEDIA);

		sc.close();
	}
}
/*
for(int i = 0; i < 12; i++){
            for(int j = 0; j < 12; j++){
                   cin >> N[i][j];
            if(j > i && (j+i) < 11){
                 soma += N[i][j];
            }
            }
   }		
 */
		
		
