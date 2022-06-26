package com.final2;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Eksekusi extends Jurusan {
    
    private String[] namaDosen = new String[6];
    private String[] mataKuliah = new String[6];
    private String[] jadwalkuliah = new String[6];
    public int i;
    public int a;
    public int data;
    public String nim;
    public String nama;
    public int index = -1;
    public boolean kondisi = true;

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    Date now = new Date();
    String tanggal = sdf.format(now);

    public void setData(int data){
        this.data = data;
    }

    
    public void tambahjadwal (String jadwal){

        if(this.index == jadwalkuliah.length - 1){
            return;
        }
        
        this.jadwalkuliah[++this.index] = jadwal;
    }


    public void tambahMatkul (String matkul){

        if(this.index == mataKuliah.length - 1){
            return;
        }
        
        this.mataKuliah[++this.index] = matkul;
    }

    
    public void cetakData(){
        
        while (kondisi){

            

            System.out.println("\n \t\t\t\t PENCARIAN INFO AKADEMIK MAHASISWA    ");
            System.out.println("-------------------------------------------------------------------------------------------------");
            System.out.println("\t\t\t\t\t\t\t\t\t     Tanggal : " + this.tanggal);
            System.out.println("\n Nama Mahasiswa : " + super.nama);
            System.out.println("\n NIM \t\t: " + super.nim);
            System.out.println("\n Jurusan \t: " + super.getNamaJurusan());
            System.out.println("\n Kelas \t\t: " + super.getKelas());
            System.out.println("");
            System.out.println("+-----+---------------------------------+-------------------------------------------------------+");
            System.out.println("| No. |     Mata Kuliah                 |         Dosen         |              Jadwal\t\t|");
            System.out.println("+-----+---------------------------------+-------------------------------------------------------+");

            for (i = 0 ; i < this.data ; i++){

                if (this.mataKuliah[i] == "Pemrograman berbasis objek"){
                        this.namaDosen[i] = "Rahmat Tri Yunandar";
                        this.jadwalkuliah[i] = "Senin pukul 18:30 - 21:40";
                    } else if (this.mataKuliah[i] == "Struktur Data\t\t"){
                        this.namaDosen[i] = "Rico Aditya Utama";
                        this.jadwalkuliah[i] = "Selasa pukul 19:30 - 21:40";
                    }else if (this.mataKuliah[i] == "Matematika Diskrit\t"){
                        this.namaDosen[i] = "Ririn Restu Aria";
                        this.jadwalkuliah[i] = "Rabu pukul 18:30 - 21:40";
                    }  else if (this.mataKuliah[i] == "Bahasa Inggris\t\t"){
                        this.namaDosen[i] = "Syukri Ghozali";
                        this.jadwalkuliah[i] = "Jumat pukul 20:00 - 21:40";
                    }else if (this.mataKuliah[i] == "Arsitektur Komputer\t"){
                        this.namaDosen[i] = "Ahmad Ghani\t";
                        this.jadwalkuliah[i] = "Sabtu pukul 17:10 - 19:10";
                    } else if (this.mataKuliah[i] == "Sistem Operasi\t\t"){
                        this.namaDosen[i] = "Tri Santoso\t";
                        this.jadwalkuliah[i] = "Sabtu pukul 19:10 - 21:40";
                    } 

                if (mataKuliah[i] != null){
                    System.out.println(String.format("| " + (i+1) + "   |  %s\t|  %s\t|  %s\t|", this.mataKuliah[i], this.namaDosen[i], this.jadwalkuliah[i] ));
                }
            }
            
            System.out.println("+-----+---------------------------------+-----------------------+-------------------------------+");

            kondisi = false;
        }
    
        
    }

}

