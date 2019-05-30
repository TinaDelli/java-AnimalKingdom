package animals;

public class Fish extends AbstractAnimal
{
    public String name;
    public int year;

    public Fish (int food, String name, int year)
    {
        super(food);
        this.name = name;
        this.year = year;
    }

    @Override
    public String getName()
    {
        return name;
    }

    @Override
    public Integer getYear()
    {
        return year;
    }

    @Override
    public String getMovement()
    {
        return "Swimming";
    }

    @Override
    public String getBreathType()
    {
        return "Gills";
    }
    
    @Override
    public String getReproduction()
    {
        return "Eggs";
    }

    @Override
    public String toString()
    {
        return "Fish: " +
        "Name: " + name + '\'' +
        ", Year Named: " + year + 
        '}';

    }
}

