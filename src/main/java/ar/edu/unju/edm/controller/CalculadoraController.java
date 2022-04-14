package ar.edu.unju.edm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ar.edu.unju.edm.model.Calculadora;


@Controller 
public class CalculadoraController {

	@GetMapping ("/menu")
	public String mostrarMenuCalculadora() {
			return "index"; 
	}
	
	@GetMapping("/calculoSuma")
	public String getSumaPage (@RequestParam (name="num1") int num1, @RequestParam (name="num2") int num2, Model model) {
		int resultadoS=0; 
		
		Calculadora nuevaCalculadora = new Calculadora();
		nuevaCalculadora.setNumeroa(num1);
		nuevaCalculadora.setNumerob(num2);	
		resultadoS = nuevaCalculadora.suma(); 
		model.addAttribute("resultadoS", resultadoS);
		return "resultado";
	}
	
	@GetMapping("/calculoResta")
	public String getRestaPage (@RequestParam (name="num1") int num1, @RequestParam (name="num2") int num2, Model model) {
		int resultadoR=0; 
		
		Calculadora nuevaCalculadora = new Calculadora();
		nuevaCalculadora.setNumeroa(num1);
		nuevaCalculadora.setNumerob(num2);	
		resultadoR = nuevaCalculadora.resta(); 
		model.addAttribute("resultadoR", resultadoR);
		return "resultadoresta";
	}
	
	@GetMapping("/calculoMul")
	public String getMulPage (@RequestParam (name="num1") int num1, @RequestParam (name="num2") int num2, Model model) {
		int resultadoM=0; 
		
		Calculadora nuevaCalculadora = new Calculadora();
		nuevaCalculadora.setNumeroa(num1);
		nuevaCalculadora.setNumerob(num2);	
		resultadoM = nuevaCalculadora.multiplicar(); 
		model.addAttribute("resultadoM", resultadoM);
		return "resultadomul";
	}
	
	@GetMapping("/calculoDiv")
	public String getDivPage (@RequestParam (name="num1") int num1, @RequestParam (name="num2") int num2, Model model) {
		int resultadoD=0; 
		
		Calculadora nuevaCalculadora = new Calculadora();
		nuevaCalculadora.setNumeroa(num1);
		nuevaCalculadora.setNumerob(num2);	
		resultadoD = nuevaCalculadora.dividir();
		model.addAttribute("resultadoD", resultadoD);
		return "resultadodiv";
	}
	
	@GetMapping("/calculoPot")
	public String getPotPage (@RequestParam (name="num1") int num1, @RequestParam (name="num2") int num2, Model model) {
		double resultadoP=0; 
		
		Calculadora nuevaCalculadora = new Calculadora();
		nuevaCalculadora.setNumeroa(num1);
		nuevaCalculadora.setNumerob(num2);	
		resultadoP = nuevaCalculadora.potencia(); 
		model.addAttribute("resultadoP", resultadoP);
		return "resultadopot";
	}
	
	@GetMapping("/calculoRz")
	public String getRaizPage (@RequestParam (name="num1") int num1, @RequestParam (name="num2") int num2, Model model) {
		double resultadoRz=0; 
		
		Calculadora nuevaCalculadora = new Calculadora();
		nuevaCalculadora.setNumeroa(num1);
		nuevaCalculadora.setNumerob(num2);	
		resultadoRz = nuevaCalculadora.raiz(); 
		model.addAttribute("resultadoRz", resultadoRz);
		return "resultadoraiz";
	}
	
	
}
