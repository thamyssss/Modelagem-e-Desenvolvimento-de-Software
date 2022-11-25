package questao1;
public abstract class AbstractLog {
    public final int INFO = 1;
    public final int DEBUG = 2;
    public final int ERROR = 3;

    protected int level;
    protected AbstractLog nextLog;

    public AbstractLog(int level) {
        this.level = level;
    }

    public void setNextLog(AbstractLog nextLog) {
        this.nextLog = nextLog;
    }

    public void logMessage(int level, String message) {
        if (this.level == level)
            write(message);
        else {
            System.out.println("Nivel chamado = " + level + " Nivel a executar = " + this.level);
            level++;
            logMessage(level, message);
          }
    }

    protected void write(String message) {   
    }
}
