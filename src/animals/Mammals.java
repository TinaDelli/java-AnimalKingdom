package animals;

public class Mammals extends AbstractAnimal
{
    public String name;
    public int year;

    public Mammals (int food, String name, int year)
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
        return "Walk";
    }   

    @Override
    public String getBreathType()
    {
        return "Lungs";
    }
    
    @Override
    public String getReproduction()
    {
        return "Live Births";
    }

    @Override
    public String toString()
    {
        return "Mammals :" +
        "Name: " + name + '\'' +
        ", Year Named: " + year + 
        '}';

    }
}

