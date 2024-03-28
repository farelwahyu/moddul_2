
package modul_2_202357201023;

import javax.swing.JOptionPane;

public class bantubudi {
    
    public static double luasSegiPanjang(double panjang, double lebar) {
        return panjang * lebar;
    }
    
    public static double luasSegitiga(double alas,double tinggi) {
        return 0.5 * alas * tinggi;  
    }
    
    public static double luasLingkaran(double jarijari) {
        return Math.PI * Math.pow(jarijari, 2);
    }
    
    public static void main(String[] args) {
        
        double panjangSegiPanjang = Double.parseDouble(JOptionPane.showInputDialog("Masukan panjang persegi panjang"));
        double lebarSegiPanjang = Double.parseDouble(JOptionPane.showInputDialog("Masukan lebar persegi panjang"));
        double luasSegiPanjang = luasSegiPanjang(panjangSegiPanjang, lebarSegiPanjang);
        JOptionPane.showMessageDialog(null, "Luas Persegi Panjang: " + luasSegiPanjang );
        System.out.println("Luas Persegi Panjang: " + luasSegiPanjang);
        
        double alasSegitiga = Double.parseDouble(JOptionPane.showInputDialog("Masukan alas segitiga"));
        double tinggiSegitiga = Double.parseDouble(JOptionPane.showInputDialog("Masukan tinggi Segitiga"));
        double luasSegitiga = luasSegitiga(alasSegitiga, tinggiSegitiga);
        JOptionPane.showMessageDialog(null, "Luas Segitiga " + luasSegitiga);
        System.out.println("Luas Segitiga : " + luasSegitiga);
        
        double jariJariLingkaran = Double.parseDouble(JOptionPane.showInputDialog("Masukan jari jari linglaran"));
        double luasLingkaran = luasLingkaran(jariJariLingkaran);
        JOptionPane.showMessageDialog(null, "Luas LIngakaran " + luasLingkaran);
        System.out.println("Luas Lingkaran : " + luasLingkaran);
    }
    
            
}
