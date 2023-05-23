package ec.edu.insteclrg.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import ec.edu.insteclrg.domain.Comunicado;

public interface ComunicadoRepository extends JpaRepository<Comunicado, Long> {
	
}
