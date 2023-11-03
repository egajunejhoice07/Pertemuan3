/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan3;

/**
 *
 * @author pc15
 */
public class ContohFungsi {
    int alas = 10;
    int tinggi = 8;

    int hitungluasjajargenjang(){
        int luas = alas*tinggi;
        System.out.println("Alas= "+ alas);
        System.out.println("Tinggi= "+tinggi);
        return luas;
    }
    public static void main(String[] args) {
        ContohFungsi F = new ContohFungsi();
        System.out.println("Luas jajargenjang "+F.hitungluasjajargenjang());
    }
    }