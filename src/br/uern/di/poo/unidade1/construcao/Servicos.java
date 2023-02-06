package br.uern.di.poo.unidade1.construcao;

public class Servicos {
	  private static final float LUXO_PERCENTUAL = 0.1f;
	    private static final float INSTALACAO_POR_METRO_QUADRADO = 70.0f;
	    private static final float INSTALACAO_PORTA_PIVOTANTE = 250.0f;

	    public static float calcularServico(Porta porta) {
	        float valor = 0.0f;

	        if (porta.getTipo() == TipoDePorta.LUXO) {
	            valor += (porta.getTipo().getPreco() * LUXO_PERCENTUAL);
	        } else if (porta.isPivotante()) {
	            valor += INSTALACAO_PORTA_PIVOTANTE;
	        } else {
	            valor += porta.getLargura() * porta.getAltura() * INSTALACAO_POR_METRO_QUADRADO;
	        }

	        return valor;
	    }
}
