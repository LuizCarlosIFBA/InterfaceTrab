
public class Modalidade
{
    
   
    private String nome;
    private float preco;

    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public Modalidade(String nome, float preco) {
        this.nome = nome;
        this.preco = preco;
    }
    
}
