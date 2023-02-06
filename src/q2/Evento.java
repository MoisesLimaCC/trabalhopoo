package q2;

public class Evento {
	 private String descricao, time1, time2;
	    private double peso1, peso2, peso3;
	    private Resultado resultado;
	    
	    public Evento(String descricao, String time1, String time2, double peso1, double peso2, double peso3) {
	        this.descricao = descricao;
	        this.time1 = time1;
	        this.time2 = time2;
	        this.peso1 = peso1;
	        this.peso2 = peso2;
	        this.peso3 = peso3;
	    }

	    public Resultado getResultado() {
	        return resultado;
	    }

	    public void setResultado(Resultado resultado) {
	        this.resultado = resultado;
	    }

	    public String getDescricao() {
	        return descricao;
	    }

	    public String getTime1() {
	        return time1;
	    }

	    public String getTime2() {
	        return time2;
	    }

	    public double getPeso1() {
	        return peso1;
	    }

	    public double getPeso2() {
	        return peso2;
	    }

	    public double getPeso3() {
	        return peso3;
	    }
}
