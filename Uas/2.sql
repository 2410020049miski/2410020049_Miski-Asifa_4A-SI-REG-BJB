#DROP TABLE tbl_peserta;
#CREATE DATABASE quiz_2410020049;
#USE DATABASE quiz_2410020049;
#CREATE TABLE tbl_program(
#id_program VARCHAR (15) PRIMARY key,
#nama_program VARCHAR (15) NOT NULL,
#tarif_per_sesi INT NOT NULL);


CREATE TABLE  tbl_peserta (
id_peserta varchar (15) not null,
nama_peserta varchar (100) not null,
id_program varchar (15) not null,
jumlah_sesi int,
total_bayar int,
primary key (id_peserta),
foreign key (id_program) references tbl_program (id_program));

