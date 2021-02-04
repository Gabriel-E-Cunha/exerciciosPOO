package exercicioClasses;

import java.sql.Date;

public class Produto {

	private String nome;
	private double preco;
	private int quantidade;
	private int codigo;
	private String paisOrigem;
	private Date validae;
	private Date dataFabricacao;
	private double custoFabricacao;
	private double avaliacao;
	private int quantidadeVendida;
	
	
	
	public Produto(String nome, double preco, int quantidade, int codigo, String paisOrigem, Date validae,
			Date dataFabricacao, double custoFabricacao, double avaliacao, int quantidadeVendida) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
		this.codigo = codigo;
		this.paisOrigem = paisOrigem;
		this.validae = validae;
		this.dataFabricacao = dataFabricacao;
		this.custoFabricacao = custoFabricacao;
		this.avaliacao = avaliacao;
		this.quantidadeVendida = quantidadeVendida;
	}

	public void vender() {
		System.out.println("Produto vendido");
	}
	
	public void comprarEstoque() {
		System.out.println("Comprando estoque");
	}
	
	public void avaliar() {
		System.out.println("Avaliando");
	}
	
	public void calcularPreco() {
		System.out.println("Calculando preco");
	}
	
	public void calcularPrecoFabricacao() {
		System.out.println("Calculando preco fabricacao");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getPaisOrigem() {
		return paisOrigem;
	}

	public void setPaisOrigem(String paisOrigem) {
		this.paisOrigem = paisOrigem;
	}

	public Date getValidae() {
		return validae;
	}

	public void setValidae(Date validae) {
		this.validae = validae;
	}

	public Date getDataFabricacao() {
		return dataFabricacao;
	}

	public void setDataFabricacao(Date dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}

	public double getCustoFabricacao() {
		return custoFabricacao;
	}

	public void setCustoFabricacao(double custoFabricacao) {
		this.custoFabricacao = custoFabricacao;
	}

	public double getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(double avaliacao) {
		this.avaliacao = avaliacao;
	}

	public int getQuantidadeVendida() {
		return quantidadeVendida;
	}

	public void setQuantidadeVendida(int quantidadeVendida) {
		this.quantidadeVendida = quantidadeVendida;
	}
	
	
	
}
