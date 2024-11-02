import java.time.LocalDate;

import edu.thiago.dominio.Bootcamp;
import edu.thiago.dominio.Curso;
import edu.thiago.dominio.Dev;
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

        // System.out.println(curso1);
        // System.out.println(mentoria1);

        Curso curso2 = new Curso();

        curso2.setTitulo("Curso Js ");
        curso2.setDescricao("descrição curso javascript");
        curso2.setCargaHoraria(9);

        // System.out.println(curso2);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devThiago = new Dev();
        devThiago.setNome("Thiago");
        devThiago.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Thiago: " + devThiago.getConteudosInscritos());
        System.out.println("-----------/*----------- ");
        devThiago.progredir();
        System.out.println("Conteudos Concluídos Thiago: " + devThiago.getConteudosConcluidos());
        System.out.println("XP: " + devThiago.calcularTotalXP());
        System.out.println("-----------FIM----------- ");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos João: " + devJoao.getConteudosInscritos());
        System.out.println("-----------/*----------- ");
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("Conteudos Concluidos João: " + devThiago.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXP());
        System.out.println("-----------FIM----------- ");


    }
}