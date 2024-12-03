import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);

        System.out.println("Scegli il tuo piatto!");
        

            System.out.println("Nome");
            String nome= sc.nextLine();

            System.out.println("Descrizione");
            String descrizione= sc.nextLine();

            System.out.println("Prezzo");
            String prezzo= sc.nextLine();

            System.out.println("Disponibile");
            Boolean disponibile= sc.nextBoolean();

            System.out.println("Tipologia");
            Byte tipologia= sc.nextByte();

            System.out.println("allergeni");
            String allergeni= sc.nextLine();

            System.out.println("foto");
            String foto= sc.nextLine();

            System.out.println("calorie");
            Short calorie= sc.nextShort();

            System.out.println("variazioni");
            String variazioni= sc.nextLine();

            sc. close();

            //............................................................

            System.out.println("il piatto che hai scelto");

            //VERSIONE 2
            //System.out.printIn(
            
            System.out.println("Nome:" + nome);
            System.out.println("Descrizione:"+ descrizione);
            System.out.println("Prezzo:"+ prezzo);
            System.out.println("Disponibile:"+ disponibile);
            System.out.println("Tipologia:"+ tipologia);
            System.out.println("Allergeni:"+ allergeni);
            System.out.println("Foto:"+ foto);
            System.out.println("Calorie:"+ calorie);
            System.out.println("Variazioni:"+ variazioni);

    }
}
