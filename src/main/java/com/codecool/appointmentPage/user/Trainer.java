package com.codecool.appointmentPage.user;

import com.codecool.appointmentPage.training.Training;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Trainer extends Member {

    @OneToMany(mappedBy = "trainer")
    private List<Training> trainings;

    public Trainer(Long id, String firstName, String lastName, String username, String email){
        super(id, firstName, lastName, username, email);
    }

    public Trainer(){}

}
