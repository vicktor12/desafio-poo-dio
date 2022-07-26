package br.com.brainstech.desafio.Dominio;

public class Course extends Content{
    private int workload;

    public Course() {
    }

    public int getWorkload() {
        return workload;
    }

    public void setWorkload(int workload) {
        this.workload = workload;
    }

    @Override
    public String toString() {
        return "Course{" +
                "title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", workload=" + getWorkload() +
                '}';
    }

    @Override
    public double calculateXP() {
        return xp_standart * getWorkload();
    }
}
