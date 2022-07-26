package br.com.brainstech.desafio.Dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Dev {
    private String name;
    private Set<Content> subscribedContents = new LinkedHashSet<>();
    private Set<Content> contentsCompleted = new LinkedHashSet<>();

    public void subscribeBootcamp(Bootcamp bootcamp) {}
    public void progressBootcamp() {}
    public void calculateTotalXP() {}


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Content> getSubscribedContents() {
        return subscribedContents;
    }

    public void setSubscribedContents(Set<Content> subscribedContents) {
        this.subscribedContents = subscribedContents;
    }

    public Set<Content> getContentsCompleted() {
        return contentsCompleted;
    }

    public void setContentsCompleted(Set<Content> contentsCompleted) {
        this.contentsCompleted = contentsCompleted;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(name, dev.name) && Objects.equals(subscribedContents, dev.subscribedContents) && Objects.equals(contentsCompleted, dev.contentsCompleted);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, subscribedContents, contentsCompleted);
    }
}
