package net.redleon;


import net.redleon.estructuras.Info;
import net.redleon.estructuras.ListaLigada;
import net.redleon.interfaces.Ipieza;

public class Main {
	
	public static void main(String[] argv){
//		ListaLigada<Info> lista = new ListaLigada<Info>();
//		lista.agregaInicio(new Info(1,1,Ipieza.ARRIBA));
//		lista.agregaInicio(new Info(1,2,Ipieza.ABAJO));
//		lista.recorrerRecursivo(lista.getStart());
//		System.out.print(lista.obtenFinal().getDato().toString());		
//		System.out.print(lista.obtenFinal().getDato().toString());	
		
		Juego juego = new Juego();
		juego.jugar();
	}

}
