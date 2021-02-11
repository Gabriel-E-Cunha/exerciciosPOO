package exerciciosPolimorfismo;

import java.util.Date;

public class Funcionario extends Pessoa {
	
	private double desconto = .75;
	private double imposto = 1.11;
	
	public Funcionario(Date dataNascimento, String nome) {
		super(dataNascimento, nome);
		// TODO Auto-generated constructor stub
	}
	
	protected double getDesconto(double valorCompra) {
		return valorCompra * (1 - this.desconto);
	}
	
	protected double getImposto(double valorCompra) {
		return valorCompra * (this.imposto - 1);
	}

	public String calcularPreco(double valorCompra) {
		return "Valor final: R$ " + String.valueOf(valorCompra - this.getDesconto(valorCompra) + this.getImposto(valorCompra)) + 
				"\nValor descontado: R$ " + String.valueOf(this.getDesconto(valorCompra)) + 
				"\nValor de imposto: R$ " + String.valueOf(this.getImposto(valorCompra));
	}
	
}
