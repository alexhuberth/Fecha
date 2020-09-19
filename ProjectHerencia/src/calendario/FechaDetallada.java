package calendario;

public class FechaDetallada extends Fecha {
	public static String meses[]= {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Setiembre","Octubre","Noviembre","Diciembre"};

	public FechaDetallada() {
		super();
		// TODO Auto-generated constructor stub
		
	}
	public FechaDetallada(String fecha) {
		super(fecha);
	}
	public FechaDetallada(int dia,int mes,int anio) {
		super(dia,mes,anio);
	}
	public String toString() {
		return getDia()+" de "+meses[getMes()-1]+" de "+getAnio();
	}

}
