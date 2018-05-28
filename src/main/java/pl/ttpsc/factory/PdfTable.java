package pl.ttpsc.factory;

public class PdfTable extends Table {
    @Override
    public Cell createCell() {
        return new PdfCell();
    }
}
