package ejercicio1;

public class MainColeccion
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		Videojuego v1 = new Videojuego("GTA VI", "PS5", 100, 200);

		Videojuego v2 = new Videojuego("Red Dead Redemption 2", "PS5", 80, 100);

		Videojuego v3 = new Videojuego("Mario Bros", "Nintendo", 50, 20);

		Videojuego v4 = new Videojuego("Halo Infinite", "XBox", 80, 30);

		Videojuego v5 = new Videojuego("Minecraft", "PC", 20, 300);

		ColeccionJuegos c1 = new ColeccionJuegos();

		c1.getJuegos().add(v1);
		c1.getJuegos().add(v2);
		c1.getJuegos().add(v3);
		c1.getJuegos().add(v4);
		c1.getJuegos().add(v5);

		v1.mostrarJuego();
		
		System.out.println("Mi coleccion vale " + c1.valorTotalColeccion());
		
		System.out.println(c1.buscarPorTitulo("GTA VI"));
		
		System.out.println(c1.totalHorasInvertidas());
		
		c1.mostrarJuegosPorPlataforma("PS5");
		
		System.out.println(c1.obtenerJuegoMasJugado());
	}

}
