package ar.edu.unju.edm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import ar.edu.unju.edm.model.Student;
import ar.edu.unju.edm.model.Calculadora;

@SpringBootApplication
public class Tp00TorricoGastonNicolasApplication {

	public static void main(String[] args) {
		SpringApplication.run(Tp00TorricoGastonNicolasApplication.class, args);
		
	String nombre = "Nicolas";
	System.out.println( "Torrico " + nombre);
	
	Student Estudiante = new Student();
	Estudiante.setDni("45328731");
	Estudiante.setApellido("Torrico ");
	System.out.println("El estudiante " + Estudiante.getApellido() + "Dice HOLA"); 
	
	//crear un objeto de la clase calculadora
	
	Calculadora ucalculadora = new Calculadora();
	ucalculadora.setNumeroa(144); //numero a
	ucalculadora.setNumerob(2); //numero b
	
	System.out.println ("Valor numero a: " + ucalculadora.getNumeroa());  //muestra valores de los nros
	System.out.println ("Valor numero b: " + ucalculadora.getNumerob());
	
		
	//OPERACIONES
	
		System.out.println( "El resultado de la suma es: " + ucalculadora.suma()); //suma 
		System.out.println( "El resultado de la resta es: "+ ucalculadora.resta()); //resta 
		System.out.println( "El resultado de la multiplicacion es: "+ ucalculadora.multiplicar()); //multiplicacion
		System.out.println( "El resultado de la division es: " + ucalculadora.dividir()); //division
		System.out.println( "El resultado de la potencia es: " + ucalculadora.potencia()); //potencia
		System.out.println( "El resultado de la raiz del valor a con el valor b de indice es: " +ucalculadora.raiz());
			
	}

}
