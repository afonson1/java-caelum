package br.com.caelum.contas.modelo;

public class Data {
	int dia;
	int mes;
	int ano;
	
	//GETTERS AND SETTERS
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

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	//DEMAIS MÉTODOS
	public void verificaData(int dia, int mes, int ano){
		if(mesValido(mes)&&diaValido(dia, mes)){
			System.out.println("Data válida");
		}
		else {
			System.out.println("Data inválida");
		}
	}

	public boolean mesValido(int mes){
		if (mes>0 && mes<13){
			return true;
		}
		else
			return false;
	}
	
	public boolean diaValido(int dia, int mes){
		if (this.mesValido(mes)){
			if (mes==2){
				if (bissexto() && dia>0 && dia<30){
					return true;
				}
				else {
					if (dia>0 && dia<29){
						return true;
					}
				}
			}
			else {
				if ((mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12) && dia>0 && dia<32){
						return true;
				}
				else {
					if (dia>0 && dia<31){
						return true;
					}
				}
			}
		}
		return false;
	}

	public boolean bissexto(){
		if ((ano%4)==0){
			if(ano%100!=0){
				System.out.println("BISSEXTO");
			}
			else {
				if (ano%400==0){
				System.out.println("BISSEXTO!!");
				}
			}
		return true;
		}
		else {
			System.out.println("Não é divisível por 400\nNão é bissexto");
			return false;
		}
	}
	
	public String formatada (){
		return dia + "/" + mes + "/" + ano;
	}
	
}