package final_project;

import java.util.ArrayList;
import java.util.LinkedList;

import javax.swing.JOptionPane;

public class Cinema_Main {
	String Pelicula [];
    String Horario [];
    LinkedList[] clientes = new LinkedList[15];
    ArrayList<String> clientnames = new ArrayList<String>();
	public  Cinema_Main() {
	Pelicula = new  String[5];
	Horario = new String[25];   
  	clientes[0]=new LinkedList();
  	init_load();
	}
	public static void main(String[] args) {
		
	
		Cinema_Main mtds= new Cinema_Main();
		Clock c= new Clock();
		new Clock().setVisible(true);
		char op = '\0'; 
		try{
			while (op != '3'){
			op=JOptionPane.showInputDialog(" Menu   \n\n "
			     +"1.- Usuario \n"
			     +"2.- Administrador \n"
			     +"3.- Salir").charAt(0);
			
			switch(op){
			case '1':
			mtds.client_stuff();
			break;

			case '2':
			mtds.admin_stuff();
			break;
			
			case '3':
			JOptionPane.showMessageDialog(null, "Cerrando Sistema, hasta pronto !");
			break;
			            	
	}
	}
    }catch(Exception e){
	JOptionPane.showMessageDialog(null, "Cerrando sistema, hasta pronto!");
		}
	}
	
	//Metodos------------------------
	
	
	public void init_load(){
		 
	Pelicula[0]="Suicide Squad";
	Pelicula[1]="Los Ilucionistas";
    Pelicula[2]="Buscando a Dory";
    Horario[0]="00:00";
	Horario[1]="22:00";
    Horario[2]="20:00";
	Horario[3]="16:00";
	Horario[4]="18:00";
    Horario[5]="00:00";
	Horario[6]="22:00";
	Horario[7]="20:00";
	Horario[8]="16:00";
	Horario[9]="18:00";   
	Horario[10]="00:00";            
	Horario[11]="22:00";
	Horario[12]="20:00";
	Horario[13]="16:00";
	Horario[14]="18:00";
}
	
	
	public void client_stuff(){
	String username = " ";
	username= JOptionPane.showInputDialog(null, "Ingrese nombre de usuario: ");
	if(clientnames.contains(username)){
		char op = '\0'; 
		try{
			while (op != '4'){
			op=JOptionPane.showInputDialog(" Menu Administrador  \n\n "
			     +"1.- Seleccionar Película \n"
			     +"2.- Cambiar Película \n"
			     +"3.- Cambiar Función \n"
			     +"4.- Eliminar Compra \n").charAt(0);
			switch(op){
			case '1':
			
			
			break;

			case '2':
			
			break;
			
			case '3':
				
			break;
			
			case '4':
			JOptionPane.showMessageDialog(null, "Cerrando Sistema, hasta pronto !");
			break;
			            	
	}
	}
    }catch(Exception e){
	JOptionPane.showMessageDialog(null, "Cerrando sistema, hasta pronto!");
		}	
	
	}else{
		clientnames.add(username);
		char op = '\0'; 
		try{
			while (op != '4'){
			op=JOptionPane.showInputDialog(" Menu Administrador  \n\n "
			     +"1.- Seleccionar Película \n"
			     +"2.- Cambiar Película \n"
			     +"3.- Cambiar Función \n"
			     +"4.- Eliminar Compra \n").charAt(0);
			switch(op){
			case '1':
			
			
			
			break;

			case '2':
			CambiarPelicula();
			break;
			
			case '3':
				
			break;
			
			case '4':
			JOptionPane.showMessageDialog(null, "Cerrando Sistema, hasta pronto !");
			break;
			            	
	}
	}
    }catch(Exception e){
	JOptionPane.showMessageDialog(null, "Cerrando sistema, hasta pronto!");
		}	
	}
	}
	
	
	//--------------------------------
	
	
	
