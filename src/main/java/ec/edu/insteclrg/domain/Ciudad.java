package ec.edu.insteclrg.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;
@Entity //(name = "Ciudades")
@Getter
@Setter
public class Ciudad {
	
	@Id
	@Column(updatable = false,nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_1;	
	@Column(nullable = false)
	private String nombre;

	@ManyToOne
	@JoinColumn (name ="id")
	private Provincia PROVINCIAS;

	
	 
	}

