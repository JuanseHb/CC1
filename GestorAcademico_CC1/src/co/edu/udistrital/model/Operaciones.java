package co.edu.udistrital.model;

public class Operaciones {
    
    public double Pormedio(Estudiante estudiantes[]){
        double suma=0;
        
        for(int i=0;i<estudiantes.length;i++){
            suma=suma+estudiantes[i].getNota();
        }
        
        return suma/estudiantes.length;
    }
    
    public double Pormedio(double notas[]){
        double suma=0;
        
        for(int i=0;i<notas.length;i++){
            suma=suma+notas[i];
        }
        
        return suma/notas.length;
    }
    
    public double Pormedio(double n1,double n2,double n3,double n4,double n5,double n6,double n7,double n8,double n9,double n10){
        double notas[]={n1,n2,n3,n4,n5,n6,n7,n8,n9,n10};
        return Pormedio(notas);
    }
    
    public int Aprobados(Estudiante estudiantes[]){
        int cont=0;
        
        for(int i=0;i<estudiantes.length;i++){
            if(estudiantes[i].getNota()>=3.0){
                cont++;
            }
        }
        
        return cont;
    }
    
    public int Aprobados(double notas[]){
        int cont=0;
        
        for(int i=0;i<notas.length;i++){
            if(notas[i]>=3.0){
                cont++;
            }
        }
        
        return cont;
    }
    
    public int Aprobados(double n1,double n2,double n3,double n4,double n5,double n6,double n7,double n8,double n9,double n10){
        double notas[]={n1,n2,n3,n4,n5,n6,n7,n8,n9,n10};
        return Aprobados(notas);
    }
    
    public int Reprobados(Estudiante estudiantes[]){
        int cont=0;
        
        for(int i=0;i<estudiantes.length;i++){
            if(estudiantes[i].getNota()<3.0){
                cont++;
            }
        }
        
        return cont;
    }
    
    public int Reprobados(double notas[]){
        int cont=0;
        
        for(int i=0;i<notas.length;i++){
            if(notas[i]<3.0){
                cont++;
            }
        }
        
        return cont;
    }
    
    public int Reprobados(double n1,double n2,double n3,double n4,double n5,double n6,double n7,double n8,double n9,double n10){
        double notas[]={n1,n2,n3,n4,n5,n6,n7,n8,n9,n10};
        return Reprobados(notas);
    }
    
    public double Moda(Estudiante estudiantes[]){
        double moda=estudiantes[0].getNota();
        int mayor=0;
        
        for(int i=0;i<estudiantes.length;i++){
            int cont=0;
            
            for(int j=0;j<estudiantes.length;j++){
                if(estudiantes[i].getNota()==estudiantes[j].getNota()){
                    cont++;
                }
            }
            
            if(cont>mayor){
                mayor=cont;
                moda=estudiantes[i].getNota();
            }
        }
        
        if(mayor==1){
            return -1;
        }
        
        return moda;
    }
    
    public double Moda(double notas[]){
        double moda=notas[0];
        int mayor=0;
        
        for(int i=0;i<notas.length;i++){
            int cont=0;
            
            for(int j=0;j<notas.length;j++){
                if(notas[i]==notas[j]){
                    cont++;
                }
            }
            
            if(cont>mayor){
                mayor=cont;
                moda=notas[i];
            }
        }
        
        if(mayor==1){
            return -1;
        }
        
        return moda;
    }
    
    public double Moda(double n1,double n2,double n3,double n4,double n5,double n6,double n7,double n8,double n9,double n10){
        double notas[]={n1,n2,n3,n4,n5,n6,n7,n8,n9,n10};
        return Moda(notas);
    }
    
    public double Desviacion(Estudiante estudiantes[]){
        double promedio=Pormedio(estudiantes);
        double suma=0;
        
        for(int i=0;i<estudiantes.length;i++){
            suma=suma+Math.pow(estudiantes[i].getNota()-promedio,2);
        }
        
        return Math.sqrt(suma/estudiantes.length);
    }
    
    public double Desviacion(double notas[]){
        double promedio=Pormedio(notas);
        double suma=0;
        
        for(int i=0;i<notas.length;i++){
            suma=suma+Math.pow(notas[i]-promedio,2);
        }
        
        return Math.sqrt(suma/notas.length);
    }
    
    public double Desviacion(double n1,double n2,double n3,double n4,double n5,double n6,double n7,double n8,double n9,double n10){
        double notas[]={n1,n2,n3,n4,n5,n6,n7,n8,n9,n10};
        return Desviacion(notas);
    }
    
}
