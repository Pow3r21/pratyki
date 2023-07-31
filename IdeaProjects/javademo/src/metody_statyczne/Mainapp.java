package metody_statyczne;

import utils.StringUtils;

public class Mainapp {

    public static void main(String[] args) {


        String bartekTest = StringUtils.getFormattedText("BartekTest");
        System.out.println(bartekTest);

        String bartek = StringUtils.getFormattedText("Bartek");
        System.out.println(bartek);


    }
}
