import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public interface Interface {

        public static List<String> cambiar(List<String> lista, Function<String, String> cambiar) {
                List<String> ListaAnimales = new ArrayList<>();
                for (String cadena : lista) {
                        ListaAnimales.add(cambiar.apply(cadena));
                }
                return ListaAnimales;
}}