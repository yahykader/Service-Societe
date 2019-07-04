package org.kader.societe.entity.repository;

import org.kader.societe.entity.Societe;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.data.rest.webmvc.RepositoryRestController;

@RepositoryRestController
public interface SocieteRepository extends JpaRepository<Societe,Long> {

   /* @RestResource(path="/findByNomSocieteContains")
    public Page<Societe> findByNomSocieteContains(@Param("mc") String mc, Pageable pageable);*/


    @Query("select s from Societe s where s.nomSociete like :mc")
    public Page<Societe> findSocieteByMC(@Param("mc") String mc,Pageable pageable);
    
}
