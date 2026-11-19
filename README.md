# Agenda Tugas Siswa

## Deskripsi
Agenda Tugas Siswa adalah aplikasi berbasis Kotlin Console yang digunakan untuk membantu siswa mencatat dan mengelola tugas sekolah.

## Fitur Utama
- Menambahkan tugas.
- Menampilkan daftar tugas.
- Mencari tugas berdasarkan ID.
- Mengubah status tugas.
- Menghapus tugas.
- Menyimpan dan memuat data menggunakan file.

## Teknologi
- Bahasa pemrograman Kotlin.
- IntelliJ IDEA.
- Git dan GitHub.

## Struktur Proyek
- `Main.kt`: Menjalankan menu utama aplikasi.
- `model.kt`: Menyimpan struktur data tugas.
- `TugasSercvice.kt`: Mengelola fitur tugas.
- `penyimpanan.kt`: Mengatur penyimpanan dan pembacaan data.
- `tugas.txt`: Menyimpan data tugas.

## Cara Menjalankan
1. Buka proyek menggunakan IntelliJ IDEA.
2. Buka file `Main.kt`.
3. Jalankan fungsi `main()`.
4. Pilih menu sesuai kebutuhan.

## Validasi
Aplikasi memeriksa input kosong, ID duplikat, ID yang tidak ditemukan, dan pilihan menu yang tidak valid.

## Penyimpanan Data
Data tugas disimpan dalam file `tugas.txt` agar dapat dimuat kembali ketika aplikasi dijalankan.

## Keterbatasan
Aplikasi masih menggunakan antarmuka Kotlin Console dan belum menggunakan database.
