/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS2501082010;

/**
 *
 * @author Acer
 */
public class Laptop extends Elektronik{
    protected int ukuranLayar;
    protected int ukuranRAM;

    public Laptop() {
    }

    public Laptop(int ukuranLayar, int ukuranRAM, String merek, int tahunProduksi, int garansi) {
        super(merek, tahunProduksi, garansi);
        this.ukuranLayar = ukuranLayar;
        this.ukuranRAM = ukuranRAM;
    }

    public int getUkuranLayar() {
        return ukuranLayar;
    }

    public void setUkuranLayar(int ukuranLayar) {
        this.ukuranLayar = ukuranLayar;
    }

    public int getUkuranRAM() {
        return ukuranRAM;
    }

    public void setUkuranRAM(int ukuranRAM) {
        this.ukuranRAM = ukuranRAM;
    }

    /**
     *
     */
    @Override

    public void tampilData() {
        System.out.println("Ukuran Layar  :" +ukuranLayar);
        System.out.println("Ukuran RAM  :" +ukuranRAM);

        
    }

    String getKartuGrafis() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getRefreshRate() {
    throw new UnsupportedOperationException("Not supported yet.");
}

    
    
}
