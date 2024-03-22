package cycling;

import exceptions.*;

import java.util.HashMap;
import java.util.Map;

public class CyclingPortalImpl implements CyclingPortal {
    private Map<String, Rider> riders;
    private Map<String, Team> teams;
    private Map<String, Race> races;

    public CyclingPortalImpl() {
        this.riders = new HashMap<>();
        this.teams = new HashMap<>();
        this.races = new HashMap<>();
    }

    @Override
    public void addRider(String name, String teamName) throws CyclingException {
        if (riders.containsKey(name)) {
            throw new CyclingException("Rider already exists: " + name);
        }
        Team team = teams.get(teamName);
        if (team == null) {
            throw new CyclingException("Team does not exist: " + teamName);
        }
        Rider rider = new Rider(name, teamName);
        riders.put(name, rider);
        team.addRider(rider);
    }

    @Override
    public void removeRider(String name) throws RiderNotFoundException, TeamNotFoundException {
        Rider rider = riders.get(name);
        if (rider == null) {
            throw new RiderNotFoundException("Rider not found: " + name);
        }
        String teamName = rider.getTeamName(); // Retrieve the team name
        Team team = teams.get(teamName); // Get the team object corresponding to the team name
        if (team == null) {
            throw new TeamNotFoundException("Team not found: " + teamName);
        }
        team.removeRider(rider);
        riders.remove(name);
    }

    @Override
    public Rider getRiderDetails(String name) throws RiderNotFoundException {
        Rider rider = riders.get(name);
        if (rider == null) {
            throw new RiderNotFoundException("Rider not found: " + name);
        }
        return rider;
    }

    @Override
    public void addTeam(String teamName) throws CyclingException {
        if (teams.containsKey(teamName)) {
            throw new CyclingException("Team already exists: " + teamName);
        }
        Team team = new Team(teamName);
        teams.put(teamName, team);
    }

    @Override
    public void removeTeam(String teamName) throws TeamNotFoundException {
        Team team = teams.get(teamName);
        if (team == null) {
            throw new TeamNotFoundException("Team not found: " + teamName);
        }
        teams.remove(teamName);
    }

    @Override
    public Team getTeamDetails(String teamName) throws TeamNotFoundException {
        Team team = teams.get(teamName);
        if (team == null) {
            throw new TeamNotFoundException("Team not found: " + teamName);
        }
        return team;
    }

    @Override
    public void createRace(String raceName) throws CyclingException {
        if (races.containsKey(raceName)) {
            throw new CyclingException("Race already exists: " + raceName);
        }
        Race race = new Race(raceName);
        races.put(raceName, race);
    }

    @Override
    public void addStageToRace(String raceName, Stage stage) throws RaceNotFoundException {
        Race race = races.get(raceName);
        if (race == null) {
            throw new RaceNotFoundException("Race not found: " + raceName);
        }
        race.addStage(stage);
    }

    @Override
    public void recordRaceResult(String raceName, String stageName, String riderName, long time)
            throws RaceNotFoundException, StageNotFoundException, RiderNotFoundException {
        Race race = races.get(raceName);
        if (race == null) {
            throw new RaceNotFoundException("Race not found: " + raceName);
        }

        // Retrieve the stage from the race
        Stage stage = null;
        for (Stage s : race.getStages()) {
            if (s.getName().equals(stageName)) {
                stage = s;
                break;
            }
        }
        if (stage == null) {
            throw new StageNotFoundException("Stage not found: " + stageName);
        }

        Rider rider = riders.get(riderName);
        if (rider == null) {
            throw new RiderNotFoundException("Rider not found: " + riderName);
        }
        // Check if the rider is participating in the current stage
        if (!stage.getRiders().contains(rider)) {
            throw new RiderNotFoundException("Rider not participating in stage: " + riderName);
        }
        // Record the result
        race.recordResult(stageName, riderName, time);
    }

    @Override
    public void addRiderToStage(String raceName, String stageName, String riderName)
            throws RaceNotFoundException, StageNotFoundException, RiderNotFoundException {
        Race race = races.get(raceName);
        if (race == null) {
            throw new RaceNotFoundException("Race not found: " + raceName);
        }

        Stage stage = null;
        for (Stage s : race.getStages()) {
            if (s.getName().equals(stageName)) {
                stage = s;
                break;
            }
        }
        if (stage == null) {
            throw new StageNotFoundException("Stage not found: " + stageName);
        }

        Rider rider = riders.get(riderName);
        if (rider == null) {
            throw new RiderNotFoundException("Rider not found: " + riderName);
        }

        stage.addRider(rider);
    }

}
