package com.project;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Eksekusi extends Jurusan implements Mahasiswa {

    Scanner userInput = new Scanner(System.in);
    String nimEks;
    int dataEks = 6;
    
    private String[] namaDosen = new String[6];
    private String[] mataKuliah = new String[6];
    protected String nama;
    protected String nim;
    protected String nimMhs;
    public int i;
    public int a;
    public int data;
    public int index = -1;
    public boolean kondisi = true;

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    Date now = new Date(); // instance
    String tanggal = sdf.format(now);
    private String id;
    private String pass;

    public void setData(int data){
        this.data = data;
    }

    public void tambahMatkul (String matkul){

        if(this.index == mataKuliah.length - 1){
            return;
        }
        
        this.mataKuliah[++this.index] = matkul;
    }

    public void judul(){

        System.out.println("");
        System.out.println("+-----------------------------------------------------------------------------------------------+");
        System.out.println("|\t\t Selamat Datang di Program Pencarian Data Akademik Mahasiswa BSI.               |");
        System.out.println("+-----------------------------------------------------------------------------------------------+");
        System.out.println("");

        int salah = 3;
        while (salah >= 1){
            salah--;
            System.out.print("\nUsername : ");
            id = userInput.nextLine();
            System.out.print("Password : ");
            pass = userInput.nextLine();

            if (id.equalsIgnoreCase("admin")){
                if (pass.equalsIgnoreCase("1234")){
                    break;
                } else {
                    System.out.println("\nUsername atau Password Salah!");
                    System.out.println((salah) + "x percobaan lagi");
                }
            } else {
                if (pass == "1234"){
                    System.out.println("\nUsername atau Password Salah!");
                    System.out.println((salah) + "x percobaan lagi");
                } else {
                    System.out.println("\nUsername atau Password Salah!");
                    System.out.println((salah) + "x percobaan lagi");
                }
            }
            if (salah < 1){
                cls();
                System.exit(0);
            }
        }
    }

    public void start() throws IOException{

        cls();
        
        System.out.println("\n+-----------------------------------------------------------------------------------------------+");
        System.out.println("| \t\t\t\t PENCARIAN INFO AKADEMIK MAHASISWA                              |");
        System.out.println("+-----------------------------------------------------------------------------------------------+");
        System.out.println("\t\t\t\t\t\t\t\t\t     Tanggal : " + tanggal);
        System.out.print("\nMasukkan NIM \t : ");
        nimEks = userInput.next();
        
        setNimMhs(nimEks);
        
        setData(data);
        
        tambahMatkul("Pemrograman berbasis objek");
        tambahMatkul("Struktur Data\t\t");
        tambahMatkul("Arsitektur Komputer\t");
        tambahMatkul("Bahasa Inggris\t\t");
        tambahMatkul("Sistem Operasi\t\t");
        tambahMatkul("Matematika Diskrit\t");

        for (i = 0; i < 1; i++){
                
            // Output

            for (i = 0; i < 1; i++){

                if (nimMhs.equalsIgnoreCase("15210064")){
                    this.nim = "15210064";
                    this.nama = "Octoseven Talahatu";
                    
                } else if ((nimMhs.equalsIgnoreCase("14210454"))){
                    this.nama = "ALI MUSTOLIH";
                    this.nim = "14210454";
                    
                } else if ((nimMhs.equalsIgnoreCase("15210306"))){
                    this.nama = "ALIF";
                    this.nim = "15210306";
                    
                } else if ((nimMhs.equalsIgnoreCase("15210091"))){
                    this.nama = "AFIF MAULANA";
                    this.nim = "15210091";
                    
                } else if ((nimMhs.equalsIgnoreCase("15210353"))){
                    this.nama = "MARCELLO";
                    this.nim = "15210353";
                    
                } else if ((nimMhs.equalsIgnoreCase("15210175"))){
                    this.nama = "M. Dimas Tri Wibowo";
                    this.nim = "15210175";
                    
                } else if (nimMhs.equalsIgnoreCase("15210123")){
                    this.nama = "Keefe Antonio";
                    this.nim = "15210123";
                    
                } else if ((nimMhs.equalsIgnoreCase("15210015"))){
                    this.nama = "M. Ilhamsyah  Aliwibawa";
                    this.nim = "15210015";
                    
                } else if ((nimMhs.equalsIgnoreCase("15210031"))){
                    this.nama = "Deliar cahya wardana";
                    this.nim = "15210031";
                    
                } else if ((nimMhs.equalsIgnoreCase("15310297"))){
                    this.nama = "Achmad Suryo Prayogo";
                    this.nim = "15310297";
                    
                } else if ((nimMhs.equalsIgnoreCase("15210030"))){
                    this.nama = "Ferdie Adpriyan";
                    this.nim = "15210030";
                    
                } else if ((nimMhs.equalsIgnoreCase("15210040"))){
                    this.nama = "Ade Rifky Octaviano";
                    this.nim = "15210040";
                    
                } else if ((nimMhs.equalsIgnoreCase("15210350"))){
                    this.nama = "Linova Zalliyanti";
                    this.nim = "15210350";
                    
                } else if ((nimMhs.equalsIgnoreCase("15210018"))){
                    this.nama = "Chlara Meiliana";
                    this.nim = "15210018";
                    
                } else if ((nimMhs.equalsIgnoreCase("15210013"))){
                    this.nama = "Fery Hariyanto";
                    this.nim = "15210013";
                    
                } else if ((nimMhs.equalsIgnoreCase("15210250"))){
                    this.nama = "Moh Rifqi Ardiansyah";
                    this.nim = "15210250";
                    
                } else if ((nimMhs.equalsIgnoreCase("15210069"))){
                    this.nama = "Samsul Kurniawan";
                    this.nim = "15210069";
                    
                } else if ((nimMhs.equalsIgnoreCase("15210095"))){
                    this.nama = "Fahri Nanda Saputra";
                    this.nim = "15210095";
                    
                } else if ((nimMhs.equalsIgnoreCase("15210470"))){
                    this.nama = "Wisnu Adi Heryanto";
                    this.nim = "15210470";
                    
                } else if ((nimMhs.equalsIgnoreCase("15210193"))){
                    this.nama = "Fillah Al Fazri";
                    this.nim = "15210193";
                    
                } else if ((nimMhs.equalsIgnoreCase("15210044"))){
                    this.nama = "M. Rakel  Fardan";
                    this.nim = "15210044";
                    
                } else if ((nimMhs.equalsIgnoreCase("15210082"))){
                    this.nama = "Safira Adita";
                    this.nim = "15210082";
                    
                } else if ((nimMhs.equalsIgnoreCase("15210478"))){
                    this.nama = "Sandi Ardijaya Sopandi";
                    this.nim = "15210478";
                    
                } else if ((nimMhs.equalsIgnoreCase("15210034"))){
                    this.nama = "Fransyela Situmorang";
                    this.nim = "15210034";
    
                } else {
                    System.out.println("\n\n\n\n\n\t\t\t\t    NIM YANG ANDA MASUKKAN SALAH");
                    System.out.println("\n\t\t\t\t     .::KELUAR DARI PROGRAM::.");
                    System.exit(0);
                }
    
                cls();

                System.out.println("\n\n+-----------------------------------------------------------------------------------------------+");
                System.out.println("| \t\t\t\t    HASIL INFO AKADEMIK MAHASISWA                               |");
                System.out.println("+-----------------------------------------------------------------------------------------------+");
                System.out.println("\t\t\t\t\t\t\t\t\t     Tanggal : " + this.tanggal);
                System.out.println("\n Nama Mahasiswa : " + this.nama);
                System.out.println("\n NIM \t\t: " + this.nim);
                System.out.println("\n Jurusan \t: " + super.getJurusan());
                System.out.println("\n Kelas \t\t: " + super.getKelas());
                System.out.println("");
                System.out.println("+-----+---------------------------------+-------------------------------------------------------+");
                System.out.println("| No. |     Mata Kuliah                 |         Dosen         |              Jadwal\t\t|");
                System.out.println("+-----+---------------------------------+-------------------------------------------------------+");
    
                for (i = 0 ; i < this.dataEks ; i++){
    
                    if (this.mataKuliah[i].equalsIgnoreCase("Pemrograman berbasis objek")){
                            this.namaDosen[i] = "Rahmat Tri Yunandar";
                            this.jadwalkuliah[i] = "Senin pukul 18:30 - 21:40";
                        } else if (this.mataKuliah[i].equalsIgnoreCase("Struktur Data\t\t")){
                            this.namaDosen[i] = "Rico Aditya Utama";
                            this.jadwalkuliah[i] = "Selasa pukul 19:30 - 21:40";
                        } else if (this.mataKuliah[i].equalsIgnoreCase("Arsitektur Komputer\t")){
                            this.namaDosen[i] = "Ahmad Ghani\t";
                            this.jadwalkuliah[i] = "Sabtu pukul 19:10 - 21:40";
                        }  else if (this.mataKuliah[i].equalsIgnoreCase("Bahasa Inggris\t\t")){
                            this.namaDosen[i] = "Syukri Ghozali";
                            this.jadwalkuliah[i] = "Jumat pukul 20:00 - 21:40";
                        } else if (this.mataKuliah[i].equalsIgnoreCase("Sistem Operasi\t\t")){
                            this.namaDosen[i] = "Tri Santoso\t";
                            this.jadwalkuliah[i] = "Sabtu pukul 17:10 - 19:10";
                        } else if (this.mataKuliah[i].equalsIgnoreCase("Matematika Diskrit\t")){
                            this.namaDosen[i] = "Ririn Restu Aria";
                            this.jadwalkuliah[i] = "Rabu pukul 18:30 - 21:40";
                        }
    
                    if (mataKuliah[i] != null){
                        System.out.println(String.format("| " + (i+1) + "   |  %s\t|  %s\t|  %s\t|",
                        this.mataKuliah[i], this.namaDosen[i], this.jadwalkuliah[i] ));                    }
                }
                
                System.out.println("+-----+---------------------------------+-----------------------+-------------------------------+");
    
                // Quotes
                ArrayList<String> array = new ArrayList<>();
    
                int jQuotes = 5;
    
                String s1 = "NOTE : KERJA KERASLAH, SAMPAI TETANGGA BERPIKIR REZEKIMU HASIL DARI PESUGIHAN.";
                String s2 = "NOTE : SUKSES BERAWAL DARI MIMPI. OLEH KARNA ITU MARI KITA PERBANYAK TIDUR.";
                String s3 = "NOTE : SAHABAT SUPER, JIKA INGIN TERLIHAT GANTENG, BERGAUL-LAH DENGAN ORANG JELEK.";
    
                double random = Math.random() * jQuotes;
    
                for (i = 0; i <= jQuotes; i++) {
                    array.add(s1);
                    array.add(s2);
                    array.add(s3);
                }
                System.out.println("\n\n\n");
                System.out.println("\t    " + array.get((int)random));
            }

            kembaliKeMenu();

        }
    }

    public void setNim(String nim) {
        this.nim = nim;
    }
    
    public String getNim(){
        return this.nim;
    }

    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getNama(){
        return this.nama;
    }

    public void setNimMhs(String nimMahasiswa){
        this.nimMhs = nimMahasiswa;
    }

    // function untuk mmenghapus layar / clear screen
    public static void cls(){
        try{
            new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
        }catch(Exception E){
            System.out.println(E);
		}
    }

        // MEMBUAT METHOD UNTUK OPSI KEMBALI KE MENU
        public void kembaliKeMenu() throws IOException{
            System.out.println("");
            System.out.print("\t\t\t\t   Ingin Mencari Lagi [Y/N] : ");
            String kembali = userInput.next();
            
            if (kembali.equalsIgnoreCase("Y")){
                start();
            } else if (kembali.equalsIgnoreCase("N")){
                System.exit(0);
            }
        }

}

