package pl.ttpsc.factory;

public class PdfFactory implements Factory {
    @Override
    public Page createPage() {
        return new PdfPage();
    }

    @Override
    public Table createTable() {
        return new PdfTable();
    }
}
