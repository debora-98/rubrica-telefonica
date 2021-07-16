package service_tier;
import java.util.List;

import model_tier.Contatto;


public interface ContattoService {

	public List<Contatto> mostraContatti();

	public List<Contatto> aggiungiContatto(Contatto c);

	public List<Contatto> rimuoviContatto(Contatto c);

}