package com.latinad.audiencia.persistence.repositorio;

import com.latinad.audiencia.persistence.entity.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpresaRepositorio extends JpaRepository<Empresa, String> {

    @Query("SELECT l FROM Empresa l WHERE l.id LIKE :id")
    public Empresa buscarPorId(@Param("id") String id);

}
