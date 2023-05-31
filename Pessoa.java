
import java.util.Arrays;

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
    private Telefone[] telefones;
    private Endereco endereco;
    
    public Pessoa(String nome, String cpf, String email,Endereco endereco,Telefone[] telefones){
        this.nome = nome;
        this.cpf = cpf;        
        this.email = email;
        this.endereco = endereco;
        this.telefones = telefones;
    }
    
    

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

      

    public Telefone[] getTelefones() {
        return telefones;
    }

    public void setTelefones(Telefone[] telefones) {
        this.telefones = telefones;
    }
    
        @Override
   public String toString(){
      return String.format("Nome:" +getNome()
                           +" CPF:" +getCpf()
                            +" Email: " +getEmail()
                            +" Telefone:" +Arrays.toString(telefones)); 
   }
    
    
    
}
