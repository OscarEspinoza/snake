package net.redleon.interfaces;

public interface Ipieza {
	
	public static char ARRIBA = 'U';
	public static char ABAJO = 'D';
	public static char IZQUIERDA = 'L';
	public static char DERECHA = 'R';
	
	
	public void mover();
	
	public Integer getX();
	public Integer getY();
	public void setX(Integer valor);
	public void setY(Integer valor);
	
	public char getDireccion();
	public void setDireccion(char valor);
	
	
	

}
