package cycling;

public class Rider {
    private String name;
    private String teamName;

    /**
     * @param name
     * @param teamName
     */
    public Rider(String name, String teamName) {
        this.name = name;
        this.teamName = teamName;
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
    public String getTeamName() {
        return teamName;
    }

    @Override
    public String toString() {
        return "Rider{" +
                "name='" + name + '\'' +
                ", teamName='" + teamName + '\'' +
                '}';
    }
}
