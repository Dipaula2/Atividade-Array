
import java.util.ArrayList;

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
    private ArrayList<Curso> cursos;
    
    
    public Professor(){
        super();
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

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }

   
    @Override
 public void imprimir(){
        System.out.println("_______Dados do Professor____");
        super.imprimir();
        
        System.out.println("Titulacao:" +getTitulacao());
        System.out.println("Salario:" +getSalario());
        
        for(int i =0; i<getCursos().size();i++){
    getCursos().get(i).imprimirCurso();
}
 }

    
    
}
