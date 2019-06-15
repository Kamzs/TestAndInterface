package pl.KamilAmbroziak;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Playlist implements Playable
{

    private List<Playable> tracksToPlay = new ArrayList<>();

    public void add(Playable playable)
    {tracksToPlay.add(playable);}


    @Override
    public void play()
    {

        /*for (Playable thing :tracksToPlay)
        {
            System.out.println("playing" + thing);
        }*/

        tracksToPlay.stream().forEach(tracksToPlay -> tracksToPlay.play());
    }
}
