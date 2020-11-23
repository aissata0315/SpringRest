package sn.simplon.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import sn.simplon.demo.entities.Pharmacie;

import java.util.List;

@Repository
public interface IPharmacie extends JpaRepository<Pharmacie, Integer> {

    @Query("Select ph from Pharmacie ph where ph.etat = :etat")
    public List<Pharmacie> getAllPharmacieOuvert(@Param("etat") int etat);
}
