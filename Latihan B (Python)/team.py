from asyncio.windows_events import NULL


class team():
    __namaTeam = "Nama Team"
    __negaraAsal = "Negara Asal"
    __pelatih = "Pelatih"
    __tahunBerdiri = 0
    __Pemain = []

    def __init__(self, namaTeam="Nama Team", negaraAsal="Negara Asal", tahunBerdiri=0):
        self.__namaTeam = namaTeam
        self.__negaraAsal = negaraAsal
        self.__tahunBerdiri = tahunBerdiri

    def setNamaTeam(self, namaTeam):
        self.__namaTeam = namaTeam

    def setNegaraAsal(self, negaraAsal):
        self.__negaraAsal = negaraAsal

    def setTahunBerdiri(self, tahunBerdiri):
        self.__tahunBerdiri = tahunBerdiri

    def setPelatih(self, pelatih):
        self.__pelatih = pelatih

    def addPemain(self, pemain):
        self.__Pemain.append(pemain)

    def getNamaTeam(self):
        return self.__namaTeam

    def getNegaraAsal(self):
        return self.__negaraAsal

    def getTahunBerdiri(self):
        return self.__tahunBerdiri

    def getPelatih(self):
        return self.__pelatih

    def getDaftarPemain(self):

        daftarPemain = "Daftar Pemain : \n"
        if (len(self.__Pemain) > 0):

            for p in self.__Pemain:
                daftarPemain += "- " + p + '\n'

        else:
            daftarPemain += "Belum ada data pemain \n"

        return daftarPemain

    def getInfoTeamLengkap(self):

        dataTeam = "=================================\n"
        dataTeam += "Data Team " + self.__namaTeam + '\n'
        dataTeam += "---------------------------------\n"
        dataTeam += "- Nama Team     : " + self.__namaTeam + '\n'
        dataTeam += "- Negara Asal   : " + self.__negaraAsal + '\n'
        dataTeam += "- Tahun Berdiri : " + str(self.__tahunBerdiri) + '\n'
        dataTeam += "- Daftar Pemain : \n"
        if (len(self.__Pemain) > 0):
            i = 1
            for p in self.__Pemain:
                dataTeam += "  " + str(i) + ". " + p + '\n'
                i += 1

        else:
            dataTeam += "Belum ada data pemain \n"
        dataTeam += "---------------------------------\n"
        dataTeam += "=================================\n"

        return dataTeam
