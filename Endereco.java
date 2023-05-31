/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Gui
 */
class Endereco {
    private String rua;
    private String cidade;
    private String estado;

    public Endereco(String rua, String cidade, String estado){
        this.rua = rua;
        this.cidade = cidade;        
        this.estado = estado;
    }
    
    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
     @Override
    public String toString() {
        return String.format("[Endereco]\nRua: %s, Cidade: %s, Estado: %s", 
                getRua(), getCidade(), getEstado());
    }
}
    

