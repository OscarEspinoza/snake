package net.redleon.estructuras;

import net.redleon.interfaces.Itablero;

public class Tablero implements Itablero{
	
	private Nodo<Info>[][] superficie;
	private int maxx;
	private int maxy;
	
	public Tablero(int cols, int rows){
		maxx = cols;
		maxy = rows;
		superficie = new Nodo[cols][rows];
	}

	@Override
	public Integer getMaxX() {
		
		return maxx;
	}

	@Override
	public Integer getMaxY() {
		return maxy;
	}
	
	@Override
	public String toString(){
		return maxx+","+maxy;
	}

}
