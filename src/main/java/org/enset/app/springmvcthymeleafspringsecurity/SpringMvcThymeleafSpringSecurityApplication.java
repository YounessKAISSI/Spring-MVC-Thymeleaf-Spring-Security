package org.enset.app.springmvcthymeleafspringsecurity;

import org.enset.app.springmvcthymeleafspringsecurity.entities.Patient;
import org.enset.app.springmvcthymeleafspringsecurity.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class SpringMvcThymeleafSpringSecurityApplication implements CommandLineRunner {

    @Autowired
    private PatientRepository patientRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringMvcThymeleafSpringSecurityApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

/*        //Methode 1
        Patient patient = new Patient();

        patient.setId(null);
        patient.setNom("Mohamed");
        patient.setDateNaissance(new Date());
        patient.setMalade(false);
        patient.setScore(23);

        //Methode 2
        Patient patient2 = new Patient(null,"kamla",new Date(),false,123);

        //Methode 3
        Patient patient3 = Patient.builder()
                .nom("Imane")
                .dateNaissance(new Date())
                .malade(true)
                .score(56)
                .build();*/

        patientRepository.save(new Patient(null,"Mohamed",new Date(),false,340));
        patientRepository.save(new Patient(null,"Imane",new Date(),false,4321));
        patientRepository.save(new Patient(null,"Hanane",new Date(),true,210));


    }
}
