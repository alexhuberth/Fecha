package calendario;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fecha f1=new Fecha(25,10,2020);
		Fecha f2=new Fecha("25/10/2020");
		if(f1.equals(f2)) {
			System.out.println("Las fechas son iguales");
		}else {
			System.out.println("las fechas no son iguales");
		}
		FechaDetallada f=new FechaDetallada("25/02/2020");
		//f.setDia(25);
		//f.setMes(10);
		//f.setAnio(2009);
		System.out.println(f);

	}

}
