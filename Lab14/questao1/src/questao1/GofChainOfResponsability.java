package questao1;
public class GofChainOfResponsability {
    public static void main(String[] args){
        AbstractLog abs1 = new ConsoleLog(1);  
        AbstractLog abs2 = new FileLog(2); 
        AbstractLog abs3 = new ErrorLog(3); ;
        
        abs1.logMessage(1, "enviando uma mensagem");
        System.out.println("______________________________________");

        abs2.logMessage(1, "enviando uma mensagem");
        System.out.println("______________________________________");

        abs3.logMessage(1, "enviando uma mensagem");
    }
}
