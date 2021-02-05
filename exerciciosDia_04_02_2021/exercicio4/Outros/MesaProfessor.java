package exerciciosDia_04_02_2021.exercicio4.Outros;

import java.sql.Date;

public class MesaProfessor {

	private String material;
	private Date dataFabricacao;
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public Date getDataFabricacao() {
		return dataFabricacao;
	}
	public void setDataFabricacao(Date dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}
	public MesaProfessor(String material, Date dataFabricacao) {
		super();
		this.material = material;
		this.dataFabricacao = dataFabricacao;
	}
	
	
	
}
