package exerciciosPolimorfismo;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class test {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws ParseException {
		
		Funcionario funcionario = new Funcionario(new SimpleDateFormat("dd/MM/yyyy").parse("20/12/2000"), "Carlos");
		System.out.println(funcionario.calcularPreco(200));
		
		Cliente cliente = new Cliente(new SimpleDateFormat("dd/MM/yyyy").parse("20/12/2000"), "Cleiton");
		System.out.println(cliente.calcularPreco(200));
		
		Funcionario gerente = new Gerente(new SimpleDateFormat("dd/MM/yyyy").parse("20/12/2000"), "Roberto");
		System.out.println(gerente.calcularPreco(200));

	}

}
