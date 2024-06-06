
public class MoodAnalyzer
{
    public String analyzemood(String msg)
    {
        if(msg.contains("sad")){
            return "SAD";
        }
        else {
            return "HAPPY";
        }
    }
    }

