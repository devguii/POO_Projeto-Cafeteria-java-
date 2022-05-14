//Nome: Guilherme Antunes R.A:2142589
public class Item {
    
    private int id;
    private String nome;
    private float preco;
    
    public Item() {
    }

    public Item(String nome, float preco) {
        this.nome = nome;
        this.preco = preco;
    }
   
    public int getId(){
        return id;
    }
    
    public void setId(int id) {
          this.id = id;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public float getPreco(){
        return preco;
    }
    
    public void setPreco(float preco){
        this.preco = preco;
    }
 
}