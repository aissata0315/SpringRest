package sn.simplon.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sn.simplon.demo.dao.IPharmacie;
import sn.simplon.demo.entities.Pharmacie;

@SpringBootApplication
public class SpringRestApplication implements CommandLineRunner {

    @Autowired
    private IPharmacie pharmaciedao;
    public static void main(String[] args) {
        SpringApplication.run(SpringRestApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Pharmacie pharmacie = new Pharmacie();
        pharmacie.setNom("khadim");
        pharmacie.setQuartier("Liberte5");
        pharmacie.setVille("Dakar");
        pharmacie.setEtat(0);

       // pharmaciedao.save(pharmacie);
        pharmaciedao.findAll().forEach(c-> System.out.println(c.getNom()));

    }
}
