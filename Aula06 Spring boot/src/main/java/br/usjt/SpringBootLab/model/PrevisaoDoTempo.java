package br.usjt.SpringBootLab.model;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data @Entity @Getter @Setter @AllArgsConstructor @NoArgsConstructor @Table(name="tb_previsaodotempo")
public class PrevisaoDoTempo implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY ) //Tipo de chave primaria (1,2,3,4,5,6...)
	private Long id;
	@Column (nullable=false, length=100)
	private double temperaturamin;
	@Column (nullable=false, length=100)
	private double temperaturamax;
	@Column (nullable=false, length=100)
	private double umidaderelativadoar;
	@Column (nullable=false, length=100)
	private String data;
	@Column (nullable=false, length=100)
	private String hora;
	@Column (nullable=false, length=100)
	private String descricao;

	@OneToOne (optional = false)
	@JoinColumn (name = "diadasemana")
	private DiasDaSemana diadasemana;

	@ManyToOne (cascade = CascadeType.ALL)
	private Cidade cidade;
}
