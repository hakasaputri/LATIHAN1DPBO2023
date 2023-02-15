/* Saya Hakasa Putri mengerjakan Latihan 1 DPBO 2023 C2 
dalam mata kuliah DPBO untuk keberkahanNya maka saya tidak melakukan 
kecurangan seperti yang telah dispesifikasikan. Aamiin */

// Berisi definisi kelas Mahasiswa yang memiliki atribut nama, nim, prodi, dan fakultas serta konstruktor dan setter-getter untuk atribut-atribut tersebut.

#include <string>

class Mahasiswa {
  private:
    std::string nama;     // Atribut nama
    std::string nim;      // Atribut NIM
    std::string prodi;    // Atribut program studi
    std::string fakultas; // Atribut fakultas

  public:
    // Constructor
    Mahasiswa(std::string n, std::string ni, std::string p, std::string f);

    // Getter dan setter
    std::string getNama();
    void setNama(std::string n);
    std::string getNim();
    void setNim(std::string ni);
    std::string getProdi();
    void setProdi(std::string p);
    std::string getFakultas();
    void setFakultas(std::string f);
};

// Definisi konstruktor kelas Mahasiswa
Mahasiswa::Mahasiswa(std::string n, std::string ni, std::string p, std::string f) {
  nama = n;
  nim = ni;
  prodi = p;
  fakultas = f;
}

// Getter dan setter untuk atribut nama
std::string Mahasiswa::getNama() {
  return nama;
}
void Mahasiswa::setNama(std::string n) {
  nama = n;
}

// Getter dan setter untuk atribut nim
std::string Mahasiswa::getNim() {
  return nim;
}
void Mahasiswa::setNim(std::string ni) {
  nim = ni;
}

// Getter dan setter untuk atribut prodi
std::string Mahasiswa::getProdi() {
  return prodi;
}
void Mahasiswa::setProdi(std::string p) {
  prodi = p;
}

// Getter dan setter untuk atribut fakultas
std::string Mahasiswa::getFakultas() {
  return fakultas;
}
void Mahasiswa::setFakultas(std::string f) {
  fakultas = f;
}
