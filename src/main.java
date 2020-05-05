public class main {
    public static void main(String[] args) {
        tekanan_darah pasien1 = new tekanan_darah();

        System.out.println("PASIEN 1");
        pasien1.no_pendfatran=01;
        pasien1.username="Nur Afifah";
        pasien1.umur=21;
        pasien1.golongan_darah="B";
        pasien1.nilai_tekanan=100;

        System.out.println(pasien1.no_pendfatran);
        System.out.println(pasien1.username);
        System.out.println(pasien1.umur);
        System.out.println(pasien1.nilai_tekanan);
        pasien1.periksa_tekanan_darah_dewasa();
    }
}
