/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS2501082010;

/**
 *
 * @author Acer
 */
public class Gaming extends Laptop{
    protected String kartuGrafis;
    protected int refreshRate;

    public Gaming() {
    }

   
       public Gaming(int ukuranLayar, int ukuranRAM, String merek, int tahunProduksi, int garansi,
              String kartuGrafis, int refreshRate) {
    super(ukuranLayar, ukuranRAM, merek, tahunProduksi, garansi);
    this.kartuGrafis = kartuGrafis;
    this.refreshRate = refreshRate;
}


    
    

    public String getKartuGrafis() {
        return kartuGrafis;
    }

    public void setKartuGrafis(String kartuGrafis) {
        this.kartuGrafis = kartuGrafis;
    }

    
    
    public int getRefreshRate() {
        return refreshRate;
    }

    public void setRefreshRate(int refreshRate) {
        this.refreshRate = refreshRate;
    }
   
    public void tampilData() {
        System.out.println("Kartu Grafis : " +kartuGrafis);
        System.out.println("Refresh Rate     : " +refreshRate);
    }
    
    
}
