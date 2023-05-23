package com.LojadeGames.LojaDeGames.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.LojadeGames.LojaDeGames.Model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

	public List<Produto> findAllBynomeContainingIgnoreCase(@Param("nome") String nome);

}
