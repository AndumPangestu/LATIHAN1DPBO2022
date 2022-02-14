<?php

class mahasiswa
{
    private $nim,
        $nama,
        $jenisKelamin,
        $programStudi,
        $semester;

    private static $number = 1;

    public function __construct($nama = "Nama Belum dimasukan", $jenisKelamin = "jenis kelamin  Belum dimasukan", $programStudi = "program studi Belum dimasukan", $semester = "Semester Belum dimasukan")
    {

        $year = date('Y');
        $this->nim = $year;
        if (self::$number < 10) {
            $this->nim .= '0';
        }
        $this->nim .= self::$number++;

        $this->nama = $nama;
        $this->jenisKelamin = $jenisKelamin;
        $this->programStudi = $programStudi;
        $this->semester = $semester;
    }

    public function setNama($nama)
    {
        $this->nama = $nama;
    }

    public function setJenisKelamin($jenisKelamin)
    {
        $this->jenisKelamin = $jenisKelamin;
    }

    public function setProgramStudi($programStudi)
    {
        $this->programStudi = $programStudi;
    }

    public function setSemester($semester)
    {
        $this->semester = $semester;
    }

    public function getNama()
    {
        return $this->nama;
    }

    public function getJenisKelamin()
    {
        return $this->jenisKelamin;
    }

    public function getProgramStudi()
    {
        return $this->programStudi;
    }

    public function getSemester()
    {
        return $this->semester;
    }

    public function getInfoLengkap()
    {
        $dataMahasiswa = "NIM : {$this->nim}<br>Nama : {$this->nama}<br>Jenis Kelamin : {$this->jenisKelamin}<br>Program Studi : {$this->programStudi}<br>Semester : {$this->semester}<br>";
        return $dataMahasiswa;
    }
}