package com.project;

import java.text.SimpleDateFormat;
import java.util.*;

public class Jurusan {

    private final String jurusan = "Ilmu Komputer";
    private final String kelas = "15.2C.01";
    protected ArrayList<String> nama = new ArrayList<>();
    protected String[] nim = new String [23];
    private String[] namaDosen = new String[6];
    private String[] mataKuliah = new String[6];
    protected String[] jadwalkuliah = new String[6];
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

    public String getKelas(){
        return this.kelas;
    }
    
    public String getJurusan(){
        return this.jurusan;
    }
}  