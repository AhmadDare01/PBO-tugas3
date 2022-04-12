/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baju;
import java.util.*;
/**
 *
 * @author Dell
 */
public class  Baju{
    public static void main(String[] args) {

        String jenis;
        int jumlah;

        Scanner in = new Scanner(System.in);

        displayBaju();

        System.out.print("Baju yang akan anda beli bertipe : ");
        jenis = in.next();
        System.out.print("Jumlah Baju yang akan anda beli adalah : ");
        jumlah = in.nextInt();

        Baju2.jenisBaju = jenis;
        Baju2.jumlahBaju = jumlah;

        Baju2 bajuErigo = new Baju2();
        bajuErigo.display();
    }

    private static void displayBaju(){
        System.out.println("Baju yang tersedia :");
        System.out.println("Baju A dengan harga 100000");
        System.out.println("Baju B dengan harga 125000");
        System.out.println("Baju C dengan harga 175000");
    }
}
class Baju2 {

    private final int bajua;
    private final int bajub;
    private final int bajuc;
    private int harga;
    static String jenisBaju;
    static int jumlahBaju;

    Baju2(){
        if (jumlahBaju < 100){
            this.bajua = 100000;
        } else { 
            this.bajua = 95000;
        }

        if (jumlahBaju < 100){
            this.bajub = 125000;
        } else {
            this.bajub = 120000;
        }

        if (jumlahBaju < 100){
            this.bajuc = 175000;
        } else {
            this.bajuc = 160000;
        }
    }

    void hargaa(){
        this.harga = this.bajua;
    }
    void hargab(){
        this.harga = this.bajub;
    }
    void hargac(){
        this.harga = this.bajuc;
    }

    void display(){
        if (jenisBaju.equalsIgnoreCase("A")){
            this.hargaa();
        } else if (jenisBaju.equalsIgnoreCase("B")){
            this.hargab();
        } else if (jenisBaju.equalsIgnoreCase("C")){
            this.hargac();
        }
        System.out.println("Jenis yang anda beli : " + Baju2.jenisBaju);
        System.out.println("Harga per buah       : " + this.harga);
        System.out.println("Total harga          : " + this.harga * Baju2.jumlahBaju);
    }
}
