package ar.unrn;

import static java.time.LocalDate.now;
import static java.time.Month.of;

public abstract class Calculador {
	
	private LogTransaction log;
	private int mesEnPromocion;
	
	public Calculador(int mesEnPromocion) {
		super();
		this.mesEnPromocion = mesEnPromocion;
		this.log = new LogTransaction();
	}
	
	public double calcularMonto(double precioProducto) {
		double precioTotal = precioProducto;
		
		if(of(mesEnPromocion).equals(now().getMonth())) {
			precioTotal = this.mesEnPromocion(precioProducto);
		}else {
			precioTotal = this.mesSinPromocion(precioProducto);
		}
		log.log(this.getClass().getName());
		
		return precioTotal;
	}
	
	public abstract double mesEnPromocion(double precioProducto);
	public abstract double mesSinPromocion(double precioProducto);
}
