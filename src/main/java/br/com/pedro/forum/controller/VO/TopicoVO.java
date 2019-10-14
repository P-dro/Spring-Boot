package br.com.pedro.forum.controller.VO;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import br.com.pedro.forum.model.Topico;

public class TopicoVO {
	
	private Long id;
	private String titulo;
	private String mensagem;
	private LocalDateTime dataCriacao;
	
	public TopicoVO(Topico topico) {
		this.id = topico.getId();
		this.titulo = topico.getTitulo();
		this.mensagem = topico.getMensagem();
		this.dataCriacao = topico.getDataCriacao();
	}

	public Long getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getMensagem() {
		return mensagem;
	}

	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}

	public static List<TopicoVO> converter(List<Topico> topicos) {
		
		return topicos.stream().map(TopicoVO::new).collect(Collectors.toList());
	}
	
}
