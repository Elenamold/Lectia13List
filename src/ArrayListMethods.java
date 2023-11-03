import javax.swing.*;
import java.util.*;
public class ArrayListMethods {
    public  static List<String> createTODO(){
        List<String> todoList = new ArrayList<>();
        todoList.add(("to prepare homework"));
        todoList.add("to visit uncle");
        todoList.add("to repair my skirt");
        todoList.add("to visit uncle");
        System.out.println(todoList);
        return  todoList;
    }
    public  static List<String> createAdjectives(){
        List<String> listAdj = new ArrayList<>();
        listAdj.add(("atractive"));
        listAdj.add("bald");
        listAdj.add("beautiful");
        listAdj.add("skinny");
        listAdj.add("fit");
        listAdj.add("beautiful");
        listAdj.add("ugly");
        System.out.println(listAdj);
        return  listAdj;
    }
    public  static Set<String> createAdjectivesUnic(List<String> lll){
        Set<String> setAdjectives = new HashSet<>();
        for (String ele: lll  )     setAdjectives.add(ele);
        System.out.println(setAdjectives);
        return setAdjectives;
    }
   public  static Map<String,String> createDictionary(){
       Map<String,String> mapDictionary = new HashMap<>();
       mapDictionary.put("masa", "table");
       mapDictionary.put("mostenire", "inherit");
       mapDictionary.put("adaugare", "add");
       return mapDictionary;
   }
    public  static String traduceCuvant(Map<String,String> dictionar,String cuvant){
        String word = new String();
        boolean found = false;
        for (Map.Entry<String,String> entry:dictionar.entrySet())
            if (entry.getKey().equals(cuvant))   {
                found = true;
                word=entry.getValue();
                System.out.printf("cuvântul %s se traduce în engleză ca %s \n", cuvant, word);
        }
        if (found == false)  System.out.printf("cuvântul %s nu se regâsește in dicționar \n", cuvant);
        return word;
    }
    public static void main(String[] args) {
        System.out.println("Exercitiu 1");
        createTODO();
        System.out.println("Exercitiu 2");
        createAdjectivesUnic(createAdjectives());
        System.out.println("Exercitiu 3");
        Map<String,String> mapDictionary = new HashMap<>();
        mapDictionary = createDictionary();
        System.out.println(mapDictionary);
        String str = traduceCuvant(mapDictionary,"masa");
        System.out.println(str);
        str = traduceCuvant(mapDictionary,"creon");
        System.out.println(str);

//        ArrayList<String> ar1 = new ArrayList<String>();
//        ar1.add("java");
//        ar1.add("python");
//        ar1.add("ruby");
//        ar1.add("javascript");
//        System.out.println(ar1.hashCode());
//        ArrayList<String> ar2 = new ArrayList<String>();
//        ar2.add("Testing");
//        ar2.add("dev ops");
//
//        ArrayList<String> cloneList = ( ArrayList<String>)ar1.clone();
//        System.out.println(cloneList);
//        System.out.println(cloneList.hashCode());
//        ar1.add("delphi");
//        System.out.println(ar1.hashCode());
//        System.out.println(ar1);
//        System.out.println(cloneList.hashCode());
//        System.out.println(cloneList);

//        Collection collection = new ArrayList();
    }
}