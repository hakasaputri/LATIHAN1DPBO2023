<?php 
include "Mahasiswa.php"; //include file class 

$Student1 = new Mahasiswa(); //membuat objek untuk student 1

//instansiasi menggunakan setter dari objek
$Student1->setNama("Sunoo");
$Student1->setNIM("2007695");
$Student1->setProdi("Ilmu Komputer");
$Student1->setFakultas("FPMIPA");

//instansiasi objek student 2 dan 3 dengan menggunakan contructor dari objek
$Student2 = new Mahasiswa("Hakasa Putri", "2007698", "Ilmu Komputer", "FPMIPA");
$Student3 = new Mahasiswa("Haruto", "2007699", "Biologi", "FPMIPA");

//menampilkan informasi mengenai daftar mahasiswa 
$Student1->info_DaftarMahasiswa();
$Student2->info_DaftarMahasiswa();
$Student3->info_DaftarMahasiswa();

?>