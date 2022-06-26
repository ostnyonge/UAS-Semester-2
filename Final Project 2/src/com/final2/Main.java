package com.final2;

import java.util.*;
import java.text.SimpleDateFormat;

public class Main{
    public static void main(String[] args) {
        try (Scanner userInput = new Scanner(System.in)) {
            Eksekusi j1 = new Eksekusi();
            int i;
            String nim;
            int data = 6;
            
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date now = new Date();
            String tanggal = sdf.format(now);

            // Output
            System.out.println("\n \t\t\t\t PENCARIAN INFO AKADEMIK MAHASISWA    ");
            System.out.println("-------------------------------------------------------------------------------------------------");
            System.out.println("\t\t\t\t\t\t\t\t\t     Tanggal : " + tanggal);
            System.out.print("\nMasukkan NIM \t : ");
            nim = userInput.nextLine();


            for (i = 1; i < data; i++){

                
                j1.setNim(nim);
                
                // if (nim != tes.getNim()){
                //     System.out.println("Nim yang anda masukkan salah!");
                //     break;
                // }
                
                j1.setData(data);
                
                j1.tambahMatkul("Pemrograman berbasis objek");
                j1.tambahMatkul("Struktur Data\t\t");
                j1.tambahMatkul("Arsitektur Komputer\t");
                j1.tambahMatkul("Bahasa Inggris\t\t");
                j1.tambahMatkul("Sistem Operasi\t\t");
                j1.tambahMatkul("Matematika Diskrit\t");
                
                
                j1.cetakData();

                
                // j1.setDataEksekusi(data);
            }

            // Quotes
            ArrayList<String> array = new ArrayList<>();

            int jQuotes = 5;

            String s1 = "KERJA KERASLAH, SAMPAI TETANGGA BERPIKIR REZEKIMU HASIL DARI PESUGIHAN.";
            String s2 = "TAI MEMANG KOTOR, TAPI TIDAK ADA YANG BERANI MENGINJAK\"NYA.";
            String s3 = "PELAN TAPI PASTI DARI PADA TIDAK BERJALAN SAMA SEKALI";
            String s4 = "SUKSES BERAWAL DARI MIMPI. OLEH KARNA ITU MARI KITA PERBANYAK TIDUR.";
            String s5 = "SAHABAT SUPER, JIKA INGIN TERLIHAT GANTENG, BERGAUL-LAH DENGAN ORANG JELEK.";

            double random = Math.random() * jQuotes;

            for (i = 0; i <= jQuotes; i++) {
                array.add(s1);
                array.add(s2);
                array.add(s3);
                array.add(s4);
                array.add(s5);
            }
            System.out.println("\n");
            System.out.println("\t\t" + array.get((int)random));

        }
    }
}
