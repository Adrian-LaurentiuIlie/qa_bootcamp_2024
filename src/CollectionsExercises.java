import java.util.*;

public class CollectionsExercises {

    public static void main(String[] args) {

        int[] numbers = {1,5,8,89};
        Shape[] shapes = {new Circle(), new Triangle(), new Rectangle()};

        for (int n : numbers){
            System.out.println(n);
        }

        for (Shape s : shapes){
            s.draw();
        }

        shapes[0] = new Shape();
        Shape[] myShapes = new Shape[10];
        //myShapes[0].draw();

        System.out.println(myShapes.length);


        ArrayList myList = new ArrayList();
        myList.add(new Shape());
        myList.add(new Student());
        System.out.println(myList.isEmpty());
        myList.get(0);

        for(Object o : myList){
            System.out.println(o);
        }

        Iterator it = myList.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        myList.remove(0);

        ArrayList<Shape> myGenericShapes = new ArrayList<Shape>();
        myGenericShapes.add(new Square());
        myGenericShapes.add(new Rectangle());
        for(Shape s : myGenericShapes){
            s.draw();
        }

        HashSet<String> hs = new HashSet<String>();
        hs.add("Adrian");
        hs.add("Adrian");
        System.out.println(hs.size());

        HashMap<Integer, String> myHashMap = new HashMap<Integer, String>();
        myHashMap.put(1, "Adrian1");
        myHashMap.put(2, "Adrian2");
        myHashMap.put(3, "Adrian3");
        myHashMap.put(4, "Adrian4");
        System.out.println(myHashMap.get(1));

        System.out.println("-----------------------------");

        for(Integer k : myHashMap.keySet()){
            System.out.println(myHashMap.get(k));
        }

        Queue<String> myQueue = new PriorityQueue<String>();
        myQueue.add("Adrian1");
        myQueue.add("Adrian2");
        myQueue.add("Adrian3");

        System.out.println(Browsers.OPERA);

        System.out.println("-----------------------------");
        String inputText = "Ana are mere si pere si struguri. Toamna e frumos pentru ca nu e inca frig";
        printCharFrequancy(computeMapFromString(inputText, false));


    }

    public static HashMap<Character, Integer> computeMapFromString(String inputText, boolean caseSensitive){
        HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();
        String finalText = caseSensitive ? inputText : inputText.toLowerCase();
        for(Character c : finalText.toCharArray()){
            if(charMap.containsKey(c)){
                //int curentCount = charMap.get(c);
                //curentCount++;
                //charMap.put(c, curentCount);
                charMap.put(c, charMap.get(c) + 1);
            }else{
                charMap.put(c, 1);
            }
        }
        return charMap;
    }

    public static void printCharFrequancy(HashMap<Character, Integer> charMap){
        int sum = 0;
        for(Character c : charMap.keySet()){
            sum += charMap.get(c);
        }
        for(Character c : charMap.keySet()){
            System.out.println(c + " : " + charMap.get(c) * 100.0 / sum);
        }
    }
}
