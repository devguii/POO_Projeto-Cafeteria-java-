//Nome: Guilherme Antunes R.A:2142589
public class Cafe extends Item implements TaxaItem {
    
    private String sabor;
    
    public Cafe(){
    }
    
    public Cafe(String sabor) {
        this.sabor = sabor;
    }
    
    public String getSabor(){
        return sabor;
    }
    
    public void setSabor(String sabor){
        this.sabor = sabor;
    }
    
    @Override
    public Float getTaxa(){
        float taxa;
        taxa = (getPreco())*0.05F;
        return taxa;
    }
}