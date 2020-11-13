package pbo2.pkg10119073.latihan57.vehicle;

/**
 *
 * @author 
 * NAMA     : Aghnia Dewi Mahiranie
 * KELAS    : PBO2
 * NIM      : 10119073
 * Deskripsi Program : Program ini berisi program untuk menampilkan spesifikasi kendaraan
 * dengan konsep pewarisan class
 *
 */

public class Bicycle extends Vehicle{
    private int myGearCount;
    
    public Bicycle(){
        setBrand("Trek Bike");
        setModel("7.4FX");
        setGearCount(23);

        System.out.println("Bicycle");
        System.out.println("Brand  : "+getBrand());
        System.out.println("Model  : "+getModel());
        System.out.println("Jumlah Gear : "+getGearCount());
    }
    
    public int getGearCount(){
        return myGearCount;
    }
    
    public void setGearCount(int gearCount){
        this.myGearCount = gearCount;
    }
}
