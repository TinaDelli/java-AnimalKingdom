package animals;

public interface Animal
{
    String getBreathType();
    String getReproduction();
    void move();
    int getFoodLevel();
    void addFood(int i);
    void eatFood(int i);
}