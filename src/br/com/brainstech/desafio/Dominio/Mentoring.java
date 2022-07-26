package br.com.brainstech.desafio.Dominio;

import java.time.LocalDate;

public class Mentoring extends Content{
    private LocalDate date;

    public Mentoring() {
    }

    public LocalDate getDate() {
        return LocalDate.now();
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Mentoring{" +
                "title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", date=" + getDate() +
                '}';
    }

    @Override
    public double calculateXP(){
        return xp_standart + 20;
    }
}
