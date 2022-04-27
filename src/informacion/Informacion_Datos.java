package informacion;

/**
 * @author Estefanía Hernández Meraz
 */
public class Informacion_Datos {
    
    String Nombre;
    String Carrera;
    String Materia;
    int semestre;
    int matricula;
    
    public void imprime(){
        System.out.println("El nombre del alum@ es: " + Nombre);
        System.out.println("La carrera a la que pertenece es: " + Carrera);
        System.out.println("La materia es: " + Materia);
        System.out.println("El semestre que cursa es: " + semestre);
        System.out.println("La matricula es: " + matricula);
    }
    
    public void agregarNombre(String miNombre){
        Nombre = miNombre;
    }
    
    public void agregarCarrera(String miCarrera){
        Carrera = miCarrera;
    }
    
    public void agregarMateria(String miMateria){
        Materia = miMateria;
    }
    
    public void agregarSemestre(int miSemestre){
        semestre = miSemestre;
    }
    
    public void agregarMatricula(int miMatricula){
        matricula = miMatricula;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }

    public String getMateria() {
        return Materia;
    }

    public void setMateria(String Materia) {
        this.Materia = Materia;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    
}
