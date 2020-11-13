package Modul2;

class Rekening {
    String noRekening;
    int saldo;

    Rekening(int saldo, String noRekening) {
        this.noRekening = noRekening;
        this.saldo = saldo;
    }

    String getNoRekening() { return noRekening; }

    int getSaldo() {
        return saldo;
    }

    void simpanUang(int jumlah) {
        saldo += jumlah;
        System.out.println("Uang berhasil ditambah");
    }

    void ambilUang(int jumlah) {
        if((saldo - jumlah) < 0) {
            System.out.println("Jumlah saldo tidak cukup");
        } else {
            saldo -= jumlah;
            System.out.println("Uang berhasil diambil");
        }
    }
}

