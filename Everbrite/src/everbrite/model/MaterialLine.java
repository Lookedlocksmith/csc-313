package everbrite.model;

/**
 *
 * @author Whitehurst
 */
public class MaterialLine {
    
    private Material material;
    private int quantity;

    public Material getMaterial() {
        return material;
    }

    public int getQuantity() {
        return quantity;
    }
    
    public double getTotalCost(){
        return material.getCost() * quantity;
    }
    
}
