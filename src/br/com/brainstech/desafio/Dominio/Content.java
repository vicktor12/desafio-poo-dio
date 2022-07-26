package br.com.brainstech.desafio.Dominio;

public abstract class Content {
    private String title;
    private String description;
    protected static final double xp_standart = 10;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public abstract double calculateXP();
}
