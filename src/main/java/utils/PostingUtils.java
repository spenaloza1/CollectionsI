package utils;

import com.sun.org.apache.xpath.internal.operations.Operation;
import model.CurrencyEnum;
import model.OperationTypeEnum;
import model.Posting;
import model.PostingType;
import model.Price;
import model.RealestateTypeEnum;

import java.lang.management.OperatingSystemMXBean;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static jdk.jfr.internal.instrument.JDKEvents.remove;

public class PostingUtils {

    private static Collection<Posting> postings = null;
    private static Collection<Posting> postingsToRemove = null;

    public static Collection<Posting> getPostings() {
            postings = new ArrayList<>();
            postings.add(new Posting("Departamento en venta", new Price(120000L, CurrencyEnum.DOLAR), RealestateTypeEnum.APARTMENT, OperationTypeEnum.SELL, PostingType.PROPERTY));
            postings.add(new Posting("Departamento en venta Belgrano", new Price(127500L, CurrencyEnum.DOLAR), RealestateTypeEnum.APARTMENT, OperationTypeEnum.SELL, PostingType.PROPERTY));
            postings.add(new Posting("Departamento en alquiler", new Price(24000L, CurrencyEnum.PESOS), RealestateTypeEnum.APARTMENT, OperationTypeEnum.RENT, PostingType.PROPERTY));
            postings.add(new Posting("casa en alquiler", new Price(35000L, CurrencyEnum.PESOS), RealestateTypeEnum.HOUSE, OperationTypeEnum.RENT, PostingType.PROPERTY));
            postings.add(new Posting("casa en venta", new Price(300000L, CurrencyEnum.DOLAR), RealestateTypeEnum.HOUSE, OperationTypeEnum.SELL, PostingType.UNIT));
            postings.add(new Posting("departamento en venta en desarrllo", new Price(245000L, CurrencyEnum.DOLAR), RealestateTypeEnum.APARTMENT, OperationTypeEnum.SELL, PostingType.UNIT));
            postings.add(new Posting("Desarrollo en pozo para inversion", new Price(175000L, CurrencyEnum.DOLAR), RealestateTypeEnum.APARTMENT, OperationTypeEnum.SELL, PostingType.DEVELOPMENT));
            postings.add(new Posting("Alquiler de departamento, oportunidad!", new Price(14000L, CurrencyEnum.PESOS), RealestateTypeEnum.APARTMENT, OperationTypeEnum.RENT, PostingType.PROPERTY));
            postings.add(new Posting("Alquiler de casa en Mar del plata", new Price(20000L, CurrencyEnum.PESOS), RealestateTypeEnum.HOUSE, OperationTypeEnum.RENT, PostingType.PROPERTY));
            postings.add(new Posting("Venta de casa en Cordoba", new Price(287000L, CurrencyEnum.DOLAR), RealestateTypeEnum.HOUSE, OperationTypeEnum.SELL, PostingType.PROPERTY));
        return postings;
    }

    public static Collection<Posting> getPostingsToRemove() {
        postingsToRemove = new ArrayList<>();
        postingsToRemove.add(new Posting("Departamento en venta Belgrano", new Price(127500L, CurrencyEnum.DOLAR), RealestateTypeEnum.APARTMENT, OperationTypeEnum.SELL, PostingType.PROPERTY));
        postingsToRemove.add(new Posting("departamento en venta en desarrllo", new Price(245000L, CurrencyEnum.DOLAR), RealestateTypeEnum.APARTMENT, OperationTypeEnum.SELL, PostingType.UNIT));
        postingsToRemove.add(new Posting("Alquiler de departamento, oportunidad!", new Price(14000L, CurrencyEnum.PESOS), RealestateTypeEnum.APARTMENT, OperationTypeEnum.RENT, PostingType.PROPERTY));
        postingsToRemove.add(new Posting("Venta de casa en Cordoba", new Price(287000L, CurrencyEnum.DOLAR), RealestateTypeEnum.HOUSE, OperationTypeEnum.SELL, PostingType.PROPERTY));
        return postingsToRemove;
    }

    public static void returnPosting() {
        //for(int i=0;i<PostingUtils.postings.size()-1;i++) {//PostingUtils.postings.size() estoy diciendo null.size

        //for(int i=0;i< getPostings().size();i++) {
            //System.out.println(getPostings());//me eesta imprimiendo todos en una misma linea getPostings().size() veces

        for(Posting posting : getPostings()) { //posting alias, Posting tipo, getPosting() lo que quiero iterar
            System.out.println(posting);
        }
    }
    public static void returnPostingWithRemove(){
        Collection<Posting> postingOriginal = getPostings();
        Collection<Posting> postingsToRemove = getPostingsToRemove();

        for(Posting remove: postingsToRemove){
            postingOriginal.remove(remove);
        }
        for(Posting po: postingOriginal) {
            System.out.println(po);
        }
    }
    public static void returnPostingWithoutSellandApartament() {
        List<Posting> listaPosting = (List<Posting>) getPostings();
        List<Posting> filterList = new ArrayList<>();

        for(Posting po: listaPosting){
            if((po.getOperationType() == OperationTypeEnum.SELL) && (po.getRealestateType() == RealestateTypeEnum.APARTMENT)){
                filterList.add(po);
            }
        }
        for(Posting showTo: filterList){
            System.out.println(showTo);
        }
    }
    public static void returnPostingWithoutRentandHouse(){
        List<Posting> listaPosting = (List<Posting>) getPostings();
        List<Posting> filterList = new ArrayList<>();

        for(Posting po: listaPosting){
            if((po.getOperationType() == OperationTypeEnum.RENT) && (po.getRealestateType() == RealestateTypeEnum.HOUSE)){
                filterList.add(po);
            }
        }
        for(Posting showTo: filterList){
            System.out.println(showTo);
        }
    }
}
