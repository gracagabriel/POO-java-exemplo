import java.time.LocalDate;

import dominio.Bootcamp;
import dominio.Curso;
import dominio.Dev;
import dominio.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descricao curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Java");
        curso2.setDescricao("Descricao curso Java");
        curso2.setCargaHoraria(4);

        Curso curso3 = new Curso();
        curso3.setTitulo("Curso Java");
        curso3.setDescricao("Descricao curso Java");
        curso3.setCargaHoraria(2);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descricao mentoria Java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(curso3);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Java Developer Bootcamp");
        bootcamp.setDescricao("Description Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devGabriel = new Dev();
        devGabriel.setNome("Gabriel");
        devGabriel.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos: " + devGabriel.getConteudoInscritos());
        System.out.println("--------------------------");
        devGabriel.progredir();
        System.out.println("Conteudos inscritos: " + devGabriel.getConteudoInscritos());
        System.out.println("--------------------------");
        System.out.println("Conteudos concluidos: " + devGabriel.getConteudoConcluidos());
        System.out.println("XP: " + devGabriel.calcularTotalXp());
        
        System.out.println("----------------------------------------------------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos: " + devJoao.getConteudoInscritos());
        System.out.println("--------------------------");
        devJoao.progredir();
        System.out.println("Conteudos inscritos: " + devJoao.getConteudoInscritos());
        System.out.println("--------------------------");
        System.out.println("Conteudos concluidos: " + devJoao.getConteudoConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());
    }
}
