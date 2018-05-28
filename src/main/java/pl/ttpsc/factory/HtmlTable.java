package pl.ttpsc.factory;

public class HtmlTable extends Table {
    @Override
    public Cell createCell() {
        return new HtmlCell();
    }
}
