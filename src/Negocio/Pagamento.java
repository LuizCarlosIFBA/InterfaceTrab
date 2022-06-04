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
    private Date dataPagamento;
    private float valorPagamento;
   
    public float getValorPagamento() {
        return valorPagamento;
    }

    public void setValorPagamento(float valorPagamento) {
        this.valorPagamento = valorPagamento;
    }
    
    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setQtdModalidades(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public Pagamento(Date dataPagamento,float valorPagamento) {
        this.dataPagamento = dataPagamento;
        this.valorPagamento = valorPagamento;
    }
}
