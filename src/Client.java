import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Client{

    public static void main(String[] args) {

        List<HouseholdItem> householdItmes= new ArrayList<>();

        Electronic microwaveOven= new Electronic("Microwave Oven",37, 48, 27, 13, false);
        Electronic tv= new Electronic("TV",122, 73, 15, 18, true);

        Glass wineGlass= new Glass("Wine glasses",33,28,23,1);
        Glass coffeeTable= new Glass("Glass Coffee Table",80,80,45,3);


        Furniture bed= new Furniture("Bed", "Metal", 205, 91, 94, 26);
        Furniture cupboard= new Furniture("Bookshelf", "Wood", 60, 31, 190, 25);


        List<HouseholdItem> namesList = Arrays.asList(microwaveOven,tv,wineGlass,coffeeTable,bed,cupboard );
        householdItmes.addAll(namesList);

        Calculator c = new Calculator();

        //totalCost
        System.out.println(c.calculate1(microwaveOven));
        System.out.println(c.calculate1(tv));
        System.out.println(c.calculate1(wineGlass));
        System.out.println(c.calculate1(coffeeTable));
        System.out.println(c.calculate1(bed));
        System.out.println(c.calculate1(cupboard));

        System.out.println();

        //packingInstruction
        System.out.println(c.calculate2(microwaveOven));
        System.out.println(c.calculate2(tv));
        System.out.println(c.calculate2(wineGlass));
        System.out.println(c.calculate2(coffeeTable));
        System.out.println(c.calculate2(bed));
        System.out.println(c.calculate2(cupboard));


    }
}