public class Tumpukan {
    Barang palingAtas;
    
    public void tumpuk(Barang b){
        b.dibawahnya = palingAtas;
        palingAtas = b;
    }

    public void lihatIsiTumpukan(){
        if(palingAtas == null){
            System.out.println("Tumpukan Kosong");
            return;

        }

        Barang sekarang = palingAtas;
        System.out.println("Barang : " +sekarang.nama);

        while(sekarang.dibawahnya != null){
            sekarang = sekarang.dibawahnya;
            System.out.println("Barang : "+sekarang.nama);
        }
    }

    public Barang ambil(){
        Barang atas = palingAtas;
        palingAtas = atas.dibawahnya;
        return atas;
    }

    public Barang lihatPalingAtas(){
        return palingAtas;
    }

    public Boolean kosongkah(){
        return palingAtas == null;
    }

    public Boolean adaIsinya(){
        return !kosongkah();    
    }
}
