
public class MoodAnalyzer extends Throwable {
    enum Mood{
        HAPPY,SAD,NULL,EMPTY
    }
    private String msg;
    //Parameterized Constructor
    public MoodAnalyzer(String msg)
    {
        this.msg = msg;
    }
    public String validate() throws MoodAnalyzer{
        if(msg.contains("null")){
            return "Null";
        }else if(msg.toLowerCase().contains("sad")) {
            return "SAD";
        }else if(msg.toLowerCase().contains("happy")) {
            return "HAPPY";
        }else if(msg=="") {
                return String.valueOf(Mood.EMPTY);
        }else{
            throw new MoodAnalyzer("Invalid");
        }
    }
    public String analyzemood() {
        try
        {

                return validate();

        }
        catch (MoodAnalyzer e)
        {
            System.out.println("Exception " + e);
            System.out.println("catch the exception");
        }
        return msg;
    }
}

