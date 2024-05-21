/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop1pre;

import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 *
 * @author gerar
 */
public class POOP1Pre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Alumno alumno= new Alumno("Diego","Garcia","Nava", "Ingenieria en computacion", "Av universidad 33", 4323231, 22);
        System.out.println(alumno);
        String texto;
        texto = alumno.toString();
        System.out.println(texto);
        
        ArrayList<Alumno> listaAlumnos = new ArrayList();
        listaAlumnos.add(alumno);
        listaAlumnos.add(new Alumno("Marcos","Ortiz","De Jesus","Ingenieria en computacion","Av copilco 23",317266788,22));
        listaAlumnos.add(new Alumno("Carlos","Perez","Gomez","Ingenieria civil","Direccion 3",234634236,21));
        listaAlumnos.add(new Alumno("Gerardo","Pliego","Hidalgo","Ingenieria en telecomunicaciones","Direccion 4",320087240,19));
        listaAlumnos.add(new Alumno("Axel","Garcia","Ramos","Ingenieria geofisica","Direccion 5",234634236,22));
        listaAlumnos.add(new Alumno("Emiliano","Sanchez","Reyes","Ingenieria mecatronica","Direccion 6",213513631,18));
        listaAlumnos.add(new Alumno("Ximena","Palacios","Romero","Ingenieria en sistemas biomedicos","Direccion 7",346262442,20));
        listaAlumnos.add(new Alumno("Andrea","Alvarez","Casas","Ingenieria ambiental","Direccion 8",324923411,19));
        listaAlumnos.add(new Alumno("Arturo","Navarro","Guzman","Ingenieria electrica","Direccion 9",312352575,23));
        listaAlumnos.add(new Alumno("Jessica","Nunez","Casillas","Ingenieria industrial","Direccion 10",241253465,22));
        
        for (Alumno temporal : listaAlumnos) {
            System.out.println(temporal);
            //Aqui va el codigo para escribir en un archivo
            //Siguiente paso, leer archivo
            StringTokenizer st = new StringTokenizer(temporal.toString(), ",");
            int i=0;
            Alumno alumno2 = new Alumno();
            while (st.hasMoreTokens()) {
        
                String variable= st.nextToken();
                System.out.println(variable);
                
                
                switch (i) {
                    case 0:
                        alumno2.setNombre(variable);
                        break;
                    case 1:
                        alumno2.setApellidoP(variable);
                        break; 
                    case 2: 
                        alumno2.setApellidoM(variable);
                        break;
                    case 3:
                        alumno2.setCarrera(variable);
                        break;
                    case 4:
                        alumno2.setDireccion(variable);
                       break;
                    case 5:
                        alumno2.setNumCuenta(Integer.parseInt(variable));
                        break;
                    case 6:
                        alumno2.setEdad(Integer.parseInt(variable));
                        break;
 
                    default:
                        throw new AssertionError();
                }
                i++;
            }
            System.out.println("El alumno inflado desde el tokenizer: ");
            System.out.println(alumno2);
            System.out.println("");
            
            Alumno alumnoInf1 = new Alumno();
            Alumno alumnoInf2 = new Alumno();
            Alumno alumnoInf3 = new Alumno();
            Alumno alumnoInf4 = new Alumno();
            Alumno alumnoInf5 = new Alumno();
            Alumno alumnoInf6 = new Alumno();
            Alumno alumnoInf7 = new Alumno();
            Alumno alumnoInf8 = new Alumno();
            Alumno alumnoInf9 = new Alumno();
            Alumno alumnoInf10 = new Alumno();
            
            ArrayList<Alumno> alumnosInflados = new ArrayList();
            alumnosInflados.add(alumnoInf1);
            alumnosInflados.add(alumnoInf2);
            alumnosInflados.add(alumnoInf3);
            alumnosInflados.add(alumnoInf4);
            alumnosInflados.add(alumnoInf5);
            alumnosInflados.add(alumnoInf6);
            alumnosInflados.add(alumnoInf7);
            alumnosInflados.add(alumnoInf8);
            alumnosInflados.add(alumnoInf9);
            alumnosInflados.add(alumnoInf10);
            
        }
    }
    
}
