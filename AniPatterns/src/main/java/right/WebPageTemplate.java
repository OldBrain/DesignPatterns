package right;

public abstract class WebPageTemplate {
    void showPage() {
        System.out.println("Header");
        showContent();
        System.out.println("Footer");
    }

    public abstract void showContent();
}
