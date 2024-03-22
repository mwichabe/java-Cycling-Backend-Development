package cycling.testing;

import cycling.CyclingPortalImpl;
import cycling.StageType;
import cycling.Stage;

public class CyclingPortalTestApp {
    public static void main(String[] args) {
        // Instantiate the CyclingPortalImpl class
        CyclingPortalImpl cyclingPortal = new CyclingPortalImpl();
    
        // Test methods
        try {
            // Add teams
            cyclingPortal.addTeam("Team1");
            cyclingPortal.addTeam("Team2");
    
            // Add riders
            cyclingPortal.addRider("Rider1", "Team1");
            cyclingPortal.addRider("Rider2", "Team1");
            cyclingPortal.addRider("Rider3", "Team2");
    
            // Create a race
            cyclingPortal.createRace("Tour de France");
    
            // Add stages to the race
            Stage stage1 = new Stage("Stage 1", StageType.FLAT);
            Stage stage2 = new Stage("Stage 2", StageType.HILLY_FINISH);
            cyclingPortal.addStageToRace("Tour de France", stage1);
            cyclingPortal.addStageToRace("Tour de France", stage2);
    
            // Add riders to stages
            cyclingPortal.addRiderToStage("Tour de France", "Stage 1", "Rider1");
            cyclingPortal.addRiderToStage("Tour de France", "Stage 1", "Rider2");
            cyclingPortal.addRiderToStage("Tour de France", "Stage 2", "Rider1");
            cyclingPortal.addRiderToStage("Tour de France", "Stage 2", "Rider2");
    
            // Record race results
            cyclingPortal.recordRaceResult("Tour de France", "Stage 1", "Rider1", 3600);
            cyclingPortal.recordRaceResult("Tour de France", "Stage 1", "Rider2", 3650);
            cyclingPortal.recordRaceResult("Tour de France", "Stage 2", "Rider1", 3800);
            cyclingPortal.recordRaceResult("Tour de France", "Stage 2", "Rider2", 3750);
    
            // Print rider details
            System.out.println(cyclingPortal.getRiderDetails("Rider1"));
            System.out.println(cyclingPortal.getRiderDetails("Rider2"));
    
            // Print team details
            System.out.println(cyclingPortal.getTeamDetails("Team1"));
            System.out.println(cyclingPortal.getTeamDetails("Team2"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
}
