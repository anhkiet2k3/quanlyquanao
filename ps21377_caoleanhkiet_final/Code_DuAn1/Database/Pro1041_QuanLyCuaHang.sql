USE master

DROP DATABASE Pro1041_QuanLyCuaHang
CREATE DATABASE Pro1041_QuanLyCuaHang 

USE Pro1041_QuanLyCuaHang 

CREATE TABLE NHACUNGCAP(
	IDNCC varchar(5) primary key,
	TenNCC nvarchar(50) not null,
	SDT varchar(15) not null,
	DiaChi nvarchar(50) 
)

CREATE TABLE DANHMUC(
	IDDanhMuc int identity(1,1) primary key,
	TenDanhMuc nvarchar(15)
)

CREATE TABLE CHATLIEU(
	IDChatLieu int identity(1,1) primary key,
	TenChatLieu nvarchar(15)
)

CREATE TABLE SIZE(
	IDSize int identity(1,1) primary key,
	TenSize nvarchar(15)
)

CREATE TABLE COLOR(
	IDColor int identity(1,1) primary key,
	TenColor nvarchar(15)
)

CREATE TABLE SANPHAM(
	IDSanPham varchar(5) primary key,
	TenSanPham nvarchar(50) not null,
	IDNCC varchar(5) not null,
	IDDanhMuc int not null,
	MoTa nvarchar(50),
	FOREIGN KEY (IDNCC) REFERENCES NHACUNGCAP(IDNCC),
	FOREIGN KEY (IDDanhMuc) REFERENCES DANHMUC(IDDanhMuc)
)

CREATE TABLE CHITIETSANPHAM(
	IDCTSanPham varchar(5) primary key,
	IDSanPham varchar(5) not null,
	TenCTSP nvarchar(50) not null,
	IDSize int not null,
	IDColor int not null,
	IDChatLieu int not null,
	SoLuong int,
	Gia money,
	TrangThai bit,
	FOREIGN KEY (IDSanPham) REFERENCES SANPHAM(IDSanPham),
	FOREIGN KEY (IDSize) REFERENCES SIZE(IDSize),
	FOREIGN KEY (IDColor) REFERENCES COLOR(IDColor),
	FOREIGN KEY (IDChatLieu) REFERENCES CHATLIEU(IDChatLieu)
)


CREATE TABLE [USER](
	IDUSer varchar(5) primary key,
	Ten nvarchar(50) not null,
	SDT varchar(15) not null,
	GioiTinh bit,
	NgaySinh date, 
	Email varchar(50),
	DiaChi nvarchar(100),
	Luong money,
	VaiTro bit not null,
	TrangThai bit,
)

CREATE TABLE ACCOUNT(
	IDUser varchar(5) primary key,
	UserName varchar(50),
	PassWord varchar(50)
	FOREIGN KEY (IDUser) REFERENCES [USER](IDUser)
)


CREATE TABLE KHACHHANG(
	IDKhachHang varchar(5) primary key,
	TenKhachHang nvarchar(50) not null,
	GioiTinh bit,
	DiaChi nvarchar(100),
	SDT varchar(15) not null	
)

CREATE TABLE VOUCHER(
	IDVoucher varchar(5) primary key,
	TenVoucher nvarchar(50) not null, 
	GiaTri double precision,
	NgayBatDau date, 
	NgayKetThuc date,
	SoLuong int
)

CREATE TABLE HOADON(
	IDHoaDon int identity(1,1) primary key,
	IDUser varchar(5),
	IDKhachHang varchar(5),
	NgayTao date default getdate(), 
	TongTien money, 
	IDVoucher varchar(5),
	TrangThaiThanhToan bit,
	FOREIGN KEY (IDUser) REFERENCES [USER](IDUser),
	FOREIGN KEY (IDKhachHang) REFERENCES KHACHHANG(IDKhachHang),
	FOREIGN KEY (IDVoucher) REFERENCES VOUCHER(IDVoucher)
)

CREATE TABLE CHITIETHOADON(
	IDHoaDon int,
	IDCTSanPham varchar(5) ,
	SoLuong int,
	Gia money,
	FOREIGN KEY (IDHoaDon) REFERENCES HOADON(IDHoaDon),
	FOREIGN KEY (IDCTSanPham) REFERENCES CHITIETSANPHAM(IDCTSanPham)
)

