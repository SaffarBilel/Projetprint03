package com.bilel.equipes.restcontrollers;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import com.bilel.equipes.entities.Equipe;
import com.bilel.equipes.service.EquipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api")
@CrossOrigin
public class EquipeRESTController {
	@Autowired
	EquipeService equipeService;
	@RequestMapping(method = RequestMethod.GET)
	public List<Equipe> getAllEquipes() {
	return equipeService.getAllEquipes();
}
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Equipe getEquipeById(@PathVariable("id") Long id) {
	return equipeService.getEquipe(id);
	 }
	@RequestMapping(method = RequestMethod.POST)
	public Equipe createEquipe(@RequestBody Equipe equipe) {
	return equipeService.saveEquipe(equipe);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public Equipe updateEquipe(@RequestBody Equipe equipe) {
	return equipeService.updateEquipe(equipe);
	}

	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteEquipe(@PathVariable("id") Long id)
	{
		equipeService.deleteEquipeById(id);
	}

	@RequestMapping(value="/Equipeslea/{idLea}",method = RequestMethod.GET)
	public List<Equipe> getEquipesByLeaId(@PathVariable("idLea") Long idLea) {
	return equipeService.findByLeagueIdLea(idLea);
	}
	
	
	}
