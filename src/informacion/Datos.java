package informacion;

/**
 * @author Estefanía Hernández Meraz
 */
public class Datos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("D A T O S");
        Informacion_Datos datos1 = new Informacion_Datos();
        datos1.Nombre = "Estefanía Hernández Meraz";
        datos1.Carrera = "Ingenieria en Sistemas";
        datos1.Materia = "Programacion Orientada a Objetos";
        datos1.semestre = 1;
        datos1.matricula = 21550332;
        datos1.imprime();
        
        System.out.println("\nD A T O S     C O N     S E T T S     Y     G E T T S");
        Informacion_Datos datos2 = new Informacion_Datos();
        datos2.setNombre("Juan Armendariz Lopez");
        datos2.setCarrera("Arquitectura");
        datos2.setMateria("Dibujo");
        datos2.setSemestre(3);
        datos2.setMatricula(20550321);
        datos2.imprime();
        
        System.out.println("\nD A T O S     C O N     U N     S T R I N G");
        Informacion_Datos datos3 = new Informacion_Datos();
        datos3.agregarNombre("Liliana Perez Molina");
        datos3.agregarCarrera("Contabilidad Financiera");
        datos3.agregarMateria("Derecho Mercantil");
        datos3.agregarSemestre(8);
        datos3.agregarMatricula(19550216);
        
        String generales = datos3.getNombre() + "\n" + datos3.getCarrera() + "\n" + datos3.getMateria()
                  + "\n" + datos3.getSemestre() + "\n" + datos3.getMatricula();
        System.out.println(generales);
        
    }
    
}
