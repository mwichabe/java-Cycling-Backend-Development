// In a separate Result.java file
package cycling;

public class Result {
    private String riderName;
    private long time;

    /**
     * @param riderName
     * @param time
     */
    public Result(String riderName, long time) {
        this.riderName = riderName;
        this.time = time;
    }

    // Add getters and setters as needed

    @Override
    public String toString() {
        return "Result{" +
                "riderName='" + riderName + '\'' +
                ", time=" + time +
                '}';
    }
}
