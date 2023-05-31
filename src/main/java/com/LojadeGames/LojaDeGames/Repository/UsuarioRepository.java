package com.LojadeGames.LojaDeGames.Repository;



import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.LojadeGames.LojaDeGames.Model.Usuario;
import com.LojadeGames.LojaDeGames.Model.UsuarioLogin;

public interface UsuarioRepository extends JpaRepository<UsuarioLogin, Long> {

	public Optional<UsuarioLogin> findByUsuario(String usuario);

	public Object save(Usuario usuario);

	public Object save1(Usuario usuario);

}
