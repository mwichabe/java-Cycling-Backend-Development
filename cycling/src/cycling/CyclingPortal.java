package cycling;

import exceptions.*;

public interface CyclingPortal {
    
    // Rider's Management
    
    /**
     * Add a new rider to the portal.
     * 
     * @param name The name of the rider.
     * @param teamName The name of the team the rider belongs to.
     * @throws CyclingException If the rider cannot be added.
     */
    void addRider(String name, String teamName) throws CyclingException;
    
    /**
     * Remove a rider from the portal.
     * 
     * @param name The name of the rider to be removed.
     * @throws RiderNotFoundException If the rider is not found.
     * @throws CyclingException If the rider cannot be removed.
     */
    void removeRider(String name) throws RiderNotFoundException, CyclingException;
    
    /**
     * Get the details of a specific rider.
     * 
     * @param name The name of the rider.
     * @return The rider object.
     * @throws RiderNotFoundException If the rider is not found.
     */
    Rider getRiderDetails(String name) throws RiderNotFoundException;
    
    // Team Management
    
    /**
     * Add a new team to the portal.
     * 
     * @param teamName The name of the team.
     * @throws CyclingException If the team cannot be added.
     */
    void addTeam(String teamName) throws CyclingException;
    
    /**
     * Remove a team from the portal.
     * 
     * @param teamName The name of the team to be removed.
     * @throws CyclingException If the team cannot be removed.
     */
    void removeTeam(String teamName) throws CyclingException;
    
    /**
     * Get the details of a specific team.
     * 
     * @param teamName The name of the team.
     * @return The team object.
     * @throws TeamNotFoundException If the team is not found.
     */
    Team getTeamDetails(String teamName) throws TeamNotFoundException;
    
    // Race Design
    
    /**
     * Create a new race in the portal.
     * 
     * @param raceName The name of the race.
     * @throws CyclingException If the race cannot be created.
     */
    void createRace(String raceName) throws CyclingException;
    
    /**
     * Add a stage to an existing race.
     * 
     * @param raceName The name of the race.
     * @param stage The stage to be added.
     * @throws RaceNotFoundException If the race is not found.
     * @throws CyclingException If the stage cannot be added.
     */
    void addStageToRace(String raceName, Stage stage) throws RaceNotFoundException, CyclingException;
    
    // Race Results
    
    /**
     * Record the result of a rider in a specific stage of a race.
     * 
     * @param raceName The name of the race.
     * @param stageName The name of the stage.
     * @param riderName The name of the rider.
     * @param time The time taken by the rider to complete the stage.
     * @throws RaceNotFoundException If the race is not found.
     * @throws StageNotFoundException If the stage is not found.
     * @throws RiderNotFoundException If the rider is not found.
     * @throws CyclingException If the result cannot be recorded.
     */
    void recordRaceResult(String raceName, String stageName, String riderName, long time) 
            throws RaceNotFoundException, StageNotFoundException, RiderNotFoundException, CyclingException;
    
    /**
     * Add a rider to a specific stage of a race.
     * 
     * @param raceName The name of the race.
     * @param stageName The name of the stage.
     * @param riderName The name of the rider.
     * @throws RaceNotFoundException If the race is not found.
     * @throws StageNotFoundException If the stage is not found.
     * @throws RiderNotFoundException If the rider is not found.
     * @throws CyclingException If the rider cannot be added to the stage.
     */
    void addRiderToStage(String raceName, String stageName, String riderName) 
            throws RaceNotFoundException, StageNotFoundException, RiderNotFoundException, CyclingException;
}
