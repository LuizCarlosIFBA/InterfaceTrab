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
    private Date dia;
    
    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }
    
    public Date getDia() {
        return dia;
    }

    public void setDia(Date dia) {
        this.dia = dia;
    }
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    public ModalidadeLivre(String nome, float preco, String modalidade, Date dia) {
        super(nome, preco);
        this.dia = dia;
        this.modalidade = modalidade;
    }
}
