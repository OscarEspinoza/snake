package net.redleon;


import net.redleon.estructuras.Info;
import net.redleon.estructuras.ListaLigada;
import net.redleon.interfaces.Ipieza;

public class Main {
	
	public static void main(String[] argv){
		ListaLigada<Info> lista = new ListaLigada<Info>();
		lista.agregaFinal(new Info(1,1,Ipieza.ARRIBA));
		lista.recorrerRecursivo(lista.getStart());
		
	}

}
