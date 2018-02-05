/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author AntoFra
 */

public class Calculator {
    int control ;
    double n1, n2;
    
    public Calculator(){
        n1=0;
        n2=0;
    }

    public double add(boolean control, String n1, String n2){
        this.n2=Double.valueOf(n2);
        this.n1=Double.valueOf(n1);
        if (control)
        {
            if (this.n1>this.n2)
                return -(this.n1-this.n2);
            else
                return this.n2-this.n1;
        }
        else
            return this.n1+this.n2;
    }

    public double sub (boolean control, String n1, String n2){
        this.n2=Double.valueOf(n2);
        this.n1=Double.valueOf(n1);
        if (control)
            return -(this.n1+this.n2);
        else
        {   
            if (this.n1>this.n2)
                return this.n1-this.n2;
            else
                return -(this.n2-this.n1);
        }
    }

    public double mul (boolean control, String n1, String n2){
        this.n2=Double.valueOf(n2);
        this.n1=Double.valueOf(n1);
        if (control)
            return -(this.n1*this.n2);
        else
            return this.n1*this.n2;
    }

    public double div(boolean control, String n1, String n2){
        this.n2=Double.valueOf(n2);
        this.n1=Double.valueOf(n1);
        if (control)
            return -(this.n1/this.n2);
        else
            return this.n1/this.n2;
    }
}
