package lesson_14_Desing_Pattern_Interface_Abstraction.Singleton;


// Databas ilə əlaqəni quracağımız class
public class DbConnection {
    private static DbConnection dbConnection; // obyekti yazıb saxlıyıram, sonra nəyisə asign(təyin) edə bilərik

// privite static String queryHistory = "Query History:\n"; // öz bazam kimidir bir String etmişəm queryləri store edirəm


// Burdada parametr kimi classın özünü ötürürəm
    public static  DbConnection getDbConnection(){
// əgər connection null`dursa (bazaya qoşulma yoxdursa, yeni obyektini yaradıram qoşuram bazaya. Varsada olanı geri return et
        if (dbConnection == null) dbConnection = new DbConnection();
        return dbConnection;
    } // Applicationa daxil olmamışdan əvvəl öncə yoxlamaq lazımdırki database ilə əlaqə varmı ya yox. Yoxdursa app İŞLƏMİR !!!


    // constructor normalda public olur obyekt yaratmaq üçün amma burda private ilə obyekt yarada BİLMİRƏM !!!
    // DbConnection a = new DbConnectio
    // n(); - bur formada
    private DbConnection(){ // Əgər public olsa Nümunə 6.1-dəki kimi olar
    } // Əgər Main classımızda new DbConnection yaratsada instance (obyekt) yarada BİLMƏSİN !!! Yazmasaq yəni default olsada obyekti yaratmaq olar
    // Bunu yazırıqki ancaq obyektimizi tək üsulla, odaki getDbConnection sayəsində yarada bilək

/*
    public void addQuery(String query){
        queryHistory += query + "\n" // Show case'ə görədir
    }

    public void showQueries(){
        System.out.println(queryHistory);
    }

*/
}
