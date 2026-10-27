public class Mahasiswa {
    
    String nim;
    String nama;
    String jurusan;
    double ipk;
    
    public Mahasiswa(String nim, String nama, String jurusan, double ipk){
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
        this.ipk = ipk;
    }
    
    public void tampilkanData(){
        System.out.println("NIM     : " + nim);
        System.out.println("Nama    : " + nama);
        System.out.println("Jurusan : " + jurusan);
        System.out.println("Ipk     : " + ipk);
        System.out.println("----------------------");
    }
    
    public String cekStatus(){
        if (ipk >= 3.0){
            return nama + " berstatus: Memuaskan";
        }else{
            return nama + " berstatus pelu Ditingkatkan";
        }
    }
}
