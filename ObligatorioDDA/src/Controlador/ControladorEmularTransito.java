package Controlador;

import Dominio.Administrador;
import Dominio.Bonificacion;
import Dominio.Categoria;
import Dominio.Cuenta;
import Dominio.Notificacion;
import Dominio.Propietario;
import Dominio.Puesto;
import Dominio.Tarifa;
import Dominio.Transito;
import Dominio.Vehiculo;
import Interfaz.VistaEmularTransito;
import Observer.Observable;
import Observer.Observador;
import Servicios.FachadaServicios;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class ControladorEmularTransito implements Observador {

    VistaEmularTransito vista;
    Administrador usuarioAdmin;

    public ControladorEmularTransito(VistaEmularTransito vista, Administrador usuario) {
        this.vista = vista;
        this.usuarioAdmin = usuario;
    }

    public void cerrar() {
        if (vista.confirmar("Confirma que desea salir", "Salir del sistema")) {
            usuarioAdmin.setLogueado(false);
            vista.salir();
        }
    }

    @Override
    public void notificar(Observable origen, Object evento) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void listarPuestos() {

        this.vista.listarPuestos(FachadaServicios.getInstancia().getPuestos());
    }

    public Vehiculo obtenerVehiculoPorMatricula(String matricula) {
        List<Vehiculo> vehiculos = FachadaServicios.getInstancia().getVehiculos();
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getMatricula().equals(matricula)) {
                return vehiculo;
            }
        }
        return null;
    }

    public Puesto obtenerPuestoPorNombre(String nombrePuesto) {
        List<Puesto> puestos = FachadaServicios.getInstancia().getPuestos();
        for (Puesto puesto : puestos) {
            if (puesto.getNombre().equals(nombrePuesto)) {
                return puesto;
            }
        }
        return null;
    }

    public void registrarNotificacion(String mensaje, Date fechaYHora, Propietario propietario) {

        Notificacion notificacion = new Notificacion(mensaje, fechaYHora);
        propietario.agregarNotificacion(notificacion);
    }

    public void registrarTransito(Date fechaHoraActual, Bonificacion bonificacion, Puesto puesto, Vehiculo vehiculo, double costoTransito) {
        if (bonificacion.getTipoBonificacion().getNombre() == "Frecuentes") {
//                    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yy");
//        String dia = dateFormat.format(fechaUltimaPasada);
//
//        String diahoy = dateFormat.format(new Date());
//
//        if (dia == diahoy) {
//            return getDescuento();
//        } else {
//            return 0;
//        }

//FALTA TRAER LA FECHA DE LA ULTIMA PASADA PARA VER SI APLICA DESCUENTO DE FRECUENTES
        }
        costoTransito = costoTransito * bonificacion.calcularBonificacion() / 100;
        Transito transito = new Transito(fechaHoraActual, bonificacion, puesto, vehiculo, costoTransito);
        vehiculo.agregarTransito(transito);
        actualizarSaldo(vehiculo.getPropietario().getCuenta(), costoTransito);
    }

    public double calcularCostoTransito(Vehiculo vehiculo, Puesto puesto) {
        Categoria categoria = vehiculo.getCategoria();
        List<Tarifa> tarifas = puesto.getTarifas();
        Categoria categoriaTarifa;
        double montoTarifa = -1;

        for (Tarifa t : tarifas) {
            categoriaTarifa = t.getCategoria();
            if (categoriaTarifa == categoria) {
                montoTarifa = t.getMonto();
            }
        }

        if (montoTarifa == -1) {
            return -1;
        }

        return montoTarifa;

    }

    public void actualizarSaldo(Cuenta cuenta, double costoTransito) {
        cuenta.setSaldo(cuenta.getSaldo() - costoTransito);

    }

    public Bonificacion obtenerBonificacion(Propietario propietario, Puesto puesto) {
        return propietario.getBonificacion(puesto);
    }

    public double getSaldoCuentaPropietario(Propietario propietario) {
        return propietario.getCuenta().getSaldo();
    }

}
