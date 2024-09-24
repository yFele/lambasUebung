import java.util.ArrayList;
import java.util.List;

public class HalloJavamitForEach {



    public static void main(String[] args) {
        List<String> oldList = new ArrayList<>();
        oldList.add("1");
        oldList.add("2");

        for (int i = 0; i <oldList.size() ; i++) {
            System.out.println(oldList.get(i));
        }

        oldList.forEach(item-> System.out.println(item));

    }

}
