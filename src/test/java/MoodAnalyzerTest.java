import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
class MoodAnalyzerTest
{
    @Test
    void analyzeMood()
    {
        MoodAnalyzer moodAnalyzer1 = new MoodAnalyzer();
        String mood = moodAnalyzer1.analyzemood("I am in Sad mood".toLowerCase());
        Assertions.assertEquals(mood,"SAD");
    }
}