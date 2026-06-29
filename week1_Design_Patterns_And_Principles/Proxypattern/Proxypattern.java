package Proxypattern;

interface Image {
    void display();
}

class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadImage();
    }

    private void loadImage() {
        System.out.println("Loading image from remote server: " + fileName);
    }

    public void display() {
        System.out.println("Displaying " + fileName);
    }
}

class ProxyImage implements Image {

    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    public void display() {
        if (realImage == null)
            realImage = new RealImage(fileName);

        realImage.display();
    }
}

public class Proxypattern {

    public static void main(String[] args) {

        Image img = new ProxyImage("nature.jpg");

        img.display();

        System.out.println();

        img.display();
    }
}
