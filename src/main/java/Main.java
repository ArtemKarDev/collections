import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args){
        List<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("q");
        stringArrayList.add("w");
        stringArrayList.add("e");
        stringArrayList.add("n");
        System.out.println(getStringFromStream(stringArrayList.stream()));

        printList((ArrayList) stringArrayList);
    }

    public static String getStringFromStream(Stream stringStream) {
        //напишите тут ваш код
        return (String) stringStream.collect(Collectors.joining(" "));

    }

    public static void printList(ArrayList list){
        list.forEach(System.out::println);
    }

}