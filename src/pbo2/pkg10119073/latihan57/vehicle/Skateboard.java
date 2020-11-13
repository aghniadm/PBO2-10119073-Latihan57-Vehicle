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

public class Skateboard extends Vehicle{
    private double myBoardLength;
    
    public Skateboard(){
        setBrand("Ally Skate");
        setModel("Rocket");
        setBoardLength(54.5);

        System.out.println("\nSkateboard");
        System.out.println("Brand  : "+getBrand());
        System.out.println("Model  : "+getModel());
        System.out.println("Panjangnya Board: "+getBoardLength());
    }
    
    public double getBoardLength(){
        return myBoardLength;
    }
    
    public void setBoardLength(double boardLength){
        this.myBoardLength = boardLength;
    }
}
