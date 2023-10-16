package iphone1.iphoneCliente;

import java.util.Random;
import java.util.Scanner;
import iphone1.fabrica.IphoneFabrica;

public class Iphone extends IphoneFabrica {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);	
		Iphone iphone = new Iphone();
		
		System.out.println("Ola, bem vindo ao lançamento no primriro iPhone");
		System.out.println("Digite o nome da cor que voce deseja seu iPhone.");
		String cor = scanner.nextLine();
		System.out.println("Agora digite a capacidade de memoria que vc deseja, 60gb ou 120gb? ");
		String memoria = scanner.nextLine();
		 
		Random random = new Random();
        int numeroSerie = random.nextInt(101);
        
        String descricao = "Descrição do seu iPhone: " + "cor: " + cor + ", memoria: " + memoria + ", numero de serie: " + numeroSerie;
        
        System.out.println(descricao);
        System.out.println();
        System.out.println("Aplicativo de musica vem com as seguntes funçoes: ");
		iphone.selecionarMusica();    
        iphone.tocarMusica();
        iphone.pausarMusica();
        System.out.println();
        System.out.println("funçoes do aplicativo de telefone");
        iphone.fazerLigacao();
        iphone.atenderLigacao();
        iphone.iniciarCorreioVoz();
        System.out.println();
        System.out.println("funçoes do aplicativo de Internet");
        iphone.exibirPagina();
        iphone.atualizarPagina();
        iphone.adicionarNovaAba();
    }		   
}


