package sn.simplon.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sn.simplon.demo.dao.IPharmacie;
import sn.simplon.demo.entities.Pharmacie;

import java.util.List;

@RestController
public class PharmacieService {
    @Autowired
    private IPharmacie pharmaciedao;

    @RequestMapping(value = "/pharmacie/pharmacie",method = RequestMethod.GET)
    public List<Pharmacie> getAllPharmacieOuvert(@RequestParam int etat){
        return pharmaciedao.getAllPharmacieOuvert(etat);

    }

    @RequestMapping(value = "/pharmacie/pharmacie/save",method = RequestMethod.POST)
    public List<Pharmacie> save(Pharmacie pharmacie){
        pharmaciedao.save(pharmacie);
        return pharmaciedao.findAll();
    }



}
