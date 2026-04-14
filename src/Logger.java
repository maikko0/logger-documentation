/**
 * Logger კლასი უზრუნველყოფს შეტყობინებების კონსოლში ბეჭდვას.
 * @author შენი სახელი
 * @version 1.0
 */
public class Logger {

    /**
     * ბეჭდავს საინფორმაციო შეტყობინებას.
     * @param message ტექსტი, რომელიც უნდა დაიბეჭდოს
     */
    public void logInfo(String message) {
        System.out.println("[INFO]: " + message);
    }

    /**
     * ბეჭდავს შეცდომის შეტყობინებას.
     * @param error შეცდომის აღწერა
     * @param code შეცდომის კოდი
     * @return აბრუნებს სტატუსს წარმატებულია თუ არა ლოგირება
     */
    public boolean logError(String error, int code) {
        System.err.println("[ERROR " + code + "]: " + error);
        return true;
    }
}