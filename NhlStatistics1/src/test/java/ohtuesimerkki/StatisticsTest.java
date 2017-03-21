package ohtuesimerkki;

import java.util.*;

import org.junit.*;
import static org.junit.Assert.*;

public class StatisticsTest {
 
    Reader readerStub = new Reader() {
 
        public List<Player> getPlayers() {
            ArrayList<Player> players = new ArrayList<Player>();
 
            players.add(new Player("Semenko", "EDM", 4, 12));
            players.add(new Player("Lemieux", "PIT", 45, 54));
            players.add(new Player("Kurri",   "EDM", 37, 53));
            players.add(new Player("Yzerman", "DET", 42, 56));
            players.add(new Player("Gretzky", "EDM", 35, 89));
 
            return players;
        }
    };
 
    Statistics stats;

    @Before
    public void setUp(){
        stats = new Statistics(readerStub);
    }

    @Test
    public void searchFindsOrReturnsNull() {
        assertNotNull(stats.search("Kurri"));
        assertNull(stats.search("Moslem"));
    }

    @Test
    public void teamReturnsListOfProperSize() {
        assertEquals(3, stats.team("EDM").size());
        assertEquals(1, stats.team("PIT").size());
        assertEquals(0, stats.team("GIT").size());
    }

    @Test
    public void topScorersDoesSomethingIndeed() {
        assertEquals(2, stats.topScorers(1).size());
    }
}