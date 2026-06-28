package Data;

import Model.ExcursionCultural;
import Model.PaseoLacustre;
import Model.RutaGastronomica;

public class GestorServicios {

    public void mostrarServicios() {

        RutaGastronomica ruta1 =
                new RutaGastronomica("Ruta del Kuchen", 4, 5);

        RutaGastronomica ruta2 =
                new RutaGastronomica("Sabores de Frutillar", 3, 4);

        PaseoLacustre paseo1 =
                new PaseoLacustre("Lago Llanquihue", 2, "Catamarán");

        PaseoLacustre paseo2 =
                new PaseoLacustre("Bahía de Puerto Varas", 1, "Lancha");

        ExcursionCultural excursion1 =
                new ExcursionCultural("Museo Colonial Alemán", 2,
                        "Museo Colonial Alemán");

        ExcursionCultural excursion2 =
                new ExcursionCultural("Iglesia del Sagrado Corazón", 2,
                        "Iglesia del Sagrado Corazón");

        System.out.println(ruta1);
        System.out.println();

        System.out.println(ruta2);
        System.out.println();

        System.out.println(paseo1);
        System.out.println();

        System.out.println(paseo2);
        System.out.println();

        System.out.println(excursion1);
        System.out.println();

        System.out.println(excursion2);
    }
