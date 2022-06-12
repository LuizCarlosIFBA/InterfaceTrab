package Negocio;

import java.util.ArrayList;

/**
 * Escreva uma descrição da classe Aluno aqui.
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Aluno
{
    protected ArrayList<Aluno> listaAluno = new ArrayList<Aluno>();
    private String cpf, nome, endereco, email, celular;
    private String dataIngresso;
    /*add estudante*/
    private boolean estudante;
    
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
       
    public Aluno(String cpf, String nome, String endereco, String email, String celular, String dataIngresso) {
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
        this.celular = celular;
        this.dataIngresso = dataIngresso; 
    }
    
    public void gravarAluno(Aluno aluno) {
        listaAluno.add(aluno);
    }
    
    public void testaInsercao(){
        for (int i = 0; i <  listaAluno.size(); i++) {
            System.out.println(listaAluno.get(i).getCpf());
            System.out.println(listaAluno.get(i).getNome());
            System.out.println(listaAluno.get(i).getEndereco());
            System.out.println(listaAluno.get(i).getEmail());
            System.out.println(listaAluno.get(i).getCelular());
            System.out.println(listaAluno.get(i).getDataIngresso());
            System.err.println(" ");
	}
    }
    
}
