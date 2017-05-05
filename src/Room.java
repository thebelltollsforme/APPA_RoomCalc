
public class Room {

    private int totalSquareFeet;
    private int cleanlinessLevel;

    Room(int totalSquareFeet, int cleanlinessLevel) {
        this.totalSquareFeet = totalSquareFeet;
        this.cleanlinessLevel = cleanlinessLevel;
    }

    Room() {
        this.totalSquareFeet = 0;
        this.cleanlinessLevel = 1;
    }

}
