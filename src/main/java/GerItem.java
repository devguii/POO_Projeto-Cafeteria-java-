//Nome: Guilherme Antunes R.A:2142589
import java.util.ArrayList;
import java.util.List;

public class GerItem {
    
    private List<Cafe> bdCafe = new ArrayList<Cafe>();
    private List<Pao> bdPao = new ArrayList<Pao>();
    private List<Bolo> bdBolo = new ArrayList<Bolo>();

    public Cafe consIdCafe(Cafe cf){ //, int id, String nome, float preco, String sabor
        for (int i = 0; i < bdCafe.size(); i++) {
            if (bdCafe.get(i).getId() == cf.getId()) {
                return bdCafe.get(i);
            }
        }
        return null;
    } // consultando Cafe na lista
    
    public Pao consIdPao(Pao p){ //, int id, String nome, float preco, String sabor
        for (int i = 0; i < bdPao.size(); i++) {
            if (bdPao.get(i).getId() == p.getId()) {
                return bdPao.get(i);
            }
        }
        return null;
    } // consultando Pao na lista
    
    public Bolo consIdBolo(Bolo b){ //, int id, String nome, float preco, String sabor
        for (int i = 0; i < bdBolo.size(); i++) {
            if (bdBolo.get(i).getId() == b.getId()) {
                return bdBolo.get(i);
            }
        }
        return null;
    } // consultando Bolo na lista

    public Cafe setBdCafe(Cafe cf) {
        if (consIdCafe(cf) == null) {
            bdCafe.add(cf);
            return cf;
        }
        return null;
    } // adicionando Cafe na lista
    
    public Pao setBdPao(Pao p) {
        if (consIdPao(p) == null) {
            bdPao.add(p);
            return p;
        }
        return null;
    } // adicionando Pao na lista
    
    public Bolo setBdBolo(Bolo b) {
        if (consIdBolo(b) == null) {
            bdBolo.add(b);
            return b;
        }
        return null;
    } // adicionando Bolo na lista

    public void impListaCafe() {
        for (int i = 0; i < bdCafe.size(); i++) {
            System.out.println("\nCafe{ID: "+bdCafe.get(i).getId()+" , nome: "+bdCafe.get(i).getNome()+" , preco: "+bdCafe.get(i).getPreco()+"}");
        }
    } // imprimindo lista de Cafe
    
    public void impListaPao() {
        for (int i = 0; i < bdPao.size(); i++) {
            System.out.println("\nPao{ID: "+bdPao.get(i).getId()+" , nome: "+bdPao.get(i).getNome()+" , preco: "+bdPao.get(i).getPreco()+"}");
        }
    } // imprimindo lista de Pao
    
    public void impListaBolo() {
        for (int i = 0; i < bdBolo.size(); i++) {
            System.out.println("\nBolo{ID: "+bdBolo.get(i).getId()+" , nome: "+bdBolo.get(i).getNome()+", preco: "+bdBolo.get(i).getPreco()+"}");
        }
    } // imprimindo lista de Bolo
    
    public List<Cafe> getBdCafe() {
        return bdCafe; //retornando a lista de Cafe
    }
    
    public List<Pao> getBdPao() {
        return bdPao; //retornando a lista de Pao
    }
    
    public List<Bolo> getBdBolo() {
        return bdBolo; //retornando a lista de Bolo
    }

    public Cafe delCafe(Cafe c) {
        c = consIdCafe(c);
        if(c != null){
            bdCafe.remove(c); //apagando Cafe da lista pelo obj
        }
        return c;
    }
    
    public Pao delPao(Pao p) {
        p = consIdPao(p);
        if(p != null){
            bdPao.remove(p); //apagando Pao da lista pelo obj
        }
        return p;
    }
    
    public Bolo delBolo(Bolo b) {
        b = consIdBolo(b);
        if(b != null){
            bdBolo.remove(b); //apagando Bolo da lista pelo obj
        }
        return b;
    }
    
} // fim da classe
