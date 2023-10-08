public abstract class WebPageDecorator implements WebPageComponent {
    private WebPageComponent decoratedPage;

    public WebPageDecorator(WebPageComponent decoratedPage) {
        this.decoratedPage = decoratedPage;
    }

    @Override
    public void render() {
        decoratedPage.render();
    }
}
