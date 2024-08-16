package iphone;

import funcionalidades.telefone.AppTelefone;
import funcionalidades.navegador.Google;
import funcionalidades.navegador.Safari;
import funcionalidades.musica.AppleMusic;

public class Iphone extends AppTelefone {
    private final AppleMusic appleMusic = new AppleMusic();
    private final Google google = new Google();
    private final Safari safari = new Safari();

    public void tocarMusica() {
        appleMusic.tocar();
    }

    public void pausarMusica() {
        appleMusic.pausar();
    }

    public void selecionarMusica() {
        appleMusic.selecionarMusica();
    }

    public void aumentarVolume() {
        appleMusic.aumentarVolume();
    }

    public void abaixarVolume() {
        appleMusic.abaixarVolume();
    }

    public void pesquisarNoGoogle() {
        google.pesquisar();
    }

    public void exibirPaginaNoGoogle() {
        google.exibirPagina();
    }

    public void adicionarNovaAbaNoGoogle() {
        google.adicionarNovaAba();
    }

    public void atualizarPaginaNoGoogle() {
        google.atualizarPagina();
    }

    public void pesquisarNoSafari() {
        safari.pesquisar();
    }

    public void exibirPaginaNoSafari() {
        safari.exibirPagina();
    }

    public void adicionarNovaAbaNoSafari() {
        safari.adicionarNovaAba();
    }

    public void atualizarPaginaNoSafari() {
        safari.atualizarPagina();
    }
}
