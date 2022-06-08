import java.util.Date;

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
