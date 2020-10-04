package br.com.jbasketball.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.jbasketball.model.Jogo;

public interface Jogos extends JpaRepository<Jogo, Long> {

}
