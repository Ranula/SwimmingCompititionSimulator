/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swimming;

/**
 *
 * @author User
 */
public class TouchPad {
    private boolean touch = false;
    public void touch(){
        touch=true;
    }
    public boolean hastouched(){
        return touch;
    }
    public void sendsignal(){
        
    }
}
