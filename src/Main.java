import smartphone.Iphone;

public class Main {
    public static void main(String[] args) {

        Iphone iphone = new Iphone();

        //Função de Telefone
        System.out.println( "******** ********** " );
        System.out.println( "Função deTelefone " );
        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();

        //Função de Reprodutor Musical
        System.out.println( " " );
        System.out.println( "******** ********** " );
        System.out.println( "Função Reprodutor Musical " );
        iphone.selecionarMusica();
        iphone.tocarMusica();
        iphone.pausarMusica();

        //Função de Navegador Internet
        System.out.println( " " );
        System.out.println( "******** ********** " );
        System.out.println( "Função de Navegador de Internet " );
        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
        }
    }
