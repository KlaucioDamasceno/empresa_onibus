package empresa_onibus;
import model.Rota;
import java.util.ArrayList;

import model.Empresa;
import model.Proprietario; 
import model.Onibus;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthToggleButtonUI;
public class App {

	public static void main(String[] args) {
		
		//Criar Lista de Proprietários da Empresa
		ArrayList<Proprietario> proprietarios = new ArrayList<Proprietario>();
		//Setar Lista de Proprietários da Empresa
		proprietarios.add(new Proprietario("669.626.690-97", "Pedro Paulo Viera Bezerra"));
		proprietarios.add(new Proprietario("150.068.770-73", "Rômulo Pereira Nishiyama"));
		
		//Criar Lista de Onibus da Empresa
		ArrayList<Onibus> frota = new ArrayList<Onibus>();
		//Setar Lista de Proprietários da Empresa
		frota.add(new Onibus("Apache VIP V MIDI", "18757375947", "JFI-8524", "Caio", 2012, 57));
		frota.add(new Onibus("Apache VIP V MIDI", "10919931755", "JKA-8906", "Caio", 2017, 76));
		frota.add(new Onibus("Apache VIP V MIDI", "25390042213", "JHD-4037", "Caio", 2018, 84));
		
		
		Empresa empresa = new Empresa("76.557.867/0005-38", "AUTO VIACAO MARECHAL", "AUTO VIACAO MARECHAL LTDA",proprietarios, frota);
			
	
		boolean viagem = true;
		Scanner in = new Scanner(System.in);
		//Iniciar uma viagem;
		
	
		
		//Cadastrar um rota
		System.out.println("Deseja cadastrar uma rota?");
		System.out.println("Digite Sim ou Não: ");
		String entrada = in.next().toUpperCase();
		ArrayList<Rota> rotas = new ArrayList<Rota>();
		
		
		while(entrada.equals("SIM")) {
			Rota rota = new Rota();
			//Cidade
			System.out.println("Qual cidade da Rota: ");
			rota.setCidade(in.next());
			//linha
			System.out.println("Digite a Linha a ser cadastrada: ");
			rota.setLinha(in.next());
			//Origem
			System.out.println("Digite o local de origem: ");
			rota.setOrigem(in.next());
			//Destino
			System.out.println("Digite o local de destino: ");
			rota.setDestino(in.next());
			//Valor da Passagem
			System.out.println("Digite o valor da passagem: ");
			rota.setValor_passagem(in.nextDouble());
			//Quantidade de paradas da rota
			System.out.println("Quantas paradas tem a rota: ");
			rota.setParadas(in.nextInt());
			
			rotas.add(rota);
			
			System.out.println("Deseja cadastrar uma rota?");
			System.out.println("Digite Sim ou Não: ");
			entrada = in.next().toUpperCase();
		}
		
		
		for(Rota rota: rotas) {
			//while(rotas.size() > 0) {
				System.out.println("*** Bem Vindo ***\n");
				System.out.println("Qual Ônibus fará essa rota "+rota.getOrigem()+ " -> "+rota.getDestino());
				System.out.println("Digite um número para escolher:\n");
				for(Onibus onibus: frota) {
					if(onibus.isEmViagem() == false) {
						System.out.println(+frota.indexOf(onibus)+ " - "+ onibus.getModelo()+ "com Capacidade p/"+onibus.getCapacidade()+" passageiros.");
					}else{
						System.out.println("Este Ônibus está em viagem");
					}
					
				}
				
				int escolha = in.nextInt();
				rota.setOnibus(frota.get(escolha));
				rota.getOnibus().setEmViagem(true);
				System.out.println(rota.getLinha()+" - "+rota.getOrigem()+" com destino "+rota.getDestino());
				
						
				for(int j = rota.getParadas(); j > 0 ; j--) {
					System.out.println("\nÔnibus com "+ rota.getOnibus().getCapacidade()+ " vagas." );
					
						
					if(rota.getOnibus().getCapacidade() > 0) {
						System.out.println("Entrou algum passageiro na parada "+j);
						int passageiro = in.nextInt();
						rota.setQuantidade_passageiros(passageiro);
						rota.getOnibus().verificarCapacidade(passageiro);
					}else {
						System.out.println("Ônibus atingiu a capacidade máxima...pegue o próximo!!!\n");
						break;
					}
				}	
		}
		in.close();
		
		for(Rota rota : rotas) {
			rota.encerrarViagem();
			System.out.println(rota.toString());
		}
	
	}
	
}
