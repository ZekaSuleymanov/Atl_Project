package lesson_14_Desing_Pattern_Interface_Abstraction.Factory;

public interface Developer {
    void writeCode();
}

/*
        void writeCode(); - Ümumi bir anlayışdı digərləri onun sublarıdır. Bu Inhertance DEYIL !!! Çünki onun body'si olmalıdır
        Bununla sanki xülya yaradıram, developer kod yazır nə yazdığını bilmirəm. Onun üçün body'si OLMUR !!!
        bilmirəm nə yazacaq body'nə
 */
