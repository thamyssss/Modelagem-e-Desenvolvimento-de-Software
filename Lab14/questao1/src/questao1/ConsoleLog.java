package questao1;
public class ConsoleLog extends AbstractLog {
    public ConsoleLog(int level) {
        super(level);
    }
    
    protected void write(String message) {
        System.out.println("Console: Enviando uma mensagem.");
    }
}
