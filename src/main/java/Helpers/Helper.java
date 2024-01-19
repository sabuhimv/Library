package Helpers;

public class Helper {
    public static int tryParseInt(String choice){
        int input=0;
        
        try{
            input = Integer.parseInt(choice);
        }
        catch(Exception e){
            System.out.println("Pls enter number");
        }
        
        return input;
        
        
    }
}
