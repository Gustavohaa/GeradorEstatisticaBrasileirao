package Trabalho;

public class main {
	public static void main(String[] args) {
        TimeMandante mandante = new TimeMandante(2, 4, 3, 78, 40, 17, 25);
        TimeVisitante visitante = new TimeVisitante(1, 4, 7, 9, 10, 15, 14);
        Jogo jogo = new Jogo(mandante, visitante, 1, 1);

        GerenciadorEstatisticas faltasCartoes = new GerenciadorEstatisticas(new FaltasCartoes());
        GerenciadorEstatisticas golsChute = new GerenciadorEstatisticas(new GolsChute());
        GerenciadorEstatisticas tempoJogo = new GerenciadorEstatisticas(new TempoJogo());

        tempoJogo.imprimir(jogo);
        golsChute.imprimir(jogo);
        faltasCartoes.imprimir(jogo);
    }
}