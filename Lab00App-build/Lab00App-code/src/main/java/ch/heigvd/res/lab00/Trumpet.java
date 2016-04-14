/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;

/**
 * MASTER-MSE - Filière informatique
 * Software Engineering
 *
 * @author Maria Sisto
 */
public class Trumpet implements IInstrument {

    @Override
    public String play() {
        return "pouet";
    }

    @Override
    public int getSoundVolume() {
        return 7;
    }

    @Override
    public String getColor() {
        return "golden";
    }

}
