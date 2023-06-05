
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Gui
 */
public class Pessoa {
    private String nome;
    private String cpf;
    private String email;
    private ArrayList<Telefone> telefones;
    private Endereco endereco;
   
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public ArrayList<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(ArrayList<Telefone> telefones) {
        this.telefones = telefones;
    }

  public void imprimir(){
  System.out.println("Nome:" +getNome() +"CPF:" +getCpf() +"E-mail:" +getEmail());
  
  getEndereco().imprimirEndereco(); 
   
  for(int i =0; i<getTelefones().size();i++){
    getTelefones().get(i).imprimirTelefone();
}
  }  
    
    
}
