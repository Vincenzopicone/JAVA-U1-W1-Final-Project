package ElementoMultimediale;

public class Immagine extends ElementoMultimediale{

    public Immagine() {
        System.out.println("Inserire il titolo dell'immagine:");
        this.type = Type.IMMAGINE;
        String titolo = Player.scanner.next();
        this.titolo = titolo;
        System.out.println("Inserire la luminosità:");
        int luminosità = Player.scanner.nextInt();
        this.luminosità = luminosità;

    }

}
