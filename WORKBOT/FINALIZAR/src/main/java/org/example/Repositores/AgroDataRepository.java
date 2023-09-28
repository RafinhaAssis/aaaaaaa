package org.example.Repositores;

import org.example.Model.Agro;
import org.example.Model.AgroData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AgroDataRepository extends JpaRepository<AgroData, Long> {
    @Query("SELECT a FROM AgroData a WHERE a.municipio =:municipio")
    List<AgroData> findByMunicipio(String municipio);

    List<AgroData> findAll();
    @Query("SELECT p.semente_ideal_solo,p.Desc, p.Clima_Predominante  FROM AgroData p WHERE p.id IN :ids")
    List<String> findNomesByIds(@Param("ids") List<Long> pessoasSelecionadas);

    @Query("SELECT p FROM AgroData p WHERE p.id IN :ids")
    List<AgroData> findNomesById(@Param("ids") List<Long> pessoasSelecionadas);

    //Trazer o preco da semente
    @Query("SELECT p.Despesa,p.Desc, p.Clima_Predominante  FROM AgroData p WHERE p.id IN :ids")
    List<String> findNomesByIdsDespessa(@Param("ids") List<Long> pessoasSelecionadas);

    @Query("SELECT p.EspacamentoMax  FROM AgroData p WHERE p.id IN :ids")
    List<String> findNomesByIdsEscamento(@Param("ids") List<Long> pessoasSelecionadas);
}
