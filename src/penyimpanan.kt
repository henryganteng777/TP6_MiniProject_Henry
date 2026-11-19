import java.io.File

class Penyimpanan {

    private val file = File("tugas.txt")

    fun muat(): MutableList<Tugas> {
        val daftar = mutableListOf<Tugas>()

        if (!file.exists()) {
            return daftar
        }

        file.forEachLine { baris ->
            val data = baris.split(";")

            if (data.size == 3) {
                val id = data[0]
                val judul = data[1]
                val selesai = data[2].toBooleanStrictOrNull()

                if (id.isNotBlank() && judul.isNotBlank() && selesai != null) {
                    daftar.add(Tugas(id, judul, selesai))
                }
            }
        }

        return daftar
    }

    fun simpan(daftar: List<Tugas>) {
        file.writeText(
            daftar.joinToString("\n") {
                "${it.id};${it.judul};${it.selesai}"
            }
        )

        println("Data tugas berhasil disimpan!")
    }
}