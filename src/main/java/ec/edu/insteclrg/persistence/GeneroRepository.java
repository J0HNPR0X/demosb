package ec.edu.insteclrg.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import ec.edu.insteclrg.domain.Genero;

public interface GeneroRepository extends JpaRepository<Genero, Long> {
	
}