/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;


/**
 *
 * @author luiz
 */
public class ModalidadeDiaria extends Modalidade
{   private String turma, diaTurma;

    public String getDiaTurma() {
        return diaTurma;
    }

    public void setDiaTurma(String diaTurma) {
        this.diaTurma = diaTurma;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }
        
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    public ModalidadeDiaria(){
    
    }

    public ModalidadeDiaria(String turma, String diaTurma,String nome, float preco, String aluno) {
        super(nome, preco, aluno);
        this.turma = turma;
        this.diaTurma = diaTurma;
    }    
}    
