package com.desafioapi.starwars.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor // cria automaticamente um construtor com todas os atributos da classe como argumento.
@NoArgsConstructor // cria automaticamente um construtor vazio (sem argumentos).
@Data //cria automaticamente os métodos toString, equals, hashCode, getters e setters.
@Entity
@Table(name="planeta")
public class Planeta {
	
	@Id
	private String id;

	@NotBlank
	@NotNull
	private String nome;

	@NotBlank
	@NotNull
	private String clima;

	@NotBlank
	@NotNull
	private String terreno;

	private Integer quantidadeAparicoes;

	
}
