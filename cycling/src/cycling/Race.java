package cycling;

import java.util.ArrayList;
import java.util.List;

import exceptions.StageNotFoundException;

public class Race {
    private String name;
   
    private List<Stage> stages;

    /**
     * @param name
     */
    public Race(String name) {
        this.name = name;
        this.stages = new ArrayList<>();
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
    public List<Stage> getStages() {
        return stages;
    }

    /**
     * @param stage
     */
    public void addStage(Stage stage) {
        stages.add(stage);
    }

    public void removeStage(Stage stage) {
        stages.remove(stage);
    }

    @Override
    public String toString() {
        return "Race{" +
                "name='" + name + '\'' +
                ", stages=" + stages +
                '}';
    }

    public void recordResult(String stageName, String riderName, long time) throws StageNotFoundException {
        // Find the stage by name
        Stage stage = null;
        for (Stage s : stages) {
            if (s.getName().equals(stageName)) {
                stage = s;
                break;
            }
        }
        if (stage == null) {
            throw new StageNotFoundException("Stage not found: " + stageName);
        }
        // Record the result in the corresponding stage
        stage.recordResult(riderName, time);
    }
}

