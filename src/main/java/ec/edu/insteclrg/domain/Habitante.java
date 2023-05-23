package ec.edu.insteclrg.domain;

import java.sql.Date;

import ec.edu.insteclrg.enums.TipoIdentificacion;
import ec.edu.insteclrg.sexo.Sexo;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Habitante {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(updatable = false, nullable = false)
	private Long id;
	
	@Column(nullable = false, length = 50)
	private String nombre;
	
	@Column(updatable = false, length = 50)
	private String apellido;
	
	@Column(updatable = false)
	private String identificacion;
	
	@Column(updatable = false)
	private Date fechaNacimiento;
	
	@Column(updatable = false, length = 50)
	private String direccion;
	
	@Column(updatable = false, length = 10)
	private String telefono;
	
	@Column(updatable = false, length = 50)
	private String email;
	
	@Column(updatable = false)
	private TipoIdentificacion tipoIdentificacion;
	
	@Column(updatable = false)
	private Sexo sexo;
	
	@Column(updatable = false)
	private byte[] foto;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = false)
	private Casa casa;
	
}