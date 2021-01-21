package login;
import java.io.Serializable; 
  
public class ValidateUser implements Serializable { 
  
	private static final long serialVersionUID = 1L;
	private String user, pass; 
  
   
    public void setUser(String u1) { this.user = u1; } 
    public void setPass(String p1) { this.pass = p1; } 
  
    // obtain back the values set by setter methods 
    public String getUser() { return user; } 
    public String getPass() { return pass; } 
  
    // validate a user 
    public boolean validate(String u1, String p1) 
    { 
        if (u1.equals(user) && p1.equals(pass)) 
            return true; 
        else
            return false; 
    } 
} 