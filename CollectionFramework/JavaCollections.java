package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JavaCollections {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("C++");
        list.add("PHP");
        list.add("Java");

        Collections.addAll(list, "SQL", "Javascript");
        System.out.println(list);

        String[] programingLanguage = {"Scala", "Typescript", "NodeJS"};
        Collections.addAll(list, programingLanguage);

        System.out.println(list);
        System.out.println("Max is: " + Collections.max(list));
        
        Collections.replaceAll(list, "PHP", "PHP8");

    }
}
