/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

/**
 * Escreva uma descrição da classe Modalidade aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Modalidade
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
   
    private String nome, aluno;
    private float preco;

    public String getAluno() {
        return aluno;
    }

    public void setAluno(String aluno) {
        this.aluno = aluno;
    }
   
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
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
    
    public Modalidade(String nome, float preco, String aluno) {
        this.nome = nome;
        this.preco = preco;
        this.aluno = aluno;
    }
    
    
    
    /*Métodos adicionais*/
    public void acumulaPreco(float preco){
        this.preco+=preco;
    }
    
    
}

