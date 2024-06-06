
public class MoodAnalyzer
{
    private String msg;
    //Zero argument constructor
    public MoodAnalyzer()
    {
    }
    //Parameterized Constructor
    public MoodAnalyzer(String msg)
    {
        this.msg = msg;
    }
    public String analyzemood(String msg)
    {
        if(msg.contains("sad")){
            return "SAD";
        }
        else
        {
            return "HAPPY";
        }
    }
    }

