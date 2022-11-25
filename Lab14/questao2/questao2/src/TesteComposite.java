public class TesteComposite {
    private static void mostraTropa(militar m){
        m.add(m);
        System.out.println(m.toString());
    }
    public static void main (String[] args){
        System.out.println("Nome      Patente");

        militar m1 = new militar("Napoleao", "General");
        mostraTropa(m1);

        militar m3 = new militar("Paulo", "Coronel");
        mostraTropa(m3);

        militar m4 = new militar("Rever", "Capitao");
        mostraTropa(m4);

        militar m5 = new militar("Santos", "Tenente");
        mostraTropa(m5);

        militar m6 = new militar("Pereira", "Sargento");
        mostraTropa(m6);

        militar m7 = new militar("Silva", "Cabo");
        mostraTropa(m7);

        militar m8 = new militar("Junior", "Soldado");
        mostraTropa(m8);

        militar m9 = new militar("Raso", "Soldado");
        mostraTropa(m9);
    }
}
