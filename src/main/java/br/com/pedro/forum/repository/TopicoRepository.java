package br.com.pedro.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import  br.com.pedro.forum.model.Topico;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TopicoRepository extends JpaRepository<Topico, Long> {

    List<Topico> findByCurso_Nome(String nomeCurso);

//    @Query("SELECT t FROM Topico t WHERE t.curso.nome = :nomeCurso")
//    List<Topico> consultaPorNome(@Param("nomeCurso") String nomeCurso);
}
