from team import team

# manual
mu = team("Manchester United", "Inggris", 1878)
mu.addPemain("David De Gea")
mu.addPemain("Cristiano Ronaldo")
mu.addPemain("Paul Pogba")
print(mu.getInfoTeamLengkap())

n = int(input("Input jumlah Team yang akan ditambahkan : "))
daftarTeam = [team() for i in range(n)]\

for i in range(0, n):
    print("-------------------------------")
    print("Input Data Team")
    print("-------------------------------")
    namaTeam = str(input("Input Nama Team: "))
    daftarTeam[i].setNamaTeam(namaTeam)
    negaraAsal = str(input("Input Negara Asal: "))
    daftarTeam[i].setNegaraAsal(negaraAsal)
    tahun_berdiri = str(input("Input Tahun Berdiri: "))
    daftarTeam[i].setTahunBerdiri(tahun_berdiri)
    pelatih = str(input("Input Pelatih: "))
    daftarTeam[i].setPelatih(pelatih)

    jumlahPemain = int(input("Input Jumlah Pemain: "))
    for j in range(0, jumlahPemain):
        pemain = str(input("Input Nama Pemain : "))
        daftarTeam[i].addPemain(pemain)


for i in range(0, n):
    print(daftarTeam[i].getInfoTeamLengkap())
