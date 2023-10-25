import java.util.Scanner;
public class App {

    public static void main(String[] args) throws Exception {
    Scanner t=new Scanner(System.in);
    System.out.println("Ange avstånd till ditt jobb i km");
    int avstånd=t.nextInt();
    System.out.println("Bor du tillsammans med någon annan ja/nej?");
    String boende=t.next();
    System.out.println("Hur många år ska du jobba?");
    int jobbår=t.nextInt();

    if(avstånd>=50 && boende.equalsIgnoreCase("ja" )&& jobbår>=3)
    {
    System.out.println("Du har rätt till skatteavdrag!");
    }
    else if(avstånd>=50 && boende.equalsIgnoreCase("nej" )&& jobbår>=1)
    {
    System.out.println("Du har rätt till skatteavdrag!");
    }
    else
    {
    System.out.println("Du har inte rätt till skatteavdrag! // Fel inmatning");
    }
  }
}