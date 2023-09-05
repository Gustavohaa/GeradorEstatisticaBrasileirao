package Trabalho;

public class Jogo {

	 private TimeMandante timeMandante;
	    private TimeVisitante timeVisitante;
	    private int tempoTotalBolaRolandoEmMin;
	    private int tempoTotalJogoEmMin;

	    public Jogo(TimeMandante timeMandante, TimeVisitante timeVisitante, int tempoTotalBolaRolandoEmMin, int tempoTotalJogoEmMin) {
	        this.timeMandante = timeMandante;
	        this.timeVisitante = timeVisitante;
	        this.tempoTotalBolaRolandoEmMin = tempoTotalBolaRolandoEmMin;
	        this.tempoTotalJogoEmMin = tempoTotalJogoEmMin;
	    }

	    public TimeMandante getTimeMandante() {
	        return timeMandante;
	    }

	    public TimeVisitante getTimeVisitante() {
	        return timeVisitante;
	    }

	    public int getTempoTotalBolaRolandoEmMin() {
	        return tempoTotalBolaRolandoEmMin;
	    }

	    public int getTempoTotalJogoEmMin() {
	        return tempoTotalJogoEmMin;
	    }
}