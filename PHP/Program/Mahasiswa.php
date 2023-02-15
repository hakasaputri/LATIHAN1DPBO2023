<?php
 
class Mahasiswa{

    //Enkapsulasi private untuk atribut
    private $NIM = "";
    private $Nama = "";
    private $Prodi = "";
    private $Fakultas = "";

    public function __construct($NIM = "", $Nama ="", $Prodi = "", $Fakultas = ""){ //Constructor
        
        $this->NIM = $NIM;
        $this->Nama = $Nama;
        $this->Prodi = $Prodi;
        $this->Fakultas = $Fakultas;
    }

    //prosedur setter 
    public function setNIM($NIM){
        $this->NIM = $NIM;
    }
    public function setNama($Nama){
        $this->Nama = $Nama;
    }
   
    public function setProdi($Prodi){
        $this->Prodi = $Prodi;
    }
    public function setFakultas($Fakultas){
        $this->Fakultas = $Fakultas;
    }

    //fungsi getter
    public function getNIM(){
        return $this->NIM;
    }
    public function getNama(){
        return $this->Nama;
    }
       public function getProdi(){
        return $this->Prodi;
    }
    public function getFakultas(){
        return $this->Fakultas;
    }

    //fungsi untuk menampilkan informasi mahasiswa
    function info_DaftarMahasiswa(){
    

        echo "NIM      : ".$this->NIM."<br/>";
        echo "Nama     : ".$this->Nama."<br/>";
        echo "Prodi    : ".$this->Prodi."<br/>";
        echo "Fakultas : ".$this->Fakultas."<br/>";
        ?>

       <?php
     echo "<br/>";
    }

    function __destruct(){ //Destructor
    }
}
?>