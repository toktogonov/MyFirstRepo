package junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Demo {

    @Test
    public void test1() {
        System.out.println("This is test 1");
    }

    public boolean catDog(String str) {
        int len = str.length();
        int cat = 0;
        int dog = 0;
        for (int i = 0; i < len - 2; i++) {
            String temp = str.substring(i, i + 3);
            if (temp.compareTo("cat") == 0)
                cat++;
            if (temp.compareTo("dog") == 0)
                dog++;
        }
        if (cat == dog)
            return true;
        else
            return false;
    }

    @Test
    public void test2() {


        String str1 = "catdogcatdogdogcat";
        boolean expectValue1 = true;
        String str2 = "catcatdogdg";
        boolean expectValue2 = false;
        String str3 = "1cat1cadodog";
        boolean expectValue3 = true;

        Assertions.assertEquals(expectValue1,catDog(str1));
        Assertions.assertEquals(expectValue2,catDog(str2));
        Assertions.assertEquals(expectValue3,catDog(str3));
    }
    public boolean endsLy(String str) {
        if(str.length() >= 2 && str.substring(str.length()-2).equals("ly")){
            return true;
        } else
            return false;

    }

}
