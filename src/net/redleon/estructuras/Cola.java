package net.redleon.estructuras;

import net.redleon.interfaces.Icola;

public class Cola implements Icola<Info> {

	private ListaLigada<Info> lista = new ListaLigada<Info>();

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
		if (lista.start == null) {
			return true;
		} else {
			return false;
		}
	}

	public Cola duplica() {
		
		Cola nuevo = new Cola();
		if (lista != null) {
			
			Nodo<Info> p = lista.start;
			while (p != null) {
				nuevo.inserta(new Info(p.getDato().getX(), p.getDato().getY(),
						p.getDato().getDireccion(), p.getDato()
								.getDirecciones(),null));
				p = p.getSiguiente();
			}
		}
		return nuevo;
	}

}