    public void admin_stuff(){    
    	char op = '\0'; 
		try{
			while (op != '7'){
			op=JOptionPane.showInputDialog(" Menu Administrador  \n\n "
			     +"1.- Agregar Película \n"
			     +"2.- Agregar Funciones \n"
			     +"3.- Cambiar Función \n"
			     +"4.- Cambiar Película \n"
			     +"5.- Eliminar Función \n"
			     +"6.- Eliminar Película \n"
			     +"7.- Salir").charAt(0);
			
			switch(op){
			case '1':
			AgregarP();
			break;

			case '2':
		    
			
			break;
			
			case '3':
			Modificar();			
			break;
			
			case '4':
			Modificar();
			break;
			
			case '5':
			eliminarH();	
			break;
			
			case '6':
			eliminar();	
			break;
			
			case '7':
			JOptionPane.showMessageDialog(null, "Cerrando Sistema, hasta pronto !");
			break;
			            	
	}
	}
    }catch(Exception e){
	JOptionPane.showMessageDialog(null, "Cerrando sistema, hasta pronto!");
		}	
    
    }
    
    public void Modificar()
    {
    	String valor,nuevap,nuevoH,imprimir = "",imprimirH ="";
    	int modif,sel,modifH,m=0,a=0;
    	boolean si= false;
    	valor= JOptionPane.showInputDialog("Modificar Pelicula o Funcion?");
    	if(valor.equals("Pelicula"))
    	{
    	for(int i=0;i<Pelicula.length;i++)
    	{
    		if(Pelicula[i]!= null)
    		imprimir+=(i+1)+Pelicula[i]+"\n";
    	}
    	JOptionPane.showMessageDialog(null, imprimir);
    	modif= Integer.parseInt(JOptionPane.showInputDialog("Pelicula a Modificar"));
    	nuevap= JOptionPane.showInputDialog("Nombre de la nueva Pelicula");
    	Pelicula[modif-1]=nuevap;
    	imprimir="";
    	for(int i=0;i<Pelicula.length;i++)
    	{
    		if(Pelicula[i]!= null)
    		imprimir+=(i+1)+Pelicula[i]+"\n";
    	}
    	for(int j=0;j<4;j++)
		{
			if(m==1){a=0;};
    		if(m==2){a=5;};
    		if(m==3){a=10;};
    		if(m==4){a=15;};
    		if(m==5){a=20;};
    		if(Horario[j+a]!= null);
		}
    	JOptionPane.showMessageDialog(null, "Nueva Lista de Peliculas \n"+ imprimir);
    	}
    	if(valor.equals("Funcion"))
    	{
    	for(int i=0;i<Pelicula.length;i++)
    	{
    		if(Pelicula[i]!= null)
    		imprimir+=(i+1)+" " +Pelicula[i]+"\n";
    	}
    	sel=Integer.parseInt(JOptionPane.showInputDialog(null, "De que Pelicula? \n"+ imprimir));
    	int n=0;
    	for(int i=0;i<4;i++)
    	{
    		if(sel==1){n=0;};
    		if(sel==2){n=5;};
    		if(sel==3){n=10;};
    		if(sel==4){n=15;};
    		if(sel==5){n=20;};
    		if(Horario[n+i]!= null)
    		imprimirH+=(i+1)+" "+ Horario[n+i]+"\n";
    	}JOptionPane.showMessageDialog(null, "Horarios actuales para la pelicula-"+ Pelicula[sel-1]+" \n"+ imprimirH);
    	modifH= Integer.parseInt(JOptionPane.showInputDialog("Horario a Modificar"));
    	nuevoH= JOptionPane.showInputDialog("Nueva Hora");
    	for(int i=0;i<4;i++)
    	{
    		if(nuevoH.equals(Horario[n+i])){
    			JOptionPane.showMessageDialog(null, "Existe una funcion en esa Hora");
    			si=true;
    			}
    	}	
    	if(si==false){
    				imprimirH="";
    			Horario[(modifH-1)+n]=nuevoH;
    			for(int j=0;j<4;j++)
    	    	{
    	    		if(Horario[n+j]!= null)
    	    		imprimirH+=(j+1)+" "+ Horario[n+j]+"\n";
    	    	}JOptionPane.showMessageDialog(null, "Nuevo Horario para la Pelicula-"+Pelicula[sel-1]+ "\n"+imprimirH);
    	}
    	}
	}
    
