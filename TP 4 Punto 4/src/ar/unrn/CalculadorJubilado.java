package ar.unrn;

public class CalculadorJubilado extends Calculador{

	public CalculadorJubilado(int mesEnPromocion) {
		super(mesEnPromocion);
	}

	@Override
	public double mesEnPromocion(double precioProducto) {
		return precioProducto;
	}

	@Override
	public double mesSinPromocion(double precioProducto) {
		return (precioProducto * 0.1) + precioProducto;
	}

}
