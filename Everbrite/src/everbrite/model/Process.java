/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package everbrite.model;

/**
 *
 * @author Whitehurst
 */
public class Process {
    
    private String name;
    private String workcenter;
    private double setup;
    private double runtime;
    private double toolingCost;
    private double rate;

    public String getName() {
        return name;
    }

    public String getWorkcenter() {
        return workcenter;
    }

    public double getSetup() {
        return setup;
    }

    public double getRuntime() {
        return runtime;
    }

    public double getToolingCost() {
        return toolingCost;
    }

    public double getRate() {
        return rate;
    }
    
    public double getCost(){
        return getRate() * (getSetup() + getRuntime()) + getToolingCost();
    }
    
}
