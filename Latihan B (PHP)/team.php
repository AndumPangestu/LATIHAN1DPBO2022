<?php

class team
{
    private $namaTeam,
        $negaraAsal,
        $tahunBerdiri,
        $pemain = [];

    public function __construct($namaTeam = "nama team", $negaraAsal = "negara Asal", $tahunBerdiri = 0)
    {
        $this->namaTeam = $namaTeam;
        $this->negaraAsal = $negaraAsal;
        $this->tahunBerdiri = $tahunBerdiri;
    }

    public function setNamaTeam($namaTeam)
    {
        $this->namaTeam = $namaTeam;
    }

    public function setNegaraAsal($negaraAsal)
    {
        $this->negaraAsal = $negaraAsal;
    }

    public function setTahunBerdiri($tahunBerdiri)
    {
        $this->tahunBerdiri = $tahunBerdiri;
    }

    public function getNamaTeam()
    {
        return $this->namaTeam;
    }

    public function getNegaraAsal()
    {
        return $this->negaraAsal;
    }

    public function getTahunBerdiri()
    {
        return $this->tahunBerdiri;
    }

    public function addPemain($pemain)
    {
        $this->pemain[] = $pemain;
    }

    public function getDaftarPemain()
    {
        $daftarPemain  = "Daftar Pemain : <br>";
        foreach ($this->pemain as $p) {
            $daftarPemain .=  "- {$p} <br>";
        }

        return $daftarPemain;
    }

    public function getInfoTeamLengkap()
    {
        $dataTeam  = "=================================<br>";
        $dataTeam .= "Data Team   {$this->namaTeam} <br>";
        $dataTeam .= "---------------------------------<br>";
        $dataTeam .= "- Nama Team     : {$this->namaTeam} <br>";
        $dataTeam .= "- Negara Asal   : {$this->negaraAsal} <br>";
        $dataTeam .= "- Tahun Bediri  : {$this->tahunBerdiri} <br>";
        $dataTeam .= "---------------------------------<br>";
        $dataTeam .= "Daftar Pemain : <br>";
        foreach ($this->pemain as $p) {
            $dataTeam .= "- {$p} <br>";
        }
        $dataTeam .= "---------------------------------<br>";
        $dataTeam .= "=================================<br>";

        return $dataTeam;
    }
}