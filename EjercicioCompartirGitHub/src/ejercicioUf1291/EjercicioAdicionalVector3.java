package ejercicioUf1291;




import java.util.Scanner;

public class EjercicioAdicionalVector3 {

	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		
		final int NUMEROASIGNATURAS=5;
		final int NUMEROCONVOCATORIAS=6;
		
		double[][] expedienteAlumno=new double[NUMEROASIGNATURAS][NUMEROCONVOCATORIAS];
		
		double[] ponderacionConvocatorias= {1.25,1, 0.9, 0.75, 0.6, 0.5};
		
		System.out.println("Vamos a introducir el expediente de un alumno, que consiste en 5 asignaturas, 6 convocatorias cada asignatura");
		
		for(int j=0; j<NUMEROASIGNATURAS;j++) 
		{
			for(int i=0;i<NUMEROCONVOCATORIAS;i++) 
			{
				System.out.println("Introduzca la nota de la " +(i+1) + "º convocatoria de la " +(j+1)+ "º asignatura");
				
				expedienteAlumno[j][i]=teclado.nextDouble();
				teclado.nextLine();
			}
		}
		teclado.close();
		
		double mediaPonderadaPorAsignatura=0;
		
		for(int j=0;j<NUMEROASIGNATURAS;j++) 
		{
			mediaPonderadaPorAsignatura=0;
			
			for(int i=0;i<NUMEROCONVOCATORIAS;i++) 
			{
				mediaPonderadaPorAsignatura+=ponderacionConvocatorias[i]*expedienteAlumno[j][i];
			}
			mediaPonderadaPorAsignatura=mediaPonderadaPorAsignatura/NUMEROCONVOCATORIAS;
			
			System.out.println("La media ponderada de la asignatura nº " +(j+1)+ " es " +mediaPonderadaPorAsignatura);
        }
    }
}