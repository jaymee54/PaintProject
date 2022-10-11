
import java.util.Scanner;
import java.lang.Math;


public class Main {

    /*static String name = "Jamie";
    public static void main(String[] args) {System.out.println("Hello world!" + name);
    Public static void main(){} */
    static int Length = 1;

    static int Width = 5;

    static int Height = 2;

    static double Paint_coats = 4;

    static double Paint_litre_area = 6;

    static double Paint_area = 2 * Height * (Length + Width) + Length * Width;

    static double Paint_litres = Paint_coats * Paint_area / Paint_litre_area;



    public static void main(String[] args) {

        int Price;

        Scanner Scn = new Scanner(System.in);


        do {
            Price = 0;

            System.out.println("Enter paint choice Cheap Medium Expensive");
            String Quality = Scn.nextLine();

            switch (Quality.toLowerCase()) {

                case "cheap":
                    //System.out.println("cheap");
                    Price = 1;
                    break;
                case "medium":
                    //System.out.println("mid");
                    Price = 2;
                    break;
                case "expensive":
                    //System.out.println("exp");
                    Price = 3;
                    break;
                default:
                    System.out.println("Input Error try again");

            }
        }
        while (Price == 0);

        System.out.println("Enter the number of things you don't need to paint");
        String Obstructions = Scn.nextLine();
        int Number_obstruct = Integer.parseInt(Obstructions);

        double Obstructions_array[] = new double [Number_obstruct];

        int Total_obstruction_area = 0;

        for(int count = 0; count < Obstructions_array.length; count++) {

            System.out.println("Enter the area of the thing you don't need to paint in m^2");
            String Obstruction_area_input = Scn.nextLine();
             Obstructions_array[count]= Double.parseDouble(Obstruction_area_input);

            Total_obstruction_area += Double.parseDouble(Obstruction_area_input);

        }

        double Total_obstruction_paint_liters = Paint_coats * Total_obstruction_area / Paint_litre_area;

        double Paint_price = Math.ceil(Math.abs(Paint_litres-Total_obstruction_paint_liters)) * Price;

        System.out.println("£ " + Paint_price);
    }
}