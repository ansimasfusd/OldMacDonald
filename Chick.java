class Chick implements Animal {     
     private String myType;     
     private String mySound; 
     private String mySound2;
     public Chick(String type, String sound1, String sound2)     {         
         myType = type;         
         mySound = sound1;
         mySound2 = sound2;
     }     
     public Chick(){         
         myType = "unknown";         
         mySound = "unknown";
         mySound2 = "unknown";
     }      
     public String getSound(){
         if ((int)(Math.random() * 2) == 0)
         return mySound;
         else 
         return mySound2;
     }     
     public String getType(){
         return myType;
     } 
}