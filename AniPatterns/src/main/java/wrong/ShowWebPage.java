package wrong;

/**
 * ПРИМЕР АНТИПАТТЕРНА.
 * Антипаттерн заключается в том, что при внесении изменений придется менять структуру
 * 3 классов. Правильно было бы использовать паттерн Template.
 * */

public class ShowWebPage {
    public static WebMainPage webMainPage = new WebMainPage();
    public static WebNewsPage webNewsPage = new WebNewsPage();
    public static WebInfoPage webInfoPage = new WebInfoPage();

    public static void main(String[] args) {
        webMainPage.showPage();
        System.out.println("-----------------------------");
        webInfoPage.showPage();
        System.out.println("-----------------------------");
        webNewsPage.showPage();

    }
}
