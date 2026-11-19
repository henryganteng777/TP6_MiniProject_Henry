fun main() {
    val penyimpanan = Penyimpanan()
    val daftarTugas = penyimpanan.muat()
    val service = TugasService(daftarTugas)

    while (true) {
        println("\n================================")
        println("       AGENDA TUGAS SISWA")
        println("================================")
        println("1. Tambah tugas")
        println("2. Lihat daftar tugas")
        println("3. Cari tugas")
        println("4. Ubah status tugas")
        println("5. Hapus tugas")
        println("6. Simpan data")
        println("0. Keluar")
        println("================================")
        print("Pilih menu: ")

        when (readLine()?.trim()) {

            "1" -> {
                print("Masukkan ID tugas: ")
                val id = readLine() ?: ""

                print("Masukkan judul tugas: ")
                val judul = readLine() ?: ""

                if (service.tambah(id, judul)) {
                    println("Tugas berhasil ditambahkan!")
                } else {
                    println("Gagal! ID atau judul kosong, atau ID sudah digunakan.")
                }
            }

            "2" -> {
                println("\nDAFTAR TUGAS")
                service.tampilkan()
            }

            "3" -> {
                print("Masukkan ID tugas yang dicari: ")
                val id = readLine() ?: ""

                val tugas = service.cari(id)

                if (tugas != null) {
                    println("ID: ${tugas.id}")
                    println("Judul: ${tugas.judul}")
                    println("Status: ${if (tugas.selesai) "Selesai" else "Belum selesai"}")
                } else {
                    println("Tugas tidak ditemukan!")
                }
            }

            "4" -> {
                print("Masukkan ID tugas: ")
                val id = readLine() ?: ""

                if (service.ubahStatus(id)) {
                    println("Status tugas berhasil diubah!")
                } else {
                    println("Tugas tidak ditemukan!")
                }
            }

            "5" -> {
                print("Masukkan ID tugas yang ingin dihapus: ")
                val id = readLine() ?: ""

                if (service.hapus(id)) {
                    println("Tugas berhasil dihapus!")
                } else {
                    println("Tugas tidak ditemukan!")
                }
            }

            "6" -> {
                penyimpanan.simpan(daftarTugas)
            }

            "0" -> {
                penyimpanan.simpan(daftarTugas)
                println("Terima kasih telah menggunakan aplikasi!")
                break
            }

            else -> {
                println("Pilihan tidak valid! Silakan coba lagi.")
            }
        }
    }
}