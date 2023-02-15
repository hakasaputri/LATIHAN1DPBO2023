# Saya Hakasa Putri mengerjakan Latihan 1 DPBO 2023 C2 
# dalam mata kuliah DPBO untuk keberkahanNya maka saya tidak melakukan 
# kecurangan seperti yang telah dispesifikasikan. Aamiin


class Mahasiswa:

    # constructor
    def __init__(self, nim, nama, prodi, fakultas):
        self.nim = nim
        self.nama = nama
        self.prodi = prodi
        self.fakultas = fakultas
    
    # setter getter untuk setiap atribut
    def get_nim(self):
        return self.nim
    
    def set_nim(self, nim):
        self.nim = nim
    
    def get_nama(self):
        return self.nama
    
    def set_nama(self, nama):
        self.nama = nama
    
    def get_prodi(self):
        return self.prodi
    
    def set_prodi(self, prodi):
        self.prodi = prodi
    
    def get_fakultas(self):
        return self.fakultas
    
    def set_fakultas(self, fakultas):
        self.fakultas = fakultas
