package calendario;

public class Fecha {
	private int dia;
	private int mes;
	private int anio;

	public Fecha() {
		this.dia=0;
		this.mes=0;
		this.anio=0;
		// TODO Auto-generated constructor stub
	}
	public Fecha(String s) {
		int pos1=s.indexOf('/');
		int pos2=s.lastIndexOf("/");
		String sDias=s.substring(0,pos1);
		dia=Integer.parseInt(sDias);
		String sMes=s.substring(pos1+1,pos2);
		mes=Integer.parseInt(sMes);
		String sAnio=s.substring(pos2+1);
		anio=Integer.parseInt(sAnio);
	}

	public Fecha(int dia, int mes, int anio) {
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}
	//@Override
	public String toString() {
		return  dia + "/" + mes + "/" + anio;
	}
	//@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Fecha otra=(Fecha)obj;
		
		return (dia==otra.dia)&&(mes==otra.mes)&&(anio==otra.anio);
	}
	
	

}
