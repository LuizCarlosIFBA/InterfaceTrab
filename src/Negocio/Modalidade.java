package Negocio;

import java.util.ArrayList;

/**
 * Escreva uma descrição da classe Modalidade aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Modalidade
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
   
    private ArrayList<String> nome = new ArrayList<>();
    private float preco;

    public ArrayList<String> getNome() {
        return nome;
    }

    public void setNome(ArrayList<String> nome) {
        this.nome = nome;
    }
   
    
    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    public Modalidade() {
     
    }

    public Modalidade(float preco, ArrayList<String> nome) {
        this.preco = preco;
        this.nome = nome;
    }

    
    
     
}
