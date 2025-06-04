public class Antrian {
    Pembeli palingDepan;
    Pembeli palingBelakang;

    // push
    public void tambahPengantri(Pembeli p){
        if (palingDepan == null) {
            palingDepan = p;
            palingBelakang = p;
        } else {
            palingBelakang.setelahnya = p;
            palingBelakang = p;
        }
        /*
        System.out.println("'" + p.nama + "' telah menambahkan diri ke dalam antrian");
        
        p.setelahnya = palingDepan;
        palingDepan = p;
        */
    }

    public void lihatIsiAntrian(){
        if(palingDepan == null){
            System.out.println("Antrian Kosong");
            return;
        }
        Pembeli p = palingDepan;
        System.out.println("Pembeli  : " +p.nama);

        while(p.setelahnya != null){
            p = p.setelahnya;
            System.out.println("Pembeli : " +p.nama);
        }
    }

    // pop
    public Pembeli layani(){
        if (palingDepan == null){
            System.out.println("Antrian Kosong");
            return null;
        }
        Pembeli depan = palingDepan;
        palingDepan = depan.setelahnya;

        if (palingDepan == null){
            palingBelakang = null;
        }
        System.out.println("'" + depan.nama + "' sedang dilayani.");
        return depan;
    }
    public Pembeli lihatPalingDepan(){
        if (palingDepan == null){
            System.out.println("Antrian Kosong.");
            return null;
        }
        return palingDepan;
    }

    // peek
    public Boolean habiskah(){
        return palingDepan == null;
    }

    public Boolean adaOrang(){
        return !habiskah();
    }
}
