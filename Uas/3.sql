CREATE DATABASE db_kosmetik;
USE db_kosmetik;

-- ===========================
-- TABEL USER
-- ===========================
CREATE TABLE user (
    id_user INT AUTO_INCREMENT PRIMARY KEY,
    nama VARCHAR(100) NOT NULL,
    username VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(100) NOT NULL,
    level ENUM('Admin','Kasir') NOT NULL
);

-- ===========================
-- TABEL PRODUK
-- ===========================
CREATE TABLE produk (
    id_produk INT AUTO_INCREMENT PRIMARY KEY,
    nama_produk VARCHAR(100) NOT NULL,
    merk VARCHAR(50),
    kategori VARCHAR(50),
    harga DECIMAL(10,2),
    stok INT
);

-- ===========================
-- TABEL PENJUALAN
-- ===========================
CREATE TABLE penjualan (
    id_penjualan INT AUTO_INCREMENT PRIMARY KEY,
    id_produk INT,
    id_user INT,
    tanggal DATE,
    jumlah INT,
    total_harga DECIMAL(12,2),

    CONSTRAINT fk_produk
        FOREIGN KEY(id_produk)
        REFERENCES produk(id_produk)
        ON UPDATE CASCADE
        ON DELETE CASCADE,

    CONSTRAINT fk_user
        FOREIGN KEY(id_user)
        REFERENCES user(id_user)
        ON UPDATE CASCADE
        ON DELETE CASCADE
);