package Modul2;

class Nasabah {
    String nama;
    String alamat;
    String noTelepon;
    Rekening rekening;

    String getNama() {
        return nama;
    }

    String getAlamat() { return alamat; }

    String getNoTelepon() { return noTelepon; }

    Rekening getRekening() {
        return rekening;
    }

    void setRekening(Rekening rekening) {
        this.rekening = rekening;
    }
}
