/* Saya Hakasa Putri mengerjakan Latihan 1 DPBO 2023 C2 
dalam mata kuliah DPBO untuk keberkahanNya maka saya tidak melakukan 
kecurangan seperti yang telah dispesifikasikan. Aamiin */


#include <iostream>
#include <vector>
#include "Mahasiswa.h"

using namespace std;

int main() {
  vector<Mahasiswa> daftarMahasiswa; //  vector untuk menyimpan daftar mahasiswa
  int menu; // Variabel untuk menyimpan pilihan menu
  bool running = true; // Variabel untuk menyimpan status program apakah sedang berjalan atau tidak

  while (running) {

    // Menampilkan menu yang tersedia
    cout << "Menu:" << endl;
    cout << "1. Tambah mahasiswa" << endl;
    cout << "2. Edit mahasiswa" << endl;
    cout << "3. Tampilkan daftar mahasiswa" << endl;
    cout << "4. Hapus mahasiswa" << endl;
    cout << "5. Keluar" << endl;
    cout << "Pilih menu: ";
    cin >> menu;

    switch (menu) {
      case 1: {

        // Menambahkan data mahasiswa
        string n, ni, p, f;
        cout << "Nama: ";
        cin >> n;
        cout << "NIM: ";
        cin >> ni;
        cout << "Program Studi: ";
        cin >> p;
        cout << "Fakultas: ";
        cin >> f;
        Mahasiswa m(n, ni, p, f);
        daftarMahasiswa.push_back(m);
        cout << "Mahasiswa berhasil ditambahkan." << endl;
        break;
      }
      case 2: {

        // Mengedit data mahasiswa
        // nomor mahasiswa merupakan index yang didapat dari urutan diinputkannya data mahasiswa
        int index;
        string n, ni, p, f;
        cout << "Nomor mahasiswa yang ingin doubah: ";
        cin >> index;
        if (index < 0 || index >= daftarMahasiswa.size()) {
          cout << "Nomor Mahasiswa tidak tersedia." << endl;
          break;
        }
        cout << "Nama: ";
        cin >> n;
        cout << "NIM: ";
        cin >> ni;
        cout << "Program Studi: ";
        cin >> p;
        cout << "Fakultas: ";
        cin >> f;
    
    daftarMahasiswa[index].setNama(n);
    daftarMahasiswa[index].setNim(ni);
    daftarMahasiswa[index].setProdi(p);
    daftarMahasiswa[index].setFakultas(f);
    cout << "Data Mahasiswa berhasil diubah." << endl;
    break;
  }
  case 3: {
    // Menampilkan daftar mahasiswa
    if (daftarMahasiswa.empty()) {
      cout << "Belum ada data mahasiswa." << endl;
    } else {
      for (int i = 0; i < daftarMahasiswa.size(); i++) {
        cout << "Nomor Mahasiswa: " << i << endl;
        cout << "Nama: " << daftarMahasiswa[i].getNama() << endl;
        cout << "NIM: " << daftarMahasiswa[i].getNim() << endl;
        cout << "Program Studi: " << daftarMahasiswa[i].getProdi() << endl;
        cout << "Fakultas: " << daftarMahasiswa[i].getFakultas() << endl;
        cout << endl;
      }
    }
    break;
  }
  case 4: {
    
    // Menghapus mahasiswa
    int index;
    cout << "Nomor mahasiswa yang ingin dihapus: ";
    cin >> index;
    if (index < 0 || index >= daftarMahasiswa.size()) {
      cout << "Nomor Mahasiswa tidak tersedia." << endl;
      break;
    }
    daftarMahasiswa.erase(daftarMahasiswa.begin() + index);
    cout << "Mahasiswa berhasil dihapus." << endl;
    break;
  }
  case 5: {
    // Keluar dari program
    running = false;
    break;
  }
  default: {
    // Menu yang dipilih tidak valid
    cout << "Menu Tidak Tersedia." << endl;
    break;
  }
}
}

return 0;
}