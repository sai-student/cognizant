interface Document {
    void open();
}

class WordDocument implements Document {

    public void open() {
        System.out.println("Opening Word Document");
    }
}

class PdfDocument implements Document {

    public void open() {
        System.out.println("Opening PDF Document");
    }
}

class ExcelDocument implements Document {

    public void open() {
        System.out.println("Opening Excel Document");
    }
}

abstract class DocumentFactory {

    abstract Document createDocument();
}

class WordFactory extends DocumentFactory {

    public Document createDocument() {
        return new WordDocument();
    }
}

class PdfFactory extends DocumentFactory {

    public Document createDocument() {
        return new PdfDocument();
    }
}

class ExcelFactory extends DocumentFactory {

    public Document createDocument() {
        return new ExcelDocument();
    }
}

public class Factorypattern {

    public static void main(String[] args) {

        DocumentFactory word = new WordFactory();
        DocumentFactory pdf = new PdfFactory();
        DocumentFactory excel = new ExcelFactory();

        word.createDocument().open();
        pdf.createDocument().open();
        excel.createDocument().open();
    }
}
