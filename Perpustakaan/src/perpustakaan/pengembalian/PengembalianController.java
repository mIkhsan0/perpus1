/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaan.pengembalian;

import java.util.ArrayList;
import perpustakaan.pinjam.BukuDipinjam;
import perpustakaan.DialogUI;

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
    }

    public void konfirmasiPengembalian() {
        ArrayList<BukuDipinjam> daftarBukuDikembalikan = formPengembalian.getBukuDipinjamCollection();
        
        if (daftarBukuDikembalikan.isEmpty()) {
            DialogUI dialog = new DialogUI("Tidak ada buku yang dikembalikan!");
            dialog.setVisible(true);
            return;
        }

        formPengembalian.bayarDenda();
        formPengembalian.pesanSukses();
    }
}