GO
CREATE TRIGGER Trg_ThemNV on [USER]
after insert as
begin
	insert into ACCOUNT
		values((select IDUSer from inserted),null,null)
end
GO

GO
CREATE TRIGGER Trg_Xoa_User on [USER]
instead of delete as 
begin
	delete from Account where idUser in (select idUser from deleted)
	delete from [USER] where IDUSer in (select idUser from deleted)	
	
end
GO

INSERT INTO [USER] VALUES
	('NV003', N'Gia Thái Bảo', '0333344444', 0,'2003-08-21','bao@gmail.com','quan tân bình',0,0,0)

INSERT INTO DANHMUC(TenDanhMuc) VALUES
	(N'ÁO'),
	(N'Quần')

INSERT INTO CHATLIEU(TenChatLieu) VALUES
	(N'Vải Cotton'),
	(N'Vải Kaki')

INSERT INTO SIZE(TenSize) VALUES
	(N'M'),
	(N'L')

INSERT INTO COLOR(TenColor) VALUES
	(N'Xanh'),
	(N'Đỏ')

INSERT INTO NHACUNGCAP(IDNCC,TenNCC, SDT, DiaChi) VALUES
	('ncc01','Cong ty x', '981124', 'quan 12, tphcm')

INSERT INTO SANPHAM VALUES
	('sp001',N'Áo thun','ncc01','1','o')

INSERT INTO CHITIETSANPHAM VALUES
	('ct002','sp001', N'Áo thun thể thao','1','1','1',10,100000,0)

select * from DANHMUC
select * from COLOR
select * from CHATLIEU
select * from NHACUNGCAP

delete from danhmuc where TenDanhMuc=N'Quần'



INSERT INTO CHITIETSANPHAM VALUES
	('ct003','sp002', N'Quần thun thể thao','2','1','2',10,200000,1)
	
INSERT INTO [USER] VALUES
	('NV003',N'Nguyen Minh Tri','0129478',0,'2003-11-26','tri@gmail.com','quan 12, tphcm',0,0,0)


UPDATE ACCOUNT SET UserName='bao01', PassWord='1234' WHERE IDUser='NV003'


INSERT INTO dbo.[User]
	(IDUSer, Ten, SDT, GioiTinh, NgaySinh, Email ,DiaChi, Luong, VaiTro, TrangThai )
VALUES
	('NV001',N'Nguyễn Văn Đức',  '0332429178',1, '2002-09-25', 'ducnvph14435@gmail.com',  N'Hà Nội', 9000000,0,	1 )

INSERT INTO [USER](IDUser, Ten, SDT, GioiTinh, NgaySinh, Email, DiaChi, Luong, VaiTro, TrangThai) VALUES
('NV004','Nguyễn Minh Trí','0912840',0,'12/12/2003','tri@gmail.com','quan 12',1,1,1)

SELECT * FROM [USER]
SELECT * FROM ACCOUNT
SELECT * FROM VOUCHER
SELECT * FROM HOADON

INSERT INTO KHACHHANG VALUES
	('kh003','Nguyen minh',1,'quan 12','01293283')

INSERT INTO VOUCHER VALUES
	('vc001','Khuyen mai thang 12',20,'1/12/2022','3/12/2022',50)

INSERT INTO HOADON(IDUser, IDKhachHang, NgayTao, TongTien, IDVoucher, TrangThaiThanhToan) VALUES
	(null,null,null,null,null,0)


SELECT * FROM HoaDon WHERE TrangThaiThanhToan=0

select * from hoadon

UPDATE [USER] SET Ten='Nguyen Minh', SDT='019283842', GioiTinh=1, NgaySinh=2000-11-11, Email='tri@yaa.com', DiaChi='quan12, tphcm', Luong=0, VaiTro=1, TrangThai=1 
WHERE IDUser= (?,?,?,?,?,?,?,?,?,?)

delete from HOADON where IDHoaDon=30
go
create proc sp_doanhthubanhang
as
begin
	select HOADON.NgayTao ngay,
	[USER].Ten ten,
	sum(HOADON.TongTien) as tien
	from HOADON 
	inner join [USER] on [USER].IDUSer=HOADON.IDUser
	group by HOADON.NgayTao,[USER].Ten
end