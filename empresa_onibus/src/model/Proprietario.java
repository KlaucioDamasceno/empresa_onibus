package model;

public class Proprietario {
	private String nome;
	private String cpf;
	
	public Proprietario() {}
	
	public Proprietario(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "Proprietario Nome: " + nome + " - Cpf: " + cpf + "";
	}
	
	

}
