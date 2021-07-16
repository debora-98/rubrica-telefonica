package view_tier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import model_tier.Contatto;
import service_tier.ContattoService;

@RestController
@CrossOrigin("*")

public class ControllerContatto {
	
	@Autowired
	ContattoService cs;
	
	@RequestMapping("/get-all")
	@ResponseBody
	public List<Contatto> getAllContatto() {
		System.out.println("-----SIAMO DENTRO GET ALL PRODOTTO---------");
		return cs.mostraContatti();

	}

	@RequestMapping("/remove")
	@ResponseBody
	public void rimuovi(@RequestBody Contatto c) {
		System.out.println("-----SIAMO DENTRO REMOVE---------");
		cs.rimuoviContatto(c);
	}

	@RequestMapping("/add")
	@ResponseBody
	public void aggiungi(@RequestBody Contatto c) {
		System.out.println("-----SIAMO DENTRO ADD---------");
		cs.aggiungiContatto(c);
	}
}


