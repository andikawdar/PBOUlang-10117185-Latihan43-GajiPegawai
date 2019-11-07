/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang.pkg10117185.latihan43.gajipegawai;
import java.util.Scanner;
/**
 *
 * @author user
 * Nama : Andhyka Widariyanto
 * NIM  : 10117185
 * Kelas: PBO-Ulang
 * Tugas: Menghitung total gaji karyawan.
 */
public class PBOUlang10117185Latihan43GajiPegawai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner masukan = new Scanner(System.in);
    GajiPegawai pegawai = new GajiPegawai();
    
    System.out.println("### Data Gaji Karyawan PT. KAKATU ###");
    System.out.println("--------------------");
    System.out.print("Nama Karyawan : ");
     String inNama = masukan.next();
      pegawai.setNama(inNama);
    System.out.print("Alamat : ");
     String inAlamat = masukan.next();
      pegawai.setAlamat(inAlamat);
    System.out.print("Uang Transport : ");
     int inTransport = masukan.nextInt();
      pegawai.setUangTransport(inTransport);  
    System.out.print("Uang Tunjangan : ");
     int inTunjangan = masukan.nextInt();
      pegawai.setUangTunjangan(inTunjangan);
    System.out.print("Gaji Pokok : ");
     int inGaji = masukan.nextInt();
      pegawai.setGajiPokok(inGaji);
    System.out.println("Total Gaji : "+pegawai.getTotalGaji());
    }
    
}
