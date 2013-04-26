package net.redleon;

import net.redleon.estructuras.Gusano;
import net.redleon.estructuras.Tablero;
import net.redleon.interfaces.Ipieza;

public class Juego {
	
	private Tablero tablero = new Tablero(10,10);
	
	public void jugar(){
		Gusano gusano = new Gusano(tablero);
		System.out.println(gusano.toString());
		gusano.comer();
		gusano.comer();
		System.out.println(gusano.toString());
		gusano.mover(gusano.getStart());
		gusano.mover(gusano.getStart());
		gusano.mover(gusano.getStart());
		System.out.println(gusano.toString());
		gusano.cambiaDireccion(Ipieza.ABAJO);
		gusano.mover(gusano.getStart());
		System.out.println(gusano.toString());
		gusano.mover(gusano.getStart());
		System.out.println(gusano.toString());
		gusano.mover(gusano.getStart());
		System.out.println(gusano.toString());
		//gusano.mover(gusano.getStart());
		//System.out.println(gusano.toString());
		
	}

}
