import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sponsor sponsor = (Sponsor) o;
        return Objects.equals(name, sponsor.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Sponsor{" +
                "name='" + name + '\'' +
                ", budget=" + budget +
                '}';
    }
}
