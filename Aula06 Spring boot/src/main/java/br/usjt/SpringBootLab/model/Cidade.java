package br.usjt.SpringBootLab.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data @Entity @Getter @Setter @AllArgsConstructor @NoArgsConstructor @Table(name="tb_cidade")
public class Cidade implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY ) //Tipo de chave primaria (1,2,3,4,5,6...)
	private Long id;
	@Column (nullable=false, length=100)
	private String cidade;
	@Column (nullable=false, length=100)
	private String latitude;
	@Column (nullable=false, length=100)
	private String longitude;

	@OneToMany (mappedBy = "cidade", cascade = CascadeType.ALL)
	private List<PrevisaoDoTempo> previsaodotempo;
}
