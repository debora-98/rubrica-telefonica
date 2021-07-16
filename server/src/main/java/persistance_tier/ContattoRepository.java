package persistance_tier;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model_tier.Contatto;

@Repository
public interface ContattoRepository extends JpaRepository<Contatto, Long>{

	
	
}
