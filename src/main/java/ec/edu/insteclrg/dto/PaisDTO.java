package ec.edu.insteclrg.dto;

import lombok.Data;
import jakarta.persistence.Column;

@Data
public class PaisDTO {
	
	private Long id;
    private String nombre;
	private String gentilicio;
	
	
}
