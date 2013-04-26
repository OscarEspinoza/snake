package net.redleon.estructuras;

import net.redleon.interfaces.Ipieza;

public class Gusano extends ListaLigada<Info>{
	
	public Gusano(){
		agregaFinal(new Info(0,0,Ipieza.DERECHA));
	}
	
	public void mover(Nodo<Info> p) {
		if (p != null) {
			p.getDato().mover(getStart());
			mover(p.getSiguiente());
		}

	}
	
	public void cambiaDireccion(char direccion){
		start.getDato().setDireccion(direccion);
	  	cambiaDireccionR(start.getSiguiente(), start.getDato());
	}
	
	public void cambiaDireccionR(Nodo<Info> p, Info q) {
		if (p != null) {
			p.getDato().getDirecciones().inserta(new Info(q.getX(), q.getY(), q.getDireccion()));
			recorrerRecursivo(p.getSiguiente());
		}

	}

}
