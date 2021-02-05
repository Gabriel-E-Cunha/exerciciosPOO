package exerciciosDia_04_02_2021.exercicio4.Outros;

public class ComputadorRede {

	private String cpu;
	private String placaVideo;
	private double capacidadeRede;
	public ComputadorRede(String cpu, String placaVideo, double capacidadeRede) {
		super();
		this.cpu = cpu;
		this.placaVideo = placaVideo;
		this.capacidadeRede = capacidadeRede;
	}
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	public String getPlacaVideo() {
		return placaVideo;
	}
	public void setPlacaVideo(String placaVideo) {
		this.placaVideo = placaVideo;
	}
	public double getCapacidadeRede() {
		return capacidadeRede;
	}
	public void setCapacidadeRede(double capacidadeRede) {
		this.capacidadeRede = capacidadeRede;
	}

	
}

