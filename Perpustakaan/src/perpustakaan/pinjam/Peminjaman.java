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
public class Peminjaman {
    private ArrayList<BukuDipinjam> daftarBuku = new ArrayList<>();

    public ArrayList<BukuDipinjam> getDaftarBuku() {
        return daftarBuku;
    }

    public void setDaftarBuku(ArrayList<BukuDipinjam> daftarBuku) {
        this.daftarBuku = daftarBuku;
    }
}
