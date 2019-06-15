package pl.KamilAmbroziak;

public class Movie implements Playable
{

    private String title;

    public Movie(String title)
    {
        this.title = title;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    @Override
    public void play()
    {
        System.out.println("film: " + title);
    }
}
