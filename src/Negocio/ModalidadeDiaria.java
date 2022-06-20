package Negocio;

import java.util.ArrayList;
import java.util.Date;

/**
 * Escreva uma descrição da classe ModalidadeDiaria aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class ModalidadeDiaria extends Modalidade
{   private String dia,turma;

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }
        
    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }
        
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    public ModalidadeDiaria(){
    
    }
    
    public ModalidadeDiaria(ArrayList<String> nome, float preco, String dia){
        super(preco, nome);
        this.dia = dia;
       // this.dia = dia;
        //this.modalidade = modalidade;
    }
}
