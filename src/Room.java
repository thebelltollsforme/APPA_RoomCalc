
public class Room {

    private int totalSquareFeet;
    private int cleanlinessLevel;

    public Room(int totalSquareFeet, int cleanlinessLevel) {
        this.totalSquareFeet = totalSquareFeet;
        this.cleanlinessLevel = cleanlinessLevel;
    }

    public Room() {
        this.totalSquareFeet = 0;
        this.cleanlinessLevel = 1;
    }
    
    public String toString(){
        String tempString = (this.totalSquareFeet + " square feet at a class " + this.cleanlinessLevel);
        return tempString;
    }

}
