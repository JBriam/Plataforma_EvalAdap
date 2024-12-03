
package plataforma_evaladap;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingUtilities;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import controlador.controlLogin;
import vista.Context;
import vista.EvaluationState;
import vista.ExamState;
import vista.Observer;
import vista.ReportState;
import vista.StudentState;
import vista.Subject;
import vista.frmLogin;

public class Plataforma_EvalAdap {
        
    public static void main(String[] args) {
        controlLogin login = new controlLogin(new frmLogin());
    }

}
    
/*
    private Context context;
    private Subject subject;

    public Plataforma_EvalAdap() {
        context = new Context();
        subject = new Subject();
        subject.addObserver(this);

        //FORM
        setTitle("Plataforma de Evaluación Adaptativa");
        setSize(1000, 800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JMenuBar menuBar = new JMenuBar();

        //-----------------------------------------
        
        //Item Estudiantes
        JMenu estudiantesMenu = new JMenu("Estudiantes");
        JMenuItem agregarEstItem = new JMenuItem("Agregar estudiante");
        JMenuItem actualizarEstItem = new JMenuItem("Actualizar estudiante");
        JMenuItem eliminarEstItem = new JMenuItem("Eliminar estudiante");
        agregarEstItem.addActionListener(e -> {
            context.setState(new StudentState());
            context.request();
            subject.notifyObservers("Se seleccionó el módulo de Estudiantes.");
        });
        actualizarEstItem.addActionListener(e -> {
            context.setState(new StudentState());
            context.request();
            subject.notifyObservers("Se seleccionó el módulo de Estudiantes.");
        });
        eliminarEstItem.addActionListener(e -> {
            context.setState(new StudentState());
            context.request();
            subject.notifyObservers("Se seleccionó el módulo de Estudiantes.");
        });
        estudiantesMenu.add(agregarEstItem);
        estudiantesMenu.add(actualizarEstItem);
        estudiantesMenu.add(eliminarEstItem);
        menuBar.add(estudiantesMenu);

        //-----------------------------------------
        
        //Item Evaluaciones
        JMenu evaluacionMenu = new JMenu("Evaluación");
        JMenuItem agregarEvalItem = new JMenuItem("Agregar evaluación");
        JMenuItem actualizarEvalItem = new JMenuItem("Actualizar evaluación");
        JMenuItem eliminarEvalItem = new JMenuItem("Eliminar evaluación");
        agregarEvalItem.addActionListener(e -> {
            context.setState(new EvaluationState());
            context.request();
            subject.notifyObservers("Se seleccionó el módulo de Evaluaciones.");
        });
        actualizarEvalItem.addActionListener(e -> {
            context.setState(new EvaluationState());
            context.request();
            subject.notifyObservers("Se seleccionó el módulo de Evaluaciones.");
        });
        eliminarEvalItem.addActionListener(e -> {
            context.setState(new EvaluationState());
            context.request();
            subject.notifyObservers("Se seleccionó el módulo de Evaluaciones.");
        });
        evaluacionMenu.add(agregarEvalItem);
        evaluacionMenu.add(actualizarEvalItem);
        evaluacionMenu.add(eliminarEvalItem);
        menuBar.add(evaluacionMenu);

        //-----------------------------------------
        
        //Item Examen adaptado
        JMenu examMenu = new JMenu("Examen Adaptado");
        JMenuItem agregarExamItem = new JMenuItem("Agregar examen");
        JMenuItem actualizarExamItem = new JMenuItem("Actualizar examen");
        JMenuItem eliminarExamItem = new JMenuItem("Eliminar examen");
        agregarExamItem.addActionListener(e -> {
            context.setState(new ExamState());
            context.request();
            subject.notifyObservers("Se seleccionó el módulo de Exámenes adaptados.");
        });
        actualizarExamItem.addActionListener(e -> {
            context.setState(new ExamState());
            context.request();
            subject.notifyObservers("Se seleccionó el módulo de Exámenes adaptados.");
        });
        eliminarExamItem.addActionListener(e -> {
            context.setState(new ExamState());
            context.request();
            subject.notifyObservers("Se seleccionó el módulo de Exámenes adaptados.");
        });
        examMenu.add(agregarExamItem);
        examMenu.add(actualizarExamItem);
        examMenu.add(eliminarExamItem);
        menuBar.add(examMenu);
        
        //-----------------------------------------
        
        //Item Informes
        JMenu informeMenu = new JMenu("Informes");
        JMenuItem agregarInfItem = new JMenuItem("Agregar informe");
        JMenuItem actualizarInfItem = new JMenuItem("Actualizar informe");
        JMenuItem eliminarInfItem = new JMenuItem("Eliminar informe");
        agregarInfItem.addActionListener(e -> {
            context.setState(new ReportState());
            context.request();
            subject.notifyObservers("Se seleccionó el módulo de Predicciones.");
        });
        actualizarInfItem.addActionListener(e -> {
            context.setState(new ReportState());
            context.request();
            subject.notifyObservers("Se seleccionó el módulo de Predicciones.");
        });
        eliminarInfItem.addActionListener(e -> {
            context.setState(new ReportState());
            context.request();
            subject.notifyObservers("Se seleccionó el módulo de Predicciones.");
        });
        informeMenu.add(agregarInfItem);
        informeMenu.add(actualizarInfItem);
        informeMenu.add(eliminarInfItem);
        menuBar.add(informeMenu);

        setJMenuBar(menuBar);
    }

    @Override
    public void update(String message) {
        System.out.println("Notificación: " + message);
    }
*/


