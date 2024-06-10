import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import junit.framework.TestCase;
class MoodAnalyzerTest extends Throwable
{
    @Test
    void analyzeMood() throws MoodAnalyzerTest
    {
        MoodAnalyzer moodAnalyzer1 = new MoodAnalyzer("I am in sad mood".toLowerCase());
        String mood = moodAnalyzer1.analyzemood();
        Assertions.assertEquals(mood,"SAD");
    }
    @Test
    void analyzeHappyMood() throws MoodAnalyzerTest
    {
        MoodAnalyzer moodAnalyzer2 = new MoodAnalyzer("I am in happy mood".toLowerCase());
        String mood = moodAnalyzer2.analyzemood();
        Assertions.assertEquals(mood,"HAPPY");
    }
    @Test
    void analyzeInvalidMood() throws MoodAnalyzerTest
    {
        MoodAnalyzer moodAnalyzer3 = new MoodAnalyzer("null");
        String mood = moodAnalyzer3.analyzemood();
        Assertions.assertEquals(mood,"Null");
    }
}