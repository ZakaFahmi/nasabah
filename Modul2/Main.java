package Modul2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner text = new Scanner(System.in);
        Scanner angka = new Scanner(System.in);
        boolean status = true;
        int jumlahAkun = 2;
        Nasabah nasabah1 = new Nasabah();
        Nasabah nasabah2 = new Nasabah();
        do {
            System.out.println("============================================");
            System.out.println("1. Buat akun nasabah");
            System.out.println("2. Tambah rekening");
            System.out.println("3. Ambil rekening");
            System.out.println("4. Info Nasabah");
            System.out.println("5. Cek saldo");
            System.out.println("6. Keluar");
            System.out.print("Pilih Menu : ");
            int pilih = angka.nextInt();
            System.out.println("============================================");
            switch(pilih) {
                case 1:
                    if(jumlahAkun < 1) {
                        System.out.println("Mohon maaf bank tidak menerima nasabah lagi");
                    } else {
                        System.out.print("Nama : ");
                        String nama = text.nextLine();
                        System.out.print("Alamat : ");
                        String alamat = text.nextLine();
                        System.out.print("Nomor Telepon : ");
                        String telepon = text.nextLine();
                        System.out.print("Uang yang disimpan : ");
                        int saldo = angka.nextInt();
                        if(jumlahAkun == 2) {
                            System.out.println("Nomor Rekening : 001");
                            nasabah1.nama = nama;
                            nasabah1.alamat = alamat;
                            nasabah1.noTelepon = telepon;
                            nasabah1.setRekening(new Rekening(saldo, "001"));
                            jumlahAkun = jumlahAkun -  1;
                        } else {
                            System.out.println("Nomor Rekening : 002");
                            nasabah2.nama = nama;
                            nasabah2.alamat = alamat;
                            nasabah2.noTelepon = telepon;
                            nasabah2.setRekening(new Rekening(saldo, "002"));
                            jumlahAkun = 0;
                        }
                    }
                    break;
                case 2:
                    if(jumlahAkun == 2) {
                        System.out.println("Belum ada nasabah yang terdaftar");
                    } else if (jumlahAkun == 1){
                        System.out.print("Rekening " + nasabah1.getNama() + " ditambah : ");
                        int jumlahSaldo = angka.nextInt();
                        nasabah1.getRekening().simpanUang(jumlahSaldo);
                    } else {
                        System.out.println("Tambah Rekening :");
                        System.out.println("1. " + nasabah1.getNama());
                        System.out.println("2. " + nasabah2.getNama());
                        System.out.print("Pilih nasabah nomor : ");
                        int noNasabah = angka.nextInt();
                        if(noNasabah == 1) {
                            System.out.print("Rekening " + nasabah1.getNama() + " ditambah : ");
                            int jumlahSaldo = angka.nextInt();
                            nasabah1.getRekening().simpanUang(jumlahSaldo);
                        } else if(noNasabah == 2) {
                            System.out.print("Rekening " + nasabah2.getNama() + " ditambah : ");
                            int jumlahSaldo = angka.nextInt();
                            nasabah2.getRekening().simpanUang(jumlahSaldo);
                        } else {
                            System.out.println("============================================");
                            System.out.println("Anda memasukkan angka yang salah");
                        }
                    }
                    break;
                case 3:
                    if(jumlahAkun == 2) {
                        System.out.println("Belum ada nasabah yang terdaftar");
                    } else if (jumlahAkun == 1){
                        System.out.print("Rekening " + nasabah1.getNama() + " diambil : ");
                        int jumlahSaldo = angka.nextInt();
                        nasabah1.getRekening().ambilUang(jumlahSaldo);
                    } else {
                        System.out.println("Ambil Rekening :");
                        System.out.println("1. " + nasabah1.getNama());
                        System.out.println("2. " + nasabah2.getNama());
                        System.out.print("Pilih nasabah nomor : ");
                        int noNasabah = angka.nextInt();
                        if(noNasabah == 1) {
                            System.out.print("Rekening " + nasabah1.getNama() + " diambil : ");
                            int jumlahSaldo = angka.nextInt();
                            nasabah1.getRekening().ambilUang(jumlahSaldo);
                        } else if(noNasabah == 2) {
                            System.out.print("Rekening " + nasabah2.getNama() + " diambil : ");
                            int jumlahSaldo = angka.nextInt();
                            nasabah2.getRekening().ambilUang(jumlahSaldo);
                        } else {
                            System.out.println("============================================");
                            System.out.println("Anda memasukkan angka yang salah");
                        }
                    }
                    break;
                case 4:
                    if(jumlahAkun == 2) {
                        System.out.println("Belum ada nasabah yang terdaftar");
                    } else if (jumlahAkun == 1){
                        System.out.println("Nama nasabah : " + nasabah1.getNama());
                        System.out.println("Alamat : " + nasabah1.getAlamat());
                        System.out.println("Nomor Telepon : " + nasabah1.getNoTelepon());
                        System.out.println("Nomor Rekening : " + nasabah1.getRekening().getNoRekening());
                        System.out.println("Saldo : " + nasabah1.getRekening().getSaldo());
                    } else {
                        System.out.println("Info Nasabah :");
                        System.out.println("1. " + nasabah1.getNama());
                        System.out.println("2. " + nasabah2.getNama());
                        System.out.print("Pilih nasabah nomor : ");
                        int noNasabah = angka.nextInt();
                        if(noNasabah == 1) {
                            System.out.println("Nama nasabah : " + nasabah1.getNama());
                            System.out.println("Alamat : " + nasabah1.getAlamat());
                            System.out.println("Nomor Telepon : " + nasabah1.getNoTelepon());
                            System.out.println("Nomor Rekening : " + nasabah1.getRekening().getNoRekening());
                            System.out.println("Saldo : " + nasabah1.getRekening().getSaldo());
                        } else if(noNasabah == 2) {
                            System.out.println("Nama nasabah : " + nasabah2.getNama());
                            System.out.println("Alamat : " + nasabah2.getAlamat());
                            System.out.println("Nomor Telepon : " + nasabah2.getNoTelepon());
                            System.out.println("Nomor Rekening : " + nasabah2.getRekening().getNoRekening());
                            System.out.println("Saldo : " + nasabah2.getRekening().getSaldo());
                        } else {
                            System.out.println("============================================");
                            System.out.println("Anda memasukkan angka yang salah");
                        }
                    }
                    break;
                case 5:
                    if(jumlahAkun == 2) {
                        System.out.println("Belum ada nasabah yang terdaftar");
                    } else if(jumlahAkun == 1) {
                        System.out.println("Jumlah saldo " + nasabah1.getNama() + " adalah " + nasabah1.getRekening().getSaldo());
                    } else {
                        System.out.println("Cek saldo :");
                        System.out.println("1. " + nasabah1.getNama());
                        System.out.println("2. " + nasabah2.getNama());
                        System.out.print("Pilih nasabah nomor : ");
                        int noNasabah = angka.nextInt();
                        if(noNasabah == 1) {
                            System.out.println("Jumlah saldo " + nasabah1.getNama() + " adalah " + nasabah1.getRekening().getSaldo());
                        } else if(noNasabah == 2) {
                            System.out.println("Jumlah saldo " + nasabah2.getNama() + " adalah " + nasabah2.getRekening().getSaldo());
                        } else {
                            System.out.println("============================================");
                            System.out.println("Anda memasukkan angka yang salah");
                        }
                    }
                    break;
                case 6:
                    status = false;
                    break;
                default:
                    System.out.println("Inputan Anda Salah");
                    break;
            }
        } while(status);
    }
}
