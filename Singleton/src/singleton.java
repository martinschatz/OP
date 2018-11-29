public class singleton 
{ 
    // static variable single_instance of type Singleton 
    private static singleton single_instance = null; 
  
    // variable of type String 
    public String s; 
  
    // private constructor restricted to this class itself 
    private singleton() 
    { 
        s = "yo"; 
    } 
  
    // static method to create instance of Singleton class 
    public static singleton getInstance() 
    { 
        if (single_instance == null) 
            single_instance = new singleton(); 
  
        return single_instance; 
    } 
} 