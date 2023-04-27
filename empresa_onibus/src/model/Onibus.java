package model;

public class Onibus {
	private String modelo;
	private String renavam;
	private String placa;
	private String fabricante;
	private int ano;
	private int capacidade;
	private boolean emViagem;
	
	
	
	public Onibus() {}

	public Onibus(String modelo, String renavam, String placa, String fabricante, int ano, int capacidade) {
		this.modelo = modelo;
		this.renavam = renavam;
		this.placa = placa;
		this.fabricante = fabricante;
		this.ano = ano;
		this.capacidade = capacidade;
		this.emViagem = false;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getRenavam() {
		return renavam;
	}

	public void setRenavam(String renavam) {
		this.renavam = renavam;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public int getCapacidade() {
		return capacidade;
	}

	public void verificarCapacidade(int passageiro) {
		if(this.capacidade > 0) {
			this.capacidade = this.capacidade - passageiro;
		}else {
			System.out.println("Ônibus Lotado!!!!!");
		}
		
		
	}	
	@Override
	public String toString() {
		return "\nÔnibus\nModelo: " + modelo + "\nRenavam:" + renavam + "\nPlaca: " + placa + "\nFabricante:" + fabricante
				+ "\nAno:" + ano + "\nCapacidade: " + capacidade + "\n";
	}

	public boolean isEmViagem() {
		return emViagem;
	}

	public void setEmViagem(boolean emViagem) {
		this.emViagem = emViagem;
	}
	

}
