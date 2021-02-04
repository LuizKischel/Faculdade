package Avaliacao2;

import java.util.Objects;

public class Importado extends Produto{
	
	private double taxaImportacao;
	
	public Importado (int codigo, String descricao, double precoCusto, double taxaImportacao) {
		super(codigo, descricao, precoCusto);
		this.taxaImportacao = taxaImportacao;
	}
	
	public double getPrecoMinimo () {
		double precoMinimo;
		precoMinimo = this.getPrecoCusto() + (taxaImportacao / 100 * this.getPrecoCusto());
		return precoMinimo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(getCodigo(), getDescricao(), getPrecoCusto(), taxaImportacao);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Importado other = (Importado) obj;
		return taxaImportacao == other.taxaImportacao && //
				this.getCodigo() == other.getCodigo() && //
				this.getDescricao() == other.getDescricao() && //
				this.getPrecoCusto() == other.getPrecoCusto();
	}
}
