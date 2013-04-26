package net.redleon.estructuras;

public class Nodo<T> {

	private T dato;
	private Nodo<T> siguiente;

	public Nodo<T> getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Nodo<T> valor) {
		siguiente = valor;
	}

	public Nodo() {

	}

	public Nodo(T dato) {
		this.dato = dato;
	}

	public T getDato() {
		return dato;
	}

	public void setDato(T dato) {
		this.dato = dato;
	}

}
