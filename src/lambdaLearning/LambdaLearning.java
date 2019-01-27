package lambdaLearning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LambdaLearning {

    public static void main(String[] args) {
        String[] list = {"sdfsf", "dsfsdf", "sf"};
        List<String> array = new ArrayList<>(Arrays.asList(list));
        System.out.println(array);
        Integer i =3;
        array.sort((o1, o2) -> o1.length() - o2.length());


    }
}
