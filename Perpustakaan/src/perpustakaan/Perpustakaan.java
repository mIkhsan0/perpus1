/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaan;

import perpustakaan.pengembalian.FormPengembalian;
import perpustakaan.pengembalian.PengembalianController;
import perpustakaan.pinjam.FormPeminjaman;
import perpustakaan.pinjam.PeminjamanController;
import perpustakaan.pinjam.PeminjamanManager;


public class Perpustakaan {

    public static HalamanUtamaUI halamanUtamaUI;
    public static PencarianController controllerPencarian;
    public static FormPencarian formPencarian;
    public static DialogUI dialogUI;
    public static BukuProvider bukuProvider;
    public static FormPeminjaman formPeminjaman;
    public static PeminjamanController peminjamanController;
    public static PeminjamanManager peminjamanManager;
    public static FormPengembalian formPengembalian;
    public static PengembalianController pengembalianController;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // create new Home
        Perpustakaan.halamanUtamaUI = new HalamanUtamaUI();
        
        // center screen
        Perpustakaan.halamanUtamaUI.pack();
        Perpustakaan.halamanUtamaUI.setLocationRelativeTo(null);
        Perpustakaan.halamanUtamaUI.setVisible(true);
        
        
        // TODO code application logic here
    }    
}
