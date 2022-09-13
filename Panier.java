import java.util.*;
/**
 *
 * @author roudet
 */
public class Panier {
    private ArrayList<Fruit> fruits;  //attribut pour stocker les fruits
    private int contenanceMax;        //nb maximum d'oranges que peut contenir le panier
	
    //groupe 1
    public Panier(int contenanceMax){  //initialise un panier vide ayant une certaine contenance maximale (precisee en parametre)
        this.contenanceMax = contenanceMax;
	    this.fruits = new ArrayList<Fruit>(this.contenanceMax);
    }

    @Override
    public String toString(){  //affichage de ce qui est contenu dans le panier : liste des fruits presents
        String s = "Votre panier contient: ";
        for(int i = 0; i < this.fruits.size(); i++)
        {
            s += this.fruits.get(i) + " ";
        }
        return s;
    }
    
    //groupe 2
    public ArrayList<Fruit> getFruits() {  //accesseur du premier attribut
       return this.fruits;
    }

    public void setFruits(ArrayList<Fruit> fruits) { //modificateur du premier attribut

    }

    public int getTaillePanier(){  //accesseur retournant la taille allouee pour l'attibut fruits
        return this.fruits.size();
    }
    
    public int getContenanceMax(){  //accesseur du second attribut
	return 0;
    }

    //groupe 3
    public Fruit getFruit(int i){  //accesseur retournant le fruit contenu dans le panier a l'emplacement n°i ou null s'il n'y a rien a cet emplacement
	return this.fruits.get(i);
    }
    
    public void setFruit(int i, Fruit f){  //modificateur du fruit contenu dans le panier a l'emplacement n°i par f (s'il y a bien deja un fruit a cet emplacement, ne rien faire sinon)
    }



    public boolean estVide(){  //predicat indiquant que le panier est vide
	    return !this.estPlein();
    }
    
    public boolean estPlein(){  //predicat indiquant que le panier est plein
	    return false;
    }

    //groupe 4
    public void ajout(Fruit o) throws PanierPleinException{  //ajoute le fruit o a la fin du panier si celui-ci n'est pas plein
        try{
            this.getFruits().add(o);
        }
        catch(PanierPleinException e){
            throw e;
        }     
    }

    //groupe 5
    public void retrait() throws PanierVideException{ //retire le dernier fruit du panier si celui-ci n'est pas vide
     
    }

    //groupe 6
    public double getPrix(){  //calcule le prix du panier par addition des prix de tous les fruits contenus dedans
	return 0;
    }
    
    //groupe 7
    public void boycotteOrigine(String origine){  //supprime du panier tous les fruits provenant du pays origine
	
    }  
        
    //groupe 8    
    @Override
    public boolean equals(Object o){  ///predicat pour tester si 2 paniers sont equivalents : s'ils contiennent exactement les memes fruits
        return false;
    }
    
    //tests
    public static void main (String[] args) throws PanierPleinException{
    	//Ecrire ici vos tests
    	Panier p = new Panier(1);
    	Fruit f1 = new Kiwi();
    	p.ajout(f1);
    	
    	Fruit f = p.getFruit(0);
    	if(f != null)
    	    System.out.println("getFruit OK");
    	else
    	    System.out.println("getFruit FALSE");
    	
	System.out.println("premier test Panier");

    Pomme pomme = new Pomme(2, "Bénin");
    System.out.println(pomme.getPrix());

    Panier panier = new Panier(10);
    panier.ajout(pomme);
    System.out.println(panier.getTaillePanier());
    }
}
