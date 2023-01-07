import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class WorkingWithList {
    public static void main(String[] args) {
        List <String> colors = new ArrayList<>();//ArrayList Implementation of using List (I)
        List <String> colors2 = new Stack<>(); //Stack Implementation of using List (I)
        List <String> colors3 = new LinkedList<>(); //LinkedList Implementation of using List (I)
        colors.add("blue");
        colors.add("yellow");
        colors.add("purple");

        List <String> colorsUnmodifiable = List.of(
                "blue",
                "yellow"
        );

        System.out.println(colors.size());
        System.out.println(colors.contains("yellow"));
        System.out.println(colors.contains("pink"));
        System.out.println(colors);

        for (String color : colors){
            System.out.println(color);
        }

        colors.forEach(System.out::println);

        for (int i = 0; i < colors.size(); i++){
            System.out.println(colors.get(i));
        }

    }
}