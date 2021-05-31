package com.example.aplikasisederhana;

import java.util.ArrayList;

public class LanguageData {
    private static String[] languageName ={
        "Phyton",
        "Java",
        "JavaScript",
        "C#",
        "PHP",
        "C",
        "R",
        "Objective-C",
        "Swift",
        "Ruby",
        "C++"
    };

    private static String[] languageDetail ={
            "Python adalah bahasa pemrograman yang ramah pemula. Bahasa satu ini terkenal mudah dipelajari karena sintaksnya yang jelas dan intuitif. Bahkan, sintaks Python banyak miripnya dengan Bahasa Inggris.",
            "Java bisa dibilang merupakan bahasa pemrograman yang cukup lawas. Bahasa satu ini dikembangkan di tahun 1990 dan baru dirilis ke publik tahun 1995.",
            "Inilah bahasa yang paling populer di kalangan developer. Selama tujuh tahun berturut-turut, JavaScript mencatatkan diri sebagai bahasa yang paling banyak digunakan developer.",
            "C# (baca: C-sharp) merupakan bahasa yang biasa digunakan untuk bermacam keperluan. Mulai dari pengembangan website, aplikasi Windows, sampai dengan games.",
            "PHP sebenarnya merupakan bahasa pemrograman yang multifungsi. Hanya saja, ia lebih banyak dipakai untuk mengembangkan website. Bahkan, 79 persen website yang ada di dunia menggunakan PHP.",
            "Kalau bahasa pemrograman punya bapak, C ini mungkin adalah “orangnya”. Bahasa C pertama kali dikembangkan di tahun 1972 untuk mendukung sistem operasi UNIX. Kemudian dari sinilah, muncul bahasa program yang lebih canggih semacam JavaScript, C++, Java C#, dsb.",
            "Berbeda dengan yang sempat dibahas di sini, R merupakan bahasa yang khusus dipakai untuk mengolah data dan statistik. Segala metode pengolahan data, bisa dilakukan dengan bahasa ini. Mulai dari algoritma machine learning, regresi linear, time series, dsb.",
            "Kalau Microsoft punya C#, Apple punya bahasa yang namanya Objective-C. Ini merupakan bahasa yang dikembangkan Apple di tahun 1983. Tujuannya, khusus untuk mengatasi kekurangan bahasa C.",
            "Swift tergolong bahasa pemrograman yang masih muda. Ia baru dikenalkan Apple pada tahun 2014. Fungsinya, spesifik untuk mengembangkan aplikasi di iOS dan MacOS. Setahun setelahnya, barulah Swift dijadikan open-source dan cross-platform.",
            "Ruby merupakan bahasa pemrograman yang cukup banyak digunakan oleh startup. Tak heran, karena bahasa ini sangat-sangat fleksibel dan mudah digunakan.",
            "C++ adalah jenis bahasa pemrograman level tengah. Artinya, C++ dapat digunakan untuk menjalankan programming sistem. Namun, juga bisa dipakai untuk mengembangkan aplikasi skala besar macam Photoshop, Media Player, dan lainnya."
    };

    private static int[] languageImages = {
            R.drawable.phyton,
            R.drawable.java,
            R.drawable.javascript,
            R.drawable.c_sharp,
            R.drawable.php,
            R.drawable.c,
            R.drawable.r,
            R.drawable.objective_c,
            R.drawable.swift,
            R.drawable.ruby,
            R.drawable.c_plus

    };

    static ArrayList<Language> getListData(){
        ArrayList<Language> list = new ArrayList<>();
        for (int position=0;position<languageName.length;position++){
           Language language = new Language();
           language.setName(languageName[position]);
           language.setDetail(languageDetail[position]);
           language.setImg(languageImages[position]);
           list.add(language);
        }

        return list;
    }
}
