public class tekanan_darah {
    String username, golongan_darah;
    int umur;
    int no_pendfatran;
    int nilai_tekanan;
    int hasil;

    void setNo_pendfatran() {
        System.out.println("mengantri no antrian");
    }

    void checkup() {
        System.out.println("pasien periksa tekanan darah");
    }

    void periksa_tekanan_darah_dewasa() {
        hasil--;
        if (nilai_tekanan > 90 - 120) {
            hasil++;
            System.out.println("tekanan darah anda normal");
        } else if (nilai_tekanan > 130) {
            System.out.println("tekanan darah anda tinggi");
        }
    }
}
