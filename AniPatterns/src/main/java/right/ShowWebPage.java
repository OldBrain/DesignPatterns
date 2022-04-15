package right;

import right.WebInfoPage;

public class ShowWebPage {
    public static WebPageTemplate weMainPage = new WebMainPage();
    public static WebPageTemplate webNewsPage = new WebNewsPage();
    public static WebPageTemplate webInfoPage = new WebInfoPage();

    public static void main(String[] args) {
        weMainPage.showPage();
        System.out.println("------------------------------");
        webInfoPage.showPage();
        System.out.println("------------------------------");
        webNewsPage.showPage();
    }
}
