package net.redleon.estructuras;

import net.redleon.exceptions.ColisionException;
import net.redleon.interfaces.Ipieza;
import net.redleon.interfaces.Itablero;

public class Info implements Ipieza<Info> {

	private Integer x;
	private Integer y;
	private char direccion;
	private Itablero tablero;
	private Cola direcciones;

	public Info(Integer x, Integer y, char direccion, Tablero tablero) {
		this.x = x;
		this.y = y;
		this.direccion = direccion;
		direcciones = new Cola();
		this.tablero = tablero;
	}

	public Info(Integer x, Integer y, char direccion, Cola direcciones,
			Tablero tablero) {
		this.x = x;
		this.y = y;
		this.tablero = tablero;
		this.direccion = direccion;
		this.direcciones = direcciones;
	}

	@Override
	public void mover(Nodo<Info> start) {
		switch (direccion) {
		case Ipieza.ARRIBA:
			if (y - 1 <= 0) {
				throw new ColisionException();
			}
			y--;
			// No es el inicio de la lista
			if (this != start.getDato()) {
				// Hay elementos en la cola
				if (!direcciones.isEmpty()) {
					// La casilla en la que estoy es la misma en la que se va a
					// dar vuelta
					if (direcciones.obten().comparaInfo(this)) {
						Info infotemp = direcciones.elimina();
						this.direccion = infotemp.getDireccion();
					}
				}
			}
			break;
		case Ipieza.ABAJO:
			if (y + 1 >= tablero.getMaxY()) {
				throw new ColisionException();
			}
			// direcciones.inserta(new Info(this.x,this.y,Ipieza.ABAJO));
			y++;
			// No es el inicio de la lista
			if (this != start.getDato()) {
				// Hay elementos en la cola
				if (!direcciones.isEmpty()) {
					// La casilla en la que estoy es la misma en la que se va a
					// dar vuelta
					if (direcciones.obten().comparaInfo(this)) {
						Info infotemp = direcciones.elimina();
						this.direccion = infotemp.getDireccion();
					}
				}
			}
			break;
		case Ipieza.IZQUIERDA:
			if (x - 1 <= 0) {
				throw new ColisionException();
			}
			// direcciones.inserta(new Info(this.x,this.y,Ipieza.IZQUIERDA));
			x--;
			// No es el inicio de la lista
			if (this != start.getDato()) {
				// Hay elementos en la cola
				if (!direcciones.isEmpty()) {
					// La casilla en la que estoy es la misma en la que se va a
					// dar vuelta
					if (direcciones.obten().comparaInfo(this)) {
						Info infotemp = direcciones.elimina();
						this.direccion = infotemp.getDireccion();
					}
				}
			}
			break;
		case Ipieza.DERECHA:
			if (x + 1 >= tablero.getMaxX()) {
				throw new ColisionException();
			}
			// direcciones.inserta(new Info(this.x,this.y,Ipieza.DERECHA));
			x++;
			// No es el inicio de la lista
			if (this != start.getDato()) {
				// Hay elementos en la cola
				if (!direcciones.isEmpty()) {
					// La casilla en la que estoy es la misma en la que se va a
					// dar vuelta
					if (direcciones.obten().comparaInfo(this)) {
						Info infotemp = direcciones.elimina();
						this.direccion = infotemp.getDireccion();
					}
				}
			}
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
		return ">>Pieza|x:" + x + "|y:" + y + "|dir:" + direccion + "|dirs:"
				+ (direcciones == null ? "NO" : "OK," + direcciones.isEmpty())
				+ "|tabl:" + (tablero == null ? "NO" : tablero.toString())
				+ "<<";
	}

	public boolean comparaInfo(Info nodo) {
		if (this.x == nodo.getX() && this.y == nodo.getY()) {
			return true;
		} else {
			return false;
		}
	}

	public Cola getDirecciones() {
		return direcciones;
	}

}
