import java.util.Date;

public class Compras {
    private int id;
    private Date data;
    private Pessoa cliente;
    
    public Compras(int id, Date data, Pessoa cliente){
        this.id = id;
        this.data = data;
        this.cliente = cliente;
    }
    
    public int getId(){
        return id;
    }
    
    public void setId(){
        this.id = id;
    }
    
    public Date getData(){
        return data;
    }
    
    public void setData(){
        this.data = data;
    }
    
    
}