package everbrite.model;

import java.util.ArrayList;

/**
 *
 * @author Whitehurst
 */
public class ProcessLine {
    
    private ArrayList<Process> processStep;
    
    public double getTotalCost(){
        double total = 0.0;
        for(Process process : processStep){
            total += process.getCost();
        }
        return total;
    }
    
    
}
