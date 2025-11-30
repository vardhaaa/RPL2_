/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pert3_rpl2_51422604.view;

import com.mycompany.pert3_rpl2_51422604.model.MahasiswaDAO;
import java.util.Scanner;

/**
 *
 * @author vardh
 */
public class MahasiswaView {
    public static void main(String[] args){
         MahasiswaDAO mahasiswaDAO = new MahasiswaDAO();
         MahasiswaController mahasiswaController = new MahasiswaController(mahasiswaDAO);
         
         Scanner scanner = new Scanner(System.in);
         int pilihan;
       
        while(true){
            System.out.println("Menu:");
            System.out.println("1. Tampilkan Semua Mahasiswa");
            System.out.println("2. Tambah Mahasiswa");
            System.out.println("3. Update Mahasiswa");
            System.out.println("4. Hapus Mahasiswa");
            System.out.println("5. Cek Koneksi Database");
            System.out.println("6. Keluar");
            System.out.print("PILIH OPSI: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();
            
            switch (pilihan){
                case 1 -> mahasiswaController.displayAllMahasiswa();
                    
                case 2 -> {
                    // tambah mhs
                    System.out.println("Masukkan NPM: ");
                    String npm = scanner.next();
                    System.out.println("Masukkan Nama: ");
                    String nama = scanner.next();
                    System.out.println("Masukkan Semester: ");
                    int semester = scanner.nextInt();
                    System.out.println("Masukkan IPK: ");
                    float ipk = scanner.nextFloat();
                    System.out.println(npm + nama + semester + ipk);
                    
                    mahasiswaController.addMahasiswa(npm, nama, semester, ipk);
                 }
                    
                case 3 -> {
                    System.out.print("Masukkan ID mahasiswa: ");
                    scanner.nextLine();
                    
                    System.out.println("Masukkan NPM: ");
                    System.out.println("Masukkan Nama: ");
                    System.out.println("Masukkan Semester: ");
                 }
            }
        }}}
        
