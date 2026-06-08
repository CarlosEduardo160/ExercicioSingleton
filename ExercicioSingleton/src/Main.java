public class Main {
    public static void main() {
        PacienteDAO pacienteDAO = new PacienteDAO();
        MedicoDAO medicoDAO = new MedicoDAO();

        pacienteDAO.salvarPaciente();
        System.out.println();
        medicoDAO.salvarMedico();
    }
}
