/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Gui
 */
class Curso {

   
    private String nome;
    
    public Curso(String nome){
        this.nome = nome;
    }

    public String getNomeC() {
        return nome;
    }

    public void setNomeC(String nome) {
        this.nome = nome;
    }
    
   @Override
public String toString() {
    return String.format("" + getNomeC());
}
    
}
