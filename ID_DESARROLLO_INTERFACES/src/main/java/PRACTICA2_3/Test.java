package PRACTICA2_3;

public class Test {

	public static void validarDocumento(TipoDeDocumento tipoDOC, String documentacion) {

		if (tipoDOC == TipoDeDocumento.DNI) {

			int caracterASCII = 0;

			if (documentacion.length() == 9 && Character.isLetter(documentacion.charAt(8))) {

				for (int i = 0; i < documentacion.length() - 1; i++) {

					caracterASCII = documentacion.charAt(i);

					if (caracterASCII > 47 && caracterASCII < 58) {

					} else {

						System.out.println("El dni introducido es incorrecto");

					}
				}

			} else {

				System.out.println("El dni introducido es incorrecto");
			}

		} else {

			int caracterASCII = 0;

			if (documentacion.length() == 9 && Character.isLetter(documentacion.charAt(8))

					&& Character.isLetter(documentacion.charAt(0))) {

				for (int i = 1; i < documentacion.length() - 1; i++) {

					caracterASCII = documentacion.charAt(i);

					if (caracterASCII > 47 && caracterASCII < 58) {

					} else {

						System.out.println("El nie introducido es incorrecto");
					}
				}

			} else {

				System.out.println("El nie introducido es incorrecto");
			}
		}

	}

}
