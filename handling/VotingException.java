package excepation.handling;

public class VotingException 
{
    public static void validate(int age) 
    {  
        if(age<18) 
        {    
            throw new ClassCastException("Person is not eligible to vote");    
        }  
        else 
        {  
            System.out.println("Person is eligible to vote!!");  
        }  
    }  
    public static void main(String args[])
    {  
        validate(19);  
        System.out.println("program close...");    
  }    
}
