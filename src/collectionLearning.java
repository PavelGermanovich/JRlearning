import java.io.BufferedReader;
import java.util.*;

public class collectionLearning {

    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        HashSet<T> result = new HashSet<T>(set1);
        for (T temp :
                set2) {
            if (result.add(temp) == false) {
                result.remove(temp);
            }
        }
        return result;
    }


//    Напишите программу, которая прочитает из System.in последовательность целых чисел, разделенных пробелами,
//    затем удалит из них все числа, стоящие на четных позициях, и затем выведет получившуюся последовательность в
//    обратном порядке в System.out.
//    Все числа влезают в int. Позиции чисел в последовательности нумеруются с нуля.
//    В этом задании надо написать программу целиком, включая import'ы, декларацию класса Main и метода main.

    public static void main(String[] args){
        List<Integer> numbers = new ArrayList<>();
        int index =0;
        Integer temp;
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextInt()){
            temp = scanner.nextInt();
            if((index%2 == 0)){
                numbers.add(temp);
            }
            index ++;
        }

        Collections.reverse(numbers);
        for(int i: numbers){
            System.out.println(i + " ");
        }
    }
    }


