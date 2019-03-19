package org.aluraspring.models;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produto {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private String descricao;
	private String titulo;
	private int paginas;
	@ElementCollection
	private List<Preco> precos;
	
	
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
	
	public int getId() {
		return id;
	}
	public boolean addPreco(Preco novoPreco){
		for(int contador = 0; contador < this.precos.size(); contador++){
			if(this.precos.get(contador).getTipo().equals(novoPreco.getTipo())){
				this.precos.remove(contador);
			}
		}
		return this.precos.add(novoPreco);
	}
	public List<Preco> getPrecos() {
		return precos;
	}
	public void setPrecos(List<Preco> precos) {
		this.precos = precos;
	}
	@Override
	public String toString() {
		return "Produto \n titulo=" + titulo + " \n descricao=" + descricao + " \n paginas=" + paginas ;
	}
}
