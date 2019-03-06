package pkgname;

public class ImportedConstructedClass{
    private String message;
    
    public ImportedConstructedClass(){
        message = "Default Message";
    }
    
    public ImportedConstructedClass(String _message){
        message = _message;
    }
    
    public String getMessage(){
        return message;
    }
}