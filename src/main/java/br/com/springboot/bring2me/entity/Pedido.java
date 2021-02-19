package br.com.springboot.bring2me.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Pedido {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	@NotBlank
	private String nome;
	@NotBlank
	private String urlProduto;
	@NotBlank
	private String urlImagem;
	@NotBlank
	private String descrição;
	@Enumerated(EnumType.STRING)
	private Status status = Status.PENDENTE;
	private BigDecimal valor;
	private LocalDate dataCompra;
	private LocalDate dataEntrega;
	
}
