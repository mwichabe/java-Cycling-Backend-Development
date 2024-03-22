package cycling;

import java.util.ArrayList;
import java.util.List;

public class Stage {
    private String name;
    private StageType type;
    private List<Rider> riders;
    private List<Result> results; // Declaration of the results list

    public Stage(String name, StageType type) {
        this.name = name;
        this.type = type;
        this.riders = new ArrayList<>();
        this.results = new ArrayList<>(); // Initialize the results list
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
    public StageType getType() {
        return type;
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

    /**
     * @param riderName
     * @param time
     */
    public void recordResult(String riderName, long time) {
        Result result = new Result(riderName, time);
        results.add(result); // Add the result to the results list
    }

    @Override
    public String toString() {
        return "Stage{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", riders=" + riders +
                ", results=" + results + // Include results in the string representation
                '}';
    }
}
