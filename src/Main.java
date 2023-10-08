public class Main {
    public static void main(String[] args) {
        WebPageComponent basicWebPage = new BasicWebPage();
        WebPageComponent withNavigationMenu = new NavigationMenuDecorator(basicWebPage);
        WebPageComponent withForm = new FormDecorator(withNavigationMenu);

        System.out.println("Rendering Basic Web Page:");
        basicWebPage.render();

        System.out.println("\nRendering Web Page with Navigation Menu and Form:");
        withForm.render();
    }
}

