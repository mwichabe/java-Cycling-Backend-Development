package cycling;

import java.util.HashMap;
import java.util.Map;

public class RaceResult {
    private Map<String, Long> stageResults;
    private Map<String, Integer> sprintPoints;
    private Map<String, Integer> mountainPoints;

    public RaceResult() {
        this.stageResults = new HashMap<>();
        this.sprintPoints = new HashMap<>();
        this.mountainPoints = new HashMap<>();
    }

    /**
     * @param stageName
     * @param time
     */
    public void addStageResult(String stageName, long time) {
        stageResults.put(stageName, time);
    }

    /**
     * @param stageName
     * @return
     */
    public long getStageResult(String stageName) {
        return stageResults.getOrDefault(stageName, -1L);
    }

    /**
     * @param stageName
     * @param points
     */
    public void addSprintPoints(String stageName, int points) {
        sprintPoints.put(stageName, points);
    }

    public int getSprintPoints(String stageName) {
        return sprintPoints.getOrDefault(stageName, 0);
    }

    /**
     * @param stageName
     * @param points
     */
    public void addMountainPoints(String stageName, int points) {
        mountainPoints.put(stageName, points);
    }

    /**
     * @param stageName
     * @return
     */
    public int getMountainPoints(String stageName) {
        return mountainPoints.getOrDefault(stageName, 0);
    }

    @Override
    public String toString() {
        return "RaceResult{" +
                "stageResults=" + stageResults +
                ", sprintPoints=" + sprintPoints +
                ", mountainPoints=" + mountainPoints +
                '}';
    }
}
