
import java.util.ArrayList;
public class RoomCalc {

   // testing the commit function in netbeans
    // testing again
    // testing if the netbeans commit is more annoying than the cmd prompt
    // more testing for the commit comment
    // modifying for the task update
    public static void main(String[] args) {
        ArrayList<Room> testArrayList = new ArrayList();
        Room testRoom = new Room(1000,1);
        testArrayList.add(testRoom);
        testRoom.setCleanlinessLevel(2);
        testArrayList.add(new Room(250,2));
        
        for (Room testingRoom : testArrayList){
            System.out.println(testingRoom);
        }
    }
    
    
    
    
    
}
