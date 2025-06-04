public class DemoAntrian {
    public static void main(String[] args) {
        Antrian t = new Antrian();

        Pembeli pertama = new Pembeli("Azmi");
        Pembeli kedua = new Pembeli("Nabil");
        Pembeli ketiga = new Pembeli("Ojan");

        t.tambahPengantri(pertama);
        t.tambahPengantri(kedua);
        t.tambahPengantri(ketiga);

        t.lihatIsiAntrian();

        System.out.println("Apakah ada Antrian ? "+t.habiskah());

        System.out.println("Lihat paling depan : "+t.lihatPalingDepan().nama);
        System.out.println("Lihat paling depan : "+t.lihatPalingDepan().nama);
        System.out.println("Lihat paling depan : "+t.lihatPalingDepan().nama);

        System.out.println("-----------------");

        while(t.adaOrang()){
            System.out.println("Ambil paling depan : "+t.layani().nama);
        }

        System.out.println("tidak ada antrian");
    }
}
