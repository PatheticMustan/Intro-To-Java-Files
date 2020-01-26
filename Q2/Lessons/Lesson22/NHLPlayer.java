/* NHLTeam.java            by Kevin Wang
 * • An NHLTeam has NHLPlayers. NHLPlayers have the following properties:
 *     o A name
 *     o A uniform number
 *     o A position (left wing, right wing, center, defenseman, goalie)
 *     o A date of birth (you could calculate the age from this!)
 *     o A city of birth
 */

import java.text.SimpleDateFormat;
import java.util.Date;

public class NHLPlayer {
    private String playerName;
    private int playerNumber;
    private String playerPosition;
    private SimpleDateFormat playerDateOfBirth;
    private String cityOfBirth;
    
    public NHLPlayer() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String dateString = format.format(new Date());
        Date   date       = format.parse ("2009-12-31");    
        
        playerName = "";
        playerNumber = 0;
        playerPosition = "";
        playerDateOfBirth = new SimpleDateFormat(12, 25, 0);
    }
}