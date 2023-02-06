package br.uern.di.poo.unidade1.construcao;

public class Porta {
	 private TipoDePorta tipo;
	    private float largura, altura;
	    private boolean pivotante;

	    private static final float PRECO_PIVOTANTE = 350.0f;
	    private static final float ALTURA_PADRAO = 1.8f;
	    private static final float LARGURA_PADRAO = 0.7f;

	    public Porta() {
	        this.tipo = TipoDePorta.SIMPLES;
	        this.largura = LARGURA_PADRAO;
	        this.altura = ALTURA_PADRAO;
	        this.pivotante = false;
	    }

	    public Porta(TipoDePorta tipo, float largura, float altura, boolean pivotante) {
	        this.tipo = tipo;
	        this.largura = largura;
	        this.altura = altura;
	        this.pivotante = pivotante;
	    }

	    public float calculaPreco() {
	        float preco = getLargura() * getAltura() * getTipo().getPreco();

	        if (isPivotante()) {
	            return PRECO_PIVOTANTE + preco;
	        }

	        return preco;
	    }

	    public String exibePorta() {
	        return "Material: " + getTipo().getMaterial() + "\nFechadura: " + getTipo().getFechadura() + "\nLargura: " + getLargura() + "\nAltura: " + getAltura() + "\nÉ pivotante? " + (isPivotante() ? "Sim" : "Não");
	    }

	    public TipoDePorta getTipo() {
	        return tipo;
	    }

	    public float getLargura() {
	        return largura;
	    }

	    public float getAltura() {
	        return altura;
	    }

	    public float getPRECO_PIVOTANTE() {
	        return PRECO_PIVOTANTE;
	    }

	    public float getALTURA_PADRAO() {
	        return ALTURA_PADRAO;
	    }

	    public float getLARGURA_PADRAO() {
	        return LARGURA_PADRAO;
	    }

	    public boolean isPivotante() {
	        return pivotante;
	    }
}

