package Negocio; 

import java.util.ArrayList;
import java.util.Date;
/**
 * Escreva uma descrição da classe ModalidadeTurma aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class ModalidadeLivre extends Modalidade
{  
    private String modalidade;
    private String dia;
    
    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }
    
    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    public ModalidadeLivre(ArrayList<String> nome, float preco, String dia) {
        super(preco, nome); 
        this.dia = dia;
    }
    
      
    
}
