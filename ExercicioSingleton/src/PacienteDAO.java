public class PacienteDAO {
    ConexaoDB pacienteDAO = ConexaoDB.getInstancia();

    public void salvarPaciente() {
        pacienteDAO.conectar();
        System.out.println("Salvando paciente...");
    }
}
