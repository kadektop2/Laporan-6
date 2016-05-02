package Bab6.Praktikum;

public class Manager extends Employee {

    private long tun, tunJab, tunIs, tunAn, bonus, total;

    public Manager(String name, String idKerja, String jabatan, String istri, int anak, int tahunMasuk, long gaji) {
        super(name, idKerja, jabatan, istri, anak, tahunMasuk, gaji);
    }

    public long getTunJab() {
        return tunJab = (long) (super.getGaji() * 0.1);
    }

    public long getTunIs() {
        return tunIs = (long) ((super.getGaji() + getTunJab1()) * 0.1);
    }

    public long getTunAn() {
        return tunAn = (long) ((super.getGaji() + getTunJab1() + getTunIs1()) * 0.15 * super.getAnak());
    }

    public long getTunAnMax() {
        super.setAnak(3);
        return getTunAn();
    }

    public long getTotal() {
        return total = super.getGaji() + getTunJab() + getTunIs() + getTunAn();
    }

    public long getTotalAnakMax() {
        return total = super.getGaji() + getTunJab() + getTunIs() + getTunAnMax();
    }

    public long getTunJab1() {
        return tunJab = (long) ((super.getGaji() + getBonus1()) * 0.1);
    }

    public long getTunIs1() {
        return tunIs = (long) ((super.getGaji() + getBonus1() + getTunJab1()) * 0.1);
    }

    public long getTunAn1() {
        return tunAn = (long) ((super.getGaji() + getBonus1() + getTunJab1() + getTunIs1()) * 0.15 * super.getAnak());
    }

    public long getTunAnMax1() {
        super.setAnak(3);
        return getTunAn1();
    }

    public long getTotal1() {
        return total = super.getGaji() + getBonus1() + getTunJab1() + getTunIs1() + getTunAn1();
    }

    public long getTotal1AnakMax() {
        return total = super.getGaji() + getBonus1() + getTunJab1() + getTunIs1() + getTunAnMax1();
    }

    public long getBonus1() {
        return bonus = (long) (0.05 * super.getGaji());
    }

    public long getBonus2() {
        return bonus = (long) (0.1 * super.getGaji());
    }

    public long getTun2() {
        return tun = (long) (0.1 * (super.getGaji() + getBonus2()));
    }

    public long getTunJab2() {
        return tunJab = (long) ((super.getGaji() + getBonus2() + getTun2()) * 0.1);
    }

    public long getTunIs2() {
        return tunIs = (long) ((super.getGaji() + getBonus2() + getTun2() + getTunJab2()) * 0.1);
    }

    public long getTunAn2() {
        return tunAn = (long) ((super.getGaji() + getBonus2() + getTun2() + getTunJab2() + getTunIs2()) * 0.15 * super.getAnak());
    }

    public long getTunAnMax2() {
        super.setAnak(3);
        return getTunAn2();
    }

    public long getTotal2() {
        return total = super.getGaji() + getBonus2() + getTun2() + getTunJab2() + getTunIs2() + getTunAn2();
    }

    public long getTotal2AnakMax() {
        return total = super.getGaji() + getBonus2() + getTun2() + getTunJab2() + getTunIs2() + getTunAnMax2();
    }

    public void GajiManager() {
        System.out.println("\n= = = = = = = DATA  PEGAWAI = = = = = = =");
        System.out.println("Nama anda                : " + getName());
        System.out.println("Id Kerja anda            : " + getIdKerja());
        System.out.println("Jabatan anda             : " + getJabatan());
        System.out.println("Lama bekerja             : " + getLamaKerja() + " tahun");
        System.out.println("= = = = = = = = = = = = = = = = = = = = =");
        System.out.println("Gaji pokok anda          : Rp. " + getGaji());
        if (getLamaKerja() >= 0 && getLamaKerja() <= 5) {
            System.out.println("Bonus anda               : Rp. " + 0);
            System.out.println("Tunjangan masa kerja     : Rp. " + 0);
            System.out.println("Tunjangan jabatan        : Rp. " + getTunJab());
            if (super.getIstri().equalsIgnoreCase("ya")) {
                System.out.println("Tunjangan istri          : Rp. " + getTunIs());
                if (super.getAnak() >= 0 && super.getAnak() <= 3) {
                    System.out.println("Tunjangan anak           : Rp. " + getTunAn());
                    System.out.println("Total Gaji anda          : Rp. " + getTotal());
                } else if (super.getAnak() > 3) {
                    System.out.println("Tunjangan anak           : Rp. " + getTunAnMax());
                    System.out.println("Total Gaji               : Rp. " + getTotalAnakMax());
                }
            } else if (super.getIstri().equalsIgnoreCase("tidak")) {
                System.out.println("Tunjangan istri          : Rp. " + 0);
                System.out.println("Tunjangan anak           : Rp. " + 0);
                System.out.println("Total Gaji anda          : Rp. " + (super.getGaji() + getTunJab()));
            }

        } else if (getLamaKerja() > 5 && getLamaKerja() <= 10) {
            System.out.println("Bonus anda               : Rp. " + getBonus1());
            System.out.println("Tunjangan masa kerja     : Rp. " + 0);
            System.out.println("Tunjangan jabatan        : Rp. " + getTunJab1());
            if (super.getIstri().equalsIgnoreCase("ya")) {
                System.out.println("Tunjangan istri          : Rp. " + getTunIs1());
                if (super.getAnak() >= 0 && super.getAnak() <= 3) {
                    System.out.println("Tunjangan anak           : Rp. " + getTunAn1());
                    System.out.println("Total Gaji anda          : Rp. " + getTotal1());
                } else if (super.getAnak() > 3) {
                    System.out.println("Tunjangan anak           : Rp. " + getTunAnMax1());
                    System.out.println("Total Gaji               : Rp. " + getTotal1AnakMax());
                }
            } else if (super.getIstri().equalsIgnoreCase("tidak")) {
                System.out.println("Tunjangan istri          : Rp. " + 0);
                System.out.println("Tunjangan anak           : Rp. " + 0);
                System.out.println("Total Gaji anda          : Rp. " + (super.getGaji() + getTunJab1() + getBonus1()));
            }
        } else if (getLamaKerja() > 10) {
            System.out.println("Bonus anda               : Rp. " + getBonus2());
            System.out.println("Tunjangan masa kerja     : Rp. " + getTun2());
            System.out.println("Tunjangan jabatan        : Rp. " + getTunJab2());
            if (super.getIstri().equalsIgnoreCase("ya")) {
                System.out.println("Tunjangan istri          : Rp. " + getTunIs2());
                if (super.getAnak() >= 0 && super.getAnak() <= 3) {
                    System.out.println("Tunjangan anak           : Rp. " + getTunAn2());
                    System.out.println("Total Gaji anda          : Rp. " + getTotal2());
                } else if (super.getAnak() > 3) {
                    System.out.println("Tunjangan anak           : Rp. " + getTunAnMax2());
                    System.out.println("Total Gaji               : Rp. " + getTotal2AnakMax());
                }
            } else if (super.getIstri().equalsIgnoreCase("tidak")) {
                System.out.println("Tunjangan istri          : Rp. " + 0);
                System.out.println("Tunjangan anak           : Rp. " + 0);
                System.out.println("Total Gaji anda          : Rp. " + (super.getGaji() + getTunJab2() + getBonus2() + getTun2()));
            }
        }
    }
}
