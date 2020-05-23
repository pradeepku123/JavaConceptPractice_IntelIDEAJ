package enumerationDemo;

import java.lang.invoke.SwitchPoint;

public class DemoTestOnEnum {
    public static void main(String[] args) {
        School s= School.STDTHREE;
        System.out.println(s);
        switch (s){
            case STDONE:
                 System.out.println("This Is STDONE");
                 break;
            case STDTWO:
                System.out.println("This is STDTWO");
                break;
            case STDTHREE:
                System.out.println("This is STDTHREE");
                break;
            default:
                System.out.println("Hiii Its Default & Make Sure u Have Assign Enum Variable");
        }
    }
}
