/* NHLTeam.java            by Kevin Wang
 * Intro to Programming and Java
 * Great Neck South High School
 * Ms Zinn
 * 
 * In-Class Assignment: Writing Classes (again)
 * 
 * Outline a class called NHLTeam that serves to provide information about a
 * National Hockey League team. Consider the following facts:
 *     • An NHLTeam has the following properties:
 *         o A name
 *         o A number of years in existence
 *         o A conference affiliation (Western/Eastern)
 *         o A division affiliation:
 *             * In the East: Atlantic, Northeast, Southeast
 *             * In the West: Central, Northwest, Pacific
 * 
 *     • An NHLTeam has NHLPlayers. NHLPlayers have the following properties:
 *         o A name
 *         o A uniform number
 *         o A position (left wing, right wing, center, defenseman, goalie)
 *         o A date of birth (you could calculate the age from this!)
 *         o A city of birth
 *     • A team uses a location to play its games (Arena)
 *         o An Arena also has its own properties! Think of them on your own!
 *     • You may add any other characteristics that you deem necessary to fully describe the team, players, or arena
 */

public class NHLTeam {
    private String teamName;
    private int teamAge;
    private String conferenceAffiliation, divisionAffiliation;
    
    public NHLTeam() {
        teamName = "";
        teamAge = 0;
        conferenceAffiliation = "";
        divisionAffiliation = "";
    }
}