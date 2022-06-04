
/**
 * Escreva uma descrição da classe Resonsavel aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Responsavel
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String nome, cpf,telefone;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Responsavel(String nome, String cpf, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    
}
