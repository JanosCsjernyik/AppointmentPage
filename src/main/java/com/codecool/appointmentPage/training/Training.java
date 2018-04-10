package com.codecool.appointmentPage.training;

import com.codecool.appointmentPage.user.User;

import java.util.Date;

public class Training {

    TrainingType trainingType;
    Date date;
    User trainer;
    int emptySpots;

    public Training(TrainingType trainingType, Date date, User trainer, int emptySpots) {
        this.trainingType = trainingType;
        this.date = date;
        this.trainer = trainer;
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

    public User getTrainer() {
        return trainer;
    }

    public void setTrainer(User trainer) {
        this.trainer = trainer;
    }

    public int getEmptySpots() {
        return emptySpots;
    }

    public void setEmptySpots(int emptySpots) {
        this.emptySpots = emptySpots;
    }
}
