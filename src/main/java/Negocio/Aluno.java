package Negocio;

import java.util.ArrayList;

/**
 * Escreva uma descrição da classe Aluno aqui.
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Aluno
{
    private String cpf, nome, endereco, email, celular;
    private String dataIngresso;
    private boolean estudante;
    private boolean parente;
    
    private Responsavel responsavel;
   
    public Responsavel getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Responsavel responsavel) {
        this.responsavel = responsavel;
    }
        
    public boolean isEstudante() {
        return estudante;
    }

    public void setEstudante(boolean estudante) {
        this.estudante = estudante;
    }

    public boolean isParente() {
        return parente;
    }

    public void setParente(boolean parente) {
        this.parente = parente;
    }
        
    public String getDataIngresso() {
        return dataIngresso;
    }

    public void setDataIngresso(String dataIngresso) {
        this.dataIngresso = dataIngresso;
    }
    
    public String getCpf() {
        return cpf;
    }
 
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
   
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Aluno() {
        
    }

    public Aluno(String cpf, String nome, String endereco, String email, String celular, String dataIngresso, boolean estudante, boolean parente) {
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
        this.celular = celular;
        this.dataIngresso = dataIngresso;
        this.estudante = estudante;
        this.parente = parente;
    }   
    
    /*Quando aluno é menor de idade*/
    public Aluno(Responsavel responsavel, String cpf, String nome, String endereco, String email, String celular, String dataIngresso, boolean estudante, boolean parente) {
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
        this.celular = celular;
        this.dataIngresso = dataIngresso;
        this.estudante = estudante;
        this.responsavel = responsavel;
        this.parente = parente;
    }
}
