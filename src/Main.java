import br.com.brainstech.desafio.Dominio.Course;
import br.com.brainstech.desafio.Dominio.Mentoring;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Course course = new Course();
        Mentoring mentoring = new Mentoring();

        course.setTitle("Objects Orientation");
        course.setDescription("Notion of objects orientations in Java");
        course.setWorkload(60);

        mentoring.setTitle("Professor Camila");
        mentoring.setDescription("Anything");

        System.out.println(course);
        System.out.println(mentoring);
    }
}
