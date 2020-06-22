package overloading;

public class RumahSakit {
        int kode;
        public String nama;
        String jenisKelamin;
        String golDarah;
        int umur;
        String alamat;
        String telpon;

        public void tampilkanIsi() {
            System.out.println("********************|PASIEN|********************");
            System.out.println("Kode Pasien           : " + kode);
            System.out.println("Nama Pasien           : " + nama);
            System.out.println("Umur Pasien           : " + umur);
            System.out.println("Jenis Kelamin Pasien  : " + jenisKelamin);
            System.out.println("Golongan Darah Pasien : " + golDarah);
            System.out.println("Alamat Pasien         : " + alamat);
        }

        public void tampilkanIsi(String jenislayanan, String diagnosa){
            System.out.println("********************|PASIEN RAWAT|********************");
            System.out.println("Kode Pasien           : " + kode);
            System.out.println("Nama Pasien           : " + nama);
            System.out.println("Umur Pasien           : " + umur);
            System.out.println("Jenis Kelamin Pasien  : " + jenisKelamin);
            System.out.println("Golongan Darah Pasien : " + golDarah);
            System.out.println("Alamat Pasien         : " + alamat);
            System.out.println("Jenis Layanan         : " + jenislayanan);
            System.out.println("Diagnosa Dokter       : " + diagnosa);
        }

        public void tampilkanIsi(String keahlianPerawat) {
            System.out.println("********************|PERAWAT|********************");
            System.out.println("Kode Perawat  : " + kode);
            System.out.println("Nama Perawat  : " + nama);
            System.out.println("Jenis Kelamin : " + jenisKelamin);
            System.out.println("Telpon        : " + telpon);
            System.out.println("Keahlian      : " + keahlianPerawat);
        }

        public void tampilkanIsi(String jenislayanan, String diagnosa, String kamar){
            System.out.println("********************|PASIEN RAWAT INAP|********************");
            System.out.println("Kode Pasien           : " + kode);
            System.out.println("Nama Pasien           : " + nama);
            System.out.println("Umur Pasien           : " + umur);
            System.out.println("Jenis Kelamin Pasien  : " + jenisKelamin);
            System.out.println("Golongan Darah Pasien : " + golDarah);
            System.out.println("Alamat Pasien         : " + alamat);
            System.out.println("Jenis Layanan         : " + jenislayanan);
            System.out.println("Diagnosa Dokter       : " + diagnosa);
            System.out.println("Jenis Kamar           : " + kamar);
        }

        public void tampilkanIsi(String jenislayanan, String diagnosa, String kamar, String tanggalMasuk, String tarifLayanan){
            System.out.println("********************|MEDICAL RECORD|********************");
            System.out.println("Kode Pasien           : " + kode);
            System.out.println("Nama Pasien           : " + nama);
            System.out.println("Umur Pasien           : " + umur);
            System.out.println("Jenis Kelamin Pasien  : " + jenisKelamin);
            System.out.println("Golongan Darah Pasien : " + golDarah);
            System.out.println("Alamat Pasien         : " + alamat);
            System.out.println("Jenis Layanan         : " + jenislayanan);
            System.out.println("Diagnosa Dokter       : " + diagnosa);
            System.out.println("Jenis Kamar           : " + kamar);
            System.out.println("Tanggal Masuk         : " + tanggalMasuk);
            System.out.println("Tarif Layanan         : " + tarifLayanan);
        }

        public String getNama() {
            return nama;
        }

        RumahSakit(){
            kode = 0;
            nama = "DEFAULT";
            umur = 0;
            jenisKelamin = "L/P";
            golDarah = "A/B/AB/O";
            alamat = "DEFAULT";
        }

        public RumahSakit(int kode, String nama, String jenisKelamin, String golDarah, int umur, String alamat) {
            this.kode = kode;
            this.nama = nama;
            this.jenisKelamin = jenisKelamin;
            this.golDarah = golDarah;
            this.umur = umur;
            this.alamat = alamat;
        }

        public RumahSakit(int kode, String nama, String golDarah){
            this.kode = kode;
            this.nama = nama;
            this.golDarah = golDarah;
        }

        public RumahSakit(int kode, String nama, String jenisKelamin, String telpon) {
            this.kode = kode;
            this.nama = nama;
            this.jenisKelamin = jenisKelamin;
            this.telpon = telpon;
        }

        public RumahSakit(int kode, String nama, String jenisKelamin, String telpon, String tanggalMasuk, String tarikLayanan) {

            this.kode = kode;
            this.nama = nama;
            this.jenisKelamin = jenisKelamin;
            this.golDarah = golDarah;
            this.umur = umur;
            this.alamat = alamat;

        }
    }

