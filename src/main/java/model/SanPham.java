/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ADMIN
 */
public class SanPham {
    private int masp;
    private String tensp;
    private float dongia;
    private String hinhanh;
    private int maloai;
    private boolean km;

    public SanPham(){
        
    }
    public SanPham(int masp){
        
    }

    public SanPham(int masp, String tensp, float dongia, String hinhanh, int maloai, boolean km) {
        this.masp = masp;
        this.tensp = tensp;
        this.dongia = dongia;
        this.hinhanh = hinhanh;
        this.maloai = maloai;
        this.km = km;
    }
    
    public int getMasp() {
        return masp;
    }
    
    public String getTensp() {
        return tensp;
    }

    public double getDongia() {
        return dongia;
    }

    public String getHinhanh() {
        return hinhanh;
    }

    public int getMaloai() {
        return maloai;
    }

    public boolean isKm() {
        return km;
    }

    public void setMasp(int masp) {
        this.masp = masp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public void setDongia(float dongia) {
        this.dongia = dongia;
    }

    public void setHinhanh(String hinhanh) {
        this.hinhanh = hinhanh;
    }

    public void setMaloai(int maloai) {
        this.maloai = maloai;
    }

    public void setKm(boolean km) {
        this.km = km;
    }
    @Override
    public String toString(){
        return "SanPham{" + "masp=" + masp + ", tensp= " + tensp + ", dongia=" + dongia + ", hinhanh=" + hinhanh + ", maloai= " + maloai + ", khuyenmai=" + km + '}';
    }
}
