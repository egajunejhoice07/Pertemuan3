/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan3;

/**
 *
 * @author pc15
 */
public class TampilanNilai {
    public static void main(String[] args) {
        MasterNilai N = new MasterNilai();
        System.out.println("=========================================");

        //prosedure
        System.out.println("\t\tHasil Nilai Kelulusan");
        N.kelulusan("EgaJune", 95);
        System.out.println("=========================================");

        //fungsi
        System.out.println("\t\tHasil Nilai Kelulusan");
        System.out.println(N.nilailulus("EgaJune", 83, ""));
        System.out.println("=========================================");

        //static prosedure
        System.out.println("\t\tHasil Nilai Kelulusan");
        MasterNilai.hasilkelulusan("EgaJune", 75);
        System.out.println("=========================================");

        //static fungsi
        System.out.println("\t\tHasil Nilai Kelulusan");
        System.out.println(MasterNilai.nilailulusan("EgaJune", 87, ""));
        System.out.println("=========================================");
    }
}