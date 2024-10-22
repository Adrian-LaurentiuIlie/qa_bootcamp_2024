import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashMap;

@NoArgsConstructor @AllArgsConstructor
public class Room {

    @Getter @Setter
    protected int number;
    @Getter @Setter
    protected String name;
    @Getter @Setter
    protected int size;

    public Room(int number, String name, int size) {
        this.number = number;
        this.name = name;
        this.size = size;
    }

    protected HashMap<String, ArrayList<Furnitures>> furnitures = new HashMap<String, ArrayList<Furnitures>>();
    protected HashMap<String, ArrayList<Appliances>> appliances = new HashMap<String, ArrayList<Appliances>>();

    public void addFurnitures(String furnitureType){
        if(furnitureType == "Desk"){
            if(furnitures.containsKey(furnitureType)){
                furnitures.get(furnitureType).add(Furnitures.DESK);
            }else{
                ArrayList<Furnitures> f = new ArrayList<>();
                f.add(Furnitures.DESK);
                furnitures.put(furnitureType, f);
            }
        }else if(furnitureType == "Seat"){
            if(furnitures.containsKey(furnitureType)){
                furnitures.get(furnitureType).add(Furnitures.SEAT);
            }else{
                ArrayList<Furnitures> f = new ArrayList<>();
                f.add(Furnitures.SEAT);
                furnitures.put(furnitureType, f);
            }
        }else{
            System.out.println("Invalid furniture type.");
        }
    }

    public void addFurnitures(String furnitureType, int number){
        if(furnitureType == "Desk"){
            if(furnitures.containsKey(furnitureType)){
                for (int i = 0; i < number; i++) {
                    furnitures.get(furnitureType).add(Furnitures.DESK);
                }
            }else{
                ArrayList<Furnitures> f = new ArrayList<>();
                for (int i = 0; i < number; i++) {
                    f.add(Furnitures.DESK);
                }

                furnitures.put(furnitureType, f);
            }
        }else if(furnitureType == "Seat"){
            if(furnitures.containsKey(furnitureType)){
                for (int i = 0; i < number; i++) {
                    furnitures.get(furnitureType).add(Furnitures.SEAT);
                }
            }else{
                ArrayList<Furnitures> f = new ArrayList<>();
                for (int i = 0; i < number; i++) {
                    f.add(Furnitures.SEAT);
                }
                furnitures.put(furnitureType, f);
            }
        }else{
            System.out.println("Invalid furniture type.");
        }
    }

    public ArrayList<Furnitures> getFurniture(String furnitureType) {
        return furnitures.getOrDefault(furnitureType, new ArrayList<>());
    }

    public void addAppliances(String applianceType){
        if(applianceType == "Coffee Machine"){
            if(appliances.containsKey(applianceType)){
                appliances.get(applianceType).add(Appliances.COFFEE_MACHINE);
            }else{
                ArrayList<Appliances> a = new ArrayList<>();
                a.add(Appliances.COFFEE_MACHINE);
                appliances.put(applianceType, a);
            }
        }else if(applianceType == "Water Dispenser"){
            if(appliances.containsKey(applianceType)){
                appliances.get(applianceType).add(Appliances.WATER_DISPENSER);
            }else{
                ArrayList<Appliances> a = new ArrayList<>();
                a.add(Appliances.WATER_DISPENSER);
                appliances.put(applianceType, a);
            }
        }else if (applianceType == "Fridge") {
            if(appliances.containsKey(applianceType)){
                appliances.get(applianceType).add(Appliances.FRIDGE);
            }else{
                ArrayList<Appliances> a = new ArrayList<>();
                a.add(Appliances.FRIDGE);
                appliances.put(applianceType, a);
            }
        }else if (applianceType == "TV") {
            if(appliances.containsKey(applianceType)){
                appliances.get(applianceType).add(Appliances.TV);
            }else{
                ArrayList<Appliances> a = new ArrayList<>();
                a.add(Appliances.TV);
                appliances.put(applianceType, a);
            }
        }else if (applianceType == "Video Projector") {
            if(appliances.containsKey(applianceType)){
                appliances.get(applianceType).add(Appliances.VIDEO_PROJECTOR);
            }else{
                ArrayList<Appliances> a = new ArrayList<>();
                a.add(Appliances.VIDEO_PROJECTOR);
                appliances.put(applianceType, a);
            }
        } else{
            System.out.println("Invalid appliance type.");
        }
    }

    public void addAppliances(String applianceType, int number){
        if(applianceType == "Coffee Machine"){
            if(appliances.containsKey(applianceType)){
                for (int i = 0; i < number; i++) {
                    appliances.get(applianceType).add(Appliances.COFFEE_MACHINE);
                }
            }else{
                ArrayList<Appliances> a = new ArrayList<>();
                for (int i = 0; i < number; i++) {
                    a.add(Appliances.COFFEE_MACHINE);
                }
                appliances.put(applianceType, a);
            }
        }else if(applianceType == "Water Dispenser"){
            if(appliances.containsKey(applianceType)){
                for (int i = 0; i < number; i++) {
                    appliances.get(applianceType).add(Appliances.WATER_DISPENSER);
                }
            }else{
                ArrayList<Appliances> a = new ArrayList<>();
                for (int i = 0; i < number; i++) {
                    a.add(Appliances.WATER_DISPENSER);
                }
                appliances.put(applianceType, a);
            }
        }else if (applianceType == "Fridge") {
            if(appliances.containsKey(applianceType)){
                for (int i = 0; i < number; i++) {
                    appliances.get(applianceType).add(Appliances.FRIDGE);
                }
            }else{
                ArrayList<Appliances> a = new ArrayList<>();
                for (int i = 0; i < number; i++) {
                    a.add(Appliances.FRIDGE);
                }
                appliances.put(applianceType, a);
            }
        }else if (applianceType == "TV") {
            if(appliances.containsKey(applianceType)){
                for (int i = 0; i < number; i++) {
                    appliances.get(applianceType).add(Appliances.TV);
                }
            }else{
                ArrayList<Appliances> a = new ArrayList<>();
                for (int i = 0; i < number; i++) {
                    a.add(Appliances.TV);
                }
                appliances.put(applianceType, a);
            }
        }else if (applianceType == "Video Projector") {
            if(appliances.containsKey(applianceType)){
                for (int i = 0; i < number; i++) {
                    appliances.get(applianceType).add(Appliances.VIDEO_PROJECTOR);
                }
            }else{
                ArrayList<Appliances> a = new ArrayList<>();
                for (int i = 0; i < number; i++) {
                    a.add(Appliances.VIDEO_PROJECTOR);
                }
                appliances.put(applianceType, a);
            }
        }else{
            System.out.println("Invalid appliance type.");
        }
    }

    public ArrayList<Appliances> getAppliances(String applianceType){
        return appliances.getOrDefault(applianceType, new ArrayList<>());
    }

}
