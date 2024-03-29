package com.example.tugasday6;

public class DiorModel {
    private String namaProduk;
    private int gmbrProduk;
    private String detailHargaB, detailWarnaB, detailTipeB, detailUkuranB, detailUPanjangb, detailTipeKerah, detailDibuat;

    public DiorModel(String namaProduk, int gmbrProduk , String detailHargaB, String detailWarnaB, String detailTipeB, String detailUkuranB, String detailUPanjangb, String detailTipeKerah, String detailDibuat) {
        this.namaProduk = namaProduk;
        this.gmbrProduk = gmbrProduk;
        this.detailHargaB = detailHargaB;
        this.detailWarnaB = detailWarnaB;
        this.detailTipeB = detailTipeB;
        this.detailUkuranB = detailUkuranB;
        this.detailUPanjangb = detailUPanjangb;
        this.detailTipeKerah = detailTipeKerah;
        this.detailDibuat = detailDibuat;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    public int getGmbrProduk() {
        return gmbrProduk;
    }

    public void setGmbrProduk(int gmbrProduk) {
        this.gmbrProduk = gmbrProduk;
    }

    public String getDetailHargaB() {
        return detailHargaB;
    }

    public void setDetailHargaB(String detailHargaB) {
        this.detailHargaB = detailHargaB;
    }

    public String getDetailWarnaB() {
        return detailWarnaB;
    }

    public void setDetailWarnaB(String detailWarnaB) {
        this.detailWarnaB = detailWarnaB;
    }

    public String getDetailTipeB() {
        return detailTipeB;
    }

    public void setDetailTipeB(String detailTipeB) {
        this.detailTipeB = detailTipeB;
    }

    public String getDetailUkuranB() {
        return detailUkuranB;
    }

    public void setDetailUkuranB(String detailUkuranB) {
        this.detailUkuranB = detailUkuranB;
    }

    public String getDetailUPanjangb() {
        return detailUPanjangb;
    }

    public void setDetailUPanjangb(String detailUPanjangb) {
        this.detailUPanjangb = detailUPanjangb;
    }

    public String getDetailTipeKerah() {
        return detailTipeKerah;
    }

    public void setDetailTipeKerah(String detailTipeKerah) {
        this.detailTipeKerah = detailTipeKerah;
    }

    public String getDetailDibuat() {
        return detailDibuat;
    }

    public void setDetailDibuat(String detailDibuat) {
        this.detailDibuat = detailDibuat;
    }
}
