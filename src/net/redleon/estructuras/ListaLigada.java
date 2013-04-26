package net.redleon.estructuras;

public class ListaLigada<T> {

	protected Nodo<T> start;

	public void agregaInicio(T dato) {
		Nodo<T> p = start;
		Nodo<T> nuevo = new Nodo<T>(dato);
		nuevo.setSiguiente(p);
		start = nuevo;

	}

	public void agregaFinal(T dato) {
		Nodo<T> nuevo = new Nodo<T>(dato);
		if (start == null) {
			start = nuevo;
		} else {
			Nodo<T> p = start;
			while (p.getSiguiente() != null) {
				p = p.getSiguiente();
			}
			p.setSiguiente(nuevo);
		}
	}

	public Nodo<T> obtenFinal() {
		Nodo<T> elemento = null;
		if (start != null) {
			Nodo<T> p = start;
			Nodo<T> q = start;
			while (p.getSiguiente() != null) {
				q = p;
				p = p.getSiguiente();
			}
			elemento = p;
			if (q == p) {
				start = null;
			} else {
				q.setSiguiente(null);
			}
		}
		return elemento;
	}

	public Nodo<T> obtenFinalSinEliminar() {
		Nodo<T> elemento = null;
		if (start.getSiguiente() == null) {
			elemento = start;
		} else {
			if (start != null) {
				Nodo<T> p = start;
				Nodo<T> q = start;
				while (p.getSiguiente() != null) {
					q = p;
					p = p.getSiguiente();
				}
				elemento = p;

			}
		}
		return elemento;
	}

	public Nodo<T> obtenInicio() {
		Nodo<T> elemento = null;
		if (start != null) {
			start = start.getSiguiente();
		}
		return elemento;
	}

	public void recorrerRecursivo(Nodo<T> p) {
		if (p != null) {
			recorrerRecursivo(p.getSiguiente());
		}

	}

	public Nodo<T> getStart() {
		return start;
	}
}
