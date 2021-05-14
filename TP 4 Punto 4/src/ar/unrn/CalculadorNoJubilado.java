package ar.unrn;

public class CalculadorNoJubilado extends Calculador{

	public CalculadorNoJubilado(int mesEnPromocion) {
		super(mesEnPromocion);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double mesEnPromocion(double precioProducto) {
		// TODO Auto-generated method stub
		return (precioProducto * 0.15) + precioProducto;
	}

	@Override
	public double mesSinPromocion(double precioProducto) {
		// TODO Auto-generated method stub
		return (precioProducto * 0.21) + precioProducto;
	}

}
