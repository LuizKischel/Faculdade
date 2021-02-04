package Avaliacao2;

import java.util.Objects;

public class Nacional extends Produto {
	
	private Categoria categoria;
	
	public Nacional (int codigo, String descricao, double precoCusto, Categoria categoria) {
		super(codigo, descricao, precoCusto);
		this.categoria = categoria;
	}
	
	public double getPrecoFinal () {
		double acrescimo = 0;
		double precoFinal;
		if(this.categoria == categoria.ARTESANAL) {
			acrescimo = 50;
		}
		if (this.categoria == categoria.INDUSTRIALIZADO) {
			acrescimo = 30;
		}
		precoFinal = this.getPrecoCusto() + ((acrescimo / 100) * this.getPrecoCusto());
		return precoFinal;
	}

	@Override
	public int hashCode() {
		return Objects.hash(getCodigo(), getDescricao(), getPrecoCusto(), categoria);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Nacional other = (Nacional) obj;
		return categoria == other.categoria && //
				this.getCodigo() == other.getCodigo() && //
				this.getDescricao() == other.getDescricao() && //
				this.getPrecoCusto() == other.getPrecoCusto();
	}
	
	public Categoria getCategoria () {
		return this.categoria;
	}

	@Override
	public String toString() {
		return "Nacional [categoria=" + categoria + ", getPrecoFinal()=" + getPrecoFinal() + ", hashCode()="
				+ hashCode() + ", getCategoria()=" + getCategoria() + ", getPrecoCusto()=" + getPrecoCusto()
				+ ", getCodigo()=" + getCodigo() + ", getDescricao()=" + getDescricao() + ", getClass()=" + getClass()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	

}
