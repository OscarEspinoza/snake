package net.redleon.interfaces;

public interface Icola<T> {
	
	public T elimina();
	
	public T obten();
		
	public void inserta(T valor);
	
	public boolean isEmpty();
	
}
