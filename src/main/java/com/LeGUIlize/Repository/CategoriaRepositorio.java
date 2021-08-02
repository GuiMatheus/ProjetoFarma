package com.LeGUIlize.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.LeGUIlize.Model.Categoria;

public interface CategoriaRepositorio extends JpaRepository<Categoria, Long>{

    public List<Categoria>findAllByDescricaoContainingIgnoreCase( String descricao);
}
