package KI34.Okilka.Lab3;
import java.io.*;
/**
 * Phone Application class implements main method for Phone
 class possibilities demonstration
 * @author Okilka Yaroslav
 * @version 1.0
 */
public class PhoneApp {
    /**
     * @param args args
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        Phone phone = new Phone("Samsung",55,"dvf",60);

        phone.phoneModel();
        phone.checkCharge();
        phone.connectToWifi();
        phone.addBright();
        phone.minusBright();
        phone.minusBright();
        phone.showBright();
        phone.makePhoto();
        phone.deletePhoto();
        phone.deletePhoto();
        phone.showPhoto();



    }
}

