package pl.KamilAmbroziak;

public class Song implements Playable
{
    private String name;

    public Song(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }


    @Override
    public void play()
    {
        System.out.println("muzyka: " + name);
    }
}
