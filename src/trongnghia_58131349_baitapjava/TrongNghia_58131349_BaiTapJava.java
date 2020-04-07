/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trongnghia_58131349_baitapjava;

import Interfaces.ICalculate;
import caculates.CasioCalculator;

/**
 *
 * @author Admin
 */
public class TrongNghia_58131349_BaiTapJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ICalculate calculator = new CasioCalculator();
        System.out.println("7+8="+ calculator.cong(7,8));
        System.out.println("9x3="+ calculator.nhan(9,3));
        System.out.println("9:3="+ calculator.chia(9,3));
        }
    
}
