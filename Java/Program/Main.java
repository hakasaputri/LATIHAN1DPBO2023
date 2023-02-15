/* Saya Hakasa Putri mengerjakan Latihan 1 DPBO 2023 C2 
dalam mata kuliah DPBO untuk keberkahanNya maka saya tidak melakukan 
kecurangan seperti yang telah dispesifikasikan. Aamiin */


// Import library
import java.util.Scanner;
import java.util.ArrayList;

// Buat kelas Mahasiswa
class Mahasiswa {

    // definisi atribut
    private String nama;
    private String nim;
    private String prodi;
    private String fakultas;

    // constructor
    public Mahasiswa(String nama, String nim, String prodi, String fakultas) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        this.fakultas = fakultas;
    }

    // setter
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    // getter
    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public String getProdi() {
        return prodi;
    }

    public String getFakultas() {
        return fakultas;
    }
}

// buat kelas Main
class Main {
    public static void main(String[] args) {

        // scanner untuk input user
        Scanner input = new Scanner(System.in);

        // ArrayList untuk menyimpan data mahasiswa
        ArrayList<Mahasiswa> listMahasiswa = new ArrayList<Mahasiswa>();

        // tampilkan menu dengan 5 pilihan yaiutu tambah, edit, tampilkan, dan hapus mahasiswa juga keluar dari prohram
        int pilihan = 0;
        while (pilihan != 5) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Edit Mahasiswa");
            System.out.println("3. Tampilkan Mahasiswa");
            System.out.println("4. Hapus Mahasiswa");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            pilihan = input.nextInt();

            // aksi sesuai menu pilihan user
            switch (pilihan) {
                case 1:
                    // Meminta user untuk memasukkan data mahasiswa baru
                    System.out.print("Nama: ");
                    String nama = input.next();
                    System.out.print("NIM: ");
                    String nim = input.next();
                    System.out.print("Prodi: ");
                    String prodi = input.next();
                    System.out.print("Fakultas: ");
                    String fakultas = input.next();

                    // Buat objek Mahasiswa baru dan tambahkan ke dalam array
                    Mahasiswa mhsBaru = new Mahasiswa(nama, nim, prodi, fakultas);
                    listMahasiswa.add(mhsBaru);
                    System.out.println("Mahasiswa berhasil ditambahkan!");
                    break;

                    case 2:
                    // Meminta user untuk memasukkan NIM mahasiswa yang ingin diubah
                    System.out.print("Masukkan NIM mahasiswa yang ingin diubah: ");
                    String editNim = input.next();

                    // Cari mahasiswa dengan NIM yang diinginkan oleh user
                    boolean found = false;
                    for (Mahasiswa mhs : listMahasiswa) {
                        if (mhs.getNim().equals(editNim)) {

                            // meminta user memasukan data baru
                            System.out.print("Nama: ");
                            String namaBaru = input.next();
                            System.out.print("NIM: ");
                            String nimBaru = input.next();
                            System.out.print("Prodi: ");
                            String prodiBaru = input.next();
                            System.out.print("Fakultas: ");
                            String fakultasBaru = input.next();

                            // set atribut dengan data baru
                            mhs.setNama(namaBaru);
                            mhs.setNim(nimBaru);
                            mhs.setProdi(prodiBaru);
                            mhs.setFakultas(fakultasBaru);
                            found = true;
                            System.out.println("Data mahasiswa berhasil diubah!");
                            break;
                        }
                    }

                    // jika min tidak ditemukan
                    if (!found) {
                        System.out.println("Mahasiswa dengan NIM " + editNim + " tidak ditemukan.");
                    }
                    break;
    
                case 3:

                    // tampilkan data mahasiswa
                    for (Mahasiswa mhs : listMahasiswa) {
                        System.out.println("Nama: " + mhs.getNama());
                        System.out.println("NIM: " + mhs.getNim());
                        System.out.println("Prodi: " + mhs.getProdi());
                        System.out.println("Fakultas: " + mhs.getFakultas());
                        System.out.println();
                    }
                    break;
    
                case 4:

                    // meminta user untuk menginputkan nIM yang akan dihapus
                    System.out.print("Masukkan NIM mahasiswa yang akan dihapus: ");
                    String deleteNim = input.next();

                    // cari mahasiswa
                    boolean deleted = false;
                    for (int i = 0; i < listMahasiswa.size(); i++) {
                        Mahasiswa mhs = listMahasiswa.get(i);
                        if (mhs.getNim().equals(deleteNim)) {

                            // jika nim ditemukan, hapus dari array
                            listMahasiswa.remove(i);
                            deleted = true;
                            System.out.println("Data mahasiswa berhasil dihapus!");
                            break;
                        }
                    }

                    // fika nim tidak ditemukan
                    if (!deleted) {
                        System.out.println("Mahasiswa dengan NIM " + deleteNim + " tidak ditemukan.");
                    }
                    break;
    
                case 5:
                    // program selesai
                    System.out.println("Semoga Harimu Menyenagkan Kaka!");
                    break;
    
                default:
                    // Jika pilihan tidak valid, tampilkan pesan kesalahan
                    System.out.println("Menu Tidak Tersedia");
                    break;
            }
        }
    }
}    
