package shapemain;

import shapecalculation.Calculation;
import java.util.Scanner;
import java.util.logging.Logger;
public class Main {
    private static final Logger log=Logger.getLogger("Main");

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            log.info("1.Triangle        2.Rectangle          3.Circle           4.Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    log.info("VALUES FOR TRIANGLE");
                    log.info("Enter the base value:");
                    double base = sc.nextInt();
                    log.info("Enter the height value:");
                    float height = sc.nextInt();
                    log.info("Enter the side value:");
                    double side = sc.nextInt();
                    Calculation t = new Calculation(base, height, side);
                    log.info("Perimeter of Triangle :" + t.perimeter(base, height, side));
                    log.info("Area of Triangle :" + t.area(base,height));
                }

                case 2 -> {
                    log.info("VALUES FOR RECTANGLE");
                    log.info("Enter the length value:");
                    double length = sc.nextInt();
                    log.info("Enter the width value:");
                    double width = sc.nextInt();
                    Calculation r = new Calculation(length, width);
                    log.info("Perimeter of Rectangle :" + r.perimeter(length, width));
                    log.info("Area of Rectangle :" + r.area(length, width));
                }
                case 3 -> {
                    log.info("VALUES FOR CIRCLE");
                    log.info("Enter the radius value:");
                    double radius = sc.nextInt();
                    Calculation c = new Calculation(radius);
                    log.info("Perimeter of Circle :" + c.perimeter(radius));
                    log.info("Area of Circle :" + c.area(radius));
                }
                case 4 ->
                    System.exit(0);
                default ->
                    log.info("INVALID CHOICE!!!");
            }
        }
    }
}