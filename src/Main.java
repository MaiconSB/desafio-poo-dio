import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("Java");
        curso.setDescricao("Curso java OPP");
        curso.setCargaHoraria(15);


        Curso curso1 = new Curso();
        curso1.setTitulo("JavaScript");
        curso1.setDescricao("FRONT");
        curso1.setCargaHoraria(10);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Devweloper");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);

        Dev devMaicon = new Dev();
        devMaicon.setNome("Maicon");
        devMaicon.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" + devMaicon.getConteudosInscritos());

        devMaicon.progredir();
        devMaicon.progredir();

        System.out.println("Conteúdos Inscritos" + devMaicon.getConteudosInscritos());
        System.out.println("Conteúdos Conluídos" + devMaicon.getConteudosConcluidos());
        System.out.println("XP: " + devMaicon.calcularXp());


        System.out.println("------");


        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" + devJoao.getConteudosInscritos());

        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();

        System.out.println("Conteúdos Inscritos" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Conluídos" + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devMaicon.calcularXp());
    }
}