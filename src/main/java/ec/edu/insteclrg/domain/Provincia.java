package ec.edu.insteclrg.domain;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
@Entity 
@Getter
@Setter
public class Provincia {
@Id
@Column(updatable = false,nullable = false)
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;	
@Column(nullable = false)
private String nombre;

@Column
private String acronimo;
}
