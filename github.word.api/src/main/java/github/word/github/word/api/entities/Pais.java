package github.word.github.word.api.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity(name="tb_paises")
public class Pais {
	

@GeneratedValue(strategy =GenerationType.IDENTITY)
@Id
 private Integer id;
@Column(nullable = false, length = 50)
 private String nome;
@Column(nullable = false, length = 50)
 private String regiao;
@Column(nullable = false, length = 10)
 private Integer area;

	public Pais() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRegiao() {
		return regiao;
	}

	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}

	public Integer getArea() {
		return area;
	}

	public void setArea(Integer area) {
		this.area = area;
	}
 
 
 
	
	
}
