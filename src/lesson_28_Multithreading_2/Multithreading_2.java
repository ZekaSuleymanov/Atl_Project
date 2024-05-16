package lesson_28_Multithreading_2;

public class Multithreading_2 extends Thread{

    // Nümunə 1
    public static void main(String[] args) {
        int n = 8;
        for (int i = 0; i < n; i++) {
            MultiThreadingDemo object = new MultiThreadingDemo();
            object.start();
        }
    }
}




/*






    lesson 28 dərsinin axrına əlavəsidir

    Multithreading kod üzərind 2 halda yaradıla bilər.
    1)Thread klasını extend etmək. - Nümunə 1
    2) Runnable klasını implement etməklə - implements Runnable yazmaqla

    * Thread klasını extend edəndə onunda extend etdiyi class varmı? Mən onu extend edəndə bir növ Runnable classını
    implement etmiş oluram (gizli şəkildə). run() metodu da onun içindən gəlir

    Tgreadə'rin statementləri

    1) New - Thread o zaman new thread olurki yaradılanda. Thread a = new Thread();
    2/ Runnable - işləməyə hazır vəziyyəti - a.start(); Run vəziyyətinə run() metodunu işlətdiyimiz an keçir - burda işlədirik
    3) Blocked -
    4) Waiting - a.wait();
    5) Timed Waiting - a.sleep() - thread'ə yuxu rejmi verirəm dayansın. Məqsədi fərqli yerlərdə müxtəlif ola biər
    6) Terminated

    Timed Waiting - Məsələn mən çox böyük Long running task icra edirəm. Taskın aralıqlarında multi task olduğuna görə
    bir tərəfə thread.sleep verirəmki bu dayansın gözləsin digəri işini icra etsin responce gəlsin və sonra bu işini icra etson


 */