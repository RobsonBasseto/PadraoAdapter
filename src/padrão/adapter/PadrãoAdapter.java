/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package padrão.adapter;

import padrão.adapter.Dispostivos.Cumputer;
import padrão.adapter.Dispostivos.HDMIToOldMonitorAdapter;
import padrão.adapter.Dispostivos.OldMonitor;
import padrão.adapter.Dispostivos.TV;

/**
 *
 * @author RROBASSETO
 */
public class PadrãoAdapter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cumputer c = new Cumputer();
        
        System.out.println(c.setImage());
        System.out.println(c.setSound());
        c.sendImageAndSound();
        c.ConnectPort();
        
        HDMIToOldMonitorAdapter OM = new HDMIToOldMonitorAdapter();
        
        System.out.println(OM.setImage());
        System.out.println(OM.setSound());
        
        TV tv = new TV();
        System.out.println(tv.setImage());
        System.out.println(tv.setSound());
        
        OldMonitor om = new OldMonitor();
        System.out.println(om.setImage());
    }
    
}
