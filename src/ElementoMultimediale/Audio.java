package ElementoMultimediale;

public class Audio extends ElementoMultimediale{

    public Audio() {
        System.out.println("Inserire il titolo dell'audio:");
        String titolo = Player.scanner.next();
        this.titolo = titolo;
        System.out.println("Inserire la durata:");
        int durata = Player.scanner.nextInt();
        this.durata = durata;
        System.out.println("Inserire il volume:");
        int volume = Player.scanner.nextInt();
        this.volume = volume;
        this.type = Type.AUDIO;
    }

}
