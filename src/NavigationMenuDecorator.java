public class NavigationMenuDecorator extends WebPageDecorator {
    public NavigationMenuDecorator(WebPageComponent decoratedPage) {
        super(decoratedPage);
    }

    @Override
    public void render() {
        super.render();
        addNavigationMenu();
    }

    private void addNavigationMenu() {
        System.out.println("Added Navigation Menu");
    }
}



