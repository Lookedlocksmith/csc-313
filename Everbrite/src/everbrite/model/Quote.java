
package everbrite.model;

import java.util.ArrayList;
import java.util.Date;

/**
 * A quote contains a list of materials and a list of processes
 * as well as summary information.
 * 
 * @author Whitehurst
 */
public class Quote {
    
    private int projectNum;
    private double overHeadRate;
    private String customer;
    private String comment;
    private boolean complete;
    private Date completionDate;
    private User completedBy;
    private ArrayList<MaterialLine> materials;
    private ArrayList<ProcessLine> processes;
    private double buyouts;
    
    public double getLaborTotal(){ return 0;}
    public double getMaterialTotal(){return 0;}
    
    
}
