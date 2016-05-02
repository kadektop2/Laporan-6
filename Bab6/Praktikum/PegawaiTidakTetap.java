package Bab6.Praktikum;

import java.util.Scanner;

public class PegawaiTidakTetap extends Employee {

    Scanner in = new Scanner(System.in);
    private long lembur, jamkerja, hari, total;

    public PegawaiTidakTetap(String name, String idKerja, String jabatan, String istri, int anak, int tahunMasuk, long gaji) {
        super(name, idKerja, jabatan, istri, anak, tahunMasuk, gaji);
    }

    public long getHari() {
        return hari;
    }

    public long getJamKerja() {
        return jamkerja - 10;
    }

    public long getLembur() {
        return getJamKerja() * getHari() * 10000;
    }

    public long getTotalLembur() {
        return total = super.getGaji() + getLembur();
    }

    public void GajiPegawaiTidakTetap() {
        System.out.print("Masukkan lama jam kerja (saat lembur)   : ");
        jamkerja = in.nextInt();
        System.out.print("Masukkan jumlah hari lembur             : ");
        hari = in.nextInt();
        System.out.println("\n= = = = = = = DATA  PEGAWAI = = = = = = =");
        System.out.println("Nama anda                : " + getName());
        System.out.println("Id Kerja anda            : " + getIdKerja());
        System.out.println("Jabatan anda             : " + getJabatan());
        System.out.println("Lama bekerja             : " + getLamaKerja() + " tahun");
        System.out.println("= = = = = = = = = = = = = = = = = = = = =");
        System.out.println("Gaji pokok anda          : Rp. " + getGaji());
        if (jamkerja <= 10) {
            System.out.println("Gaji lembur anda         : Rp. " + 0.0);
            System.out.println("Tunjangan masa kerja     : Rp. " + 0.0);
            System.out.println("Tunjangan istri          : Rp. " + 0.0);
            System.out.println("Tunjangan anak           : Rp. " + 0.0);
            System.out.println("Total Gaji anda          : Rp. " + super.getGaji());
        } else if (jamkerja > 10) {
            System.out.println("Gaji lembur anda         : Rp. " + getLembur());
            System.out.println("Tunjangan masa kerja     : Rp. " + 0.0);
            System.out.println("Tunjangan istri          : Rp. " + 0.0);
            System.out.println("Tunjangan anak           : Rp. " + 0.0);
            System.out.println("Total Gaji anda          : Rp. " + getTotalLembur());
        }
    }
}
