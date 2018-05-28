package pl.ttpsc.factory;

public class HtmlFactory implements Factory {
    @Override
    public Page createPage() {
        return new HtmlPage();
    }

    @Override
    public Table createTable() {
        return new HtmlTable();
    }
}
