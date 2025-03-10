/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaan.pinjam;

import java.util.ArrayList;

/**
 *
 * @author Muhammad
 */
public class PeminjamanManager {
    Peminjaman peminjaman = new Peminjaman();
 
    public boolean save(ArrayList<BukuDipinjam> bukuDipinjamCollection) {
        // save to database
        for (BukuDipinjam bukuDipinjam : bukuDipinjamCollection) {
            for (BukuDipinjam bukuSudahDipinjam : peminjaman.getDaftarBuku()) {
                if(bukuDipinjam.judul.equalsIgnoreCase(bukuSudahDipinjam.judul)) {
                    return false;
                }
            }
            peminjaman.getDaftarBuku().add(bukuDipinjam);
        }
        return true;
    }

    public ArrayList<BukuDipinjam> getDaftarBukuDipinjam() {
        return peminjaman.getDaftarBuku();
    }
    
}
