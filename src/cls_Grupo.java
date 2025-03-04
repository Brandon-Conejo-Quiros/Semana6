//Composición: Declarar una propiedad en una clase apartir de una clase previamente declarada solo si es obligatorio
//Agregación: Declarar una propiedad en una clase apartir de una clase previamente declarada si su uso es alternativo

public class cls_Grupo {

    private cls_Profesor profe;
    private cls_Estudiante[] alumnos;
    private String nombre;

    public cls_Grupo(cls_Profesor profe, cls_Estudiante[] alumnos, String nombre) {
        this.profe = profe;
        this.alumnos = alumnos;
        this.nombre = nombre;
    }

    private cls_Grupo(){

    }

    public cls_Profesor getProfe() {
        return profe;
    }

    public void setProfe(cls_Profesor profe) {
        this.profe = profe;
    }

    public cls_Estudiante[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(cls_Estudiante[] alumnos) {
        this.alumnos = alumnos;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

