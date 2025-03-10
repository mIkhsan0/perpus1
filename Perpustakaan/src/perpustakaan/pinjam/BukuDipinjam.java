/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaan.pinjam;

import java.time.LocalDate;
import perpustakaan.Buku;

/**
 *
 * @author Muhammad
 */
public class BukuDipinjam extends Buku {
    private int lama;
    private LocalDate tanggalPinjam;

    public BukuDipinjam(String judul, int lama) {
        super(judul);
        this.lama = lama;
        tanggalPinjam = LocalDate.now();
        tanggalPinjam = tanggalPinjam.plusDays(lama);
    }

    public int getLama() {
        return lama;
    }

    public void setLama(int lama) {
        this.lama = lama;
    }
    
    public LocalDate getTanggalPinjam() {
        return tanggalPinjam;
    }
}
