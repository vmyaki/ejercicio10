import java.util.Scanner;

public class clase10 {

	public static void main(String[] args) {
		// Declaramos e inicializamos variables
		
			int mensajesDia,mensajesSemana,mensajesMes,mensajesSegundos;
			
			//Declaramos constante
			final int SEGUNDOS_DIA=24*60*60; //calculo de los segundos al dia
			
			//Pedimos por teclado
			System.out.print("\n¿Cúantos mensajes por segundo recibes?:");
			Scanner teclado=new Scanner (System.in);
			mensajesSegundos=teclado.nextInt();
			
			//Cálculos
			mensajesDia=SEGUNDOS_DIA*mensajesSegundos; //segundos que tiene un dia *  mensajes introducidos
			mensajesSemana=SEGUNDOS_DIA*mensajesSegundos*7;
			mensajesMes=SEGUNDOS_DIA*mensajesSegundos*30;
			
			System.out.println("Mensajes por segundo: 30\n"); // \n para salto de linea
			//podemos quitar al print el ‘ln’ y añadir al final de la linea \n y ya tenemos el salto de linea
			System.out.print("Mensajes al dia por segundo: "+mensajesDia+"\n");	
			System.out.println("Mensajes a la semana por segundo: "+mensajesSemana);
			System.out.println("Mensajes al mes por segundo: "+mensajesMes);
			//prueba
	}

}
