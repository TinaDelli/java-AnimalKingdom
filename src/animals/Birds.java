package animals;

public class Birds extends AbstractAnimal
{
    public String name;
    public int year;

    public Birds (int food, String name, int year)
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
    public String getMovement()
    {
        return "Fly";
    }

    @Override
    public String getBreathType()
    {
        return "Lungs";
    }
    
    @Override
    public String getReproduction()
    {
        return "Eggs";
    }

    @Override
    public String toString()
    {
        return "Birds :" +
        "Name: " + name + '\'' +
        ", Year Named: " + year + 
        '}';

    }
}

