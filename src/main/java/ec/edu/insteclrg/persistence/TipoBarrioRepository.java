package ec.edu.insteclrg.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import ec.edu.insteclrg.domain.TipoBarrio;

public interface TipoBarrioRepository extends JpaRepository<TipoBarrio, Long> {
	
}
