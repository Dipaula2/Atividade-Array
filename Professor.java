
import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Gui
 */
public class Professor extends Pessoa {
    private String titulacao;
    private Double salario;
    private Curso[] cursos;

    public Professor(String nome, String cpf, String email, Endereco endereco, Telefone[] telefones,String titulacao, double salario, Curso[] cursos) {
        super(nome, cpf, email, endereco, telefones);
        this.titulacao = titulacao;
        this.salario = salario;
        this.cursos = cursos;
    }

    

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Curso[] getCursos() {
        return cursos;
    }

    public void setCursos(Curso[] cursos) {
        this.cursos = cursos;
    }
  @Override
public String toString() {
    return String.format("\n[Professor]\n" +super.toString() + " Titulacao:" + getTitulacao()+" Salario:"+getSalario() + " Cursos:" + Arrays.toString(getCursos()));
                         
}

    
    
}
