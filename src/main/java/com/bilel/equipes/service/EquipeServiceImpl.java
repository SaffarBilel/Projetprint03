package com.bilel.equipes.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.bilel.equipes.entities.League;
import com.bilel.equipes.entities.Equipe;
import com.bilel.equipes.repos.EquipeRepository;
import com.bilel.equipes.repos.LeagueRepository;

@Service
public class EquipeServiceImpl implements EquipeService {
@Autowired
EquipeRepository equipeRepository;

@Autowired
LeagueRepository leagueRepository;
@Override
public Equipe saveEquipe(Equipe j) {
return equipeRepository.save(j);
}
@Override
public Equipe updateEquipe(Equipe j) {
return equipeRepository.save(j);
}
@Override
public void deleteEquipe(Equipe j) {
	equipeRepository.delete(j);
}
 @Override
public void deleteEquipeById(Long id) {
	 equipeRepository.deleteById(id);
}
@Override
public Equipe getEquipe(Long id) {
return equipeRepository.findById(id).get();
}
@Override
public List<Equipe> getAllEquipes() {
return equipeRepository.findAll();
}
@Override
public Page<Equipe> getAllEquipesParPage(int page, int size) {
	return equipeRepository.findAll(PageRequest.of(page, size));

}
@Override
public List<Equipe> findByNomEquipe(String nom) {
	
	return equipeRepository.findByNomEquipe(nom);
}
@Override
public List<Equipe> findByNomEquipeContains(String nom) {
	
	return equipeRepository.findByNomEquipeContains(nom);
}
@Override
public List<Equipe> findByNomEquipeClassementEquipe(String nomEquipe, int classementEquipe) {
	return equipeRepository.findByNomEquipeClassementEquipe(nomEquipe, classementEquipe);
}
@Override
public List<Equipe> findByLeague(League league) {
	
	return equipeRepository.findByLeague(league);
}
@Override
public List<Equipe> findByLeagueIdLea(Long id) {
	return equipeRepository.findByLeagueIdLea(id);
}
@Override
public List<Equipe> findByOrderByNomEquipeAsc() {
	
	return equipeRepository.findByOrderByNomEquipeAsc();
}
@Override
public List<Equipe> trierEquipesNomEquipesClassementEquipe() {
	return equipeRepository.trierEquipesNomEquipeClassementEquipe();
}

@Override
public List<League> getAllLeagues() {
	
	return leagueRepository.findAll();
}
@Override
public long countEquipes() {
	return  equipeRepository.count();
}

}