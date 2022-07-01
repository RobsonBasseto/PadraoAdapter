/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package padrão.adapter.Dispostivos;

import padrão.adapter.Adaptadores.VGA;

/**
 *
 * @author RROBASSETO
 */
public class OldMonitor extends VGA {

    @Override
    public String setImage() {
        return "Imagem VGA Monitor";
    }

    
   
    
}
