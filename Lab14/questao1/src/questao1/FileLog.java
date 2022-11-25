package questao1;
public class FileLog extends AbstractLog {
    public FileLog(int level){
        super(level);
    }

    protected void write(String message) {
        System.out.println("File: enviando informação de debug.");
    }
}
