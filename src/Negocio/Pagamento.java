package Negocio;

import java.util.Date;
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
    
    public Pagamento(){
    
    }

    public Pagamento(String dataPagamento,float valorPagamento) {
        this.dataPagamento = dataPagamento;
        this.valorPagamento = valorPagamento;
    }
    
    public float pagamentoModalidade(boolean modalidade1, boolean modalidade2, boolean modalidade3, float preco1, float preco2, float preco3){
        boolean modalidade [] ={modalidade1,modalidade2,modalidade3};
        float preco []={preco1,preco2,preco3};     
        
        float somaValor = 0;
        
        for(int i = 0;i<3; i++){
            if(modalidade[i]){
                somaValor = somaValor+preco[i];
            }
        }
        
        return somaValor; 
    }
    /*public float Pagamento(boolean natacao, boxe){
        return; 
    }*/

}