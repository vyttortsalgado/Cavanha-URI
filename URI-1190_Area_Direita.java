/*-------------------*
| Rodrigo CavanhaMan |
| URI 1190           |
| Area Direta        |
*--------------------*/
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		//MATRIZ[LINHA][COLUNA]
		int L, C=5;
		char T = sc.next().charAt(0);
		double SOMA=0.0, MEDIA=0.0;
		double[][] MATRIX = new double[12][12];

		//-------MATRIX BEGIN-------------------
		for(int l=0; l<12; l++)
			for(int c=0; c<12; c++)
				MATRIX[l][c] = sc.nextDouble();
		//-------MATRIX END---------------------

		int p=11;
		int q=7;
		for(L=1 ; L<=10 ; L++){
			 
			if (L <= 5){
				for(C=p ; C<=11 ; C++)
					SOMA+=MATRIX[L][C];
				p--;
				 
			}
			else if (L>=6){
				for(C=q ; C<=11 ; C++)
					SOMA+=MATRIX[L][C];
				q++;
			}
		}
		MEDIA = SOMA/30.0; 
		if (T == 'S')
			System.out.printf("%.1f\n",SOMA);
		
		if (T == 'M')
			System.out.printf("%.1f\n",SOMA/MEDIA);

		sc.close();
	}
}

