package funcionalidades.musica;

public class AppleMusic implements ReprodutorMusical{
    public void tocar() {
        System.out.println("Tocando música...");
    }

    public void pausar() {
        System.out.println("Música pausada...");
    }

    public void selecionarMusica() {
        System.out.println("Escolhendo música...");
    }

    public void aumentarVolume() {
        System.out.println("Aumentando volume...");
    }

    public void abaixarVolume() {
        System.out.println("Abaixando volume...");
    }
}

