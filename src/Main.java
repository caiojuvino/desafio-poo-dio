import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso = new Curso("Curso Java", "Tudo sobre Java", 8);
        Mentoria mentoria = new Mentoria("Mentoria Java","Mentoria de Java", LocalDate.now());

        Bootcamp bootcamp = new Bootcamp("Java Developer", "Bootcamp para Java Developers");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(mentoria);

        Dev dev = new Dev("Caio");
        dev.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos: " + dev.getConteudosInscritos());
        dev.progredir();

        System.out.println("Conteúdos Inscritos: " + dev.getConteudosInscritos());
        System.out.println("XP Total: " + dev.calcularTotalXp());
    }
}