package bim2pt1;


public class Teste {    
    public static void main(String[] args) throws InterruptedException {        
        
        String[] turmas = {"1º ANO mineração","1º ano Pertubação da ordem","2º ano Informatica"};
        Usuario teste = new Usuario("Willian IF","senha1234","will34ejc@gmail.com");
        PerfilSetor setor = new PerfilSetor("1º setor",785,"José");
        PerfilDisciplina Matematica = new PerfilDisciplina("Matematica",239103,setor);
        PerfilCurso Informatica = new PerfilCurso("Informatica",666,"Joaquin","Laboratorio 3");
        PerfilTurma InfoA = new PerfilTurma("Primeiro ano Informatica","Vitor guedes","Laboratorio de Porgramaçao 52");
        PerfilProfessor pf = new PerfilProfessor("Carlos Braga",562462489,turmas,"riousymp78",Matematica);
        PerfilTecnicoAdm tadm = new PerfilTecnicoAdm("Groselia",2464,"Tia da Cantina",setor);
        PerfilAluno w = new PerfilAluno("Willian Pereira",123456789,"1º ano Info.","666665876jjjf");
        PerfilAluno e = new PerfilAluno("Elio Castro",562456789,"3º ano Qui.","55gggh878");
        Postagem p = new Postagem("Primeiro post");
        Postagem p2 = new Postagem("Segundo post");
        Postagem p3 = new Postagem("Teste 3");
        Postagem p4 = new Postagem("Teste4","Foto4","Video4");
        

        //Postagem
        p.setFoto("Foto");
        p2.setVideo("Video2");
        p3.setFoto("Foto3");
        p3.setVideo("video3");
        System.out.println(p4.toString());
        //Fim Postagem
        
        System.out.println("-----------------------------");
        
        //Usuario
        teste.setSenha("novasenha");
        teste.addperfil(w);
        teste.addperfil(InfoA);
        System.out.println(teste.toString());
        teste.excluirPerfil(InfoA);
        System.out.println(teste.toString());
        //Fim Usuario
            
        System.out.println("-----------------------------");
        
        //Setor
        setor.addDiciplina(Matematica);
        setor.addPostagem(p2);
        setor.addSeguidor(pf);
        System.out.println(setor.toString());
        setor.removeDiciplina(Matematica);
        setor.trocarDiretor("João Bezerra");
        setor.seguir(tadm);
        System.out.println(setor.toString());
        //Fim Setor
        
        System.out.println("-----------------------------");
        
        //Disciplina
        Matematica.addAluno(e);
        Matematica.addAluno(w);
        Matematica.addPostagem(p);
        Matematica.seguir(setor);
        Matematica.addTurma(InfoA);
        Matematica.addPostagem(p2);
        Matematica.addSeguidor(pf);
        Matematica.seguir(tadm);
        System.out.println(Matematica.toString());
        Matematica.seguir(w);
        Matematica.removerTurma(InfoA);
        Matematica.remoAluno(e);
        Matematica.remoAluno(w);
        System.out.println(Matematica.toString());
        //Fim Disciplina
        
        System.out.println("-----------------------------");
        
        //Curso 
        System.out.println(Informatica.toString());
        Informatica.adicionarProfessor(pf);
        Informatica.addAluno(e);
        Informatica.addAluno(w);
        Informatica.addPostagem(p);
        System.out.println(Informatica.toString());
        Informatica.addSeguidor(setor);
        Informatica.mudarSala("Sala 18");
        Informatica.seguir(tadm);
        Informatica.tirarAluno(e);
        Informatica.removerProfessor(pf);
        System.out.println(Informatica.toString());
        //Fim Curso
        
        System.out.println("-----------------------------");
        
        //Turma
        InfoA.alterarHoraEntrada(7);
        InfoA.alterarHoraSaida(17.30);
        InfoA.addSeguidor(pf);
        InfoA.addPostagem(p3);
        InfoA.addSeguidor(Informatica);
        InfoA.seguir(setor);
        System.out.println(InfoA.toString());
        //Fim Turma
        
        System.out.println("-----------------------------");
        
        //Professor
        System.out.println(pf.toString());
        pf.addPostagem(p4);
        pf.addSeguidor(w);
        pf.aviso("Quero dormir");
        pf.seguir(setor);
        pf.setCargah(8);
        pf.setGenero(Genero.MASCULINO);
        pf.setSite("www.sptn_bpojm.com.br");
        pf.seguir(e);
        System.out.println(pf.toString());
        pf.aviso("ahhhhhhhhhhhhhh");

        //Final Professor
       
        System.out.println("-----------------------------");
         
        //Tecnico ADM
        tadm.setQuemsou("Tra");
        tadm.setGenero(Genero.Feminino);
        System.out.println(tadm.toString());
        //Final Tecnico ADM
        
        System.out.println("-----------------------------");

        //Aluno
        w.setCargah(12);
        w.addPostagem(p3);
        w.addSeguidor(e);
        w.seguir(pf);
        w.addSeguidor(setor);
        w.seguir(setor);
        w.seguir(e);
        w.seguir(Matematica);
        w.seguir(tadm);
        w.setGenero(Genero.INDEFINIDO);
        System.out.println(w.toString());
        
        //Fim Aluno
    }
    
}
