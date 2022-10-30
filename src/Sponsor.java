import java.util.ArrayList;
import java.util.List;

public class Sponsor {

    private String name;
    private int budget;

    public Sponsor(String name, int budget) {
        this.name = name;
        this.budget = budget;
    }

    public String getName() {
        return name;
    }

    public int getBudget() {
        return budget;
    }

    public void toSponsorTheRace() {
        System.out.println("Выделить деньги для гонок");
    }

    @Override
    public String toString() {
        return "Sponsor{" +
                "name='" + name + '\'' +
                ", budget=" + budget +
                '}';
    }
}
