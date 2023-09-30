package loops;

public class BreakContinue {

	public static void main(String[] args) {
		/*
		 * sentencias utilizadas en loops:
		 * --break. Se utiliza par salir de un bucle en un puntoespecifico
		 * -- continue. Interrumpe la iteracion de un bucle, si se produce una condicion especifica y continua con la siguiente.
		 * 
		 */
		   //super ozzito va a realizar una rifa en la cual el cliente numero 5 se ganara una coca cola de bolsita
		for (int cliente = 1; cliente <=20;cliente++) {
			if(cliente ==5) {
				System.out.println("Eres el cliente numero " + cliente+"Ganasteeee");
				continue;
			}System.out.println("Cliente numero " + cliente );
		}
		} 
		

	}


