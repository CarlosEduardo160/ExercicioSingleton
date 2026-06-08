public class ConexaoDB {
    private static ConexaoDB singleton;

    private ConexaoDB() {
    }

    public static ConexaoDB getInstancia(){
        if(singleton == null){
            singleton = new ConexaoDB();
        }
        return singleton;
    }

    public void conectar(){
        System.out.println("Conectando ao banco...");
    }
}
