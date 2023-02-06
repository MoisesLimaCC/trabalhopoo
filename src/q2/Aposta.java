package q2;

public class Aposta {

    private Evento evento;
    private Resultado resultado;
    private double valorApostado;

    public Aposta(Evento evento, Resultado resultado, double valorApostado) {
        this.evento = evento;
        this.resultado = resultado;
        this.valorApostado = valorApostado;
    }

    public int calculaLucro(Evento evento) {
        int lucro = 0;
        if (evento.getResultado() == Resultado.TIME1) {
            lucro = (int) (getValorApostado() * evento.getPeso1());
        } else if (evento.getResultado() == Resultado.EMPATE) {
            lucro = (int) (getValorApostado() * evento.getPeso2());
        } else if (evento.getResultado() == Resultado.TIME2) {
            lucro = (int) (getValorApostado() * evento.getPeso3());
        }

        return lucro;
    }

    public Evento getEvento() {
        return evento;
    }

    public Resultado getResultado() {
        return resultado;
    }

    public double getValorApostado() {
        return valorApostado;
    }
}
