package iniciante;

/*
Dois carros (X e Y) partem em uma mesma dire��o. O carro X sai com velocidade constante de 
60 Km/h e o carro Y sai com velocidade constante de 90 Km/h.

Em uma hora (60 minutos) o carro Y consegue se distanciar 30 quil�metros do carro X, ou seja, 
consegue se afastar um quil�metro a cada 2 minutos.

Leia a dist�ncia (em Km) e calcule quanto tempo leva (em minutos) para o carro Y tomar essa dist�ncia do outro carro.

Entrada
O arquivo de entrada cont�m um n�mero inteiro.

Sa�da
Imprima o tempo necess�rio seguido da mensagem "minutos".
*/

import java.io.IOException;
import java.util.Scanner;

public class URI1016 {

	public static void main(String[] args) throws IOException {
		
        Scanner scan = new Scanner(System.in);
        int distancia = scan.nextInt();
        
        int tempo = (60 * distancia) / 30;
        
        System.out.println(tempo + " minutos");
        
        scan.close();
	}
}
