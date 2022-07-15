import model.OperationTypeEnum;
import model.RealestateTypeEnum;
import utils.PostingUtils;

/*
   Utilizando los métodos de la clase PostingUtils, implementar :
   1- Método que muestre por pantalla los elementos de la collection devuelta por getPostings()
   2- Método que elimine de la collection getPostings() los postings existentes en getPostingsToRemove() y mostrar por pantalla el resultado
   3- Metodo que muestre todos los postings que tiene tipo de operacion SELL y tipo de propiedad APARTMENT
   4- Método que muestre todos los postings que tiene tipo de operacion RENT y tipo de propiedad HOUSE
*/
public class Application {

    public static void main(String[] args) {

        //1
        PostingUtils.returnPosting();
        System.out.println("**************************************FIN DEL EJ1****************************************************");
        //2
        PostingUtils.returnPostingWithRemove();
        System.out.println("**************************************FIN DEL EJ2****************************************************");
        //3
        PostingUtils.returnPostingWithoutSellandApartament();
        System.out.println("**************************************FIN DEL EJ3****************************************************");
        //PostingUtils.mostrarFilterSellApartment(RealestateTypeEnum.HOUSE, OperationTypeEnum.RENT);
        PostingUtils.returnPostingWithoutRentandHouse();
        System.out.println("**************************************FIN DEL EJ4****************************************************");
    }

}
