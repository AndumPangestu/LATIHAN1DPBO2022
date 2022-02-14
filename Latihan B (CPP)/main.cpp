#include <bits/stdc++.h>
#include "team.cpp"

using namespace std;

int main()
{

    team mu("Manchester United", "Inggris", "Ralf Rangnick", 1878);
    mu.addPemain("David De Gea");
    mu.addPemain("Cristiano Ronaldo");
    mu.addPemain("Paul Pogba");

    cout << mu.getInfoTeamLengkap();

    vector<team> daftarTeam;
    string temp, namaTeam, negarAsal, pelatih, addplayer, pemain;
    int tahunBerdiri, jumlahPemain;

    while (temp != "no")
    {
        cout << "Menambahkan Team Baru? (yes:no)\n";
        cin >> temp;
        if (temp == "yes")
        {
            cout << "Input Nama Team : \n";
            cin >> namaTeam;
            cout << "Input Negara Asal Team : \n";
            cin >> negarAsal;
            cout << "Input Nama Pelatih Team : \n";
            cin >> pelatih;
            cout << "Input Tahun Berdiri Team : \n";
            cin >> tahunBerdiri;
            daftarTeam.push_back(team(namaTeam, negarAsal, pelatih, tahunBerdiri));
            cout << "Menambahkan Pemain Baru? (yes:no)\n";
            cin >> addplayer;
            if (addplayer == "yes")
            {
                cout << "Input Jumlah Pemain yang akan ditambahkan : ";
                cin >> jumlahPemain;
                while (jumlahPemain--)
                {
                    cout << "Input Nama Pemain : \n";
                    cin >> pemain;
                    daftarTeam[daftarTeam.size() - 1].addPemain(pemain);
                }
            }
        }
        else if (temp != "no")
        {
            cout << "Mohon Maaf Jawaban yang Anda Masukan Salah\n";
        }
    }

    for (auto t : daftarTeam)
    {

        cout << t.getInfoTeamLengkap() << "\n";
    }

    return 0;
}
