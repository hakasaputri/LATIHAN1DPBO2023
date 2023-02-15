#Saya Hakasa Putri mengerjakan Latihan 1 DPBO 2023 C2 
# dalam mata kuliah DPBO untuk keberkahanNya maka saya tidak melakukan 
# kecurangan seperti yang telah dispesifikasikan. Aamiin

# import calss
from Mahasiswa import Mahasiswa

daftar_mahasiswa = []

# untuk menambahkan data mahasiswa
def tambah_mahasiswa():
    nim = input("Masukkan NIM: ")
    nama = input("Masukkan Nama: ")
    prodi = input("Masukkan Prodi: ")
    fakultas = input("Masukkan Fakultas: ")
    mhs = Mahasiswa(nim, nama, prodi, fakultas)
    daftar_mahasiswa.append(mhs)
    print("Mahasiswa berhasil ditambahkan")

# untuk menampilkan informasi mahasiswa
def tampilkan_mahasiswa():
    for mhs in daftar_mahasiswa:
        print("===============================")
        print("NIM:", mhs.get_nim())
        print("Nama:", mhs.get_nama())
        print("Prodi:", mhs.get_prodi())
        print("Fakultas:", mhs.get_fakultas())
        print("===============================")

# untuk mengupdate data mahasiswa
def update_mahasiswa():
    nim = input("Masukkan NIM Mahasiswa yang akan diupdate: ")
    for mhs in daftar_mahasiswa:
        if mhs.get_nim() == nim:
            nama = input("Masukkan Nama Baru: ")
            prodi = input("Masukkan Prodi Baru: ")
            fakultas = input("Masukkan Fakultas Baru: ")
            mhs.set_nama(nama)
            mhs.set_prodi(prodi)
            mhs.set_fakultas(fakultas)
            print("Data mahasiswa berhasil diupdate")
            return
    print("Mahasiswa dengan NIM", nim, "tidak ditemukan")

# untuk mendelete data mahasiswa
def delete_mahasiswa():
    nim = input("Masukkan NIM Mahasiswa yang akan dihapus: ")
    for mhs in daftar_mahasiswa:
        if mhs.get_nim() == nim:
            daftar_mahasiswa.remove(mhs)
            print("Data mahasiswa berhasil dihapus")
            return
    print("Mahasiswa dengan NIM", nim, "tidak ditemukan")

# pilihan menu yang tersedia
while True:
    print("Pilih Menu:")
    print("1. Tambah Mahasiswa")
    print("2. Tampilkan Mahasiswa")
    print("3. Update Mahasiswa")
    print("4. Delete Mahasiswa")
    print("0. Keluar")
    pilihan = input("Masukkan Pilihan: ")
    
    if pilihan == "1":
        tambah_mahasiswa()
    elif pilihan == "2":
        tampilkan_mahasiswa()
    elif pilihan == "3":
        update_mahasiswa()
    elif pilihan == "4":
        delete_mahasiswa()
    elif pilihan == "0":
        print("Semoga Harimu Menyenagkan Kaka!")
        break
    else:
        print("Menu Tidak Tersedia")
