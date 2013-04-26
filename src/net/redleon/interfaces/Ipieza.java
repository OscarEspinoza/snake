package net.redleon.interfaces;

import net.redleon.estructuras.Nodo;

public interface Ipieza<T> {
	
	public static char ARRIBA = 'U';
	public static char ABAJO = 'D';
	public static char IZQUIERDA = 'L';
	public static char DERECHA = 'R';
	
	
	public void mover(Nodo<T> start);
	
	public Integer getX();
	public Integer getY();
	public void setX(Integer valor);
	public void setY(Integer valor);
	
	public char getDireccion();
	public void setDireccion(char valor);
	
	
	

}
