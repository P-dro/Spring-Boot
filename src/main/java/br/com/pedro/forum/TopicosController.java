package br.com.pedro.forum;

import java.net.URI;
import java.util.List;

import br.com.pedro.forum.controller.form.TopicoForm;
import br.com.pedro.forum.repository.CursoRepository;
import br.com.pedro.forum.repository.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.com.pedro.forum.controller.VO.TopicoVO;
import br.com.pedro.forum.model.Topico;
import org.springframework.web.util.UriComponentsBuilder;


@RestController
@RequestMapping("/topicos")
public class TopicosController {

	@Autowired
	private TopicoRepository topicoRepository;

	@Autowired
	private CursoRepository cursoRepository;

	@GetMapping
	public List<TopicoVO> lista(String nomeCurso) {

		if (nomeCurso == null) {
			List<Topico> topicos = topicoRepository.findAll();
			return TopicoVO.converter(topicos);
		}else {
			System.out.println(nomeCurso);
			List<Topico> topicos = topicoRepository.findByCurso_Nome(nomeCurso);
			return TopicoVO.converter(topicos);
		}
	}
	@PostMapping
	public ResponseEntity<TopicoVO> cadastrar(@RequestBody TopicoForm form, UriComponentsBuilder uriBuilder) {
		Topico topico = form.converter(cursoRepository);
		topicoRepository.save(topico);

		URI uri = uriBuilder.path("/topicos/{id}").buildAndExpand(topico.getId()).toUri();
		return ResponseEntity.created(uri).body(new TopicoVO(topico));
	}
}

