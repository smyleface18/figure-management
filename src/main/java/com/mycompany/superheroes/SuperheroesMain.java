


package com.mycompany.superheroes;

import com.mycompany.superheroes.Superheroe;
import com.mycompany.superheroes.Coleccion;
import com.mycompany.superheroes.Dimension;
import com.mycompany.superheroes.Figure;
import java.util.ArrayList;
import java.util.Scanner;





public class SuperheroesMain {

    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);

        ArrayList<Coleccion> colletionList = new ArrayList <>();
        
        String option;
    do{
       
        System.out.println("que acción quieres realizar?");
        System.out.println("agregar");
        System.out.println("ver");
        System.out.println("exit");
        option = read.nextLine();
        


        
        if("agregar".equalsIgnoreCase(option) ){
                System.out.println("agregar figura a collecion existente");
                System.out.println("crear coleccion");
                option = read.nextLine();
                    if("agregar".equalsIgnoreCase(option)){
                        System.out.println("name de la coleccion");
                        option = read.nextLine();
                        
                        for(Coleccion colletion : colletionList){
                            if(option.equalsIgnoreCase(colletion.nameColletion)){
                                 Figure fig = Createfigure();
                                colletion.listFigures.add(fig);   
                            }
                        }
                        
                    }
                    else if("crear".equalsIgnoreCase(option)){
                        System.out.println("name de la coleccion");
                        String word = read.nextLine();
                        Coleccion colletion = new Coleccion(word);
                        colletionList.add(colletion);
                    }
                    else {System.out.println("Error");}
            }
        
        
        else if ("ver".equalsIgnoreCase(option)){
                System.out.println("Que quieres ver?");
                System.out.println("coleccion");
                System.out.println("figura");
                System.out.println("todo");
                System.out.println("colecciones");
                option = read.nextLine();
                if(option.equalsIgnoreCase("coleccion")){
                    System.out.println("name de la coleccion");
                    option = read.nextLine();
                    
                    for(Coleccion colletion :colletionList ){
                        if(option.equalsIgnoreCase(colletion.nameColletion)){
                            System.out.println(colletion.toString());
                        }
                    }
                }
                else if(option.equalsIgnoreCase("figura")){
                        System.out.println("cod de la figura");
                        String cod = read.next();
                        for(Coleccion colletion : colletionList){
                                int size = colletion.listFigures.size();
                                    for (int i = 0; i < size; i++) {
                                        if(colletion.listFigures.get(i).codigo.equalsIgnoreCase(cod)){
                                            System.out.println( colletion.listFigures.get(i).toString());
                                        }
                                        else {System.out.println("no existe figura con ese cod");}
                                     } 
                            }
                        }
                        
                else if(option.equalsIgnoreCase("todo")){
                        for(Coleccion colletion : colletionList){
                            System.out.println(colletion.toString());
                        }
                }
              else if(option.equalsIgnoreCase("colecciones")){
                        for(Coleccion colletion : colletionList){
                            System.out.println(colletion.nameColletion);
                        }
                }
              else {System.out.println("Error");}
            }
        
      else if(option.equalsIgnoreCase("exit")){
            System.out.println("ah salido del programa");
            break;
        }
        else {
            System.out.println("opcion no valida");
        } 
        }
        while(true);
        
        
    }
    
    
    public static Figure Createfigure() {
        
        Scanner read = new Scanner(System.in);
       
        System.out.println("Name del heroe");
        String name = read.nextLine();
        Superheroe heroe = new Superheroe(name);
        
        System.out.println("descripcion del heroe");
        String description = read.nextLine();
        heroe.setDescription(description);
        
        System.out.println("tiene capa?");
        boolean layer = read.nextBoolean();
        heroe.setLayer(layer);
        
        System.out.println("alture de la figura");
        double heigth = read.nextDouble();
        System.out.println("ancho de la figura");
        double width = read.nextDouble();
        System.out.println("profundidad de la figura");
        double depth = read.nextDouble();
        Dimension dimension = new Dimension(heigth,width,depth);
        
        String cod ;
        System.out.println("Codigo que va a tener la figura");
        cod = read.next();
        System.out.println("Ingrese el precio de la figura");
        double price =  read.nextDouble();
        Figure figureHeroe = new Figure(cod,price,dimension,heroe);
        
        return figureHeroe;
    }
}
