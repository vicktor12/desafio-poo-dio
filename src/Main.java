import br.com.brainstech.desafio.Dominio.Bootcamp;
import br.com.brainstech.desafio.Dominio.Course;
import br.com.brainstech.desafio.Dominio.Dev;
import br.com.brainstech.desafio.Dominio.Mentoring;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Course course1 = new Course();
        Course course2 = new Course();
        Mentoring mentoring = new Mentoring();
        Bootcamp bootcamp1 = new Bootcamp();
        Bootcamp bootcamp2 = new Bootcamp();
        Dev dev1 = new Dev();
        Dev dev2 = new Dev();

        course1.setTitle("Objects Orientation");
        course1.setDescription("Notion of objects orientations in Java");
        course1.setWorkload(60);

        course2.setTitle("Programing Logic");
        course2.setDescription("Notion of programing");
        course2.setWorkload(80);

        mentoring.setTitle("Professor Camila");
        mentoring.setDescription("Anything");

        bootcamp1.setName("Bootcamp Java Developer");
        bootcamp1.setDescription("Course of development Java");
        bootcamp1.getContents().add(course1);
        bootcamp1.getContents().add(mentoring);

        bootcamp2.setName("Bootcamp Developer beginner");
        bootcamp2.setDescription("Course of programing");
        bootcamp2.getContents().add(course2);
        bootcamp2.getContents().add(mentoring);

        dev1.setName("Victor");
        dev1.subscribeBootcamp(bootcamp1);
        System.out.println("Conteudos inscritos de Victor " + dev1.getSubscribedContents());
        dev1.progressBootcamp();
        System.out.println("*********");
        System.out.println("Conteudos inscritos de Victor " + dev1.getSubscribedContents());
        System.out.println("Conteudos concluidos de Victor " + dev1.getContentsCompleted());
        System.out.println("XP " + dev1.calculateTotalXP());

        System.out.println("-------------------");

        dev2.setName("Helayne");
        dev2.subscribeBootcamp(bootcamp2);
        System.out.println("Conteudos inscritos de Lay " + dev2.getSubscribedContents());
        dev2.progressBootcamp();
        dev2.progressBootcamp();
        System.out.println("*********");
        System.out.println("Conteudos inscritos de Lay " + dev2.getSubscribedContents());
        System.out.println("Conteudos concluidos de Lay " + dev2.getContentsCompleted());
        System.out.println("XP " + dev2.calculateTotalXP());
    }
}
