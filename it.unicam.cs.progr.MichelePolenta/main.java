import java.net.*;
import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String playerWord = scanner.nextLine();
        String word= scanner.nextLine();
        System.out.print("Inserire il numero di tentativi");
        System.out.println("Inserire la parola da indovinare");
        Player player = new Player(scanner.nextInt());
        while(player.getTentativi()==0){
            System.out.println("Inserire quante lettere si vuole");
            if(player.inserisciLettera(playerWord, word)) {
            System.out.println("Bravo hai indovinato");
            }
            else{
                System.out.println("Hai sbagliato, ti rimangono "+player.getTentativi()+ " tentativi");
            }
        }
        System.out
    }
}
