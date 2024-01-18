public class OgrenciKrediManager extends BaseKrediManager{

    // base'deki hesapla ile imzası aynı ama içeriği farklı
    //diğer hesaplayı eziyoruz.
    public double hesapla(double tutar){
        return tutar*1.10;
    }
}
