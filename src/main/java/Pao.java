//Nome: Guilherme Antunes R.A:2142589
public class Pao extends Item implements TaxaItem {
    
    private String tipo;
    private String recheio;
    
    public Pao(){
    }
    
    public Pao(String tipo, String recheio) {
        this.tipo = tipo;
        this.recheio = recheio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getRecheio() {
        return recheio;
    }

    public void setRecheio(String recheio) {
        this.recheio = recheio;
    }
    
    @Override
    public Float getTaxa(){
        float taxa;
        taxa = (getPreco())*0.1F;
        return taxa;
    }
 
}