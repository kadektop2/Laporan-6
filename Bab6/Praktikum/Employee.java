package Bab6.Praktikum;

public class Employee {

    private String name;
    private String idKerja;
    private String jabatan;
    private String istri;
    private int anak;
    private int tahunMasuk;
    private int lamaKerja;
    private long gaji;

    public Employee(String name, String idKerja, String jabatan, String istri, int anak, int tahunMasuk, long gaji) {
        this.name = name;
        this.idKerja = idKerja;
        this.jabatan = jabatan;
        this.istri = istri;
        this.anak = anak;
        this.tahunMasuk = tahunMasuk;
        this.gaji = gaji;
    }

    public void setAnak(int anak) {
        this.anak = anak;
    }

    public String getName() {
        return name;
    }

    public String getIdKerja() {
        return idKerja;
    }

    public String getJabatan() {
        return jabatan;
    }

    public String getIstri() {
        return istri;
    }

    public int getAnak() {
        return anak;
    }

    public int getTahunMasuk() {
        return tahunMasuk;
    }

    public int getLamaKerja() {
        return lamaKerja = 2016 - tahunMasuk;
    }

    public long getGaji() {
        return gaji;
    }
}
