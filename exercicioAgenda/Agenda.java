package exercicioAgenda;

import java.util.ArrayList;

public class Agenda {

	private ArrayList<Contato> contatos = new ArrayList<Contato>();
	
	public void incluir(Contato contato) {
		this.contatos.add(contato);
	}
	
	public void excluir(Contato contato) {
		this.contatos.remove(contato);
	}
	
	public void listar() {
		for (int i = 0; i < this.contatos.size(); i++) {
			System.out.println(String.valueOf(i) + this.contatos.get(i).toString());
		}
	}
	
	public void alterar(Contato contato, Contato novoContato) {
		for (int i = 0; i < this.contatos.size(); i++) {
			if(this.contatos.get(i).equals(contato)) {
				this.contatos.remove(i);
				this.contatos.add(i, novoContato);
				break;
			}
		}
	}
			
}
