package br.usjt.JSONREST.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.usjt.JSONREST.model.Livro;

public interface LivroRepository extends JpaRepository <Livro, Long>{
}