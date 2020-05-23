package StreamDemoProgram;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemoIMPMAP {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<Integer>();
        al.add(36);
        al.add(26);
        al.add(77);
        al.add(36);
        al.add(15);
        al.add(86);
        System.out.println("its By Default print Using Println Method"+al);

        //Now its Time To Use Stream Time Let Begin
      /*
        long streamCollectList = al.stream().map(i -> i + 5).count();
        System.out.println("Its Proceess & Find Ix the Element is Even Number::->"+streamCollectList);
     */
        List<Integer> SotredStream = al.stream().sorted((i1, i2) -> (i1 < i2) ? 1 : (i1 > i2) ? -1 : 0).collect(Collectors.toList());
        System.out.println("This is a List Of Stream Which is Now Available TO Display"+SotredStream);

        Integer[] convertToArray = al.stream().toArray(Integer[]::new);
        Stream.of(convertToArray).forEach(System.out::println);
        Integer max = al.stream().max((i1, i2) -> (i1 < i2) ? -1 : (i1 > i2) ? 1 : 0).get();
        System.out.println("Max of a Sorted List::"+max);
        Integer min = al.stream().min((i1, i2) -> (i1 < i2) ? -1 : (i1 > i2) ? 1 : 0).get();
        System.out.println("Min of a Sorted List::"+min);
    }

}
