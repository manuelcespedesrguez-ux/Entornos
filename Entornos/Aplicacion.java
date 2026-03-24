public class Aplicacion {

    public static void main(String[] args) {

        // Arrays
        Serie[] series = new Serie[5];
        Videojuegos[] videojuegos = new Videojuegos[5];

        // Serie
        series[0] = new Serie("Stranger Things", 5, "Ciencia Ficción", "The Duffer Brothers");
        series[1] = new Serie("Breaking Bad", 5,"Acción", "Vince Gilligan");
        series[2] = new Serie("Prison Break", 5, "Acción", "Paul Scheuring");
        series[3] = new Serie("Anatomía de Grey", 22, "Drama y acción", "Shonda Rhimes");
        series[4] = new Serie("The Boys", 4, "Acción", "Eric Kripke");

        // Videojuegos
        videojuegos[0] = new Videojuegos("Dirt Rally 2.0", 140, "Coches", "CodeMasters");
        videojuegos[1] = new Videojuegos("Minecraft", 50, "Construcción y supervivencia", "Mojang");
        videojuegos[2] = new Videojuegos("Elden Ring", 120, "Rol", "From Software");
        videojuegos[3] = new Videojuegos("FIFA 24", 30, "Deportes", "EA Sports");
        videojuegos[4] = new Videojuegos("GTA V", 80, "Acción", "Rockstar");

        // Entregar objetos
        series[1].entregado();
        series[4].entregado();

        videojuegos[2].entregado();
        videojuegos[4].entregado();

        // Contar entregados
        int seriesEntregadas = 0;
        int videojuegosEntregados = 0;

        for (Serie s : series) {
            if (s.isEntregado()) {
                seriesEntregadas++;
                s.devolver();
            }
        }

        for (Videojuegos v : videojuegos) {
            if (v.isEntregado()) {
                videojuegosEntregados++;
                v.devolver();
            }
        }

        System.out.println("Series entregadas: " + seriesEntregadas);
        System.out.println("Videojuegos entregados: " + videojuegosEntregados);

        // Máximo horas
        Serie serieMax = series[0];
        Videojuegos videojuegoMax = videojuegos[0];

        for (int i = 1; i < series.length; i++) {
            if (series[i].compareTo(serieMax) == 1) {
                serieMax = series[i];
            }
        }

        for (int i = 1; i < videojuegos.length; i++) {
            if (videojuegos[i].compareTo(videojuegoMax) == 1) {
                videojuegoMax = videojuegos[i];
            }
        }

        System.out.println("Serie con más temporadas ");
        System.out.println(serieMax.toString());

        System.out.println("Videojuego con más horas estimadas ");
        System.out.println(videojuegoMax.toString());
    }
}
