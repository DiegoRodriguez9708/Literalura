package com.alura.Literalura.repository;

import com.alura.Literalura.model.AutorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AutorRepository extends JpaRepository<AutorEntity, Long> {

    @Query("SELECT a FROM AutorEntity a WHERE :anio between a.fechaNacimiento AND a.fechaFallecimiento")
    List<AutorEntity> findForYear(int anio);

}
