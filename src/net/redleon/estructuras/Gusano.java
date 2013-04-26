package net.redleon.estructuras;

import net.redleon.interfaces.Ipieza;

public class Gusano extends ListaLigada<Info> {

	
	Tablero tablero;
	/**
	 * Constructor de la clase
	 */
	public Gusano(Tablero tablero) {
		this.tablero = tablero;
		agregaFinal(new Info(0, 0, Ipieza.DERECHA,tablero));
	}

	/**
	 * Este metodo mueve todas las piezas del gusano, lo hace iterando en cada
	 * elemento del mismo y actualizando sus coordenadas en base a la direccion
	 * 
	 * @param p
	 */
	public void mover(Nodo<Info> p) {
		if (p != null) {
			p.getDato().mover(getStart());
			mover(p.getSiguiente());
		}

	}

	/**
	 * Este metodo cambia la direccion a una específica definida.
	 * 
	 * @param direccion
	 */
	public void cambiaDireccion(char direccion) {
		start.getDato().setDireccion(direccion);
		cambiaDireccionR(start.getSiguiente(), start.getDato());
	}

	/**
	 * Metodo recursivo para cambiar la direccion de todos los elementos.
	 * 
	 * @param p
	 * @param q
	 */
	private void cambiaDireccionR(Nodo<Info> p, Info q) {
		if (p != null) {
			p.getDato().getDirecciones()
					.inserta(new Info(q.getX(), q.getY(), q.getDireccion(), null));
			cambiaDireccionR(p.getSiguiente(),q);
		}

	}

	/**
	 * Metodo que sirve para agregar una pieza mas a la lista ligada.
	 */
	public void comer() {
		
		Nodo<Info> nodo = obtenFinalSinEliminar();
		Info dato = null;
		switch (nodo.getDato().getDireccion()) {
		case Ipieza.ABAJO:
			dato = new Info(nodo.getDato().getX(), nodo.getDato().getY() - 1,
					start.getDato().getDireccion(), nodo.getDato()
							.getDirecciones().duplica(),tablero);
			break;
		case Ipieza.ARRIBA:
			dato = new Info(nodo.getDato().getX(), nodo.getDato().getY() + 1,
					start.getDato().getDireccion(), nodo.getDato()
							.getDirecciones().duplica(),tablero);
			break;
		case Ipieza.IZQUIERDA:
			dato = new Info(nodo.getDato().getX() + 1, nodo.getDato().getY(),
					start.getDato().getDireccion(), nodo.getDato()
							.getDirecciones().duplica(),tablero);
			break;
		case Ipieza.DERECHA:
			dato = new Info(nodo.getDato().getX() - 1, nodo.getDato().getY(),
					start.getDato().getDireccion(), nodo.getDato()
							.getDirecciones().duplica(),tablero);
			break;

		default:
			break;
		}
		agregaFinal(dato);
	}

	public String toS(Nodo<Info> p, String resultado) {
		if (p != null) {
			resultado = toS(p.getSiguiente(), resultado
					+ p.getDato().toString());
		}
		return resultado;

	}

	@Override
	public String toString() {
		return "Gusano: " + toS(start, "");
	}
}
