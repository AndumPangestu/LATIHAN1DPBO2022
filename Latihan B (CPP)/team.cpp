#include <bits/stdc++.h>

using namespace std;

class team
{
private:
    string namaTeam;
    string negaraAsal;
    string pelatih;
    int tahunBerdiri;
    vector<string> pemain;

public:
    team(string namaTeam, string negaraAsal, string pelatih, int tahunBerdiri)
    {
        this->namaTeam = namaTeam;
        this->negaraAsal = negaraAsal;
        this->pelatih = pelatih;
        this->tahunBerdiri = tahunBerdiri;
    }

    team(string namaTeam, string negaraAsal, int tahunBerdiri, vector<string> pemain)
    {
        this->namaTeam = namaTeam;
        this->negaraAsal = negaraAsal;
        this->tahunBerdiri = tahunBerdiri;
        this->pelatih = pelatih;
        this->pemain = pemain;
    }
    team()
    {
        this->namaTeam = "Nama Team";
        this->negaraAsal = "Negara Asal";
        this->pelatih = "Pelatih";
        this->tahunBerdiri = 0;
    }

    void setNamaTeam(string namaTeam)
    {
        this->namaTeam = namaTeam;
    }

    void setNegaraAsal(string negaraAsal)
    {
        this->negaraAsal = negaraAsal;
    }

    void setTahunBerdiri(int tahunBerdiri)
    {
        this->tahunBerdiri = tahunBerdiri;
    }

    void setPelatih(string Pelatih)
    {
        this->pelatih = pelatih;
    }

    void addPemain(string pemain)
    {
        this->pemain.push_back(pemain);
    }

    void addPemain(vector<string> pemain)
    {
        this->pemain = pemain;
    }

    string getNamaTeam()
    {
        return this->namaTeam;
    }

    string getNegarAsal()
    {
        return this->negaraAsal;
    }

    string getPelatih()
    {
        return this->pelatih;
    }

    int getTahunBerdiri()
    {
        return this->tahunBerdiri;
    }

    string getDaftarPemain()
    {
        string dataPemain = "- Daftar Pemain : \n";
        for (int i = 0; i < this->pemain.size(); i++)
        {
            dataPemain += "  " + to_string(i + 1) + ". " + this->pemain[i] + "\n";
        }

        return dataPemain;
    }

    string getInfoTeamLengkap()
    {
        string dataTeam = "=================================\n";
        dataTeam += "Data Team " + this->namaTeam + '\n';
        dataTeam += "---------------------------------\n";
        dataTeam += "- Nama Team     : " + this->namaTeam + '\n';
        dataTeam += "- Negara Asal   : " + this->negaraAsal + '\n';
        dataTeam += "- Tahun Berdiri : " + to_string(this->tahunBerdiri) + '\n';
        dataTeam += getDaftarPemain();
        dataTeam += "---------------------------------\n";
        dataTeam += "=================================\n";

        return dataTeam;
    }

    ~team(){};
};