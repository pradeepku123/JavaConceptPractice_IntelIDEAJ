package StreamDemoProgram;

import org.omg.CORBA.ObjectHelper;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemoOne {
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
        List<Integer> streamCollectList = al.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println("Its Proceess & Find Ix the Element is Even Number"+streamCollectList);

    }
}
