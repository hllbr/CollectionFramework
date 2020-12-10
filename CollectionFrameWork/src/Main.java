
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();//ArrayList yapı olarak Generic yapıdadır Integer ,Double, String ... Ogrenci,doctor .... gibi yapılara müsade eder.
        //abstract yapılara müsade eden bir yapı içermektedir ..
        List<String> list = new ArrayList<String>();
        list.add("Java");
        list.add("Python");
        list.add("C++");
        //arraylist için 0. index java 1.index Python 2. index C++
        System.out.println(list.get(0));
        System.out.println("**************************************************");
        for(String s: list){
            System.out.println(s);
        }
        System.out.println("**************************************************");
        for(int i = 0;i<list.size();i++){
            System.out.println(i+" .ci/ci eleman :"+list.get(i));
        }
        System.out.println("**************************************************");
        list.remove(0);
        for(String s: list){
            System.out.println(s);
        }
        System.out.println("**************************************************");
        list.remove(0);
        for(String s: list){
            System.out.println(s);
        }
        list.remove(0);
        System.out.println("**************************************************");
        System.out.println("liste tamamen boş.");
       // System.out.println(list.get(0));
        
    }
    
    /*
    Kaynak Mustafa Murat Coşkun-ileri seviye java kursu -udemy referans alnımıştır.
    Java Collection Framework = 
    Framework = Yazılım geliştiricilerinin kullandığı önceden yazırlanmış Kütüphanelerin bulunduğu ve bunlara yenilerini ekleyebileceği yapıların adıdır.
    Gelişmiş fremaworklerde form kontrolü ,veri tabanı bağlantısı,kullanıcı giriş,cıkışı,mail atma,tema motoru gibi kütüphaneler mevcuttur.
    Ayrıca bu kütüphaneler kendi içinde bir çok somut sınıf(Concrete Class),soyut sınıf(Abstract Class),Interface ve metod barındırır.
    
    ***********
    *********
    Collecktion Framework nedir ? 
    Benzer verileri grup halinde yuymak ve onlar üzerinde işlemler yapmak yazılım geliştirirken bizim sıkça karşılaştığımız problemlerdendir.
    Örnek : Çok sayıda tamsayıyı sıralamak
    Collection Framework bu gibi problemleri ve işlemleri kolayca yapmamızı sağlayan ,içinde bir çok somut,soyut sınıf,interface,metod bulunduran Java geliştiricileri tarafından tasarlanmış bir framewroktur.
    ***********
    *********
    Collection Objesi ne anlama geliyor ? 
    Collection Objesi içinde başka objeler barındıran bir objedir ve Collection Frameworkte bulunan Collection bir interface olup içinde benzer türden objeleri liste halinde ,sıralı halde ve benzersiz olacak şekilde barındıracak objelerin temel metodları(add,addAll,remove,clear) belirler.
     ***********
    *********
    Collection Framework Özellikeri = 
    Collection Framework içinde bir çok interface ve class bulundurur.
    verilerin liste halinde tutulması için list inteface'i,kuyruk halinde tutulması için Queue interface'i,
    Benzersiz tutulması için Set interface'i bulunur.
    Bu 3 İnterfacede Collection Interfaceden türerler
    Ancak Map İnterface'i Collection Interfaceleri ile bağlantılı olmamasına rağmen Collection Framewrok'ün içinde bulunan kullanışlı bir interfacetir.
    Bu interface'i uygulayan veya implemente eden somut sınıflar ile bu framework tamamlanır.(Örnek = ArrayList,LinkedList vs...) 
    */
}
