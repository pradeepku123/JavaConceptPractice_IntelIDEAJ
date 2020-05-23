package InternationalizationExplore;

import java.util.Locale;

/**
 * Author Pradeep Kumar Behera
 */
public class DemoOne {
    public static void main(String[] args) {
        System.out.println("it is Locale Of Default Which is Chhoe By By Default::"+Locale.getDefault().getDisplayLanguage());
        Locale locale =new Locale("HINDI","IN");
        Locale.setDefault(locale);
        System.out.println("After Hindi As A Default Locale::"+Locale.getDefault().getCountry());
        System.out.println("this is Locale GEt Counrtyr::"+locale.getCountry());
        System.out.println("this is Locale GetDisplayCountry::"+locale.getDisplayCountry());
        System.out.println("this is Locale GetDisplayCountry With Local Variable::"+locale.getDisplayCountry(locale));
        System.out.println("Dispaly Language is::"+locale.getDisplayLanguage());


    }
}
