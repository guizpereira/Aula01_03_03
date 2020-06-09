package br.usjt.SpringBootLab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.usjt.SpringBootLab.model.Cidade;

public interface CidadeRepository extends JpaRepository <Cidade, Long>{
}

