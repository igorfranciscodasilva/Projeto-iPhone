package iphone1.fabrica;

import iphone1.interfaces.AparelhoTelefonico;
import iphone1.interfaces.NavegadorInternet;
import iphone1.interfaces.ReprodutorMusical;

public class IphoneFabrica implements ReprodutorMusical, NavegadorInternet, AparelhoTelefonico {
	
	public void selecionarMusica() {
	    System.out.println("Selecionando musica");
	}
    public void tocarMusica() {
        System.out.println("Play");
    }
    public void pausarMusica() {
        System.out.println("Pause");
    }
// interface AparelhoTelefonico
    public void fazerLigacao() {
        System.out.println("Fazendo ligação");
    }
    public void atenderLigacao() {
        System.out.println("Atendendo ligação");
    }
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }
// interface NavegadorNaInternet
    public void exibirPagina() {
        System.out.println("Exibindo pagina web");
    }
    public void atualizarPagina() {
        System.out.println("Atualizando pagina web");
    }
    public void adicionarNovaAba() {
        System.out.println("Nova aba");
    }
}
