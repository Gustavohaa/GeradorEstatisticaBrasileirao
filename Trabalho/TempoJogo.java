package Trabalho;

public class TempoJogo implements Estatistica{

	 @Override
	    public String imprimir(Jogo jogo) {
	        return
	                "A bola ficou rolando por " + (((double) jogo.getTempoTotalBolaRolandoEmMin() / jogo.getTempoTotalJogoEmMin()) * 100) + "% do tempo de jogo" + System.lineSeparator() +
	                        "O time mandante ficou " + (((double) jogo.getTimeMandante().getPosseBolaTimeMandanteDefesaEmMin() / (jogo.getTimeMandante().getPosseBolaTimeMandanteDefesaEmMin() + jogo.getTimeMandante().getPosseBolaTimeMandanteAtaqueEmMin())) * 100) + "% do tempo de jogo na defesa" + System.lineSeparator() +
	                        "O time mandante ficou " + (((double) jogo.getTimeMandante().getPosseBolaTimeMandanteAtaqueEmMin() / (jogo.getTimeMandante().getPosseBolaTimeMandanteDefesaEmMin() + jogo.getTimeMandante().getPosseBolaTimeMandanteAtaqueEmMin())) * 100) + "% do tempo de jogo no ataque" + System.lineSeparator() +
	                        "O time visitante ficou " + (((double) jogo.getTimeVisitante().getPosseBolaTimeVisitanteDefesaEmMin() / (jogo.getTimeVisitante().getPosseBolaTimeVisitanteDefesaEmMin() + jogo.getTimeVisitante().getPosseBolaTimeVisitanteAtaqueEmMin())) * 100) + "% do tempo de jogo na defesa" + System.lineSeparator() +
	                        "O time visitante ficou " + (((double) jogo.getTimeVisitante().getPosseBolaTimeVisitanteAtaqueEmMin() / (jogo.getTimeVisitante().getPosseBolaTimeVisitanteDefesaEmMin() + jogo.getTimeVisitante().getPosseBolaTimeVisitanteAtaqueEmMin())) * 100) + "% do tempo de jogo no ataque" + System.lineSeparator();
	    }
	}


