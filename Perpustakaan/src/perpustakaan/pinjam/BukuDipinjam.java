/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaan.pinjam;

import perpustakaan.Buku;

/**
 *
 * @author Muhammad
 */
public class BukuDipinjam extends Buku {
    private int lama;

    public BukuDipinjam(String judul, int lama) {
        super(judul);
        this.lama = lama;
    }

    public int getLama() {
        return lama;
    }

    public void setLama(int lama) {
        this.lama = lama;
    }
}
