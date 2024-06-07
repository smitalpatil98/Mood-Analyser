
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
    public String analyzemood() {
        try
        {
            if (msg.contains("sad"))
            {
                return "SAD";
            }
            else
            {
                return "HAPPY";
            }
        }
        catch (NullPointerException e)
        {
            return "HAPPY";
        }
    }
}

