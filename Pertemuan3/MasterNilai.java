/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan3;

/**
 *
 * @author pc15
 */
public class MasterNilai {
    void kelulusan(String nama,int nilai){
        System.out.println("Nama : "+nama);
        System.out.println("Nilai : "+nilai);

        if ( nilai >= 95 ){
            System.out.println("Grade = A");
        }else if ( nilai >= 85 ){
            System.out.println("Grade = B+");
        }else if ( nilai >= 75 ){
            System.out.println("Grade = B");
        }else if ( nilai >= 65 ){
            System.out.println("Grade = C+");
        }else if ( nilai >= 55 ){
            System.out.println("Grade = C");
        }else if ( nilai >= 45 ){
            System.out.println("Grade = D");
        }else {
            System.out.println("Grade = E");
        }

        if (nilai >= 75){
            System.out.println("\t\tSelamat Anda Lulus");
        }
        else{
            System.out.println("\t\tMaaf Anda Belum Lulus");
    }
        }

 String nilailulus( String nama, int nilai, String ket){
        System.out.println("Nama : "+nama);
        System.out.println("Nilai : "+nilai);
         if ( nilai >= 95 ){
            System.out.println("Grade = A");
        }else if ( nilai >= 85 ){
            System.out.println("Grade = B+");
        }else if ( nilai >= 75 ){
            System.out.println("Grade =B");
        }else if ( nilai >= 65 ){
            System.out.println("Grade = C+");
        }else if ( nilai >= 55 ){
            System.out.println("Grade = C");
        }else if ( nilai >= 45 ){
            System.out.println("Grade = D");
        }else {
            System.out.println("Grade = E");
        }
         if ( nilai >= 75 ){
            ket ="\t\tSelamat Anda Lulus";
        }else {
            ket ="\t\tMohon Maaf Anda Belum Lulus";
        }
        return ket;
}
 static void hasilkelulusan(String nama,int nilai){
        System.out.println("Nama : "+nama);
        System.out.println("Nilai : "+nilai);

        if ( nilai >= 95 ){
            System.out.println("Grade = A");
        }else if ( nilai >= 85 ){
            System.out.println("Grade = B+");
        }else if ( nilai >= 75 ){
            System.out.println("Grade =B");
        }else if ( nilai >= 65 ){
            System.out.println("Grade = C+");
        }else if ( nilai >= 55 ){
            System.out.println("Grade = C");
        }else if ( nilai >= 45 ){
            System.out.println("Grade = D");
        }else {
            System.out.println("Grade = E");
        }

        if (nilai >= 75){
            System.out.println("\t\tSelamat Anda Lulus");
        }
        else{
            System.out.println("\t\tMaaf Anda Belum Lulus");
    }
        }

 static String nilailulusan( String nama, int nilai,String ket){
System.out.println("Nama : "+nama);
        System.out.println("Nilai : "+nilai);
         if ( nilai >= 95 ){
            System.out.println("Grade = A");
        }else if ( nilai >= 85 ){
            System.out.println("Grade = B+");
        }else if ( nilai >= 75 ){
            System.out.println("Grade =B");
        }else if ( nilai >= 65 ){
            System.out.println("Grade = C+");
        }else if ( nilai >= 55 ){
            System.out.println("Grade = C");
        }else if ( nilai >= 45 ){
            System.out.println("Grade = D");
        }else {
            System.out.println("Grade = E");
        }
         if ( nilai >= 75 ){
            ket ="\t\tSelamat Anda Lulus";
        }else {
            ket ="\t\tMohon Maaf Anda Belum Lulus";
        }
        return ket;
}
}