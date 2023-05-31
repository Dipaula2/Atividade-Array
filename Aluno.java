
import java.util.Arrays;





/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Gui
 */
public class Aluno extends Pessoa{
    
   private Curso curso;
   private Double[] notas;

    public Aluno(String nome, String cpf, String email, Endereco endereco, Telefone[] telefones,Double[] notas,Curso curso) {
        super(nome, cpf, email, endereco, telefones);
        this.curso = curso;
        this.notas = notas;
    }
    
    

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Double[] getNotas() {
        return notas;
    }

    public void setNotas(Double[] notas) {
        this.notas = notas;
    }
    
    public double calcularMedia() {
        double soma = 0.0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }
    
    @Override
    public String toString() {
        return String.format("[Aluno]\n" +super.toString() + " Curso:" + getCurso()+" Notas:" + Arrays.toString(notas) + " Media:" + calcularMedia() +" Curso:" + getCurso());
    }
    

}
