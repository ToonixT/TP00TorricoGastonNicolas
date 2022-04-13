package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Calculadora {

	private int numeroa;
	private int numerob;

	public Calculadora() {

	}

	public int getNumeroa() {
		return numeroa;
	}

	public void setNumeroa(int numeroa) {
		this.numeroa = numeroa;
	}

	public int getNumerob() {
		return numerob;
	}

	public void setNumerob(int numerob) {
		this.numerob = numerob;
	}

	public int suma() {
		return numeroa + numerob;

	}

	public int resta() {
		return numeroa - numerob;

	}

	public int dividir() {
		return numeroa / numerob;

	}

	public int multiplicar() {
		return numeroa * numerob;

	}

	public double potencia() {
		return Math.pow(numeroa, numerob);
	}

	
	//raiz de del valor a con el valor b de indice
	public float raiz() { 
		double base, exp;
		base = numeroa;
		exp = numerob;

		return (float) Math.pow(base, 1 / exp);
	}

}
