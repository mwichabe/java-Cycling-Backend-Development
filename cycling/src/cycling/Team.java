package cycling;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Team {
    private String name;
    private List<Rider> riders;

    /**
     * @param name
     */
    public Team(String name) {
        this.name = name;
        this.riders = new ArrayList<>();
    }

    /**
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * @return
     */
    public List<Rider> getRiders() {
        return riders;
    }

    /**
     * @param rider
     */
    public void addRider(Rider rider) {
        riders.add(rider);
    }

    /**
     * @param rider
     */
    public void removeRider(Rider rider) {
        riders.remove(rider);
    }

    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                ", riders=" + riders +
                '}';
    }
}
