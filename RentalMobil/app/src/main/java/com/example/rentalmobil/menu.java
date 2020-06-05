package com.example.rentalmobil;

public class menu {
    private String nama;
    private String hargasewa;
    private String image;

    public menu(String datanama, String datanharga, String dataimage){
        nama=datanama;
        hargasewa=datanharga;
        image=dataimage;
    }

    public String getNama() {
        return nama;
    }

    public String getHargasewa() {
        return hargasewa;
    }

    public String getImage() {
        return image;
    }
}
