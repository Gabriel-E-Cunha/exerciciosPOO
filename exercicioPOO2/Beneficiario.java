package exercicioPOO2;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public abstract class Beneficiario extends Pessoa {

	private Categoria categoria;
	private int mesesBeneficio;
	private double valorBeneficio;
	private ArrayList<Regra> regrasAplicadas = new ArrayList<Regra>();

	public Beneficiario(String nomeCompleto, Date dataNascimento, String estado, Categoria categoria) {
		super(nomeCompleto, dataNascimento, estado);
		this.categoria = categoria;
	}
	
	public String toString() {
		String dataNascimento = new SimpleDateFormat("dd/MM/yyyy").format(this.getDataNascimento());
		return this.getNomeCompleto() + " nascido em " + dataNascimento + " no estado " + this.getEstado() + " se encaixa na categoria de " + this.getCategoria().getDescricao();
	}
	
	public String beneficio() {
		if(this.isBeneficiario()) {
			return this.getNomeCompleto() + " tem direito ao benef�cio no valor de R$ " + String.valueOf(this.valorBeneficio) + " durante " + String.valueOf(this.mesesBeneficio) + " meses.";
		}
		return this.getNomeCompleto() + " n�o tem direito ao benef�cio.";
	}
	
	public String regrasAplicadas() {
		String regrasAplicadas = "Regras aplicadas:\n";
		if(this.regrasAplicadas.size() == 0) {
			regrasAplicadas += "N�o foi aplicada nenhuma regra espec�fica.\n";
		}
		for (int i = 0; i < this.regrasAplicadas.size(); i++) {
			Regra regraAplicada = this.regrasAplicadas.get(i);
			regrasAplicadas += "> " + regraAplicada.getLetra() + " - " + regraAplicada.getDescricao() + "\n";
		}
		return regrasAplicadas;
	}
	
	public int compareTempo(Beneficiario beneficiario) {
		if(this.mesesBeneficio < beneficiario.getMesesBeneficio()) {
			return 1;
		} else if(this.mesesBeneficio > beneficiario.getMesesBeneficio()) {
			return -1;
		} else {
			return 0;
		}
	}
	
	public int compareValor(Beneficiario beneficiario) {
		if(this.valorBeneficio < beneficiario.getValorBeneficio()) {
			return 1;
		} else if(this.valorBeneficio > beneficiario.getValorBeneficio()) {
			return -1;
		} else {
			return 0;
		}
	}
	
	public boolean isBeneficiario() {
		return !(this.mesesBeneficio == 0 || this.valorBeneficio == 0);
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public int getMesesBeneficio() {
		return mesesBeneficio;
	}

	public void setMesesBeneficio(int mesesBeneficio) {
		this.mesesBeneficio = mesesBeneficio;
	}

	public double getValorBeneficio() {
		return valorBeneficio;
	}

	public void setValorBeneficio(double valorBeneficio) {
		this.valorBeneficio = valorBeneficio;
	}
	
	public void addRegraAplicada(Regra regra) {
		this.regrasAplicadas.add(regra);
	}
	
}
