package interfaces;

import entity.Cuenta;
import entity.Producto;
import entity.TarjetaCredito;

public interface NumeroProducto {

	default Integer getNumeroGenerado() {

		// pregunto a que clase pertenecen
		if (this.getClass() == Cuenta.class) {
			// Casteo
			Cuenta cuenta = (Cuenta) this;
			switch (cuenta.getTipo().toUpperCase()) {
			case "CC":
				return Producto.NUMERO_CC++;
			case "CA":
				return Producto.NUMERO_CA++;
			default:
				break;
			}
		} else if (this.getClass() == TarjetaCredito.class) {
			return Producto.NUMERO_TC++;
		}

		return null;
	}
}
