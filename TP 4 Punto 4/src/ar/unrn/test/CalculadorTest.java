package ar.unrn.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import ar.unrn.Calculador;
import ar.unrn.CalculadorJubilado;
import ar.unrn.CalculadorNoJubilado;

class CalculadorTest {

	@Test
	void testJubiladoSinPromocion() {
		Calculador calculador = new CalculadorJubilado(LocalDate.now().getMonth().getValue() - 1);

		double resultado = calculador.calcularMonto(100);

		assertEquals(110d, resultado, 0.01f);
	}

	@Test
	void testJubiladoConPromocion() {
		Calculador calculador = new CalculadorJubilado(LocalDate.now().getMonth().getValue());

		double resultado = calculador.calcularMonto(100);

		assertEquals(100d, resultado, 0.01f);
	}

	@Test
	void testNoJubiladoSinPromocion() {
		Calculador calculador = new CalculadorNoJubilado(LocalDate.now().getMonth().getValue() - 1);

		double resultado = calculador.calcularMonto(100);

		assertEquals(121d, resultado, 0.01f);
	}

	@Test
	void testNoJubiladoConPromocion() {
		Calculador calculador = new CalculadorNoJubilado(LocalDate.now().getMonth().getValue());

		double resultado = calculador.calcularMonto(100);

		assertEquals(115d, resultado, 0.01f);

	}
}
