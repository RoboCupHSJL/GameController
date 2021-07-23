package data.hl;

/**
 * This class sets attributes given by the humanoid-league rules.
 *
 * @author Michel-Zen
 */
public class HLSimulationJunior extends HLSim
{
    public HLSimulationJunior()
    {
        /** The league´s name this rules are for. */
        leagueName = "HL Simulation Junior";
        /** The league´s directory name with it´s teams and icons. */
        leagueDirectory = "hl_sim_junior";
        /** How many robots are in a team. */
        teamSize = 3;
        /** How many robots of each team may play at one time. */
        robotsPlaying = 3;
        /** Time in seconds one half is long. */
        halfTime = 3*60;        
    }
}
