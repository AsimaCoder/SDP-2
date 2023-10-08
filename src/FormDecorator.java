
public class FormDecorator extends WebPageDecorator {
    public FormDecorator(WebPageComponent decoratedPage) {
        super(decoratedPage);
    }

    @Override
    public void render() {
        super.render();
        addForm();
    }

    private void addForm() {
        System.out.println("Added Form");
    }
}
