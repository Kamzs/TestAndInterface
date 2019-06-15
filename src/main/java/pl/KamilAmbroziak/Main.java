package pl.KamilAmbroziak;

public class Main {

    public static void main(String[] args) {

        Playlist playlista = new Playlist();
        Song song = new Song("ona tanczy dla mnie");
        Movie movie = new Movie("przeminałe z wiatrem");

        playlista.play();


    }
}
