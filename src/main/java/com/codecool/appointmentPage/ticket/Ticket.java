package com.codecool.appointmentPage.ticket;

import com.codecool.appointmentPage.user.User;

public class Ticket {

    TicketType ticketType;
    User user;
    boolean active;
    Price price;

    public Ticket(TicketType ticketType, User user, boolean active, Price price) {
        this.ticketType = ticketType;
        this.user = user;
        this.active = active;
        this.price = price;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public TicketType getTicketType() {
        return ticketType;
    }

    public void setTicketType(TicketType ticketType) {
        this.ticketType = ticketType;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
