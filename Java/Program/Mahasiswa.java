/* Saya Hakasa Putri mengerjakan Latihan 1 DPBO 2023 C2 
dalam mata kuliah DPBO untuk keberkahanNya maka saya tidak melakukan 
kecurangan seperti yang telah dispesifikasikan. Aamiin */


public class Mahasiswa {

    // enkapsulasi atribut
    public String nama;
    public String nim;
    public String prodi;
    public String fakultas;

    // constructor
    public Mahasiswa(String nama, String nim, String prodi, String fakultas) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        this.fakultas = fakultas;
    }

    // getter dan setter untuk setiap atribut
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public String getFakultas() {
        return fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }
}
