//Nome: Guilherme Antunes R.A:2142589
public class Bolo extends Item implements TaxaItem {
    
    private String sabor;
    private String recheio;
    private String cobertura;
    
    public Bolo(){
    }
    
    public Bolo(String sabor, String recheio, String cobertura) {
        this.sabor = sabor;
        this.recheio = recheio;
        this.cobertura = cobertura;
    }
    
    public String getSabor(){
        return sabor;
    }
    
    public void setSabor(String sabor){
        this.sabor = sabor;
    }

    public String getRecheio() {
        return recheio;
    }

    public void setRecheio(String recheio) {
        this.recheio = recheio;
    }

    public String getCobertura() {
        return cobertura;
    }

    public void setCobertura(String cobertura) {
        this.cobertura = cobertura;
    }
    
    @Override
    public Float getTaxa(){
        float taxa;
        taxa = (getPreco())*0.15F;
        return taxa;
    }
    
}