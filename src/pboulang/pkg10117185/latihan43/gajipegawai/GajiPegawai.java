/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang.pkg10117185.latihan43.gajipegawai;

/**
 *
 * @author user
 * Nama : Andhyka Widariyanto
 * NIM  : 10117185
 * Kelas: PBO-Ulang
 * Tugas: Mnghitung total gaji pegawai.
 */
public class GajiPegawai {
    //Atribute
    String nama;
    String alamat;
    int uangTransport;
    int uangTunjangan;
    int gajiPokok;
    int totalGaji;
    
    //Function
    
    void setNama (String parNama) {
        nama = parNama;
    }
    String getNama (){
        return nama;
    }
    void setAlamat (String parAlamat) {
        alamat = parAlamat;
    }
    String getAlamat (){
        return alamat;
    }
    void setUangTransport (int parUangTransport){
        uangTransport = parUangTransport;
    }
    int getUangTransport(){
        return uangTransport;
    }
    void setUangTunjangan (int parUangTunjangan){
        uangTunjangan = parUangTunjangan;
    }
    int getUangTunjangan(){
        return uangTunjangan;
    }
    

    void setGajiPokok(int parGajiPokok) {
        gajiPokok = parGajiPokok;
    }
    int getGajiPokok() {
        return gajiPokok;
    }


    void setTotalGaji(int parTotalGaji) {
        totalGaji = parTotalGaji;
    }
    int getTotalGaji() {
        return totalGaji = uangTunjangan+uangTransport+gajiPokok ;
    }
    
}
