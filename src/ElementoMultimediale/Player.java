package ElementoMultimediale;
import ElementoMultimediale.Type;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;


public class Player {
    public static Scanner scanner = new Scanner(System.in);
   static ArrayList media = new ArrayList<>();



    public static void main(String[] args) {

        System.out.println("Crea 5 elementi!");
        for (int i = 0; i < 5; i++) {
            System.out.println("Quale elemento vuoi creare? 1 Audio - 2 Video - 3 Immagine - 0 Uscita");
            int type = scanner.nextInt();
            switch (type) {
                case 1:
                    Audio audio = new Audio();
                    media.add(audio);
                    break;
                case 2:
                    Video video = new Video();
                    media.add(video);
                    break;
                case 3:
                    Immagine immagine = new Immagine();
                    media.add(immagine);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("il numero selezionato non è corretto! Inserisci il numero corretto.");

            }

        }

       /*int numeroScelta = 0;
        while (true) {
            System.out.println("Cosa vuoi riprodurre? Scegli da 1 a 5.");
            numeroScelta = scanner.nextInt();
            if (numeroScelta > 0 && numeroScelta <= 5) {
                switch (media.get(numeroScelta - 1).getType()) {
                    case Type.IMMAGINE -> ElementoMultimediale.show((Immagine) media.get(numeroScelta - 1));
                    case Type.VIDEO -> ElementoMultimediale.play((Video) media.get(numeroScelta - 1));
                    case Type.AUDIO -> ElementoMultimediale.play((Audio) media.get(numeroScelta - 1));
                    default -> System.out.println("Il numero non è corretto!");
                }
            }
        }*/



    }


      



}