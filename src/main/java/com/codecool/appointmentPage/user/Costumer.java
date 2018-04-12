package com.codecool.appointmentPage.user;

import com.codecool.appointmentPage.training.Training;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Costumer extends Member {


    @ManyToMany(mappedBy = "attandedUsers", fetch = FetchType.LAZY)
    private List<Training> activeTrainings;

    @ManyToMany(mappedBy = "attandedUsers", fetch = FetchType.LAZY)
    private List<Training> historyTrainings;

    public List<Training> getHistoryTrainings() {
        return historyTrainings;
    }

    public void setHistoryTrainings(List<Training> historyTrainings) {
        this.historyTrainings = historyTrainings;
    }

    public Costumer(Long id, String firstName, String lastName, String username, String email){
        super(id, firstName, lastName, username, email);
    }

    public Costumer(){}

    public List<Training> getActiveTrainings() {
        return activeTrainings;
    }

    public void setActiveTrainings(List<Training> activeTrainings) {
        this.activeTrainings = activeTrainings;
    }
}
