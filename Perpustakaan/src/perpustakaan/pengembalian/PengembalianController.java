/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaan.pengembalian;

import java.time.LocalDate;
import java.util.ArrayList;
import perpustakaan.pinjam.BukuDipinjam;
import perpustakaan.DialogUI;
import perpustakaan.Perpustakaan;

/**
 *
 * @author HP
 */
public class PengembalianController {

    private FormPengembalian formPengembalian;

    public PengembalianController() {
        this.formPengembalian = new FormPengembalian();
    }

    public void showFormPengembalian() {
        formPengembalian.tampilkan();
        formPengembalian.display(Perpustakaan.peminjamanManager.getDaftarBukuDipinjam());
    }

    public void konfirmasiPengembalian(ArrayList<BukuDipinjam> bukuDikembalikanCollection) {
        if (bukuDikembalikanCollection.isEmpty()) {
            DialogUI dialog = new DialogUI("Tidak ada buku yang dikembalikan!");
            dialog.setVisible(true);
            return;
        }

        for(BukuDipinjam buku : bukuDikembalikanCollection)
            this.cekWaktuPeminjaman(buku);
    }
    
    public void cekWaktuPeminjaman(BukuDipinjam buku) {
        formPengembalian.pesanSukses(buku.getTanggalPinjam().isAfter(LocalDate.now()) || buku.getTanggalPinjam().isEqual(LocalDate.now()), buku);
    }
}