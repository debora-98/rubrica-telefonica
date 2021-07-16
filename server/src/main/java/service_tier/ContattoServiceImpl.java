package service_tier;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model_tier.Contatto;
import persistance_tier.ContattoRepository;

@Transactional
@Service
public class ContattoServiceImpl implements ContattoService {

	@Autowired
	ContattoRepository cr;

	@Override
	public List<Contatto> mostraContatti() {
		return cr.findAll();
	}

	@Override
	public List<Contatto> aggiungiContatto(Contatto c) {
		if (c != null) {
			cr.save(c);
		}
		return mostraContatti();
	}

	@Override
	public List<Contatto> rimuoviContatto(Contatto c) {
		if (c.getId() != null) {
			cr.deleteById(c.getId());
		}
		return mostraContatti();
	}

}
