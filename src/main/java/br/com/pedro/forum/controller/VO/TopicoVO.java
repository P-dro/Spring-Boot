package br.com.pedro.forum.controller.VO;

import br.com.pedro.forum.model.Topico;
import org.springframework.data.domain.Page;

import java.time.LocalDateTime;

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

	public static Page<TopicoVO> converter(Page<Topico> topicos) {
		
		return topicos.map(TopicoVO::new);
	}
	
}
