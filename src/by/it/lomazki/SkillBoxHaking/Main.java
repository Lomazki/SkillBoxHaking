package by.it.lomazki.SkillBoxHaking;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws AWTException {

        System.out.println("Give me some money and I will give you coffee, maybe");
        Scanner scanner = new Scanner(System.in);
        int moneyAmount = scanner.nextInt();

        String[] nameCoffee = {"Americano", "Espresso", "Cappuccino", "Latte"};
        int[] priceCoffee = {165, 140, 130, 90};
        boolean enoughMoney = false;
        for (int i = 0; i < priceCoffee.length; i++) {
            if (moneyAmount >= priceCoffee[i]) {
                System.out.println("You can buy " + nameCoffee[i] + " for " + priceCoffee[i] + " rubles");
                enoughMoney = true;
            }
        }
        if (!enoughMoney) {
            System.out.println("Not enough money");
        }

        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd_HHmmss");
        Date now = new Date();
        System.out.println(formatter.format(now));

        BufferedImage image = new Robot()
                .createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
        System.out.println(image.getWidth() + "x" + image.getHeight());
    }
}