//--**

/*public class ConsolaUI {
    public static void main(String[] args) {
        
        
        Scanner scanner = new Scanner(System.in);
        SistemaExamenesAdaptadosFacade sistema = new SistemaExamenesAdaptadosFacade();
        
        
        // prueba FACADE 
        try {
            // Registrar un nuevo estudiante
            System.out.print("Introduce el nombre del estudiante: ");
            String nombre = scanner.nextLine();
            
            System.out.print("Introduce la edad del estudiante: ");
            int edad = scanner.nextInt();
            scanner.nextLine(); // limpiar el buffer
            
            System.out.print("Introduce el nivel académico del estudiante: ");
            String nivelAcademico = scanner.nextLine();
            
            sistema.registrarEstudiante(nombre, edad, nivelAcademico);
            System.out.println("Estudiante registrado con éxito.");

            //****************************************************************************
            // Insertar una nueva evaluación para el estudiante
            System.out.print("Introduce el ID del estudiante para la evaluación: ");
            int estudianteID = scanner.nextInt();
            scanner.nextLine(); // limpiar el buffer

            System.out.print("Introduce los resultados anteriores: ");
            String resultadosAnteriores = scanner.nextLine();
            
            System.out.print("Introduce el tiempo promedio de la evaluación (en minutos): ");
            double tiempoPromedio = scanner.nextDouble();
            scanner.nextLine(); // limpiar el buffer
            
            System.out.print("Introduce el nivel de dificultad de la evaluación: ");
            String dificultad = scanner.nextLine();

            sistema.insertarEvaluacion(estudianteID, resultadosAnteriores, tiempoPromedio, dificultad);
            System.out.println("Evaluación insertada con éxito.");

            //****************************************************************************
            
            //Prueba FACTORY 
            // Pedir el ID de la evaluación
            System.out.print("Introduce el ID de la evaluación: ");
            int evaluacionID = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            // Pedir el tipo de examen adaptado
            System.out.print("Introduce el tipo de examen adaptado (Ej: Examen 1 Adaptado): ");
            String tipoExamenAdaptado = scanner.nextLine();
            
            sistema.generarExamenAdaptado(evaluacionID, tipoExamenAdaptado);
            System.out.println("Examen adaptado generado con éxito.");
            
            //****************************************************************************
             
            // prueba del decorato
        
            // Crear un examen adaptado
            ExamenAdaptado examen = ExamenAdaptadoFactory.crearExamenAdaptado(1, "Matematicas");

            // Decorar el examen con un comentario especial
            examen = new ComentarioEspecialDecorator(examen, "Excelente desempeño en el examen.");

            // Decorar el examen como aprobado
            examen = new ExamenAprobadoDecorator(examen, true);

            // Imprimir los detalles del examen con los decoradores aplicados
            System.out.println(examen);
           
        }catch (SQLException e) {
            System.out.println("Ocurrió un error en la base de datos: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }           
    } 
}*/