    public void CambiarPelicula(){
    	
    	clientes[1]=new LinkedList();
    	int aux=-1;
    	String nombre;
    	nombre= JOptionPane.showInputDialog("Ingresa el nombre del cliente");
    	
    	for (int i = 0; i < clientes.length; i++) {
			if(nombre.equals(clientes[i].get(0))){
				aux=i;
			}
		}
    	if(aux==-1){
    		JOptionPane.showMessageDialog(null, "Nombre no encontrado");
    	}else{
    		JOptionPane.showMessageDialog(null, "El cliente "+clientes[aux].get(0)+" tiene asignada la pelicula"+clientes[aux].get(1)+" en el horario"+clientes[aux].get(2));
    		JOptionPane.showMessageDialog(null, "Selecciona una nueva pelicula y una nueva funcion");
            
    	}
    }
    public void eliminarH()
    {
    	String imprimir = "",imprimirH="";
    	int m,s;
    	for(int i=0;i<Pelicula.length;i++)
    	{
    		if(Pelicula[i]!= null)
    		imprimir+=(i+1)+" " +Pelicula[i]+"\n";
    	}
    	s=Integer.parseInt(JOptionPane.showInputDialog(null, "Selecciona pelicula para elminar horario? \n"+ imprimir));
    	int n=0;
    	for(int i=0;i<4;i++)
    	{
    		if(s==1){n=0;};
    		if(s==2){n=5;};
    		if(s==3){n=10;};
    		if(s==4){n=15;};
    		if(s==5){n=20;};
    		if(Horario[i]!= null)
    		imprimirH+=(i+1)+"-"+Horario[i]+"\n";
    	}m= Integer.parseInt(JOptionPane.showInputDialog(imprimirH+"\n Horario a eliminar"));
    	Horario[m-1]=null;
    	imprimirH="";
    	for(int i=0;i<4;i++)
    	{
    		if(Horario[i]!= null)
    		imprimirH+=(i+1)+"-"+Horario[i]+"\n";
    	}JOptionPane.showMessageDialog(null, "Horario de la Pelicula- "+Pelicula[s-1]+"\n"+imprimirH);
    }
    public void eliminar()
    {
    	String imprimir = "";
    	int m;
    	for(int i=0;i<Pelicula.length;i++)
    	{
    		if(Pelicula[i]!= null)
    		imprimir+=(i+1)+Pelicula[i]+"\n";
    	}m= Integer.parseInt(JOptionPane.showInputDialog(imprimir+"\n Pelicula a eliminar"));
    	Pelicula[m-1]=null;
    	imprimir="";
    	for(int i=0;i<Pelicula.length;i++)
    	{
    		if(Pelicula[i]!= null)
    		imprimir+=(i+1)+Pelicula[i]+"\n";
    	}JOptionPane.showMessageDialog(null, "Lista Modificada- \n "+imprimir);
    }
    public void AgregarP()
    {
    	String nuevoH,imprimir = "",nuevaP="";
    	int n=0,h=0;
    	for(int i=0;i<Pelicula.length;i++)
    	{
    		if(Pelicula[i]!= null)
    		imprimir+=(i+1)+"-"+Pelicula[i]+"\n";
    	}
    	JOptionPane.showMessageDialog(null, "Peliculas Existentes: \n"+ imprimir);
    	
    	nuevaP=JOptionPane.showInputDialog(null, "Nueva Pelicula");
    	for(int i=0;i<Pelicula.length;i++)
    	{
    		if(Pelicula[i]== null)
    		{
    		Pelicula[i]=nuevaP;
    		h=i;
    		i=10;}
    		
    	}
    		 
    		for(int j=0;j<4;j++)
    		{
    			if(h==1){n=0;};
        		if(h==2){n=5;};
        		if(h==3){n=10;};
        		if(h==4){n=15;};
        		if(h==5){n=20;};
        		if(Horario[j+n]!= null);
    		}
    	
    	imprimir="";
    	for(int i=0;i<Pelicula.length;i++)
    	{
    		if(Pelicula[i]!= null)
    		imprimir+=(i+1)+Pelicula[i]+"\n";
    	}
    	JOptionPane.showMessageDialog(null, "Lista Modificada: \n"+imprimir);
    }
}

