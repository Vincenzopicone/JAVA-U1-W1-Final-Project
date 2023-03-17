package ElementoMultimediale;

public class Video extends ElementoMultimediale{
    public Video() {
        System.out.println("Inserire il titolo del video:");
        this.type = Type.VIDEO;
        String titolo = Player.scanner.next();
        this.titolo = titolo;
        System.out.println("Inserire la durata:");
        int durata = Player.scanner.nextInt();
        this.durata = durata;
        System.out.println("Inserire il volume:");
        int volume = Player.scanner.nextInt();
        this.volume = volume;
        System.out.println("Inserire la luminosità:");
        int luminosità = Player.scanner.nextInt();
        this.luminosità = luminosità;

    }

}
