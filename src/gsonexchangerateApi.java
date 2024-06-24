import java.util.Map;

public record gsonexchangerateApi(

        String result,
        String base_code,
        Map<String,Double>conversion_rates
) {
    public double conversion(String convertirmoneda){
        return conversion_rates.get(convertirmoneda);
    }
}