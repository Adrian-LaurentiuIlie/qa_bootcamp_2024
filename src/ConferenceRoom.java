import java.util.ArrayList;
import java.util.HashMap;

public class ConferenceRoom extends Room{

    private final String type = "Conference Room";

    private HashMap<String, ArrayList<ConferenceEquipmnet>> conferenceEquipment = new HashMap<String, ArrayList<ConferenceEquipmnet>>();

    public ConferenceRoom(int number, String name, int size) {
        super(number, name, size);
    }

    public void addConferenceEquipment(String conferenceEquipmentType){
        if (conferenceEquipmentType == "Telepresence") {
            if (conferenceEquipment.containsKey(conferenceEquipmentType)) {
                conferenceEquipment.get(conferenceEquipmentType).add(ConferenceEquipmnet.TELEPRESENCE);
            } else {
                ArrayList<ConferenceEquipmnet> c = new ArrayList<>();
                c.add(ConferenceEquipmnet.TELEPRESENCE);
                conferenceEquipment.put(conferenceEquipmentType, c);
            }
        } else {
            System.out.println("Invalid equipment type.");
        }
    }

    public void addConferenceEquipment(String conferenceEquipmentType, int number) {
        if (conferenceEquipmentType == "Telepresence") {
            if (conferenceEquipment.containsKey(conferenceEquipmentType)) {
                for (int i = 0; i < number; i++) {
                    conferenceEquipment.get(conferenceEquipmentType).add(ConferenceEquipmnet.TELEPRESENCE);
                }
            } else {
                ArrayList<ConferenceEquipmnet> c = new ArrayList<>();
                for (int i = 0; i < number; i++) {
                    c.add(ConferenceEquipmnet.TELEPRESENCE);
                }
                conferenceEquipment.put(conferenceEquipmentType, c);
            }
        } else {
            System.out.println("Invalid equipment type.");
        }
    }

    public ArrayList<ConferenceEquipmnet> getConferenceEquipment(String conferenceEquipmentType){
        return conferenceEquipment.getOrDefault(conferenceEquipmentType, new ArrayList<>());
    }
}
