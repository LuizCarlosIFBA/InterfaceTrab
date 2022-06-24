/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;
/**
 * Escreva uma descrição da classe Pagamento aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Pagamento
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String dataPagamento;
    private float valorPagamento;
   
    public float getValorPagamento() {
        return valorPagamento;
    }

    public void setValorPagamento(float valorPagamento) {
        this.valorPagamento = valorPagamento;
    }
    
    public String getDataPagamento() {
        return dataPagamento;
    }

    public void setQtdModalidades(String dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public Pagamento() {
     
    }
    
    public Pagamento(String dataPagamento,float valorPagamento) {
        this.dataPagamento = dataPagamento;
        this.valorPagamento = valorPagamento;
    }
    
    public void calcularDesconto(float valorSomado, boolean estudante, boolean parente, int qtdModalidades){
        this.valorPagamento = valorSomado;
        if(estudante){
           this.valorPagamento*=0.90f;
        }
        
        if(parente){
            this.valorPagamento *=0.90f;
        }
                
        switch(qtdModalidades){
            case 1: break;
            case 2: this.valorPagamento *=0.95f;
                    break;
            case 3:this.valorPagamento *=0.80f;
                    break;
                    default: ;
        }            // code block
                          
    }
    
    
}
