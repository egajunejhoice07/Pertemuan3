/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan3;

/**
 *
 * @author pc15
 */
public class ContohProsedur {
    int alas = 10;
    int tinggi = 8;

    void hitungluasjajargenang(){
        int luas = alas*tinggi;
        System.out.println("Alas= "+ alas);
        System.out.println("Tinggi= "+tinggi);
        System.out.println("Luas jajargenjang = "+luas);
    }

    public static void main(String[] args) {
        ContohProsedur P = new ContohProsedur();
        P.hitungluasjajargenang();
    }
}