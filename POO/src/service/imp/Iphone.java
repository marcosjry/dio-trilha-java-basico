package service.imp;

import service.Contatos;
import service.NavegadorInternet;
import service.ReprodutorMusical;

public class Iphone implements Contatos, NavegadorInternet, ReprodutorMusical{
    final boolean touchScreen = true;
    static int volume = 0;
    public static void conectaInternet() {
        System.out.println("Conectado na Internet");
    }
    public static void aumentarVolumeBotao() {
        volume++;
    }
    public static void diminuirVolumeBotao() {
        volume--;
    }
    public static void voltaInicioBotao() {
        System.err.println("Você voltou a tela inicial");
    }
    public static void voltarSeção() {
        System.out.println("Você voltou uma seção");
    }

    @Override
    public void aumentarVolume() {
        System.out.println("Aumentou volume");
    }
    @Override
    public void reproduzMusica() {
        System.out.println("Reproduzindo musica");
    }
    @Override
    public void reproduzProxima() {
        System.out.println("Reproduzindo Proxima Musica");
    }
    @Override
    public void reproduzAnterior() {
        System.out.println("Reproduzindo musica anterior");
    }
    @Override
    public void pausa() {
        System.out.println("Musica Pausada");
    }
    @Override
    public void seleciona() {
        System.out.println("Musica Selecionada");
    }

    @Override
    public void exibePagina() {
        System.out.println("Exibindo Pagina");
    }
    @Override
    public void abrirNovaAba() {
        System.out.println("Abriu nova Aba"); 
    }
    @Override
    public void fecharAba() {
        System.out.println("Fechou Aba");
    }
    @Override
    public void Atualizar() {
        System.out.println("Pagina Atualizada.");
    }
    
    @Override
    public void adicionaContato() {
        System.out.println("Contato Adicionado");
    }
    @Override
    public void iniciaCorreioVoz() {
        System.out.println("Correio de voz iniciado.");
    }
    @Override
    public void fazerLigacao() {
        System.out.println("Ligação Feita");
    }
    @Override
    public void finalizarLigacao() {
        System.out.println("Ligação Finalizada.");
    }
}
