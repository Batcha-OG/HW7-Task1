public class Calculator implements Visitor{

    public String calculate1(HouseholdItem h){
        return h.accept1(this);
    }

    public String calculate2(HouseholdItem h){
        return h.accept2(this);
    }

    public String glassCost(Glass g){
        return switch (g.getThickness()) {
            case 1 -> "Total Cost for " + g.getName() + " is: " + 2.0 * ((double) g.getLength() / 100.0) + " Euros";
            case 2 -> "Total Cost for " + g.getName() + " is: " + 1.2 * ((double) g.getLength() / 100.0) + " Euros";
            case 3 -> "Total Cost for " + g.getName() + " is: " + 0.7 * ((double) g.getLength() / 100.0) + " Euros";
            default -> throw new IllegalStateException("Unexpected value: " + g.getThickness());
        };
    }

    public String furnitureCost(Furniture f) {
        return "Total Cost for " + f.getName() + " is: " + 5.0 * ((double)f.getWeight()/20.0) + " Euros";
    }

    public String electronicCost(Electronic e) {
        if(e.getFragile()){
            return "Total Cost for " + e.getName() + " is: " + 5.0 * ((double)e.getWeight()/10.0) + " Euros";
        }else{
            return "Total Cost for " + e.getName() + " is: " + 5.0 * ((double)e.getWeight()/15.0) + " Euros";
        }
    }

    public String glassPacking(Glass g) {
        return g.getName() + ": \n >should be wrapped with bubble wraps and packed in a box with dimension: "
                + (g.getHeight()+1) + "x" + (g.getLength()+1) + "x" + (g.getWidth()+1);
    }

    public String furniturePacking(Furniture f) {
        return f.getName() + ": \n >should be covered with waterproof cover with area of: "
                + f.getLength() + "x" + f.getWidth();
    }

    public String electronicPacking(Electronic e) {
        return e.getName() + ": \n >should be covered with Polyethylene foam film and packed in a box with dimension: "
                + (e.getHeight()+1) + "x" + (e.getLength()+1) + "x" + (e.getWidth()+1);
    }
}
