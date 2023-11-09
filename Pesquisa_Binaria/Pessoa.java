import java.util.List;

public class Pessoa{
    private String nome;
    private int idade;
    private List<Compras> compras;
    
    public Pessoa(String nome, int idade, List<Compras> compras){
        this.nome = nome;
        this.idade = idade;
        this.compras = compras;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public int getIdade(){
        return idade;
    }
    
    public void setIdade(){
        this.idade = idade;    
    }
    
    public List <Compras> getCompras(){
        return compras;
    } 
}