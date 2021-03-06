
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String opcion;
        String res = "";
        String user, password;
        Usuario admin = new Usuario();
        admin.buscarDatosAdmin();

        do {

            System.out.println("Ingrese los datos para acceder al sistema.");
            System.out.println("Ingresa el usuario: ");
            user = scanner.next();
            System.out.println("Ingresa la contraseña: ");
            password = scanner.next();

            if (user.equals(admin.getUser()) && password.equals(admin.getPassword())) {
                System.out.println("Bienvenido a la administración de citas");
                System.out.println("Menú");
                System.out.println("1. Dar alta de doctores.");
                System.out.println("2. Dar de alta pacientes.");
                System.out.println("3. Crear una cita con fecha, hora y motivo.");
                System.out.println("4. Relacionar una cita con un doctor y un paciente.");
                System.out.println("5. Mostrar lista de doctores.");
                System.out.println("6. Mostrar lista de pacientes.");
                System.out.println("7. Mostrar lista de citas.");
                System.out.println("8. Mostrar la información relacionada (doctor, paciente, cita).");
                System.out.println("0. Salir.");
                System.out.println("Elige una opción: ");
                opcion = scanner.next();

                switch (opcion) {
                    case "1":
                        Doctor doctor = new Doctor();
                        doctor.pedirDatos();
                        doctor.darAltaDoctor();
                        break;

                    case "2":
                        Paciente paciente = new Paciente();
                        paciente.pedirDatos();
                        paciente.darAltaPaciente();
                        break;

                    case "3":
                        Cita cita = new Cita();
                        cita.pedirDatos();
                        cita.crearCita();
                        break;

                    case "4":
                        RelacionInformacion relacion = new RelacionInformacion();
                        relacion.pedirDatos();
                        relacion.relacionarInformacion();
                        break;

                    case "5":
                        doctor = new Doctor();
                        doctor.mostrarDoctores();
                        break;

                    case "6":
                        paciente = new Paciente();
                        paciente.mostrarPacientes();
                        break;

                    case "7":
                        cita = new Cita();
                        cita.mostrarCitas();
                        break;

                    case "8":
                        relacion = new RelacionInformacion();
                        relacion.mostrarRelacionesInformacion();
                        break;

                    case "0":
                        System.out.println("Aplicación finalizada.");
                        System.exit(0);
                        break;

                }
            } else {
                System.out.println("Datos incorrectos, intentelo nuevamente.");
            }

            do {
                System.out.println("¿Deseas volver a ejecutar el programa?");
                System.out.println("Escribe si o no: ");
                scanner.nextLine();
                res = scanner.next();
                res = res.toLowerCase();

                if (!res.equals("si") && !res.equals("no")) {
                    System.out.println("No has escrito una respuesta correcta.");
                    System.out.println("Recuerda que solo es si o no.");
                }

            } while (!res.equals("si") && !res.equals("no"));

            System.out.println();

        } while (res.equals("si"));

        System.out.println("Aplicación finalizada.");

    }

}
