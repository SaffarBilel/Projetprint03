package com.bilel.equipes.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.bilel.equipes.entities.League;
import com.bilel.equipes.entities.Equipe;
public interface EquipeService {
	Equipe saveEquipe(Equipe j);
	Equipe updateEquipe(Equipe j);
void deleteEquipe(Equipe j);
 void deleteEquipeById(Long id);
 Equipe getEquipe(Long id);
List<Equipe> getAllEquipes();
List<League> getAllLeagues();
long countEquipes();

Page<Equipe> getAllEquipesParPage(int page, int size);

List<Equipe> findByNomEquipe(String nom);
List<Equipe> findByNomEquipeContains(String nom);
List<Equipe> findByNomEquipeClassementEquipe (String nomEquipe, int classementEquipe);
List<Equipe> findByLeague (League league);
List<Equipe> findByLeagueIdLea(Long id);
List<Equipe> findByOrderByNomEquipeAsc();
List<Equipe> trierEquipesNomEquipesClassementEquipe();

}
