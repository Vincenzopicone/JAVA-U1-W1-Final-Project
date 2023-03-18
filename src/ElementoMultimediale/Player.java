package ElementoMultimediale;

import java.util.Scanner;
import java.util.ArrayList;


public class Player {
    public static Scanner scanner = new Scanner(System.in);
    public static ArrayList media = new ArrayList<>();


    public static void main(String[] args) {

        System.out.println("Crea 5 elementi!");
        for (int i = 0; i < 5; i++) {
            System.out.println("Quale elemento vuoi creare? 1 Audio - 2 Video - 3 Immagine - 0 Uscita");

            int type = scanner.nextInt();
            switch (type) {
                case 1:
                    System.out.println("Inserire il titolo:");
                    String titA = Player.scanner.next();
                    System.out.println("Inserire la durata:");
                    int durA = Player.scanner.nextInt();
                    System.out.println("Inserire il volume:");
                    int volA = Player.scanner.nextInt();
                    Audio audio = new Audio(titA, durA, volA);
                    media.add(audio);
                    break;
                case 2:
                    System.out.println("Inserire il titolo:");
                    String titV = Player.scanner.next();
                    System.out.println("Inserire la durata:");
                    int durV = Player.scanner.nextInt();
                    System.out.println("Inserire il volume:");
                    int volV = Player.scanner.nextInt();
                    System.out.println("Inserire la luminosità:");
                    int lumV = Player.scanner.nextInt();
                    Video video = new Video(titV, durV, volV, lumV);
                    media.add(video);
                    break;
                case 3:
                    System.out.println("Inserire il titolo:");
                    String tit = Player.scanner.next();
                    System.out.println("Inserire la luminosità:");
                    int lum = Player.scanner.nextInt();
                    Immagine immagine = new Immagine(tit, lum);
                    media.add(immagine);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("il numero selezionato non è corretto! Inserisci il numero corretto.");

            }

        }


        System.out.println(media.get(3));
        int numeroScelta = 0;
        while (true) {
            System.out.println("Cosa vuoi riprodurre? Scegli da 1 a 5 oppure 0 per uscire!");
            numeroScelta = scanner.nextInt();
            if (numeroScelta > 0 && numeroScelta <= 5) {
                if (media.get(numeroScelta - 1).getClass().equals(Immagine.class)) {
                    ElementoMultimediale.show((Immagine) media.get(numeroScelta - 1));
                    System.out.println("Premi 1 per aumentare la luminosità e 2 per diminuirla oppure 0 per uscire!");
                    int scelta1 = scanner.nextInt();
                    switch (scelta1) {
                        case 1:
                            ElementoMultimediale.aumentaLuminosità((Immagine) media.get(numeroScelta - 1));
                            ElementoMultimediale.show((Immagine) media.get(numeroScelta - 1));
                            break;
                        case 2:
                            ElementoMultimediale.diminuisciLuminosità((Immagine) media.get(numeroScelta - 1));
                            ElementoMultimediale.show((Immagine) media.get(numeroScelta - 1));
                            break;
                        default:System.exit(0);
                    }
                    ;
                } else if (media.get(numeroScelta - 1).getClass().equals(Video.class)) {
                    ElementoMultimediale.play((Video) media.get(numeroScelta - 1));
                    System.out.println("Premi 1 per aumentare il volume e 2 per diminuirlo!");
                    System.out.println("oppure 3 per aumentare la luminosità e 4 per diminuirla oppure 0 per uscire!!");
                    int scelta2 = scanner.nextInt();
                    switch (scelta2) {
                        case 1:
                            ElementoMultimediale.alzaVolume((Video) media.get(numeroScelta - 1));
                            ElementoMultimediale.play((Video) media.get(numeroScelta - 1));
                            break;
                        case 2:
                            ElementoMultimediale.abbassaVolume((Video) media.get(numeroScelta - 1));
                            ElementoMultimediale.play((Video) media.get(numeroScelta - 1));
                            break;
                        case 3:
                            ElementoMultimediale.aumentaLuminosità((Video) media.get(numeroScelta - 1));
                            ElementoMultimediale.play((Video) media.get(numeroScelta - 1));
                            break;
                        case 4:
                            ElementoMultimediale.diminuisciLuminosità((Video) media.get(numeroScelta - 1));
                            ElementoMultimediale.play((Video) media.get(numeroScelta - 1));
                            break;
                        default:System.exit(0);
                    }
                } else if (media.get(numeroScelta - 1).getClass().equals(Audio.class)) {
                    ElementoMultimediale.play((Audio) media.get(numeroScelta - 1));
                    System.out.println("Premi 1 per aumentare il volume e 2 per diminuirlo oppure 0 per uscire!!");
                    int scelta3 = scanner.nextInt();
                    switch (scelta3) {
                        case 1:
                            ElementoMultimediale.alzaVolume((Audio) media.get(numeroScelta - 1));
                            ElementoMultimediale.play((Audio) media.get(numeroScelta - 1));
                            break;
                        case 2:
                            ElementoMultimediale.abbassaVolume((Audio) media.get(numeroScelta - 1));
                            ElementoMultimediale.play((Audio) media.get(numeroScelta - 1));
                            break;
                        default:System.exit(0);
                    }
                    ;
                } else {
                    System.exit(0);
                    System.out.println("");
                }
            }

        }
    }
}