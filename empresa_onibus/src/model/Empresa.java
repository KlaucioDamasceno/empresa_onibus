package model;

import java.util.ArrayList;

public class Empresa {
	private String cnpj;
	private String nome_fantasia;
	private String razao_social;
	private ArrayList<Proprietario> proprietarios;
	private ArrayList<Onibus> onibus;
	
	
	
	public Empresa() {}
	
	public Empresa(String cnpj, String nome_fantasia, String razao_social, ArrayList<Proprietario> proprietarios,
			ArrayList<Onibus> onibus) {
		this.cnpj = cnpj;
		this.nome_fantasia = nome_fantasia;
		this.razao_social = razao_social;
		this.proprietarios = proprietarios;
		this.onibus = onibus;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getNome_fantasia() {
		return nome_fantasia;
	}

	public void setNome_fantasia(String nome_fantasia) {
		this.nome_fantasia = nome_fantasia;
	}

	public String getRazao_social() {
		return razao_social;
	}

	public void setRazao_social(String razao_social) {
		this.razao_social = razao_social;
	}

	public ArrayList<Proprietario> getProprietarios() {
		return proprietarios;
	}

	public void setProprietarios(ArrayList<Proprietario> proprietarios) {
		this.proprietarios = proprietarios;
	}

	public ArrayList<Onibus> getOnibus() {
		return onibus;
	}

	public void setOnibus(ArrayList<Onibus> onibus) {
		this.onibus = onibus;
	}
	

	@Override
	public String toString() {
		return "Empresa\n\n"
				+ "Cnpj: " + cnpj +"\nNome Fantasia: " + nome_fantasia + "\nRazão Social: " + razao_social
				+ "\n\nProprietários:\n" + proprietarios.toString() + "\n\nFrota\n" + onibus + "]";
	}
	
	

}
