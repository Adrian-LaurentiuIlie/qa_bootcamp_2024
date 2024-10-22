public class Homework {

    public static void main(String[] args) {

        //Create building
        Building building1 = new Building("Casuta Mititica","Cluj-Napoca","Aleea Detunata",55);

        //Create floors
        Floor floor1 = new Floor("Floor 1", 1);
        Floor floor2 = new Floor("Floor 2", 2);
        Floor floor3 = new Floor("Floor 3", 3);

        //Add floors to building
        building1.addFloor(floor1);
        building1.addFloor(floor2);
        building1.addFloor(floor3);

        //Create rooms for the first floor
        OfficeSpace floor1OfficeSpace1 = new OfficeSpace(1, "Office Space 1", 250);
        ConferenceRoom floor1ConferenceRoom1 = new ConferenceRoom(1, "Conference  Room A", 65);
        ConferenceRoom floor1ConferenceRoom2 = new ConferenceRoom(2, "Conference  Room B", 55);
        ConferenceRoom floor1ConferenceRoom3 = new ConferenceRoom(3, "Conference  Room C", 75);
        Toilet floor1Toilet1 = new Toilet(1, "Big Toilet", 25);
        Toilet floor1Toilet2 = new Toilet(2, "Small Toilet", 15);
        Kitchen floor1Kitchen1 = new Kitchen(1, "Kitchen", 45);

        //Add furnitures and appliances to rooms on the first floor
        floor1OfficeSpace1.addFurnitures("Desk", 20);
        floor1ConferenceRoom1.addFurnitures("Seat", 10);
        floor1ConferenceRoom1.addAppliances("TV");
        floor1ConferenceRoom2.addFurnitures("Seat",10);
        floor1ConferenceRoom2.addAppliances("TV");
        floor1ConferenceRoom3.addFurnitures("Seat", 10);
        floor1ConferenceRoom3.addAppliances("TV");
        floor1Kitchen1.addAppliances("Water Dispenser");
        floor1Kitchen1.addAppliances("Coffee Machine");
        floor1Kitchen1.addAppliances("Fridge");

        //Add rooms to floor 1
        floor1.addRoom("Office Space",floor1OfficeSpace1);
        floor1.addRoom("Conference Room",floor1ConferenceRoom1);
        floor1.addRoom("Conference Room",floor1ConferenceRoom2);
        floor1.addRoom("Conference Room",floor1ConferenceRoom3);
        floor1.addRoom("Toilet",floor1Toilet1);
        floor1.addRoom("Toilet",floor1Toilet2);
        floor1.addRoom("Kitchen",floor1Kitchen1);

        //Create rooms for the second floor
        OfficeSpace floor2OfficeSpace1 = new OfficeSpace(1, "Office Space 1", 250);
        OfficeSpace floor2OfficeSpace2 = new OfficeSpace(1, "Office Space 2", 300);
        ConferenceRoom floor2ConferenceRoom1 = new ConferenceRoom(1, "Conference  Room A", 65);
        ConferenceRoom floor2ConferenceRoom2 = new ConferenceRoom(2, "Conference  Room B", 55);
        ConferenceRoom floor2ConferenceRoom3 = new ConferenceRoom(3, "Conference  Room C", 45);
        ConferenceRoom floor2ConferenceRoom4 = new ConferenceRoom(3, "Conference  Room D", 55);
        Toilet floor2Toilet1 = new Toilet(1, "Big Toilet", 25);
        Toilet floor2Toilet2 = new Toilet(2, "Small Toilet", 15);
        Kitchen floor2Kitchen1 = new Kitchen(1, "Kitchen", 45);

        //Add furnitures and appliances to rooms on the second floor
        floor2OfficeSpace1.addFurnitures("Desk", 10);
        floor2OfficeSpace2.addFurnitures("Desk", 10);
        floor2ConferenceRoom1.addFurnitures("Seat", 8);
        floor2ConferenceRoom1.addAppliances("TV");
        floor2ConferenceRoom2.addFurnitures("Seat", 8);
        floor2ConferenceRoom2.addAppliances("TV");
        floor2ConferenceRoom3.addFurnitures("Seat", 8);
        floor2ConferenceRoom3.addAppliances("TV");
        floor2ConferenceRoom4.addFurnitures("Seat", 8);
        floor2ConferenceRoom4.addAppliances("TV");
        floor2Kitchen1.addAppliances("Water Dispenser");
        floor2Kitchen1.addAppliances("Coffee Machine");
        floor2Kitchen1.addAppliances("Fridge");

        //Add rooms to floor 2
        floor2.addRoom("Office Space",floor2OfficeSpace1);
        floor2.addRoom("Office Space",floor2OfficeSpace2);
        floor2.addRoom("Conference Room",floor2ConferenceRoom1);
        floor2.addRoom("Conference Room",floor2ConferenceRoom2);
        floor2.addRoom("Conference Room",floor2ConferenceRoom3);
        floor2.addRoom("Conference Room",floor2ConferenceRoom4);
        floor2.addRoom("Toilet",floor2Toilet1);
        floor2.addRoom("Toilet",floor2Toilet2);
        floor2.addRoom("Kitchen",floor2Kitchen1);

        //Create rooms for the third floor
        ConferenceRoom floor3ConferenceRoom1 = new ConferenceRoom(1, "Conference  Room A", 85);
        ConferenceRoom floor3ConferenceRoom2 = new ConferenceRoom(2, "Conference  Room B", 55);
        ConferenceRoom floor3ConferenceRoom3 = new ConferenceRoom(3, "Conference  Room C", 65);
        ConferenceRoom floor3ConferenceRoom4 = new ConferenceRoom(3, "Conference  Room D", 55);
        ConferenceRoom floor3ConferenceRoom5 = new ConferenceRoom(3, "Conference  Room E", 55);
        ConferenceRoom floor3ConferenceRoom6 = new ConferenceRoom(3, "Conference  Room F", 45);
        Toilet floor3Toilet1 = new Toilet(1, "Big Toilet", 25);
        Toilet floor3Toilet2 = new Toilet(2, "Small Toilet", 15);

        //Add furnitures and appliances to rooms on the third floor
        floor3ConferenceRoom1.addFurnitures("Seat", 30);
        floor3ConferenceRoom1.addAppliances("Video Projector");
        floor3ConferenceRoom1.addConferenceEquipment("Telepresence");
        floor3ConferenceRoom2.addFurnitures("Seat", 20);
        floor3ConferenceRoom2.addAppliances("TV");
        floor3ConferenceRoom2.addConferenceEquipment("Telepresence");
        floor3ConferenceRoom3.addFurnitures("Seat", 10);
        floor3ConferenceRoom3.addAppliances("TV");
        floor3ConferenceRoom3.addConferenceEquipment("Telepresence");
        floor3ConferenceRoom4.addFurnitures("Seat", 10);
        floor3ConferenceRoom4.addAppliances("TV");
        floor3ConferenceRoom4.addConferenceEquipment("Telepresence");
        floor3ConferenceRoom5.addFurnitures("Seat", 10);
        floor3ConferenceRoom5.addAppliances("TV");
        floor3ConferenceRoom5.addConferenceEquipment("Telepresence");
        floor3ConferenceRoom6.addFurnitures("Seat", 10);
        floor3ConferenceRoom6.addAppliances("TV");
        floor3ConferenceRoom6.addConferenceEquipment("Telepresence");

        //Add rooms to floor 3
        floor3.addRoom("Conference Room",floor3ConferenceRoom1);
        floor3.addRoom("Conference Room",floor3ConferenceRoom2);
        floor3.addRoom("Conference Room",floor3ConferenceRoom3);
        floor3.addRoom("Conference Room",floor3ConferenceRoom4);
        floor3.addRoom("Conference Room",floor3ConferenceRoom5);
        floor3.addRoom("Conference Room",floor3ConferenceRoom6);
        floor3.addRoom("Toilet",floor3Toilet1);
        floor3.addRoom("Toilet",floor3Toilet2);

        System.out.println(building1.toString());

    }
}
