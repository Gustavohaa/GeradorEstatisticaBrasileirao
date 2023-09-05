package Trabalho;

public class FaltasCartoes implements Estatistica {
	
	 @Override
	    public String imprimir(Jogo jogo) {
	        int totalFaltas = jogo.getTimeMandante().getFaltasTimeMandante() + jogo.getTimeVisitante().getFaltasTimeVisitante();
	        int faltasTimeMandante = jogo.getTimeMandante().getFaltasTimeMandante();
	        int faltasTimeVisitante = jogo.getTimeVisitante().getFaltasTimeVisitante();

	        return "Total de Faltas: " + totalFaltas + System.lineSeparator() +
	                "O time mandante teve " + (((double) faltasTimeMandante / totalFaltas) * 100) + "% das faltas do jogo" + System.lineSeparator() +
	                "O time visitante teve " + (((double) faltasTimeVisitante / totalFaltas) * 100) + "% das faltas do jogo" + System.lineSeparator() +
	                "Total de cartões amarelos do time visitante: " + jogo.getTimeVisitante().getCartoesAmarelosVisitante() + System.lineSeparator() +
	                "Total de cartões vermelhos do time visitante: " + jogo.getTimeVisitante().getCartoesVermelhosVisitante() + System.lineSeparator() +
	                "Total de cartões amarelos do time mandante: " + jogo.getTimeMandante().getCartoesAmarelosMandante() + System.lineSeparator() +
	                "Total de cartões vermelhos do time mandante: " + jogo.getTimeMandante().getCartoesVermelhosMandante() + System.lineSeparator();
	    }
}


