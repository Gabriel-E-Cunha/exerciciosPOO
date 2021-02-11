package exerciciosPolimorfismo;

import java.util.Date;

public class Gerente extends Funcionario {

	private double desconto = .72;
	private double imposto = 1.11;
	
	public Gerente(Date dataNascimento, String nome) {
		super(dataNascimento, nome);
		// TODO Auto-generated constructor stub
	}
	
}
