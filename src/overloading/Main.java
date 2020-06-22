package overloading;

public class Main {
    public static void main(String[] args) {

        //pasien
        RumahSakit dataRS1 = new RumahSakit();
        RumahSakit dataRS2 = new RumahSakit(1, "Ucup", "L", "B", 40, "Banjarbaru");
        RumahSakit dataRS3 = new RumahSakit(2, "Ipul", "B");
        //perawat
        RumahSakit dataRS4 = new RumahSakit(1001, "Tirta", "L", "08133190800");


        dataRS1.tampilkanIsi();
        dataRS2.tampilkanIsi("OPERASI JANTUNG", "GAGAL NAFAS");
        dataRS4.tampilkanIsi("AHLI JANTUNG");

        dataRS2.kode = 2;
        dataRS2.nama = "emon";
        dataRS2.umur = 33;
        dataRS2.tampilkanIsi("OPERASI AMANDEL", "PEMBEKAKAN TENGGOROKAN");
        dataRS4.kode = 1002;
        dataRS4.nama = "ALEX";
        dataRS4.tampilkanIsi("AHLI BEDAH");

        dataRS2.tampilkanIsi("OPERASI JANTUNG", "POMPA JANTUNG LEMAH", "VVIP KLS 1");

        dataRS2.tampilkanIsi("OPERASI PARU", "PERNAFASAN", "VVIP KLS2", "22 Juni 2020", "3.750.000");

    }
}




