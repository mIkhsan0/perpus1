/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaan.pinjam;

import java.util.ArrayList;
import perpustakaan.Buku;
import perpustakaan.BukuProvider;
import perpustakaan.DialogUI;
import perpustakaan.Perpustakaan;

/**
 *
 * @author Muhammad
 */
public class PeminjamanController {
    
    public void showFormPeminjaman() {
        Perpustakaan.formPeminjaman = new FormPeminjaman();
        Perpustakaan.formPeminjaman.tampilkan();
    }
    
    public void cariBuku(String judul) {
        BukuProvider bukuProvider = new BukuProvider();
        ArrayList<Buku> listBuku = bukuProvider.selectBuku(judul);
        if (listBuku.isEmpty()) {
            DialogUI dialogUI = new DialogUI("Buku tidak terdaftar");
            dialogUI.pack();
            dialogUI.setLocationRelativeTo(null);
            dialogUI.setVisible(true);
        } else Perpustakaan.formPeminjaman.display(listBuku);
    }
}
