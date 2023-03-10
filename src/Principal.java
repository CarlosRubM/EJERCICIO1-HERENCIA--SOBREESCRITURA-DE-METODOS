import java.sql.SQLOutput;

public class Principal {
    public static void main(String[] args) {

        Empleado empleado1 = new Empleado();
        System.out.println("INFORMACION EMPLEADO 1:");
        System.out.println("SALARIO:"+empleado1.getSalario());
        System.out.println("MES DE VACACIONES: "+empleado1.getMesVacaciones());
        System.out.println("HORAS QUE TRABAJA: "+empleado1.getHoras());
        System.out.println("DIAS DE VACACIONES: "+empleado1.getMesVacaciones());
        System.out.println("---------------------------------------------------------");
        Empleado empleado2 = new Abogado();
        System.out.println("INFORMACION EMPLEADO 2 - ABOGADO:");
        System.out.println("SALARIO:"+empleado2.getSalario());
        System.out.println("MES DE VACACIONES: "+empleado2.getMesVacaciones());
        System.out.println("HORAS QUE TRABAJA: "+empleado2.getHoras());
        System.out.println("DIAS DE VACACIONES: "+empleado2.getMesVacaciones());
        System.out.println("---------------------------------------------------------");
        Empleado empleado3 = new Secretario();
        System.out.println("INFORMACION EMPLEADO 3 - SECRETARIO:");
        System.out.println("SALARIO:"+empleado3.getSalario());
        System.out.println("MES DE VACACIONES: "+empleado3.getMesVacaciones());
        System.out.println("HORAS QUE TRABAJA: "+empleado3.getHoras());
        System.out.println("DIAS DE VACACIONES: "+empleado3.getMesVacaciones());


    }
}
