import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@NoArgsConstructor @AllArgsConstructor
public class Building {

    @Getter @Setter
    private String name;
    @Getter @Setter
    private String city;
    @Getter @Setter
    private String street;
    @Getter @Setter
    private int number;

    @Getter @Setter
    private ArrayList<Floor> floors = new ArrayList<Floor>();

    public Building(String name, String city, String street, int number) {
        this.name = name;
        this.city = city;
        this.street = street;
        this.number = number;
    }

    public void addFloor(Floor fn){
        floors.add(fn);
    }

    public void removeFloor(Floor fn){
        floors.remove(fn);
    }

    @Override
    public String toString() {
        System.out.println("Hotel " + name + " that is in " + city + " on the " + street + " " + number + " has " + floors.size() + " floors.");
        for(Floor f : floors) {
            System.out.println(f.getName()+":");
            if(f.getRooms("Ofiice Space").size() !=0) {
                System.out.println("    " + f.getRooms("Office Space").size() + " Office Space");
            }
            for(Room r : f.getRooms("Office Space")){
                System.out.println("        " + r.getName() + ": " + r.getFurniture("Desk").size() + " desks");
            }
            if(f.getRooms("Congerence Room").size() != 0) {
                System.out.println("    " + f.getRooms("Conference Room").size() + " Conference Room");
            }
            for(Room r : f.getRooms("Conference Room")){
                System.out.println("        " + r.getName() + ": " + r.getFurniture("Seat").size() + " seats");
                System.out.println("        " + r.getName() + ": " + r.getAppliances("TV").size() + " TVs");
                System.out.println("        " + r.getName() + ": " + ((ConferenceRoom) r).getConferenceEquipment("Telepresence").size() + " Telepresences");
            }
            if(f.getRooms("Kitchen").size() != 0) {
                System.out.println("    " + f.getRooms("Kitchen").size() + " Kitchen");
            }
            for(Room r : f.getRooms("Kitchen")){
                System.out.println("        " + r.getName() + ": " + r.getAppliances("Coffee Machine").size() + " Coffee Machines");
                System.out.println("        " + r.getName() + ": " + r.getAppliances("Water Dispenser").size() + " Water Dispensers");
                System.out.println("        " + r.getName() + ": " + r.getAppliances("Fridge").size() + " Fridges");
            }
            if(f.getRooms("Toilet").size() != 0) {
                System.out.println("    " + f.getRooms("Toilet").size() + " Toilet");
            }
            for(Room r : f.getRooms("Toilet")){
                System.out.println("        " + r.getName());
            }
        }
        return "";
    }

}
