package org.aluraspring.models;

import javax.persistence.Entity;

@Entity
public class Produto {
	
	private String descricao;
	private String titulo;
	private int paginas;
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getPaginas() {
		return paginas;
	}
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	
	@Override
	public String toString() {
		return "Produto \n titulo=" + titulo + " \n descricao=" + descricao + " \n paginas=" + paginas ;
	}

}
