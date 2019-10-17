package br.com.pedro.forum;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import br.com.pedro.forum.controller.VO.DetalhaTopicoVO;
import br.com.pedro.forum.controller.form.AtulalizacaoTopicoForm;
import br.com.pedro.forum.controller.form.TopicoForm;
import br.com.pedro.forum.repository.CursoRepository;
import br.com.pedro.forum.repository.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.com.pedro.forum.controller.VO.TopicoVO;
import br.com.pedro.forum.model.Topico;
import org.springframework.web.util.UriComponentsBuilder;

import javax.transaction.Transactional;
import javax.validation.Valid;


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
	@Transactional
	public ResponseEntity<TopicoVO> cadastrar(@RequestBody @Valid TopicoForm form, UriComponentsBuilder uriBuilder) {
		Topico topico = form.converter(cursoRepository);
		topicoRepository.save(topico);

		URI uri = uriBuilder.path("/topicos/{id}").buildAndExpand(topico.getId()).toUri();
		return ResponseEntity.created(uri).body(new TopicoVO(topico));
	}

	@GetMapping("/{id}")
	public ResponseEntity<DetalhaTopicoVO> detalhar(@PathVariable Long id) {
		Optional<Topico> optional = topicoRepository.findById(id);
		if (optional.isPresent()) {
			return ResponseEntity.ok(new DetalhaTopicoVO(optional.get()));
		}

		return ResponseEntity.notFound().build();
	}

	@PutMapping("/{id}")
	@Transactional
	public ResponseEntity<TopicoVO> atualizar(@PathVariable Long id, @RequestBody @Valid AtulalizacaoTopicoForm form) {
		Optional<Topico> optional = topicoRepository.findById(id);
		if (optional.isPresent()) {
			Topico topico = form.atualizar(id, topicoRepository);
			return ResponseEntity.ok(new TopicoVO(topico));
		}

		return ResponseEntity.notFound().build();
	}

	@DeleteMapping("/{id}")
	@Transactional
	public ResponseEntity<?> remover(@PathVariable Long id) {

		Optional<Topico> optional = topicoRepository.findById(id);
		if (optional.isPresent()) {
			topicoRepository.deleteById(id);
			return ResponseEntity.ok().build();
		}

		return ResponseEntity.notFound().build();
	}

}

