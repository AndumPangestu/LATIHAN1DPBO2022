<?php
include "mahasiswa.php";

$dataMahasiswa1 = new mahasiswa("Andum Pangestu", "Laki-Laki", "Ilmu Komputer", 4);
$dataMahasiswa2 = new mahasiswa("Asep Saeful", "Laki-Laki", "Ilmu Komputer", 4);

$dataMahasiswa3 = new mahasiswa();
$dataMahasiswa3->setNama("Husein");
$dataMahasiswa3->setJenisKelamin("Laki-Laki");
$dataMahasiswa3->setProgramStudi("Ilmu Komputer");
$dataMahasiswa3->setSemester(4);

echo $dataMahasiswa1->getInfoLengkap();
echo $dataMahasiswa2->getInfoLengkap();
echo $dataMahasiswa3->getInfoLengkap();
