package br.usjt.SpringBootLab.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data @Entity @Getter @Setter @AllArgsConstructor @NoArgsConstructor 
@Table(name="tb_diadasemana")
public class DiasDaSemana implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long id;
	private String diadasemana;


}
