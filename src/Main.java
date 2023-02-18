import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("Java");
        curso.setDescricao("Curso java OPP");
        curso.setCargaHoraria(15);
        System.out.println(curso);
        System.out.println("------------------------------------------------------------");

        Curso curso1 = new Curso();
        curso1.setTitulo("JavaScript");
        curso1.setDescricao("FRONT");
        curso1.setCargaHoraria(10);
        System.out.println(curso1);
        System.out.println("------------------------------------------------------------");

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());
        System.out.println(mentoria);
        System.out.println("------------------------------------------------------------");


    }
}