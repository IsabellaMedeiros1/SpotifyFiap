import models.Album;
import models.Musica;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sistema iniciando!");
        Musica novaMusica = new Musica("War Pigs", "Black Sabbath",
                "Heavy Metal", 474, 1970);
        Musica novaMusica2 = new Musica("Paranoid", "Black Sabbath", "Heavy Metal", 172, 1970);

        Album novoAlbum = new Album("Paranoid", "Black Sabbath",1970,
                new ArrayList<Musica>());
        novoAlbum.adicionarMusica(novaMusica);
        novoAlbum.adicionarMusica(novaMusica2);
        System.out.println(novoAlbum);

    }
}