
import Negocio.Aluno;
import java.util.Date;
/**
 * Escreva uma descrição da classe AlunoMenor aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class AlunoMenor extends Aluno
{   private Responsavel responsavel;
    

    public Responsavel getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Responsavel responsavel) {
        this.responsavel = responsavel;
    }
    

    
    public AlunoMenor(String cpf, String nome, String endereco, String email, String celular, Date dataIngresso,Responsavel responsavel)
    {
        super(cpf,nome,endereco,email,celular,dataIngresso);
        this.responsavel=responsavel;
    }

  
}
