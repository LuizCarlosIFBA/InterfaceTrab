package Negocio; 

import Negocio.Aluno;


/**
 * Escreva uma descrição da classe Matricula aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Matricula
{   private Aluno aluno;
    private Modalidade modalidade;
    private Pagamento pagamento;
    private String login, senha;

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public Matricula(){
    
    }
    
    
    public Matricula(String login, String senha, Aluno aluno, Pagamento pagamento) {
        this.login = login;
        this.senha = senha;
        this.aluno = aluno;
        this.pagamento = pagamento;       
    }
    

    public Matricula(String login, String senha, Aluno aluno, Modalidade modalidade, Pagamento pagamento) {
        this.login = login;
        this.senha = senha;
        this.aluno = aluno;
        this.modalidade = modalidade;
        this.pagamento = pagamento;
        
    }
    
    //MÉTODO ACESSO (TO-DO)
    
}
