public class  AppException extends Exception {

    public AppException(String mensagem) {
        super(mensagem);
    }

    public AppException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
}
 
    

