package EstruturaControle;

import java.util.Locale;
import java.util.Scanner;

public class desafiowhile2 {
 public static void main(String[] args) {
	 Scanner entrada = new Scanner (System.in); 
	 entrada.useLocale(Locale.ENGLISH);
	 int quantidadesDeNotas = 0;
	 double nota = 0;
	 double total = 0;
	 
	 //calculo de media de notas com a saida ligada a -1; com a média <= 10 && >=0; necessitando utilizar o =1 ou qualquer outra variavel para o calculo da media final
	 while (nota != -1 ) {
		 System.out.println("Digite uma nota ");
		 	nota = entrada.nextDouble();
		 
		 if (nota <= 10 && nota >= 0) {
			 total += nota;
			 quantidadesDeNotas++;

		 }
	 }
	 
	 double media = total / quantidadesDeNotas;
	 System.out.println("A média e " + media);
	 
	 
	 
	 entrada.close();
	 
	 
}
}
