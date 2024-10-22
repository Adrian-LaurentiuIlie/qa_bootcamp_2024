import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashMap;

@NoArgsConstructor @AllArgsConstructor
public class Floor {

    @Getter @Setter
    private String name;
    @Getter @Setter
    private int number;

    private HashMap<String, ArrayList<Room>> rooms = new HashMap<String, ArrayList<Room>>();

    public Floor(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public void addRoom(String roomType, Room room){
        ArrayList<Room> a = new ArrayList<>();
        a.add(room);
        if(roomType == "Office Space"){
           if(rooms.containsKey(roomType)){
               rooms.get(roomType).add(room);
           }else{
               rooms.put(roomType, a);
           }
       }
       else if(roomType == "Conference Room"){
           if(rooms.containsKey(roomType)){
               rooms.get(roomType).add(room);
           }else{
               rooms.put(roomType, a);
           }
       }
       else if(roomType == "Toilet"){
           if(rooms.containsKey(roomType)){
               rooms.get(roomType).add(room);
           }else{
               rooms.put(roomType, a);
           }
       }
       else if(roomType == "Kitchen"){
           if(rooms.containsKey(roomType)){
               rooms.get(roomType).add(room);
           }else{
               rooms.put(roomType, a);
           }
       }
       else{
           System.out.println("Invalid room type.");
       }
    }

    public void removeRoom(String roomType, Room room){
        rooms.get(roomType).remove(room);
    }

    public ArrayList<Room> getRooms(String roomType) {
        return rooms.getOrDefault(roomType, new ArrayList<>());
    }
}
