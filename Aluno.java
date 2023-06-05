
import java.util.ArrayList;






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
   private ArrayList<Double> notas;

  public Aluno(){
      super();
  }
  

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public ArrayList<Double> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Double> notas) {
        this.notas = notas;
    }

    
    public double calcularMedia() {
        double soma = 0.0;
        for (double nota : getNotas()) {
            soma += nota;
        }
        double media = soma/notas.size();
       return media;
    }
    
   @Override
 public void imprimir(){
        System.out.println("_______Dados do Aluno____");
        super.imprimir();
        getCurso().imprimirCurso();
        
       for(int i =0; i<getNotas().size();i++){
           System.out.println(getNotas().get(i).toString());
 }
       System.out.println("Media Final:" +calcularMedia());
   

}
}
