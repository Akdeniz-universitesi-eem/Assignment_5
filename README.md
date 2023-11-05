# Homework - 5
###### Sinan Demir - 20200805054
### First Question
###### UML nedir? 
- UML, bir sistemin tasarımını görselleştirmek için yazılım mühendisliği alanında genel amaçlı modelleme dilidir.
Farklı amaçlar için kategorilere ayrılmış olsa da, genel itibariyle modelleme için kullanılır.
UML, karmaşık yazılım sistemlerini daha anlaşılır ve yönetilebilir hale getirmek için kullanılır.
Bir nevi yapacağımız işleri önceden planlayıp bir yol haritası çizmeye benzetebiliriz.
Bu da yazılım projelerinin daha etkili bir şekilde planlanmasına ve yönetilmesine yardımcı olur.
###### En yaygın kullanılan UML nedir?
- Sınıf Diyagramları (Class Diagrams) : Yazılım geliştirmede en sık kullanılan tür olan bu diyagram bir sistemin mantıksal ve fiziksel tasarımını anlatmak için kullanılır. 
Sınıflar kutularla temsil edildiğinden bir akış çizelgesine benzer. 
Bu diyagram farklı sınıfların ve sınıflar arasındaki ilişkilerin bir görselini sunar. 

Her sınıf üç bölmeden oluşur:
1) Üst bölüm: sınıf adı
2) Orta bölüm: sınıf öznitelikleri
3) Alt bölüm: sınıf yöntemleri veya işlemleri 

### Second Question
###### ArrayList ve LinkedList farkı
- ArrayListlerde ulaşmak istediğimiz elemana indisini girerek ulaşırız. Linked List’lerde ise ulaşmak istediğimiz elemanlara point eden pointerlar vasıtasıyla ulaşırız.
- ArrayListlerde eleman ekleme, silme gibi işlemler Linked List’lere göre performans açısından daha Maliyetlidir. Örneğin; 1000 elemanlı bir dizimiz tanımlı olsun. Bu dizinin 500.cü elemanını silmek istediğimizde, 
bu elemandan sonra gelen her eleman bir sıra geri kaydırılacak bu da performans kaybına yol açacaktır. 
Linked List’te ise bu işlem sadece basit pointer kodları ile gerçekleştirilir ve kaydırma işlemlerine gerek kalmaz. Bu sayede performanstan kazanç sağlanmaktadır.
- Linked List’lerde random bir veriye ulaşım ArrayListlere göre maliyetlidir. ArrayListlerde dilediğimiz elemana indisini girerek ulaşabiliyorken, Linked List’lerde ise pointerlar aracılığı ile liste üzerinde gezinmemiz gerekir. 
Bu da performans kaybına yol açar. (Yani bir ArrayListte 750. elemana ulaşmak istediğimizde indisi girerek direkt ulaşabilirken, Linked List’lerde bu elemana ulaşmak için listenin en başından 750. elemana kadar gezinmemiz gerekir.)
- Linked List’ler, sadece veriyi değil veri ile birlikte bir sonraki düğüme işaret eden pointerları da tuttuğumuz için ArrayListlere göre hafızada daha fazla yer kaplar.
###### ArrayList, LinkedList Kullanım Amaçları
- ArrayList : Sıralı verilerin depolanması ve hızlı erişimin gerektiği durumlar için uygundur.Verilerin genellikle okunduğu ve nadiren eklendiği veya çıkarıldığı senaryolarda tercih edilir.
- Linked List: Verilere sürekli ekleme veya çıkarma işlemleri gerektiren senaryolarda tercih edilir.
  Verilerin sık sık yeniden düzenlendiği veya bir elemanın diğer elemanlar arasında sürekli olarak taşındığı senaryolarda kullanılır.
###### HashMap ve HastSet Farkı
- HashSet, sadece elemanları (değerleri) depolayan bir veri yapısıdır. HashMap ise anahtar-değer çiftlerini depolayan bir veri yapısıdır. Her anahtar, bir değerle eşlenir ve bu çiftler birlikte depolanır.
- HashSette elemanlar sırasızdır ve her eleman yalnızca bir kez depolanabilir. Bu nedenle, tekrar eden elemanlar otomatik olarak temizlenir.
HashMapte ise elemanlar tekrar edebilir ama bu değerlerin anahtarları aynı değerde olamaz. Aslında bunu biraz Fonksiyon olma şartına benzetebiliriz.
Anahtarlarımız sadece o değere özgü olmalıdır ve aynı anda iki değeri yada veriyi temsil edemez. Aslında LinkedListe benziyor diyebiliriz.
###### HashMap ve HastSet Kullanım Amaçları
- HashMap anahtar - değer eşlemesi gereken verileri depolamak ve hızlı erişim sağlamak için kullanılır.
  Özellikle büyük veri setlerinin işlendiği uygulamalarda verilere hızlı erişim sağlar.
Örneğin bir öğrenci verilerinin girdisini oluşturmak istediğinizde, her öğrenci için bir öğrenci kimlik numarası kullanarak HashMap kullanabiliriz. Bu sayede kimlik numarası anahtar olarak kullanılır ve ilgili öğrenci bilgileri değer olarak saklanır.
- HastSet ,tekrarlayan elemanları temizlemek veya yalnızca benzersiz elemanları saklamak istediğiniz durumlar için idealdir.
  Genel olarak, elemanların sırasının veya özel bir anahtar-değer ilişkisinin gerekli olmadığı basit durumlar için uygundur.
Örneğin bir kitap listesinde her kitabın yalnızca bir kez bulunmasını sağlamak için HashSet kullanabilirsiniz.
