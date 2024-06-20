/*=================================================================================
Study Center....: Universidad TÃ©cnica Nacional
Campus..........: PacÃ­fico (JRMP)
College career..: IngenierÃ­a en TecnologÃ­as de InformaciÃ³n
Period..........: 2C-2024
Course..........: ITI-221 - ProgramaciÃ³n I
Document........: class_05 - corrida_01.java
Goals...........: Use functions from the external library to generate random data
                  and print it in a table format.
Professor.......: Jorge Ruiz (york)
Student.........:
=================================================================================*/
public class corrida_01 {
    public static void main(String[] args) {
        // Creates a new instance of the functions class
        functions f = new functions();

        // Print the header of the table
        System.out.printf("%5s | %-10s | %-30s | %-4s | %-8s | %-10s\n","ID", "CÃ©dula", "Nombre Completo","Sexo", "E. Civil", "Nacido");
        System.out.println("------+------------+--------------------------------+------+----------+-------------");

        // Print 25 random people
        for (int i = 0; i < 25; i++) {
            System.out.printf("%5s | %-10s | %-30s | %-4s | %-8s | %-10s\n",
                    f.ponCeros(String.valueOf(i+1),5),
                    f.Cedula(),
                    f.Nombre() + " " + f.Apellido() + " " + f.Apellido() ,
                    f.Sexo(),
                    f.estCivil(),
                    f.fecNac());
        }
    }
}