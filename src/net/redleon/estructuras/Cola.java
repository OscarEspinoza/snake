package net.redleon.estructuras;

import net.redleon.interfaces.Icola;

public class Cola implements Icola<Info>{

	ListaLigada<Info> lista;
		
	@Override
	public Info elimina() {
		return lista.obtenFinal().getDato();
	}

	@Override
	public Info obten() {
		return lista.obtenFinalSinEliminar().getDato();
	}
	
	@Override
	public void inserta(Info valor) {
		lista.agregaInicio(valor);
		
	}

	@Override
	public boolean isEmpty() {
		if(lista.start == null){
			return true;
		}else {
			return false;
		}
	}
	
	

}
