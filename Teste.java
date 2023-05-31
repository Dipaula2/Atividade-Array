


public class Teste {

    public static void main(String args[]) {
      
    
        
        Telefone telefone = new Telefone("Celular", "61", "81633008");
        Telefone telefone2 = new Telefone("Casa", "55", "918239030");

        Curso curso = new Curso("Cienca Da Computacao");
        Curso curso1 = new Curso("Engenharia Da Computacao");
        Curso curso2 = new Curso("Analise de Sistemas");
        Curso curso3 = new Curso("POO");
       
        Endereco endereco = new Endereco("Buriti", "Brasilia", "DF");
        Endereco endereco2 = new Endereco(" 22", "Park Way", "DF");
        
        Double[] notas = { 5.5, 7.8, 6.3 };
        Curso[] cursos = {curso, curso1, curso2, curso3};
        Telefone[] telefones = {telefone,telefone2};
        
        Aluno aluno = new Aluno("Guilherme", "077.174.101.41", "guidepaula.com", endereco,new Telefone[]{telefone}, notas,curso);
        Professor prof = new Professor("Hially", "022.245.104.32", "Hially.com", endereco2,new Telefone[]{telefone2}, "Doutorado", 4.511,cursos);

        System.out.println(aluno.toString());
        System.out.println(endereco.toString());
        
        System.out.println(prof.toString());
        System.out.println(endereco2.toString());
        
        
    }
}
