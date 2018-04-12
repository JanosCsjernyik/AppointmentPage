package com.codecool.appointmentPage.training;

import com.codecool.appointmentPage.user.Member;
import com.codecool.appointmentPage.user.Trainer;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Entity
public class Training {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;

    @Enumerated(EnumType.STRING)
    TrainingType trainingType;
    Date date;

    public Training(){}

    @ManyToOne
    Trainer trainer;

    int emptySpots;

    @ManyToMany(fetch = FetchType.EAGER)
    List<Member> attandedUsers;


    public Training(TrainingType trainingType, Date date, int emptySpots) {
        this.trainingType = trainingType;
        this.date = date;
        //this.trainer = trainer;
        this.emptySpots = emptySpots;
    }

    public TrainingType getTrainingType() {
        return trainingType;
    }

    public void setTrainingType(TrainingType trainingType) {
        this.trainingType = trainingType;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Member getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public int getEmptySpots() {
        return emptySpots;
    }

    public void setEmptySpots(int emptySpots) {
        this.emptySpots = emptySpots;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Member> getAttandedUsers() {
        return attandedUsers;
    }

    public void setAttandedUsers(List<Member> attandedUsers) {
        this.attandedUsers = attandedUsers;
    }
}
