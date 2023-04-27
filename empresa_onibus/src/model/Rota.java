package model;

public class Rota {
	private Onibus onibus;
	private String linha;
	private String origem;
	private String destino;
	private String cidade;
	private double valor_passagem;
	private double caixa;
	private int quantidade_passageiros;
	private int paradas;
	
	public Rota() {}
	
	public Rota(String linha, String origem, String destino, String cidade, double valor_passagem, int paradas) {
		this.linha = linha;
		this.origem = origem;
		this.destino = destino;
		this.cidade = cidade;
		this.valor_passagem = valor_passagem;
		this.quantidade_passageiros = 0;
		this.paradas = paradas;
	}


	public Onibus getOnibus() {
		return onibus;
	}

	public void setOnibus(Onibus onibus) {
		this.onibus = onibus;
	}

	public String getLinha() {
		return linha;
	}

	public void setLinha(String linha) {
		this.linha = linha;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public double getValor_passagem() {
		return valor_passagem;
	}

	public void setValor_passagem(double valor_passagem) {
		this.valor_passagem = valor_passagem;
	}
	public double getCaixa() {
		return caixa;
	}
	
	public int getQuantidade_passageiros() {
		return quantidade_passageiros;
	}
	

	public int getParadas() {
		return paradas;
	}
	
	public void setParadas(int paradas) {
		this.paradas = paradas;
	}
	
	public void setCaixa(double caixa) {
		this.caixa = caixa;
	}

	public void setQuantidade_passageiros(int quantidade_passageiros) {
		this.quantidade_passageiros += quantidade_passageiros;
	}
	
	public void verificarParadas(int paradas) {
		this.paradas -= paradas;
	}

	public double fecharEncerrarViagem() {
		this.caixa = this.valor_passagem * this.quantidade_passageiros;
		return  this.caixa;	
	}

	@Override
	public String toString() {
		return "\nÔnibus: " + onibus.getModelo()+" - "+onibus.getAno()  + "\nLinha - " + linha + "\nOrigem: " + origem + " - Destino: " + destino
				+ "\nCidade: " + cidade + "\nValor da Passagem R$ " + valor_passagem + "\nCaixa Total após viagem: R$ " + caixa
				+ "\nQuantidade de passageiros: " + quantidade_passageiros + "\nNúmero de Paradas: " + paradas + "";
	}
	
}
