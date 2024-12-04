import java.util.scanner;



public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);
        sc.nextLine();
    



        System.out.println("Nome");
        String nome = sc.nextLine();

        System.out.println("Descrizione");
        String descrizione = sc.nextLine();

        System.out.println("Tipologia");
        byte tipologia = sc.nextByte();

        System.out.println("Disponibilità");
        boolean disponibilità= sc.nextBooleane();

        System.out.println("Costo");
        double costo= sc.nextDouble();

        System.out.println("Allergeni");
        String allergeni= sc.nextLine();

        System.out.println("Conservazione");
        String conservazione = sc.nextLine();

        System.out.println("Foto");
        String foto= sc.nextLine();


     sc.close();


     

    System.out.println("Ecco gli ingredienti");

    System.out.println("Nome:"+ nome);
    System.out.println("Descrizione:"+ descrizione);
    System.out.println("Tipologia:"+ tipologia);
    System.out.println("Disponibilità:"+ disponibilità);
    System.out.println("Costo:"+ costo);
    System.out.println("Allergeni:"+allergeni);
    System.out.println("Conservazione:"+ conservazione);
    System.out.println("Foto"+ foto);















    

       
    }
}
