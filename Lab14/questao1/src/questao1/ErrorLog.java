package questao1;
public class ErrorLog extends AbstractLog{
    public ErrorLog(int level){
        super(level);
    }
    
    protected void write(String message){
        System.out.println("Erro: enviando um erro.");
    }
}
