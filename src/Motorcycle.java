/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jcr127
 */
public class Motorcycle extends Vehicle{
    private boolean hasSidecar;
    
    Motorcycle(String name, int numPassengers, double maxSpeed, boolean hasSidecar)
    {
        super(name, numPassengers, maxSpeed);
        this.hasSidecar = hasSidecar;
    }
    
    @Override
    public String getInfo()
    {
        return super.getInfo() + " hasSidecar = " + this.hasSidecar; 
    }

    @Override
    public void turnLeft()
    {
        int leanAngle = 5;
    }
    @Override
    public void turnRight()
    {
        int leanAngle = -5;
    }

}
