fun main() {
    println("================================")
    println("       AGENDA TUGAS SISWA")
    println("================================")
    println("1. Lihat daftar tugas")
    println("2. Tambah tugas")
    println("3. Keluar")
    println("================================")
    print("Pilih menu: ")

    val pilihan = readLine()

    if (pilihan == null || pilihan !in listOf("1", "2", "3")) {
        println("Pilihan tidak valid! Silakan pilih 1, 2, atau 3.")
        return
    }

    when (pilihan) {
        "1" -> println("Menampilkan daftar tugas...")
        "2" -> println("Menu tambah tugas...")
        "3" -> println("Terima kasih!")
    }
}