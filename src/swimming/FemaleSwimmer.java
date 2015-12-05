/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swimming;

import java.util.ArrayList;

/**
 *
 * @authorRanulLiyadipita
 */
public class FemaleSwimmer extends Swimmer{
    public final String Suitecolor="Red";
    public static ArrayList<FemaleSwimmer> FSwimmers = new ArrayList<>();
    public FemaleSwimmer(String name) {
        super(name);
        //incrementSwimmers();
    }
    
    //defining swimming methods for femaleswimmers
    @Override
    public void butterflystroke(){
        while( kick()){
            breath();
            pull();
            push();
            breath();
            recover();
        }
    }
    @Override
    public void backstroke(){
        while(kick()){
            leftarmbakward();
            breath();
            rightarmbakward();
            breath();
        }
        
    }
    @Override
    public void freestyle(){
        while(kick()){
            leftarmforward();
            breath();
            rightarmforward();
            breath();
        }
        
    }
    @Override
    public void breastroke(){
        while(kick()){
            breath();
            glide();
            outsweep();
            insweep();
        }
        
    }

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
