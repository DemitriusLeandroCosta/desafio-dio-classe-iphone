package smartphone;

import interfeces.AparelhoTelefonico;
import interfeces.NavegadorInternet;
import interfeces.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet {
    //Função de Aparelho Telefonico
    @Override
    public void ligar() {
        System.out.println("Ligando para um número de Telefone");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo uma ligação do telefone");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando um Correio de Voz");
    }

    //Função de Reprodutor Musical
    @Override
    public void tocarMusica() {
        System.out.println("Tocando uma música");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando uma música");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Pausando uma música");
    }

    //Função de Navegador Internet

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo uma página da Internet - URL");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando uma nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando uma página da Internet - URL");
    }
}



