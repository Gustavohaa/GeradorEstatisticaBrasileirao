package Trabalho;

public class GolsChute implements Estatistica{

	 @Override
	    public String imprimir(Jogo jogo) {
	        return "Total de gols no jogo: " + (jogo.getTimeMandante().getGolsTimeMandante() + jogo.getTimeVisitante().getGolsTimeVisitante()) + System.lineSeparator() +
	                "O time mandante fez " + jogo.getTimeMandante().getGolsTimeMandante() + " gols" + System.lineSeparator() +
	                "O time visitante fez " + jogo.getTimeVisitante().getGolsTimeVisitante() + " gols" + System.lineSeparator() +
	                "O time mandante chutou " + jogo.getTimeMandante().getChutesAGolTimeMandante() + " vezes no gol" + System.lineSeparator() +
	                "O time visitante chutou " + jogo.getTimeVisitante().getChutesAGolTimeVisitante() + " vezes no gol" + System.lineSeparator();
	    }
	}


