/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package perpus.domain;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author martinusadyh
 */
@Entity
@Table(name="buku")
public class Buku extends BaseEntity {
    
    @Column(name="kode_buku")
    private String kodeBuku;
    
    @Column(name="judul_buku")
    private String judulBuku;
    
    @Column(name="pengarang")
    private String pengarang;
    
    @Column(name="penerbit")
    private String penerbit;
    
    @Column(name="kota_terbit")
    private String kotaTerbit;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name="tahun_terbit")
    private Date tahunTerbit;
    
    @Column(name="jenis_buku")
    private String jenisBuku;

    public String getKodeBuku() {
        return kodeBuku;
    }

    public void setKodeBuku(String kodeBuku) {
        this.kodeBuku = kodeBuku;
    }

    public String getJudulBuku() {
        return judulBuku;
    }

    public void setJudulBuku(String judulBuku) {
        this.judulBuku = judulBuku;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public String getKotaTerbit() {
        return kotaTerbit;
    }

    public void setKotaTerbit(String kotaTerbit) {
        this.kotaTerbit = kotaTerbit;
    }

    public Date getTahunTerbit() {
        return tahunTerbit;
    }

    public void setTahunTerbit(Date tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public String getJenisBuku() {
        return jenisBuku;
    }

    public void setJenisBuku(String jenisBuku) {
        this.jenisBuku = jenisBuku;
    }
}
