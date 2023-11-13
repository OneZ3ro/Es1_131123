package angelomoreno.Es1_131123.exceptions;

public class NotFoundException extends RuntimeException{
    public NotFoundException(int id) {
        super("L'elemento con id: " + id + " non è stato trovato. Riprovare con un id diverso");
    }
}
