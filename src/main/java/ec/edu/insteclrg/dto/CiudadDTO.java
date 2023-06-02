package ec.edu.insteclrg.dto;

import ec.edu.insteclrg.domain.Provincia;
import lombok.Data;

@Data
public class CiudadDTO {
	
    private Long id;
	private String nombre;
    private Provincia provincia;
    
}
