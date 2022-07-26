package br.com.brainstech.desafio.Dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String name;
    private Set<Content> subscribedContents = new LinkedHashSet<>();
    private Set<Content> contentsCompleted = new LinkedHashSet<>();

    public void subscribeBootcamp(Bootcamp bootcamp) {
        this.subscribedContents.addAll(bootcamp.getContents());
        bootcamp.getSubscribedDevs().add(this);
    }
    public void progressBootcamp() {
        Optional<Content> contents = this.subscribedContents.stream().findFirst();
        if (contents.isPresent()){
            this.contentsCompleted.add(contents.get());
            this.subscribedContents.remove(contents.get());
        } else {
            System.err.println("Voce nao esta matriculado em nenhum conteudo");
        }
    }
    public double calculateTotalXP() {
        return this.contentsCompleted
                .stream()
                .mapToDouble(Content::calculateXP)
                .sum();
    }


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
