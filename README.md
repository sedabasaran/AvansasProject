# AvansasProject Java Spring MVC Project

# Projede Kullanılan Teknolojiler

- Spring Web MVC 
- Spring Data JPA-Hibernate ORM framework
- Sayfalara erişim yetkisi atamakta ve güvenlik sağlamakta Spring Security(authentication/login/logout)
- Thymeleaf as template engine
- Kullanıcı arayüzü için HTML 5 and Bootstrap 4 
- Unit Test için JUnit 5 and AssertJ
- MySQL database
- Build Tool ve bağımlıkları yönetmek için Maven
- Valida

# Bilgisayara indirilen software programlar
- Java Development Kit (JDK)
- Spring Tool Suite IDE (STS)
- MySQL Community server and MySQL Workbench

-----------------------------
 # Login Ekranı: 
•	Kullanıcı adı ve şifresi ile login işlemi yapılıp, alanların boş olması, kayıtlı olmayan kullanıcı adı , yada şifre hatalı gibi hatalar kullanıcılara görüntülenmektedir, başarılı login işlemi  sonrasında, kullanıcı listeleme ekranına yönlendirme yapılıyor. 

# Kullanıcı Listeleme Ekranı: 
•	Sistemde kayıtlı olan kullanıcıların listelendiği ekrandır.
•	Kullanıcılar tablo görünümünde listelenmektedir. 
•	Kullanıcı satırlarının sonunda güncelle ve sil butonları bulunmaktadır.

# Kayıt Ekranı: 
•	Kullanıcı girişinin yapıldığı ekrandır.
•	Kullanıcı kayıt butonu ile kayıt ekranı açılmaktadır.
•	KullanıcıID, şifresi, adı, soyadı, email adresi, telefon numarası, doğum tarihi alanları bulunmakta ve boş data girişi, mail, telefon numarası, doğum tarihi alanları validasyondan geçirilmiştir. Hatalı girişler hakkında kullanıcıya hata mesajları gösterilir. 
•	Kayıt işlemlerinde kullanıcıID unique olarak oluşturmuştur.

# Güncelleme Ekranı: 
•	Kullanıcı bilgilerinin güncelleneceği ekrandır.
•	Kullanıcıların listelendiği sayfada güncelle butonuna basıldığında yeni bir ekrana yönlendirilir.
•	KullanıcıID dışındaki diğer bilgiler istenirse güncellenebilir, kullanıcı id değiştirilemezdir.
•	Kayıt işlemi sırasında geçerli olan validasyonlar ve bilgilendirmeler bu ekranda da yapılmıştır.

# Silme Ekranı/İşlemi:
•	Kullanıcıların listelendiği tabloda bir butona basılarak kullanıcılar, kullanıcı datası db'den silinir. 

# Projeden Örnek Ekran Resimleri

- ANASAYFA
![Ekran Resmi 2021-07-19 16 02 00](https://user-images.githubusercontent.com/58148544/126168568-aade0125-99e6-4f57-8dd1-04f7338b52e3.png)

- KULLANICI GİRİŞ SAYFASI - Kullanıcı Sayfaya Login Olmadan Kullanıcı Listeleme Ekranına Ulaşamıyor.
![Ekran Resmi 2021-07-19 16 02 17](https://user-images.githubusercontent.com/58148544/126168931-10e92979-51f6-4506-88e2-25b8d4f1f80b.png)

- KULLANICI KAYIT SAYFASI
- ![Ekran Resmi 2021-07-19 16 02 52](https://user-images.githubusercontent.com/58148544/126169097-9958878d-7996-412a-b303-41e2ffb3ffeb.png)

- BAŞARILI KAYIT SAYFASI
- ![Ekran Resmi 2021-07-19 16 05 01](https://user-images.githubusercontent.com/58148544/126169174-c94d0690-5189-4bf6-ba50-67b7153f0f14.png)

- KULLANICI GİRİŞİ YAPANLARIN GÖREBİLECEĞİ KULLANICI LİSTELEME EKRANI![Ekran Resmi 2021-07-19 16 05 18](https://user-images.githubusercontent.com/58148544/126169425-23334e16-7917-474b-b39a-fc553b3f97a3.png)

- KULLANICI GÜNCELLEME SAYFASI
![Ekran Resmi 2021-07-19 16 07 33](https://user-images.githubusercontent.com/58148544/126169552-76a99139-5570-4436-b8c1-5f1af86e14f1.png)

- GÜNCELLENMİŞ KULLANICI LİSTELEME SAYFASI
- ![Ekran Resmi 2021-07-19 16 07 50](https://user-images.githubusercontent.com/58148544/126169642-d92e6296-47d9-4ba3-9255-5182b893b319.png)

- KULLANICI SİLİNDİKTEN SONRA GÖSTERİLEN KULLANICI LİSTELEME SAYFASI![Ekran Resmi 2021-07-19 16 08 23](https://user-images.githubusercontent.com/58148544/126169750-4616eb92-4f8b-49d3-8452-d28d57968f99.png)

- KULLANICI SİLİNDİKTEN SONRA DATABASE SAYFASI! -  Kullanıcıların şifreleri veritabanına BCryptPasswordEncoder kullanarak şifrelenmiştir.
![Ekran Resmi 2021-07-19 16 01 24](https://user-images.githubusercontent.com/58148544/126171342-5641a754-9cf3-4d57-9f08-3d50cbdd106d.png)




