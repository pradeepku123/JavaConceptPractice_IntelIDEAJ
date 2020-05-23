package InternationalizationExplore;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class DemoTwoNumberFormat {
    public static void main(String[] args) throws ParseException {
        Locale locale=new Locale("HINDI","IN");
        Locale.setDefault(locale);
        NumberFormat nf=NumberFormat.getInstance();
        System.out.println(nf.format(1536.668));
        NumberFormat numberCurrecy=NumberFormat.getCurrencyInstance();
        System.out.println("Represent The Indian::"+numberCurrecy.format(256565261));
        String stringNumber="45966";

        NumberFormat numberFormatcurrency=NumberFormat.getInstance();
        System.out.println("Convert The Sting To Java Locale Type::"+numberFormatcurrency.parse(stringNumber));


    }
}
