package br.uern.di.poo.unidade1.construcao;

public enum TipoDePorta {
		SIMPLES("Madeira Compensada", "Fechadura Simples", 50.0f),
	    PADRAO("Madeira Andiroba", "Fechadura de Encaixe", 140.0f),
	    LUXO("Madeira Ipê", "Fechadura Tetra", 350.0f);

	    private final String material;
	    private final String fechadura;
	    private final float preco;

	    TipoDePorta(String material, String fechadura, float preco) {
	        this.material = material;
	        this.fechadura = fechadura;
	        this.preco = preco;
	    }

	    public String getMaterial() {
	        return material;
	    }

	    public String getFechadura() {
	        return fechadura;
	    }

	    public float getPreco() {
	        return preco;
	    }
}
