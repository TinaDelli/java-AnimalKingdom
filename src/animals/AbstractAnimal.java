package animals;

public abstract class AbstractAnimal
{
    protected int food;

    public AbstractAnimal(int food)
    {
        this.food = food;
    }

    public AbstractAnimal()
    {
        food = 1;
    }

    public abstract String getName();
    public abstract Integer getYear();
    public abstract String getMovement();
    public abstract String getBreathType();
    public abstract String getReproduction();

    public void move()
    {
        food--;
    }
    
    public void move(int steps)
    {
        food = food - steps;
    }

    public int getFoodLevel()
    {
        return food;
    };

    public void addFood(int i)
    {
        food = food + 1;
    }
    
    public void eatFood(int i)
    {
        food = food - 1;
    }
}