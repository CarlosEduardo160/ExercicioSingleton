public class MedicoDAO {
    ConexaoDB medicoDAO = ConexaoDB.getInstancia();

    public void salvarMedico() {
        medicoDAO.conectar();
        System.out.println("Salvando medico...");
    }
}
