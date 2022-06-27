/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;


import Negocio.Modalidade;
import Negocio.Aluno;
import Negocio.Pagamento;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;


/**
 * Escreva uma descrição da classe Matricula aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Matricula
{   
    private Modalidade modalidade;
    private Pagamento pagamento;
    private String login, senha, aluno;
    private boolean matriculado=false;
   
    private ArrayList<Matricula> listaMatricula = new ArrayList<>();
   
    public String getAluno() {
        return aluno;
    }

    public void setAluno(String aluno) {
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

    public Modalidade getModalidade() {
        return modalidade;
    }

    public void setModalidade(Modalidade modalidade) {
        this.modalidade = modalidade;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public boolean isMatriculado() {
        return matriculado;
    }

    public void setMatriculado(boolean matriculado) {
        this.matriculado = matriculado;
    }
    
    public Matricula(){
    
    }

    public Matricula(String login, String senha, String aluno, Modalidade modalidade, Pagamento pagamento) {
        this.login = login;
        this.senha = senha;
        this.aluno = aluno;
        this.modalidade = modalidade;
        this.pagamento = pagamento;
        
    }
    
    
    //MÉTODO ACESSO (TO-DO)
    public void acessar(String login, String senha, ArrayList<Matricula> matricula){
        this.listaMatricula = matricula;

        for(int i=0;i<listaMatricula.size();i++){
            if(login.equals(listaMatricula.get(i).getLogin()) && senha.equals(listaMatricula.get(i).getSenha())){
                JOptionPane.showMessageDialog(null,"Logado!!!");
            }
                
        }
      
       
    }
                     
}

