package ElementoMultimediale;

public class ElementoMultimediale {
    public String titolo;
    public int volume;
    public int durata;
    public int luminosità;

    public static void play(ElementoMultimediale elemento) {
        System.out.println("Titolo: " + elemento.titolo);
        for (int i = 0; i < elemento.volume; i++) {
            System.out.print("!");
        }
        System.out.println("");
        boolean lum = elemento.luminosità > 0;
        if (lum == true) {
            for (int i = 0; i < elemento.luminosità; i++) {
                System.out.print("*");
            }
        }
        System.out.println("");
    }
    public static void show(ElementoMultimediale elemento) {
        System.out.println("Titolo: " + elemento.titolo);
        for (int i = 0; i < elemento.luminosità; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }
    public static void alzaVolume (ElementoMultimediale elemento) {
        System.out.println("Quanto vuoi alzare il volume?");
        int vol = Player.scanner.nextInt();
        elemento.volume = elemento.volume + vol;
        System.out.println("");
    };
    public static void abbassaVolume (ElementoMultimediale elemento) {
        System.out.println("Quanto vuoi abbassare il volume?");
        int vol = Player.scanner.nextInt();
        elemento.volume = elemento.volume - vol;
        System.out.println("");
    };
    public static void aumentaLuminosità (ElementoMultimediale elemento) {
        System.out.println("Aumenta luminosità di: ");
        int vol = Player.scanner.nextInt();
        elemento.luminosità = elemento.luminosità + vol;
        System.out.println("");
    };
    public static void diminuisciLuminosità(ElementoMultimediale elemento) {
        System.out.println("Diminuisci la luminosità: ");
        int vol = Player.scanner.nextInt();
        elemento.luminosità = elemento.luminosità - vol;
        System.out.println("");
    };



}
