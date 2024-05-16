package lesson_27_Multithreading;

public class Multithreading {

}

/*
        1) Singletasking nədir

        * Bir CPU'da komputer eyni zamanda yalnız bir proqram execute (icra) edə bilir

        Biz bir main classını run edən zaman - 1) comapil prosesi, 2) JİT compail, 3) İnterpretasiya və.s.
        Bu zaman datalar CPU'ya 0 və 1'lər şəklində yüklənir və oradan bizə return olunur. Bu zaman bir iş (task) görmüş sayılıram
        Biz ardıcıl olaraq 2 qovluq açıram. Bu singletask'dır.  (BURANI ARAŞDIR)

        Singletaskda biz bir proqramı işə salırıq (yada hər hansı proses - qovluğun açılması misal üçün). Etdyimiz hər
        bir əməliyyat ya task yada proses adlanır. Bir yol açılır və oyoldan proqram gedib CPU'ya dolur və ordan nəticəni
        qaytarır.

        2) MultiTask - nədir?
        * Multitask - CPU'da eyni zamanda 2 və daha çox işi icra etməkdir. CPU'nun 8 nüvəsi varsa eyni zamanda bir neçə
        application icra edə bilərik. Buda CONTEXT SWITCH sayəsində baş verir və bir proqram çox kiçik vaxt ərzində işləyir,
        və digər proqrama ötürülür. Client (istifadəçi) bu tezliyi hiss etmir və elə bilirki paralel şəklində işləyir
        Yəni CONTEXT SWITCH - bir taskdan digər taska keçiddir

        Bunlar arasında var Concurrency və Paralelism
        * Paralelism tək thread'ə aid deyil. Paralel programming deyilən məntiqdə daha aydın anlaşılır. Paralel programming
        bir proqramın fərqli hissələrinin eyni anda icra edilməsi deməkdir. Bu performansı artırmaq və vaxtı qısaltmaq
        üçün istifadə edilir. Misal olaraq, bir sənəddəki məlumatları həmin sənədi oxuyub məlmatları hesablayan və ekrana
        çıxaran iki fərqli prosesdir. Bu prosesləri eyni anda işlədərək zamanı qısaldır və effektlivliyi artırır

        Concurrency - Multitasking
        * Bizim concurrency'ə achieve (çatmaq) etməyimiz üçün multiple core'a ehtiyac yoxdur. Yəni CPU daxilinə eyni anda 10 dənə
         prosesin dolması vacib deyil. Sıra-sıra bir core daxilində əldə edə bilirik. Core - mikroprosessordur

        * CONTEXT SWITCH nə edir - JVM'də area var threadlər orada store olunur. Onlar bizim işçilərimizdir. Biz main
        düyməsinə basıb run etdikdə main thread işə düşür. main thread hamısından üstdədir deyə o gedib 1ci o işə düşür

        * Multitasking prosesində task 1 icra olunur sonra task 2'ə keçir.
        * Task 2'ə neçə keçir? - bizim Context Switch prosesi sayəsində task 1 ünvanında task 2 qeyd olunur. Task 1 icrasını
         bitirən kimi sanki yol izləyir. Task 1 bu yola doğru gedir, daha sonra fırlanır gəlir bu yol ilə task 2 icra edir
         Mənim gedəcəyim ünvanlarımı hər birini özündə saxlayır. Misal olaraq Mən Zəkayam və Elgün mənim telefonumda
         işi görüb bitir düyməsini basırsan oda göndərilir İlqara. İlqar işi icra edir göndər düyməsinə basır göndərir Aqilə
         Aqil işi icra edir biti düyməsini basır göndərir Həsənə. Sıra-sıra olur

         task 1 --> task 2 -- task 1 --> task 2 --> task 1

         task 1'in ünvanında task 2 durur. task 2'nin ünvanında task 1 durur. Bir birlərini izləyə izləyə davam edir.
         Məsələn mən komputeri flash kartla format edirəm. Normalda ilkin komputerdə əməliyyat sistemi windowss  açılır.
         Bu zaman əməliyyat sistemini atıram 2'yə flash kartı atıram 1'ə. Bu zaman komputer ilk işə DÜŞMÜR, flash kart
         işə düşür sonra əməliyyat sistemi işə düşür. Burada 1'dən sonra 2'nin işə düşəcəyini ünvanlar təyin edir.
         Yəni müəyyən etaplar ardıcıllıq baş verirki komputer açılan zaman özünə gəlsin


        2) Performance - Paralelism

        * Biz multiple core'lar sayəsində taskları paralel şəkildə exacute (təyin) edə bilirik

        Paralelism sayəsində 1 period ərzində daha çox i görə bilərik


        task 3 --> task 4 --> task 3 --> task 4 --> task 3  ---- core 2

        task 1 --> task 2 --> task 1 --> task 2 --> task 1  ----- core 1

        Əgər çox nüvəlidirsə həm telegramı aça bilərəm həmdə whatssapı aça bilərəm. Biri var sıra ilə açılar biri var eyni
        zamanda açılar. Bir app'i run edəndə productionda ayağa qaldıranda (ən sonda deploy olunur), plugin vasitəsi ilə
        1 microsevisi yox 10 dənəsini işə salmasını əmr edirəm. 1 ci core içindən user microservis qalxır eyni anda 2 ci core
        içində quiz microservis qalxır. 2 dənnə fərqli iş görülür


        4) MultiThreading nədir ?

        * Multithreadin vasitəsi ilə biz eyni zamanda bir neçə program execute (icra) edə bilərik. Bu müxtəlif threadlar
        vasitəsi ilə baş verir. Özlüyündə threadingdi, hər bir thread öz içində sıra-sıra işi icra edir, yəni Concurrency'dir
        Paralelism baş VERMİR !!!. Paralelism o zaman baş verirki bayaqki misalda quiz microsxemdə qalxır, user microsexmdə
        eyni anda qalxır.  Məsələn böyük proyektimizi qaldıranda o 8 günə falan qalxır. Əgər mən tək tək qaldırsam, quiz
        microsxemi qaldıracaqm user microsxem qaldı qıraqda. User miscrosxemi qaldırmaq error çıxacaq amma quiz ms gözləyirəm
        1 core ilə işləyirəm. Sonra useri qaldıranda error alıram və mən onu fixed etdim, və gəlib yenidən gəlib quiz ms
        qaldıranda proses olur 16 gün. Əgər mən ikisini birlikdə qaldırsam həm bu düzgün məntiqdi həmdə belə problemlər olmur


        stream - axın deməkdir
        * Data streamingdə deyə bilərik, çox formada adlandıra bilərik. Bu məntiq Kafka'ya dayanır. Buna misal olaraq 2 nəfər
        arasındakı görüntülü söhbət deyə bilərik. Əvvəllər biz məktubun içinə kağız qoyub göndərirdik indi  isə canlı video
        və canlı səs yazısını qoyub göndərirəm. Bu Stream proseslərində də birə bir Singlethread və Multithread proses gedir.
        Singlethread prosesdə ancaq 1 instruction (təlimat, göstəriş) var, məsələn ancaq videomu göndərir. Multithreadda isə
        səs video və başqa şeylər göndərir

        Threadlar 2 yerə bölünür. Main thread və User thread
        1) Main Thread - JVM tərəfindən yaradılır. App run olanda class loaderlər işə düşür və onların intialization prosesi gedir
        Sonra Linking hissəsini yoxlayırlar və onlada bitir. Stact area və Heap area var. Stack areanın daxilində Heap area
        olur. Stack area içində threadlər var (Thread 1, Thread 2, Thread 3). Program run olanda main thread JVM tərəfindən
        yaranır. Stack içində main thread'i durur. Yeni yaradılan threadlar bizdən asılıdır (photo)



        2) User threadlar  developerlər tərəfindən yaradılır
        * Proses daxilində 1)PİD yaradılır (PİD hər hansısa prosesin id'dir), 2) Files gətirilir, 3) Data (heap'dən) gətirilir
        5) Code olur. Son hissədə (necəki stack areada threadlar göstərilirdi) Main Threadlər yaradılır. Main thread
        daxilindədə stack olur. Stack'in işləmə prinsipi LİFO'dur (last-input-first-output) yəni birinci girən axrıncı çıxır
        yaddaşdan. Və İnstruction pointer olur.
        * Bizim registr olunduğumuz yerdi. Yəni CPU 1ci 111-ci threadı icra edirəm
        sonra 222 keçirəm. 111-ci thread'in özündən sonra gələcək 222 threadin icra olunması məlumatını address olaraq
        İnstructor Pointerdə saxlayır. Nümunə kimi dediyimiz Bizi aparacaq pass (yol) burada icra olunur

        MultiThreading bizə 2 böyük imkan tanıyır.
        1) Responsiveness - Concurrency - Misal üçün Trendyolda eyni anda 100 ədəd paltar alırıq - database'də bu proses
        10 saniyədə çəkir. Bu hal user-friendly adlanır

        2)Performance - Paralelism

        |. Responsiveness -> Concurrency
        ||. Performance -> Paralelism

        Trendyol nümunəsindəki proses çox uzun olduğu üçün onu kiçik hissələrə yəni kiçik threadlərə bölməliyik. Bunun
        hesabında app'dən daha yaxşı responsivlik (əlverişli) nəticə alıram

        locking məntiqi - app lock düşən zaman thread 1'i icra olunmamış thread 2 icra olunmur. Ümumilikdə lock'a düşəndə
        thread 1'i işlədir dayanır.
        Məsələn bank kartının kodunu qoyulduğu limitindən çox səhf yazdıqda o kart bloka düşür. Lock olur yəni


        Mulithreading'in çıxardığı problemlər

        Shared mutable state issues
        * Race conditions - gözləmədiyimiz anda yüksəlişlər baş verə bilər (çoxlu sayda request gəlməsi)
        * İnvisile writes
        * Congestion
        * Deadlock - thread ölməsi
        * Nested monitor lockout - b
        * Starvation - tapa bilməməyi
        * Slipped conditions
        * Missed signals - 1 ciyə request gedə digərinə çatmaz
        * Nested lockout - bir işi 2 işçi çağıranda davamlılıq ola bilər

        No shared mutable state concurrency
        * Separate state concurrency
        * Functional paralelism
        * Paralel pipelines
        * Etc.

        Context Switch məntiqi  (müsəbtə cəhətləri - yerini dəyişməyə imkan verir)

        4 prosesimiz var

        Process İD: 30          Process ID: 40           Process ID: 50          Process ID: 60
                                Thread 1 Thread 2
        Thread 1  Thread 2      Thread 3 Thread 4        Thread 1  Thread 2       Thread 1




        Ilk Thread 1 işə düşür - CPU müəyyən taskı icra etməyə başlayır


        Process İD: 30         Process ID: 40          Process ID: 50          Process ID: 60
                               Thread 1 Thread 2
               Thread 2        Thread 3 Thread 4        Thread 1  Thread 2      Thread 1


            Thread1 -->  CPU

        Thread 1 ünvanında (İnstruction pointer öz adresinə process id 40'a aid olan Thread 4 saxlayır və qısa müddətdə
        icra başa çatan kimi Thread 1 qayıdır öz ünvanına və Thread 4 öz taskının crasını etməyə başlıyır



         Process İD: 30         Process ID: 40           Process ID: 50          Process ID: 60
                                Thread 1 Thread 2
                Thread 2        Thread 3                 Thread 1  Thread 2       Thread 1
         ^
      Thread 1


                        CPU <--- Thread 4

         Thread 4 də işini icra etdikdən sonra yerinə qayıdır

         Eyni şəkildə digər əvəzləmələr olur



         Context Switch - mənfi cəhətləri

         |. Context Switch lightweight proses DEYİL !!! və multitasking'in tərkib hissəsidir. Ağır prosesdir
         ||. Hər thread CPU və Memory tükədir
         |||. Thread'lərin sayı həddindən çox olsa idarə edilməsi çəinləşə bilər və işimizin vaxtını azaltmaq yerinə, artırar
         |V. Thread'lər, processlərdən daha az recource yeyir
         V. Eyni process daxilində, thread'lər arasındakı Context Switching, müxtəlif processlər arasındakı Context Switching'dən
         daha ucuzdur


         Thread Scheduler - JVM tərəfindən idarə edilir deyə, biz ona hər hansı bir müdaxilə edə bilmirik. Sadəcə müəyyən
         qədər ona yön verə bilirik

         Misal üçün hansı thread, hansından sonra və nə zaman icra olunacaq və.s

         Priority - Thread Scheduler ilə gələn məntiq. Müəyyən threadlər yaratmışıq. Və bu thread'lər eyni zamanda işə düşən
         thread'lərdir. Sadəcə thread işə düşən zaman elə olmalıdırki 1-ci Thread 1 sonra Thread 2 işə düşsün. Bunlar
         user-friendly Tread olduğu üçün bunu müəyyən edə bilmirik. Bunu JVM idarə edir. Ancaq biz Priority verə bilirik
         Yəni 1-10'a qədər aralıqdı, Thread'in vacibliyini 1-10 şkalda göstərirəm. Məsələn 7 və 5 var. 1-ci 7'ni götürsün
         Əgər 2-də 7 və 7 (eyni) olarsa nə olar?. Time of arrival məsələsi var. Hansı Thread prinsip olaraq tez çatsa CPU'ya
         o icra olunacaq. Priority olaraq hər ikisini seçə BİLMİR !!! - hər ikisini icra edə bilər

         Əgər sual verilsəki Thread Scheduler nədir? - Priority ilə Time of Arrival öz daxilində kompanent olaraq saxlayır
         Priority - odurki mən bildirirəmki hansı olmalıdır. Time o Arrival isə o Threadın CPU'ya dolma vaxtı
 */