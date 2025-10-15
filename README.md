# SISTEM PEMESANAN KAMAR HOTEL
Hotel ingin membuat sistem untuk mengelola pemesanan kamar oleh tamu dengan berbagai tipe kamar.
## Anggota Kelompok
1. Ahmad Najib Ramadhan	(G1A025022)
2. M. Daffa  Atallah Putra	(G1A025044)
3. Aurel Clara Belinda Putri	(G1A025070)
4. Fidel Castro Praja Pratma	(G1A025102)
## Daftar isi
1. [Overview Sistem](#overview-sistem)
2. [Tools dan Teknologi](#tools-dan-teknologi)
3. [Fitur Sistem](#fitur-sistem)
4. [Struktur Program](#struktur-program)
5. [Cara Menjalankan Program](#cara-menjalankan-program)
## Overview Sistem
Program ini merupakan simulasi sederhana untuk mengelola pemesanan kamar hotel menggunakan konsep Pemrograman Berorientasi Objek (OOP) di Java. Sistem ini terdiri dari empat kelas utama: Kamar, Tamu, Hotel, dan Main. 
1. Class Kamar :
   Menyimpan informasi tentang kamar hotel, seperti nomor kamar, tipe kamar, harga per malam, dan status ketersediaan.
2. Class Tamu :
   Menyimpan data tamu seperti nama dan durasi menginap dalam malam. Memiliki constructor serta getter dan setter untuk mengakses atau mengubah data tamu.
3. Class Hotel :
  Menyimpan daftar semua kamar dalam bentuk ArrayList. Untuk mencari kamar berdasarkan tipe (Standar, Deluxe, Suite). Menghitung total biaya menginap berdasarkan durasi dan harga kamar per malam.
4. Main :
   Berfungsi sebagai pusat eksekusi program. Menggunakan Scanner agar pengguna dapat menginput data sendiri, seperti nama tamu, durasi menginap, dan pilihan tipe kamar (1 untuk Standar, 2 untuk Deluxe, 3 untuk Suite). Setelah pemesanan berhasil, program menampilkan total harga yang harus dibayar dan daftar kamar yang sudah dipesan maupun yang masih kosong.
### Fungsi Utama Program
1. Menampilkan daftar kamar hotel dengan tipe dan harga berbeda.
2. Memungkinkan pengguna memilih tipe kamar menggunakan angka (1–3).
3. Menghitung total biaya secara otomatis setelah pemesanan.
4. Menunjukkan status kamar (kosong / sudah dipesan).
## Tools dan Teknologi
- Visual Studio Code
- Java JDK 21
- Terminal
## Fitur Sistem
- Mengelola Data Kamar Hote
- Mencatat Data Tamu
- Melakukan Pemesanan Kamar
- Menghitung Total Biaya Menginap
- Menampilkan Daftar Kamar dan Statusnya 
## Struktur Program
src/
├── Kamar.java → Class untuk menyimpan data kamar (nomor, tipe, harga, status)
├── Tamu.java → Class untuk menyimpan data tamu (nama, durasi menginap)
├── Hotel.java → Class untuk mengelola daftar kamar dan menghitung total biaya
└── Main.java → Class utama, berisi logika input, pemesanan, dan output hasil

## Deskripsi Class

### 1. Class `Kamar`
- **Atribut:**  
  `nomorKamar (int)`, `tipeKamar (String)`, `hargaPerMalam (double)`, `status (boolean)`  
- **Method:**  
  - `pesanKamar()` → Mengubah status kamar menjadi *dipesan*  
  - `kosongkanKamar()` → Mengubah status kamar menjadi *kosong*  

### 2. Class `Tamu`
- **Atribut:**  
  `nama (String)`, `durasiMenginap (int)`  
- **Method:**  
  - Constructor, getter, dan setter untuk mengatur data tamu  

### 3. Class `Hotel`
- **Atribut:**  
  `ArrayList<Kamar> daftarKamar`  
- **Method:**  
  - `cariKamarKosong(String tipe)` → Mencari kamar kosong berdasarkan tipe  
  - `hitungTotalBayar(Tamu t, Kamar k)` → Menghitung total biaya = durasi × harga  

### 4. Class `Main`
- Menggunakan **Scanner** untuk input data tamu dan tipe kamar (1=Standar, 2=Deluxe, 3=Suite)  
- Menampilkan **total harga** setelah pemesanan berhasil  
- Menunjukkan daftar kamar yang **sudah dipesan** dan **masih kosong**

## Cara Menjalankan Program

