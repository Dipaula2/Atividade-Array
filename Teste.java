
import java.util.ArrayList;
import java.util.Scanner;




public class Teste {

    public static void main(String args[]) {
      
    Scanner scan = new Scanner(System.in);
    
    Curso curso;
    ArrayList<Curso> cursos = new ArrayList<>();  
    
    Aluno aluno = new Aluno();
    
    ArrayList<Double> notas = new ArrayList();
    
    Telefone telefone = new Telefone();
    ArrayList<Telefone> telefones = new ArrayList<>();
    
    Professor professor = new Professor();
    
    Endereco endereco;
    
    
        System.out.println("____Cadastro Professor___");
        
        System.out.println("Digite o nome");
        professor.setNome(scan.nextLine());
        System.out.println("Digite o CPF");
        professor.setCpf(scan.nextLine());
        System.out.println("Digite o E-mail");
        professor.setEmail(scan.nextLine());
        
        endereco = new Endereco();
        System.out.println("Digite a Rua:");
        endereco.setRua(scan.nextLine());
        System.out.println("Digite a Estado:");
        endereco.setEstado(scan.nextLine());
        System.out.println("Digite a Cidade:");
        endereco.setCidade(scan.nextLine());
    
        professor.setEndereco(endereco);
        
        System.out.println("Digite os telefones - maximo 2 ");
        for(int i = 0; i < 2;i++){
            telefone = new Telefone();
            System.out.println("Digite o numero");
            telefone.setNumero(scan.nextLine());
            
            System.out.println("Digite o DDD");
            telefone.setDdd(scan.nextLine());
            
            System.out.println("Digite o Tipo");
            telefone.setTipo(scan.nextLine());
            
            telefones.add(telefone);
        }
    professor.setTelefones(telefones);
    
    System.out.println("Digite o Titulacao:");
    professor.setTitulacao(scan.nextLine());
    
    System.out.println("Digite o Salario:");
    professor.setSalario(scan.nextDouble());

    System.out.println("Digite os Cursos - maximo 2 ");
        for(int i = 0; i < 2;i++){
            curso = new Curso();
            System.out.println("Curso");
            curso.setNomeC(scan.nextLine());
            
       
            cursos.add(curso);
        }
    professor.setCursos(cursos);
        
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
}
