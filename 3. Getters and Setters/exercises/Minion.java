package exercises;

public class Minion {

    private String name; 
 	private int eyes; 
 	private String color; 
 	private String master;

    Minion(String name, int eyes, String color, String master){
        this.name = name; 
        this.eyes = eyes; 
        this.color = color;
        this.master = master;
    }

    public void setName(String newName){
        this.name = newName;
    }
    public String getName(){
        return this.name;
    }

    public void setEyes(int newEyes){
        this.eyes = newEyes;
    }
    public int getEyes(){
        return this.eyes;
    }

    public void setColor(String newColor){
        this.color = newColor;
    }
    public String getColor(){
        return this.color;
    }

    public void setMaster(String newMaster){
        this.master = newMaster;
    }
    public String getMaster(){
        return this.master;
    }





}
