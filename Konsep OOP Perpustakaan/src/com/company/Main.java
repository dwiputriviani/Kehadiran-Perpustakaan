package com.company;


class anggotaPerpustakaan {
    String namaAnggota;
    String IDAnggota;
    int jumlahHadir = 0;
    int jumlahTidakHadir = 0;
    TanggalAbsensi tanggalAbsensi;




    anggotaPerpustakaan(String inputNamaAnggota, String inputIDAnggota){
        this.namaAnggota = inputNamaAnggota;
        this.IDAnggota = inputIDAnggota;
    }

    void setNamaAnggota(String inputNamaAnggota){
        this.namaAnggota = inputNamaAnggota;
    }
    void setIDAnggota (String inputIDAnggota){
        this.IDAnggota = inputIDAnggota;
    }

    String getNamaAnggota (){
        return namaAnggota;
    }
    String getIDAnggota (){
        return IDAnggota;
    }

    void hadir (TanggalAbsensi tanggalAbsensi){
        this.tanggalAbsensi = tanggalAbsensi;
        tanggalAbsensi.anggotaHadir();
        jumlahHadir++;
        System.out.println("Pengunjung " + namaAnggota + " Telah direkam datang ke perpustakaan pada " + tanggalAbsensi.detailTanggal());
    }

    void tidakHadir (TanggalAbsensi tanggalAbsensi){
        this.tanggalAbsensi = tanggalAbsensi;
        tanggalAbsensi.anggotaTidakHadir();
        jumlahTidakHadir++;
        System.out.println("Pengunjung " + namaAnggota + " Telah direkam tidak datang ke perpustakaan pada " + tanggalAbsensi.detailTanggal() );
        tanggalAbsensi.detailTanggal();

    }
}

class TanggalAbsensi {
    String hari;
    String tanggal ;
    int jumlahAnggotaPerpustakaanHadir;
    int jumlahAnggotaPerpustakaanTidakHadir;

    TanggalAbsensi(String inputHari, String inputTanggal){
        this.hari = inputHari;
        this.tanggal = inputTanggal;
    }

    String detailTanggal(){
        return "Hari " + this.hari + ",Tanggal " + this.tanggal;
    }


    void anggotaHadir() {
        this.jumlahAnggotaPerpustakaanHadir++;
    }

    void anggotaTidakHadir (){
        this.jumlahAnggotaPerpustakaanTidakHadir++;
    }

    void cekJumlahKehadiran(){

        System.out.println("\n_________________________________________");
        System.out.println("Hari " + hari + ", Tanggal "+ tanggal);
        System.out.println("Pengunjung Datang \t\t\t:" +this.jumlahAnggotaPerpustakaanHadir + " Orang");
        System.out.println("Pengunjung Tidak Datang \t:" +this.jumlahAnggotaPerpustakaanTidakHadir + " Orang");
        System.out.println("_________________________________________");
    }
}


public class Main {

    public static void main(String[] args) {

        //INSTANSIASI OBJEK ANGGOTA PERPUSTAKAAN
        anggotaPerpustakaan anggota1 = new anggotaPerpustakaan("Maudy Fitri Liani","000001");
        anggotaPerpustakaan anggota2 = new anggotaPerpustakaan("Andin Aprila Sari","000002");
        anggotaPerpustakaan anggota3 = new anggotaPerpustakaan("Aldova Wira Dilaganata","000003");

        //INSTANSIASI OBJEK JADWAL ABSENSI
        TanggalAbsensi Satu_9_2022 = new TanggalAbsensi("Rabu","Satu_9_2022");

        //PROSES ABSEN ANGGOTA PERPUSTAKAAN
        anggota1.tidakHadir(Satu_9_2022);
        anggota2.hadir(Satu_9_2022);
        anggota3.hadir(Satu_9_2022);

        //CEK DATA REKAP KEHADIRAN PENGUNJUNG PERPUSTAKAAN PADA TANGGAL 1_9_2002
        Satu_9_2022.cekJumlahKehadiran();

    }
}