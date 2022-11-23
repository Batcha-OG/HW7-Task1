public interface Visitor {

    String glassCost(Glass g);
    String furnitureCost(Furniture f);
    String electronicCost(Electronic e);

    String glassPacking(Glass g);
    String furniturePacking(Furniture f);
    String electronicPacking(Electronic e);
}
