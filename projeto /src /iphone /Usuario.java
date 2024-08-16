package iphone;

public class Usuario {
    public static void main(String[] args) {
        Iphone iphone5 = new Iphone();

        // Testando funcionalidades de música através do iPhone
        System.out.println(" ");
        iphone5.tocarMusica();
        iphone5.selecionarMusica();
        iphone5.aumentarVolume();
        iphone5.abaixarVolume();
        iphone5.pausarMusica();

        // Testando funcionalidades de navegador através do iPhone
        System.out.println(" ");
        iphone5.pesquisarNoGoogle();
        iphone5.exibirPaginaNoGoogle();
        iphone5.adicionarNovaAbaNoGoogle();
        iphone5.atualizarPaginaNoGoogle();

        iphone5.pesquisarNoSafari();
        iphone5.exibirPaginaNoSafari();
        iphone5.adicionarNovaAbaNoSafari();
        iphone5.atualizarPaginaNoSafari();

        // Testando funcionalidades de telefone
        System.out.println(" ");
        iphone5.ligar();
        iphone5.atender();
        iphone5.desligar();
        iphone5.inicarCorreioVoz();
    }
}
