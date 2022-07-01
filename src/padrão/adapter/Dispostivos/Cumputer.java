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
public class Cumputer extends HDMI {

    @Override
    public String setImage() {
        return "Imagem HDMI Computador";
    }

    @Override
    public String setSound() {
        return "Som HDMI Computador";
    }

    public void ConnectPort(){
        System.out.println("Conectar cabo HDMI");

    }
    public void sendImageAndSound(){
        System.out.println("Enviando imagem e som");
    }
    
   
}
