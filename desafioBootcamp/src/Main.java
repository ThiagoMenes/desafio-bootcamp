import java.time.LocalDate;

import edu.thiago.dominio.Curso;
import edu.thiago.dominio.Mentoria;

public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        Mentoria mentoria1 = new Mentoria();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        mentoria1.setTitulo("Mentoria java");
        mentoria1.setDescricao("Descrição mentoria java");
        mentoria1.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(mentoria1);

        Curso curso2 = new Curso();

        curso2.setTitulo("Curso Js ");
        curso2.setDescricao("descrição curso javascript");
        curso2.setCargaHoraria(9);

        System.out.println(curso2);
    }
}