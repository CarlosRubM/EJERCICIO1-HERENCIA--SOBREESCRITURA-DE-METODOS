public class Abogado extends Empleado{

    @Override
    public int getVacaciones() {
        return super.getVacaciones();
    }

    @Override
    public double getSalario() {
        return super.getSalario()+10000.0;
    }

    @Override
    public int getHoras() {
        return super.getHoras()+5;
    }


    public String getMesVacaciones() {
        return "Julio";
    }

    public void mostrar(){
        System.out.println("Estoy en el trubunal");
    }
}