/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author adria
 */
public class ToleranciaFallosInicioSesion {
    public static void main(String[] args) {
        int intentosMaximos = 3;
        int intentoActual = 1;
        boolean exito = false;

        while (intentoActual <= intentosMaximos && !exito) {
            try {
                boolean resultado = iniciarSesion();
                if (resultado) {
                    exito = true;
                    System.out.println("Inicio de sesión exitoso");
                } else {
                    System.out.println("Credenciales incorrectas");
                    intentoActual++;
                    if (intentoActual <= intentosMaximos) {
                        System.out.println("Intentando nuevamente...");
                    } else {
                        System.out.println("Se excedió el número máximo de intentos");
                    }
                }
            } catch (Exception e) {
                System.out.println("Ocurrió un error: " + e.getMessage());
                intentoActual++;
                if (intentoActual <= intentosMaximos) {
                    System.out.println("Intentando nuevamente...");
                } else {
                    System.out.println("Se excedió el número máximo de intentos");
                }
            }
        }
    }

    public static boolean iniciarSesion() throws Exception {
        // Simulación de inicio de sesión que puede lanzar una excepción o devolver un resultado falso
        double resultado = Math.random();
        if (resultado < 0.5) {
            throw new Exception("Error al iniciar sesión");
        }
        return resultado >= 0.7; // Simulación de resultado de inicio de sesión exitoso (70% de probabilidad)
    }
}
