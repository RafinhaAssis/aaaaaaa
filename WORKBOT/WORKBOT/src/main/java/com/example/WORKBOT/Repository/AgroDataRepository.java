package com.example.WORKBOT.Repository;

import com.example.WORKBOT.Model.AgroData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AgroDataRepository extends JpaRepository<AgroData, Long> {
    //List<agroData> findByMunContaining(String Mun);

    @Query("SELECT p.semente_ideal_solo,p.Desc, p.Clima_Predominante FROM agroData p WHERE p.id IN :ids")
    List<String> findNomesByIds(@Param("ids") List<Long> ids);
}
