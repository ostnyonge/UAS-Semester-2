package com.final2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Jurusan implements Mahasiswa {

    private String namaJurusan;
    private String[] namaDosen = new String[6];
    private String[] mataKuliah = new String[6];
    private String[] jadwalkuliah = new String[6];
    protected String nama;
    protected String nim;
    private String kelas;
    private int i;
    public boolean kondisi;

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    Date now = new Date();
    String tanggal = sdf.format(now);

    
    public void setJadwalkuliah(String jadwalkuliah){
        this.jadwalkuliah[i] = jadwalkuliah;
    }
    
    public String getjadwalkuliah(){
        return this.jadwalkuliah[i];
    }

    public void setNamaDosen(String namaDosen){
        this.namaDosen[i] = namaDosen;
    }
    
    public String getNamaDosen(){
        return this.namaDosen[i];
    }
    
    public String getMataKuliah(){
        return this.mataKuliah[i];
    }
    
    public void setNim(String nimMhs) {
        this.nim = nimMhs;

        if (nimMhs.equalsIgnoreCase("15210064")){
            this.nama = "Octoseven Talahatu";
            this.namaJurusan = "Ilmu Komputer";
            this.kelas = "15.2C.01";
            this.nim = "15210064";

        } else if (nimMhs.equalsIgnoreCase("14210454")){
            this.nama = "ALI MUSTOLIH";
            this.namaJurusan = "Ilmu Komputer";
            this.kelas = "15.2C.01";

        } else if (nimMhs.equalsIgnoreCase("15210306")){
            this.nama = "ALIF";
            this.namaJurusan = "Ilmu Komputer";
            this.kelas = "15.2C.01";

        } else if (nimMhs.equalsIgnoreCase("15210091")){
            this.nama = "AFIF MAULANA";
            this.namaJurusan = "Ilmu Komputer";
            this.kelas = "15.2C.01";

        } else if (nimMhs.equalsIgnoreCase("15210353")){
            this.nama = "MARCELLO";
            this.namaJurusan = "Ilmu Komputer";
            this.kelas = "15.2C.01";

        } else if (nimMhs.equalsIgnoreCase("15210175")){
            this.nama = "M. Dimas Tri Wibowo";
            this.namaJurusan = "Ilmu Komputer";
            this.kelas = "15.2C.01";

        } else if (nimMhs.equalsIgnoreCase("15210123")){
            this.nama = "Keefe Antonio";
            this.namaJurusan = "Ilmu Komputer";
            this.kelas = "15.2C.01";

        } else if (nimMhs.equalsIgnoreCase("15210015")){
            this.nama = "M. Ilhamsyah  Aliwibawa";
            this.namaJurusan = "Ilmu Komputer";
            this.kelas = "15.2C.01";

        } else if (nimMhs.equalsIgnoreCase("15210031")){
            this.nama = "Deliar cahya wardana";
            this.namaJurusan = "Ilmu Komputer";
            this.kelas = "15.2C.01";

        } else if (nimMhs.equalsIgnoreCase("15310297")){
            this.nama = "Achmad Suryo Prayogo";
            this.namaJurusan = "Ilmu Komputer";
            this.kelas = "15.2C.01";

        } else if (nimMhs.equalsIgnoreCase("15210030")){
            this.nama = "Ferdie Adpriyan";
            this.namaJurusan = "Ilmu Komputer";
            this.kelas = "15.2C.01";

        } else if (nimMhs.equalsIgnoreCase("15210040")){
            this.nama = "Ade Rifky Octaviano";
            this.namaJurusan = "Ilmu Komputer";
            this.kelas = "15.2C.01";

        } else if (nimMhs.equalsIgnoreCase("15210350")){
            this.nama = "Linova Zalliyanti";
            this.namaJurusan = "Ilmu Komputer";
            this.kelas = "15.2C.01";

        } else if (nimMhs.equalsIgnoreCase("15210018")){
            this.nama = "Chlara Meiliana";
            this.namaJurusan = "Ilmu Komputer";
            this.kelas = "15.2C.01";

        } else if (nimMhs.equalsIgnoreCase("15210013")){
            this.nama = "Fery Hariyanto	";
            this.namaJurusan = "Ilmu Komputer";
            this.kelas = "15.2C.01";

        } else if (nimMhs.equalsIgnoreCase("15210250")){
            this.nama = "Moh Rifqi Ardiansyah";
            this.namaJurusan = "Ilmu Komputer";
            this.kelas = "15.2C.01";

        } else if (nimMhs.equalsIgnoreCase("15210069")){
            this.nama = "Samsul Kurniawan";
            this.namaJurusan = "Ilmu Komputer";
            this.kelas = "15.2C.01";

        } else if (nimMhs.equalsIgnoreCase("15210095")){
            this.nama = "Fahri Nanda Saputra";
            this.namaJurusan = "Ilmu Komputer";
            this.kelas = "15.2C.01";

        } else if (nimMhs.equalsIgnoreCase("15210470")){
            this.nama = "Wisnu Adi Heryanto";
            this.namaJurusan = "Ilmu Komputer";
            this.kelas = "15.2C.01";

        } else if (nimMhs.equalsIgnoreCase("15210193")){
            this.nama = "Fillah Al Fazri";
            this.namaJurusan = "Ilmu Komputer";
            this.kelas = "15.2C.01";

        } else if (nimMhs.equalsIgnoreCase("15210044")){
            this.nama = "M. Rakel  Fardan";
            this.namaJurusan = "Ilmu Komputer";
            this.kelas = "15.2C.01";

        } else if (nimMhs.equalsIgnoreCase("15210082")){
            this.nama = "Safira Adita";
            this.namaJurusan = "Ilmu Komputer";
            this.kelas = "15.2C.01";

        } else if (nimMhs.equalsIgnoreCase("15210478")){
            this.nama = "Sandi Ardijaya Sopandi";
            this.namaJurusan = "Ilmu Komputer";
            this.kelas = "15.2C.01";

        } else if (nimMhs.equalsIgnoreCase("15210034")){
            this.nama = "Fransyela Situmorang ";
            this.namaJurusan = "Ilmu Komputer";
            this.kelas = "15.2C.01";

        }
    }
    
    public String getNim(){
        return this.nim;
    }

    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getNama(){
        return nama;    
    }

    public String getKelas(){
        return this.kelas;
    }
    
    public String getNamaJurusan(){
        return this.namaJurusan;
    }
}  