/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package padrão.adapter.Dispostivos;

import padrão.adapter.Adaptadores.HDMI;

/**
 *
 * @author RROBASSETO
 */
public class TV extends HDMI{

    @Override
    public String setImage() {
        return "Imagem HDMI TV";
    }

    @Override
    public String setSound() {
        return "Som HDMI TV";
    }

    
    
}
