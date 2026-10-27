public class Main {    
    public static void main(String[] args){
        
        Mahasiswa mhsw1  = new Mahasiswa("25SI35", "Marzanni", "SI", 4.0);
        Mahasiswa mhsw2  = new Mahasiswa("25SI45", "Hendri", "SI", 3.34);
        Mahasiswa mhsw3  = new Mahasiswa("25SI46", "Dimas", "SI", 3.77);
        
        mhsw1.tampilkanData();
        System.out.println(mhsw1.cekStatus());
        System.out.println();
        
        mhsw2.tampilkanData();
        System.out.println(mhsw2.cekStatus());
        System.out.println();
        
        mhsw3.tampilkanData();
        System.out.println(mhsw3.cekStatus());
    }
    
}
