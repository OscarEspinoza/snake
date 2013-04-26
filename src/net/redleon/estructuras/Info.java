package net.redleon.estructuras;

import net.redleon.exceptions.ColisionException;
import net.redleon.interfaces.Ipieza;
import net.redleon.interfaces.Itablero;

public class Info implements Ipieza {

	private Integer x;
	private Integer y;
	private char direccion;
	private Itablero tablero;

	public Info(Integer x, Integer y, char direccion) {
		this.x = x;
		this.y = y;
		this.direccion = direccion;
	}

	@Override
	public void mover() {
		switch (direccion) {
		case Ipieza.ARRIBA:
			y--;
			if (y <= 0)
				throw new ColisionException();
			break;
		case Ipieza.ABAJO:
			y++;
			if (y >= tablero.getMaxY())
				throw new ColisionException();

			break;
		case Ipieza.IZQUIERDA:
			x--;
			if (x <= 0)
				throw new ColisionException();

			break;
		case Ipieza.DERECHA:
			x++;
			if (x >= tablero.getMaxX())
				throw new ColisionException();

			break;
		}

	}

	@Override
	public Integer getX() {
		return x;
	}

	@Override
	public Integer getY() {
		return y;
	}

	@Override
	public void setX(Integer valor) {
		x = valor;

	}

	@Override
	public void setY(Integer valor) {
		y = valor;

	}

	@Override
	public char getDireccion() {
		return direccion;
	}

	@Override
	public void setDireccion(char valor) {
		direccion = valor;
	}

	@Override
	public String toString() {
		return "Pieza: " + x + "|" + y + "|" + direccion;
	}

}
