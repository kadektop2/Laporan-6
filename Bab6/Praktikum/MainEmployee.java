package Bab6.Praktikum;

import java.util.Scanner;

public class MainEmployee {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);
        int a = 0;
        System.out.println("           PT. CAHAYA GEMILANG");
        System.out.println(" Jl. Gunung Guntur No. XXX, Malang 65155");
        System.out.println("          Telp.  (0341) 8447877");
        System.out.println("= = = = = = = = = = = = = = = = = = = = =");
        System.out.print("Masukkan nama anda     : ");
        String n = in.nextLine();
        System.out.print("Masukkan id Kerja anda : ");
        String id = in.nextLine();
        System.out.print("Masukkan jabatan anda  : ");
        String j = in.nextLine();
        System.out.print("Masukkan tahun masuk anda bekerja       : ");
        int t = in2.nextInt();
        System.out.print("Apakah anda memiliki istri ? (Ya/Tidak) : ");
        String i = in.nextLine();
        if (i.equalsIgnoreCase("Ya")) {
            System.out.print("Masukkan jumlah anak (jika ada)         : ");
            a = in2.nextInt();
        }
        if (j.equalsIgnoreCase("Manager")) {
            Manager man = new Manager(n, id, j, i, a, t, 5000000);
            man.GajiManager();
        } else if (j.equalsIgnoreCase("Pegawai Tetap")) {
            PegawaiTetap pt = new PegawaiTetap(n, id, j, i, a, t, 3000000);
            pt.GajiPegawaiTetap();
        } else if (j.equalsIgnoreCase("Pegawai Tidak Tetap")) {
            PegawaiTidakTetap ptt = new PegawaiTidakTetap(n, id, j, i, a, t, 3000000);
            ptt.GajiPegawaiTidakTetap();
        }
    }
}
