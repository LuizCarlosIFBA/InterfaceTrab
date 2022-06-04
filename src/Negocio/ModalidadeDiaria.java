import java.util.Date;

/**
 * Escreva uma descrição da classe ModalidadeDiaria aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class ModalidadeDiaria extends Modalidade
{   private Date dia;
    
    public Date getDia() {
        return dia;
    }

    public void setDia(Date dia) {
        this.dia = dia;
    }
        
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    public ModalidadeDiaria(String nome, float preco, Date dia){
       super(nome, preco);
       this.dia = dia; 
       // this.dia = dia;
        //this.modalidade = modalidade;
    }
}
