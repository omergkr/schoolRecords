import java.util.*;

public class deneme1 {


    public static void main(String[] args) {
        HashMap<Integer, HashMap<String, Integer>> dersNotlari = new HashMap<>();

        HashMap<String, Integer> dersnot1 = new HashMap<>();

        dersnot1.put("Matematik", 60);
        dersnot1.put("Kimya", 30);
        dersnot1.put("Fizik", 40);

        HashMap<String, Integer> dersnot2 = new HashMap<>();
        dersnot2.put("Matematik", 50);
        dersnot2.put("Kimya", 90);
        dersnot2.put("Fizik", 80);


        HashMap<String, Integer> dersnot3 = new HashMap<>();
        dersnot3.put("Matematik", 30);
        dersnot3.put("Kimya", 50);
        dersnot3.put("Fizik", 70);

        dersNotlari.put(101, dersnot1);
        dersNotlari.put(102, dersnot2);
        dersNotlari.put(103, dersnot3);


        TreeMap<Integer, String> ogrenciler;


        // ogrenciDersNotlari(dersNotlari);
        System.out.println(dersOrtalamasi(dersNotlari, "Matematik"));
        dersOrtalamalari(dersNotlari);

        System.out.println(ogrenciNotOrtalamasi(dersNotlari, 101));

        ogrenciNotOrtalamalari(dersNotlari);

        System.out.println(ogrenciZayifSayisi(dersNotlari, 102));

        ogrenciBasariDurumu(dersNotlari);

    }

    public static double dersOrtalamasi(HashMap<Integer, HashMap<String, Integer>> dersNotlari, String ders) {

        int toplam = 0;
        int count = 0;


        for (Integer ogrno : dersNotlari.keySet()) {
            for (Map.Entry<String, Integer> m : dersNotlari.get(ogrno).entrySet()) {


                if (m.getKey().equals(ders)) {
                    toplam += m.getValue();
                    count++;
                }
            }

        }

        return toplam / count;
    }

    public static void dersOrtalamalari(HashMap<Integer, HashMap<String, Integer>> dersNotlari) {

        HashMap<String, Double> dersort = new HashMap<>();

        for (Map.Entry<Integer, HashMap<String, Integer>> n : dersNotlari.entrySet()) {

            for (Map.Entry<String, Integer> m : n.getValue().entrySet()) {
                dersort.put(m.getKey(), dersOrtalamasi(dersNotlari, m.getKey()));


            }
        }

        for (Map.Entry<String, Double> n : dersort.entrySet())
            System.out.println(n.getKey() + " dersi ortalamasi: " + n.getValue());


    }

    public static double ogrenciNotOrtalamasi(HashMap<Integer, HashMap<String, Integer>> dersNotlari, int ogrenciNo) {


        int toplam = 0;
        int count = 0;

        for (Map.Entry<Integer, HashMap<String, Integer>> n : dersNotlari.entrySet()) {
            if (n.getKey() == ogrenciNo)
                for (Map.Entry<String, Integer> m : n.getValue().entrySet()) {

                    toplam += m.getValue();
                    count++;
                }
        }

        return toplam / count;
    }

    public static void ogrenciNotOrtalamalari(HashMap<Integer, HashMap<String, Integer>> dersNotlari) {
        int i = 0;
        System.out.println("SN\tNo\t\tNot Ortalamasi");
        for (Integer ogrNo : dersNotlari.keySet())
            System.out.printf("%d.\t%d\t\t%.2f%n", ++i, ogrNo, ogrenciNotOrtalamasi(dersNotlari, ogrNo));

    }

    public static int ogrenciZayifSayisi(HashMap<Integer, HashMap<String, Integer>> dersNotlari, int ogrenciNo) {


        int count = 0;
        for (Map.Entry<Integer, HashMap<String, Integer>> n : dersNotlari.entrySet()) {

            HashMap<String, Integer> dersnot = new HashMap<>(n.getValue());

            for (Map.Entry<String, Integer> dersnotlari : dersnot.entrySet()) {
                if (n.getKey().equals(ogrenciNo)) {

                    if (dersnotlari.getValue() < 45)
                        count++;
                }
            }
        }
        return count;
    }


    public static void ogrenciBasariDurumu(HashMap<Integer, HashMap<String, Integer>> dersNotlari) {
        for (Integer ogrNo : dersNotlari.keySet()) {
            System.out.println("OKul no: " + ogrNo + "\tZayif Sayisi:" + ogrenciZayifSayisi(dersNotlari, ogrNo) + "\tNotOrtalaması:" + ogrenciNotOrtalamasi(dersNotlari, ogrNo));
            System.out.println();
        }

    }

    public static void ogrencilerinNotDokumu(HashMap<Integer, HashMap<String, Integer>> dersNotlari, TreeMap<Integer, String> ogrenciler, TreeSet<String> dersler) {


        System.out.print("OKul No\t\tAdi Soyadi\t\t");


        for (Map.Entry<Integer, HashMap<String, Integer>> n : dersNotlari.entrySet()) {

            for (Map.Entry<String, Integer> m : n.getValue().entrySet()) {

                System.out.println(n.getKey() + "\t\t" + ogrenciler.get(n.getKey()) + " " + dersOrtalamasi(dersNotlari, m.getKey()));

            }


        }

    }




}