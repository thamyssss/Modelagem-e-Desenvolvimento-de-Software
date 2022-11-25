import java.util.ArrayList;

public class militar {
    private String nome;
    private String patente;
    private ArrayList<militar> subordinados;

    public militar(String nome, String patente){
        this.subordinados = new ArrayList<militar>();
        this.nome = nome;
        this.patente = patente;
    }

    public void add (militar e){
        this.subordinados.add(e);
    }

    public void remove (militar e){
        this.subordinados.remove(e);
    }

    public ArrayList<militar> getSubordinados(){
        return this.subordinados;
    }

    public String toString(){
        return nome + " " + patente;
    }
}
