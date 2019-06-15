import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import pl.KamilAmbroziak.Movie;
import pl.KamilAmbroziak.Playlist;
import pl.KamilAmbroziak.Song;

import static org.junit.Assert.assertTrue;


public class PlaylistTest
{


    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    private static Playlist playlist;

    @Before
    public void initiazlizePlaylist()
    {
        playlist = new Playlist();
        playlist.add(new Movie("casablance"));
        playlist.add(new Song("song1"));
        playlist.add(new Song("song2"));
    }

    @Test
    public void testSequancePlaylist()
    {
        playlist.play();
        assertTrue(systemOutRule.getLog().contains("film: casablance"));
        assertTrue(systemOutRule.getLog().contains("muzyka: song1"));

    }

}
