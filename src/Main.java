import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso = new Curso("Curso Java", "Tudo sobre Java", 8);
        Mentoria mentoria = new Mentoria("Mentoria Java","Mentoria de Java", LocalDate.now());

        Bootcamp bootcamp = new Bootcamp("Java Developer", "Bootcamp para Java Developers");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(mentoria);

        Dev dev = new Dev("Fulano");
        printDevInfo(dev);

        dev.inscreverBootcamp(bootcamp);
        printDevInfo(dev);
        curso.setCargaHoraria(curso.getCargaHoraria() + 2);

        dev.setNome("Fulano Sicrano");
        dev.progredir("Curso Java");
        mentoria.setData(mentoria.getData().plusDays(7));
        printDevInfo(dev);

        dev.progredir("Mentoria Java");
        printDevInfo(dev);

        dev.progredir("Treinamento Python");
    }

    static void printDevInfo(Dev dev) {
        System.out.println( "Dev " + dev.getNome() + "\nConteúdos Inscritos: " + dev.getConteudosInscritos() +
                "\nConteúdos Concluídos: " + dev.getConteudosConcluidos() + "\nXP Total: " + dev.calcularTotalXp() + "\n"
        );
    }
}