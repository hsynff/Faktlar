package com.example.aze.funfacts;


import java.util.Random;

public class FactGenerator {
    int z=0, i=0;
   private String[] fact={
            "Coca Cola hazırlanarkən rəngləndiricidən istifadə edirlər,əls rəngi yaşıldır.",
            "Saat icad edilməmişdən əvvəl müəyyən bir vaxt ərzində yanmaya hazırlanmış şam saatları var idi.",
            "Əgər baharatlı bir şey yedikdən sonra bir çay qaşığı şəkər yesəniz, o sizin hərarətinizi azaldacaq.",
            "Almaniyada bir çox qocalar evinin önüdə yaşlı vətəndaşların qaçıb getməsinin qarşısını almaq üçün saxta dayanacaqlar var.",
            "Dalğıcların üzərindəki su qırmızı və sarı işığı filtrləyərək hər şeyin mavi tonda olmasını təmin edir.",
            "Bütün qütb ayıları solaxay olur.",
            "Fillər bellərindəki dəri qırışıqlıqlarını ağcaqanadları öldürmək üçün istifadə edirlər.",
            "Bir qaba çoxlu fıstıq yığsanız,bir müddət sonra özü partlayacaqdır.",
            "Paraqvayda hər iki tərəf də qeydə alınaraq qan bağışlamaq üçün duel etməkləri sərbəstdir.",
            "Rusiyanın gəlirinin 10%i vodka satışlarının payına düşür.",
            "Çində uşaqlar anadan olduğu andan 1 yaşında sayılırlar.",
            "Arıların başlarında 3 kiçik, ön tərəfdə isə 2 böyük göz olmaqla, 5 gözləri var. ",
            "Yin-yang motivi bilindiyinin əksinə olaraq Çində deyil, Romada görülmüşdür. ",
            "Sinqapurda saqqız çeynəmək və ya saxlamaq qadağandır.",
            "Zürafə dili ilə qulağını təmizləyə bilir.",
            "Qədim Misirlilər pişikləri öldükləri zaman qaşları dibindən kəliyərək yas saxlayırdılar.",
            "Kenquru sürüsü ingiliscə “mob” yəni “şəbəkə”  adlandırılır.",
           "İnsanın burnu və qulaqları ömrü boyu böyüdüyü halda, gözləri heç vaxt böyümür.",
           "Bir ilbiz 1 mil yolu 115 günə gedə bilər.",
           "Bir Amerikan dolları bankotunun ortalama ömrü 18 aydır.",
           "Tək yumurta əkizi olan iki qadın, tək yumurta əkizi olan iki kişi ilə evlənsə onların uşaqları genetik olaraq qardaş sayılır.",
           "Çilidəki Atakama çölünə bu günə qədər yağış yağmayıb.",
           "Dünyanın ən uzun ağacı olan “Hyperion”nun yeri bir neçə elm adamından başqa heç kimsə tərəfindən bilinmir.",
           "Timsahlar dillərini bayıra çıxara bilmirlər.",
           "Bir qurtum dəniz suyunda milyonlarla bakteriya, yüz minlərlə bitki mənşəli plankton və on minlərlə heyvan planktonları mövcuddur.",
           "Pişiklər şirin şeylərin dadını bilmirlər."};
    private String[] colors={
        "#39add1","#3079ab","#c25975", "#e15258", "#f9845b",
                "#838cc7", "#7d669e", "#53bbb4", "#51b46d",
                "#e0ab18", "#637a91", "#f092b0", "#b7c0c7"
    };

    public String getFact(){


        Random random = new Random();

       do{
            i = random.nextInt(fact.length);
        } while(i==z);
        z=i;

        System.out.println(i);


        return fact[i];
    }

    public String getColor(){
        Random random = new Random();
        do{
            i = random.nextInt(colors.length);
        } while(i==z);
        z=i;
        return colors[i];

    }
}
