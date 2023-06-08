package Main;

import Dominio.Administrador;
import Dominio.Bonificacion;
import Dominio.Categoria;
import Dominio.Cuenta;
import Dominio.Exonerados;
import Dominio.Frecuentes;
import Dominio.Notificacion;
import Dominio.Propietario;
import Dominio.Puesto;
import Dominio.Recarga;
import Dominio.Tarifa;
import Dominio.TipoBonificacion;
import Dominio.Trabajadores;
import Dominio.Transito;
import Dominio.Vehiculo;
import Servicios.FachadaServicios;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class DatosDePrueba {

    public static void cargar() {

        Administrador admin1 = new Administrador("Gerardo Silva", "gera123", 5123456);
        Administrador admin2 = new Administrador("Ana Lopez", "ana123", 5123457);
        Administrador admin3 = new Administrador("Santiago Lacretta", "santi123", 3245678);
        Administrador admin4 = new Administrador("Diego Gregoraz", "diego123", 2456789);
        Administrador admin5 = new Administrador("Alejandro González", "ale123", 2156789);
        Administrador admin6 = new Administrador("Valentina López", "vale123", 1345678);
        Administrador admin7 = new Administrador("Diego Ramírez", "diegor123", 3245678);
        Administrador admin8 = new Administrador("Juan Morales", "juan123", 4356789);
        Administrador admin9 = new Administrador("Isabella Castro", "isa123", 5324567);
        Administrador admin10 = new Administrador("Camila Silva", "cami123", 4234567);

        FachadaServicios.getInstancia().agregar(admin1);
        FachadaServicios.getInstancia().agregar(admin2);
        FachadaServicios.getInstancia().agregar(admin3);
        FachadaServicios.getInstancia().agregar(admin4);
        FachadaServicios.getInstancia().agregar(admin5);
        FachadaServicios.getInstancia().agregar(admin6);
        FachadaServicios.getInstancia().agregar(admin7);
        FachadaServicios.getInstancia().agregar(admin8);
        FachadaServicios.getInstancia().agregar(admin9);
        FachadaServicios.getInstancia().agregar(admin10);

        Categoria categoria1 = new Categoria("Sedán");
        Categoria categoria2 = new Categoria("SUV");
        Categoria categoria3 = new Categoria("Camioneta");
        Categoria categoria4 = new Categoria("Camión");
        Categoria categoria5 = new Categoria("Autobús");
        Categoria categoria6 = new Categoria("Coupé");
        Categoria categoria7 = new Categoria("Convertible");

        Tarifa tarifa1 = new Tarifa(100, "Sedán", categoria1);
        Tarifa tarifa2 = new Tarifa(120, "SUV", categoria2);
        Tarifa tarifa3 = new Tarifa(140, "Camioneta", categoria3);
        Tarifa tarifa4 = new Tarifa(240, "Camión", categoria4);
        Tarifa tarifa5 = new Tarifa(200, "Autobús", categoria5);
        Tarifa tarifa6 = new Tarifa(135, "Coupé", categoria6);
        Tarifa tarifa7 = new Tarifa(130, "Convertible", categoria7);

        List<Tarifa> tarifas1 = new ArrayList();
        List<Tarifa> tarifas2 = new ArrayList();
        List<Tarifa> tarifas3 = new ArrayList();
        List<Tarifa> tarifas4 = new ArrayList();
        List<Tarifa> tarifas5 = new ArrayList();
        List<Tarifa> tarifas6 = new ArrayList();
        List<Tarifa> tarifas7 = new ArrayList();
        List<Tarifa> tarifas8 = new ArrayList();
        List<Tarifa> tarifas9 = new ArrayList();
        List<Tarifa> tarifas10 = new ArrayList();
        List<Tarifa> tarifas11 = new ArrayList();
        List<Tarifa> tarifas12 = new ArrayList();

        tarifas1.add(tarifa1);
        tarifas1.add(tarifa2);
        tarifas1.add(tarifa3);

        tarifas2.add(tarifa4);
        tarifas2.add(tarifa5);

        tarifas3.add(tarifa6);
        tarifas3.add(tarifa7);

        tarifas4.add(tarifa1);
        tarifas4.add(tarifa2);
        tarifas4.add(tarifa3);

        tarifas5.add(tarifa1);
        tarifas5.add(tarifa5);

        tarifas6.add(tarifa2);
        tarifas6.add(tarifa3);
        tarifas6.add(tarifa7);

        tarifas7.add(tarifa4);
        tarifas7.add(tarifa6);
        tarifas7.add(tarifa7);

        tarifas8.add(tarifa1);
        tarifas8.add(tarifa5);

        tarifas9.add(tarifa2);
        tarifas9.add(tarifa4);

        tarifas10.add(tarifa4);
        tarifas10.add(tarifa5);
        tarifas10.add(tarifa6);

        tarifas11.add(tarifa4);
        tarifas11.add(tarifa5);
        tarifas11.add(tarifa6);

        tarifas12.add(tarifa1);
        tarifas12.add(tarifa2);
        tarifas12.add(tarifa3);

        Date fecha1 = new Date(120, 0, 1);   // 1 de enero de 2020
        Date fecha2 = new Date(120, 3, 15);  // 15 de abril de 2020
        Date fecha3 = new Date(120, 6, 30);  // 30 de julio de 2020
        Date fecha4 = new Date(120, 9, 25);  // 25 de octubre de 2020
        Date fecha5 = new Date(121, 0, 1);   // 1 de enero de 2021
        Date fecha6 = new Date(121, 3, 15);  // 15 de abril de 2021
        Date fecha7 = new Date(121, 6, 30);  // 30 de julio de 2021
        Date fecha8 = new Date(121, 9, 25);  // 25 de octubre de 2021
        Date fecha9 = new Date(122, 0, 1);   // 1 de enero de 2022
        Date fecha10 = new Date(122, 3, 15); // 15 de abril de 2022
        Date fecha11 = new Date(122, 6, 30); // 30 de julio de 2022
        Date fecha12 = new Date(120, 1, 28); // 28 de febrero de 2020
        Date fecha13 = new Date(121, 4, 20); // 20 de mayo de 2021
        Date fecha14 = new Date(121, 8, 12); // 12 de septiembre de 2021
        Date fecha15 = new Date(122, 1, 28); // 28 de febrero de 2022
        Date fecha16 = new Date(122, 4, 20); // 20 de mayo de 2022
        Date fecha17 = new Date(122, 8, 12); // 12 de septiembre de 2022
        Date fecha18 = new Date(120, 2, 7);  // 7 de marzo de 2020
        Date fecha19 = new Date(121, 5, 10); // 10 de junio de 2021
        Date fecha20 = new Date(121, 7, 22); // 22 de agosto de 2021
        Date fecha21 = new Date(122, 2, 7);  // 7 de marzo de 2022
        Date fecha22 = new Date(122, 5, 10); // 10 de junio de 2022
        Date fecha23 = new Date(122, 7, 22); // 22 de agosto de 2022
        Date fecha24 = new Date(120, 4, 31); // 31 de mayo de 2020
        Date fecha25 = new Date(121, 1, 9);  // 9 de febrero de 2021
        Date fecha26 = new Date(121, 11, 5); // 5 de diciembre de 2021
        Date fecha27 = new Date(122, 4, 31); // 31 de mayo de 2022
        Date fecha28 = new Date(122, 1, 9);  // 9 de febrero de 2022
        Date fecha29 = new Date(122, 11, 5); // 5 de diciembre de 2022
        Date fecha30 = new Date(120, 8, 18); // 18 de septiembre de 2020

        Recarga recarga1 = new Recarga(fecha1, 1000, true, admin1);
        Recarga recarga2 = new Recarga(fecha2, 1200, false, admin1);
        Recarga recarga3 = new Recarga(fecha3, 4500, false, admin1);

        Recarga recarga4 = new Recarga(fecha4, 2300, false, admin2);
        Recarga recarga5 = new Recarga(fecha5, 1200, true, admin2);
        Recarga recarga6 = new Recarga(fecha6, 2000, false, admin2);
        Recarga recarga7 = new Recarga(fecha7, 2500, true, admin3);
        Recarga recarga8 = new Recarga(fecha8, 4300, true, admin3);
        Recarga recarga9 = new Recarga(fecha9, 1200, false, admin3);
        Recarga recarga10 = new Recarga(fecha10, 2100, true, admin4);
        Recarga recarga11 = new Recarga(fecha11, 900, true, admin4);
        Recarga recarga12 = new Recarga(fecha12, 800, false, admin4);
        Recarga recarga13 = new Recarga(fecha13, 1500, true, admin5);
        Recarga recarga14 = new Recarga(fecha14, 1700, true, admin5);
        Recarga recarga15 = new Recarga(fecha15, 1900, false, admin5);
        Recarga recarga16 = new Recarga(fecha16, 3100, true, admin6);
        Recarga recarga17 = new Recarga(fecha17, 2100, false, admin6);
        Recarga recarga18 = new Recarga(fecha18, 1400, true, admin6);
        Recarga recarga19 = new Recarga(fecha19, 3100, false, admin7);
        Recarga recarga20 = new Recarga(fecha20, 1200, true, admin7);
        Recarga recarga21 = new Recarga(fecha21, 3200, false, admin7);
        Recarga recarga22 = new Recarga(fecha22, 1700, true, admin8);
        Recarga recarga23 = new Recarga(fecha23, 2500, true, admin8);
        Recarga recarga24 = new Recarga(fecha24, 2300, false, admin8);
        Recarga recarga25 = new Recarga(fecha25, 2900, true, admin9);
        Recarga recarga26 = new Recarga(fecha26, 4100, true, admin9);
        Recarga recarga27 = new Recarga(fecha27, 1000, true, admin9);
        Recarga recarga28 = new Recarga(fecha28, 600, false, admin10);
        Recarga recarga29 = new Recarga(fecha29, 800, false, admin10);
        Recarga recarga30 = new Recarga(fecha30, 300, true, admin10);

        Cuenta cuenta1 = new Cuenta();
        cuenta1.recargar(recarga1);
        cuenta1.recargar(recarga2);
        cuenta1.recargar(recarga3);

        Cuenta cuenta2 = new Cuenta();
        cuenta2.recargar(recarga4);
        cuenta2.recargar(recarga5);
        cuenta2.recargar(recarga6);

        Cuenta cuenta3 = new Cuenta();
        cuenta3.recargar(recarga7);
        cuenta3.recargar(recarga8);
        cuenta3.recargar(recarga9);

        Cuenta cuenta4 = new Cuenta();
        cuenta4.recargar(recarga10);
        cuenta4.recargar(recarga11);
        cuenta4.recargar(recarga12);

        Cuenta cuenta5 = new Cuenta();
        cuenta5.recargar(recarga13);
        cuenta5.recargar(recarga14);
        cuenta5.recargar(recarga15);

        Cuenta cuenta6 = new Cuenta();
        cuenta6.recargar(recarga16);
        cuenta6.recargar(recarga17);
        cuenta6.recargar(recarga18);

        Cuenta cuenta7 = new Cuenta();
        cuenta7.recargar(recarga19);
        cuenta7.recargar(recarga20);
        cuenta7.recargar(recarga21);

        Cuenta cuenta8 = new Cuenta();
        cuenta8.recargar(recarga22);
        cuenta8.recargar(recarga23);
        cuenta8.recargar(recarga24);

        Cuenta cuenta9 = new Cuenta();
        cuenta9.recargar(recarga25);
        cuenta9.recargar(recarga26);
        cuenta9.recargar(recarga27);

        Cuenta cuenta10 = new Cuenta();
        cuenta10.recargar(recarga28);
        cuenta10.recargar(recarga29);
        cuenta10.recargar(recarga30);

        Propietario propietario1 = new Propietario(1000, cuenta1, "Miguel Sánchez", "miguel123", 4378921);
        Propietario propietario2 = new Propietario(2000, cuenta2, "Ana González", "ana123", 6027534);
        Propietario propietario3 = new Propietario(1500, cuenta3, "Carlos Rodríguez", "carlos123", 4356789);
        Propietario propietario4 = new Propietario(1200, cuenta4, "Laura Pérez", "laura123", 1982356);
        Propietario propietario5 = new Propietario(2000, cuenta5, "Luisa Martínez", "luisa123", 8924567);
        Propietario propietario6 = new Propietario(1500, cuenta6, "Alejandro Castro", "ale123", 2210789);
        Propietario propietario7 = new Propietario(1200, cuenta7, "David López", "david123", 5038642);
        Propietario propietario8 = new Propietario(1500, cuenta8, "Gabriela Ramírez", "gaby123", 7654321);
        Propietario propietario9 = new Propietario(1000, cuenta9, "Juan Silva", "juan123", 3541098);
        Propietario propietario10 = new Propietario(1000, cuenta10, "Mariana Morales", "mari123", 4768059);

        FachadaServicios.getInstancia().agregar(propietario1);
        FachadaServicios.getInstancia().agregar(propietario2);
        FachadaServicios.getInstancia().agregar(propietario3);
        FachadaServicios.getInstancia().agregar(propietario4);
        FachadaServicios.getInstancia().agregar(propietario5);
        FachadaServicios.getInstancia().agregar(propietario6);
        FachadaServicios.getInstancia().agregar(propietario7);
        FachadaServicios.getInstancia().agregar(propietario8);
        FachadaServicios.getInstancia().agregar(propietario9);
        FachadaServicios.getInstancia().agregar(propietario10);

        Puesto puesto1 = new Puesto("Peaje Ciudad de la Costa", "Ruta interbalnearia Km21", tarifas1);
        Puesto puesto2 = new Puesto("Peaje Pando", "Ruta interbalnearia Km25", tarifas2);
        Puesto puesto3 = new Puesto("Peaje Solís", "Ruta interbalnearia Km63", tarifas3);
        Puesto puesto4 = new Puesto("Peaje Santa Lucía", "Ruta 1 Km77", tarifas4);
        Puesto puesto5 = new Puesto("Peaje Santa Rosa", "Ruta 1 Km119", tarifas5);
        Puesto puesto6 = new Puesto("Peaje San José", "Ruta 3 Km75", tarifas6);
        Puesto puesto7 = new Puesto("Peaje Soca", "Ruta 8 Km29", tarifas7);
        Puesto puesto8 = new Puesto("Peaje Sauce", "Ruta 6 Km58", tarifas8);
        Puesto puesto9 = new Puesto("Peaje Colonia Wilson", "Ruta 2 Km173", tarifas9);
        Puesto puesto10 = new Puesto("Peaje Paysandú", "Ruta 3 Km385", tarifas10);
        Puesto puesto11 = new Puesto("Peaje Guichón", "Ruta 90 Km89", tarifas11);
        Puesto puesto12 = new Puesto("Peaje Nueva Palmira", "Ruta 21 Km289", tarifas12);

        FachadaServicios.getInstancia().agregar(puesto1);
        FachadaServicios.getInstancia().agregar(puesto2);
        FachadaServicios.getInstancia().agregar(puesto3);
        FachadaServicios.getInstancia().agregar(puesto4);
        FachadaServicios.getInstancia().agregar(puesto5);
        FachadaServicios.getInstancia().agregar(puesto6);
        FachadaServicios.getInstancia().agregar(puesto7);
        FachadaServicios.getInstancia().agregar(puesto8);
        FachadaServicios.getInstancia().agregar(puesto9);
        FachadaServicios.getInstancia().agregar(puesto10);

        Frecuentes frecuentes1 = new Frecuentes("Frecuente Tarifa Amiga");
        Frecuentes frecuentes2 = new Frecuentes("Frecuente Descuento Familiar");
        Frecuentes frecuentes3 = new Frecuentes("Frecuente Descuento Fidelidad");
        Trabajadores trabajadores1 = new Trabajadores("Trabajadores Empresa UPM");
        Trabajadores trabajadores2 = new Trabajadores("Trabajadores Empresa Effice");
        Trabajadores trabajadores3 = new Trabajadores("Trabajadores Empresa Fanapel");
        Exonerados exonerados1 = new Exonerados("Exonerados Vecino cercano");
        Exonerados exonerados2 = new Exonerados("Exonerados Ministerio Vivienda");
        Exonerados exonerados3 = new Exonerados("Exonerados Presidencia");

        Bonificacion bonificacion1 = new Bonificacion("boni1", fecha29, puesto1, propietario1, frecuentes2);
        Bonificacion bonificacion2 = new Bonificacion("boni2", fecha27, puesto2, propietario1, frecuentes2);
        FachadaServicios.getInstancia().agregar(bonificacion1);
        FachadaServicios.getInstancia().agregar(bonificacion2);
        propietario1.agregarBonificacion(bonificacion1);
        propietario1.agregarBonificacion(bonificacion2);
        puesto1.agregarBonificacion(bonificacion1);
        puesto2.agregarBonificacion(bonificacion2);

        Bonificacion bonificacion3 = new Bonificacion("boni3", fecha25, puesto1, propietario2, exonerados2);
        Bonificacion bonificacion4 = new Bonificacion("boni4", fecha23, puesto2, propietario2, exonerados2);
        Bonificacion bonificacion5 = new Bonificacion("boni5", fecha22, puesto3, propietario2, exonerados2);
        Bonificacion bonificacion6 = new Bonificacion("boni6", fecha19, puesto4, propietario2, exonerados2);
        FachadaServicios.getInstancia().agregar(bonificacion3);
        FachadaServicios.getInstancia().agregar(bonificacion4);
        FachadaServicios.getInstancia().agregar(bonificacion5);
        FachadaServicios.getInstancia().agregar(bonificacion6);
        propietario2.agregarBonificacion(bonificacion3);
        propietario2.agregarBonificacion(bonificacion4);
        propietario2.agregarBonificacion(bonificacion5);
        propietario2.agregarBonificacion(bonificacion6);
        puesto1.agregarBonificacion(bonificacion3);
        puesto2.agregarBonificacion(bonificacion4);
        puesto3.agregarBonificacion(bonificacion5);
        puesto4.agregarBonificacion(bonificacion6);

        Bonificacion bonificacion7 = new Bonificacion("boni7", fecha28, puesto10, propietario3, trabajadores3);
        Bonificacion bonificacion8 = new Bonificacion("boni8", fecha5, puesto11, propietario3, trabajadores3);
        Bonificacion bonificacion9 = new Bonificacion("boni9", fecha16, puesto12, propietario3, trabajadores3);
        FachadaServicios.getInstancia().agregar(bonificacion7);
        FachadaServicios.getInstancia().agregar(bonificacion8);
        FachadaServicios.getInstancia().agregar(bonificacion9);
        propietario3.agregarBonificacion(bonificacion7);
        propietario3.agregarBonificacion(bonificacion8);
        propietario3.agregarBonificacion(bonificacion9);
        puesto10.agregarBonificacion(bonificacion7);
        puesto11.agregarBonificacion(bonificacion8);
        puesto12.agregarBonificacion(bonificacion9);

        Bonificacion bonificacion10 = new Bonificacion("boni10", fecha14, puesto8, propietario4, frecuentes1);
        Bonificacion bonificacion11 = new Bonificacion("boni11", fecha18, puesto9, propietario4, frecuentes1);
        FachadaServicios.getInstancia().agregar(bonificacion10);
        FachadaServicios.getInstancia().agregar(bonificacion11);

        propietario4.agregarBonificacion(bonificacion10);
        propietario4.agregarBonificacion(bonificacion11);
        puesto8.agregarBonificacion(bonificacion10);
        puesto9.agregarBonificacion(bonificacion11);

        Bonificacion bonificacion12 = new Bonificacion("boni12", fecha6, puesto5, propietario5, frecuentes3);
        Bonificacion bonificacion13 = new Bonificacion("boni13", fecha2, puesto6, propietario5, frecuentes3);
        FachadaServicios.getInstancia().agregar(bonificacion12);
        FachadaServicios.getInstancia().agregar(bonificacion13);
        propietario5.agregarBonificacion(bonificacion12);
        propietario5.agregarBonificacion(bonificacion13);
        puesto5.agregarBonificacion(bonificacion12);
        puesto6.agregarBonificacion(bonificacion13);

        Bonificacion bonificacion14 = new Bonificacion("boni14", fecha4, puesto7, propietario6, trabajadores1);
        Bonificacion bonificacion15 = new Bonificacion("boni15", fecha19, puesto8, propietario6, trabajadores1);
        FachadaServicios.getInstancia().agregar(bonificacion14);
        FachadaServicios.getInstancia().agregar(bonificacion15);
        propietario6.agregarBonificacion(bonificacion14);
        propietario6.agregarBonificacion(bonificacion15);
        puesto7.agregarBonificacion(bonificacion14);
        puesto8.agregarBonificacion(bonificacion15);

        Bonificacion bonificacion16 = new Bonificacion("boni16", fecha11, puesto9, propietario7, trabajadores2);
        FachadaServicios.getInstancia().agregar(bonificacion16);
        propietario7.agregarBonificacion(bonificacion16);
        puesto9.agregarBonificacion(bonificacion16);

        Bonificacion bonificacion17 = new Bonificacion("boni17", fecha13, puesto1, propietario8, exonerados1);
        FachadaServicios.getInstancia().agregar(bonificacion17);
        propietario8.agregarBonificacion(bonificacion17);
        puesto1.agregarBonificacion(bonificacion17);

        Bonificacion bonificacion18 = new Bonificacion("boni18", fecha15, puesto2, propietario9, exonerados1);
        FachadaServicios.getInstancia().agregar(bonificacion18);

        propietario9.agregarBonificacion(bonificacion18);
        puesto9.agregarBonificacion(bonificacion18);

        Bonificacion bonificacion19 = new Bonificacion("boni19", fecha30, puesto3, propietario10, exonerados3);
        Bonificacion bonificacion20 = new Bonificacion("boni20", fecha1, puesto4, propietario10, exonerados3);
        FachadaServicios.getInstancia().agregar(bonificacion19);
        FachadaServicios.getInstancia().agregar(bonificacion20);
        propietario10.agregarBonificacion(bonificacion19);
        propietario10.agregarBonificacion(bonificacion20);
        puesto3.agregarBonificacion(bonificacion19);
        puesto4.agregarBonificacion(bonificacion20);

        Vehiculo vehiculo1 = new Vehiculo("AAB2123", "Rojo", "Toyota Corolla", categoria1, propietario1);
        propietario1.agregarVehiculo(vehiculo1);
        Vehiculo vehiculo2 = new Vehiculo("DAF4456", "Azul", "Honda Civic", categoria6, propietario2);
        propietario2.agregarVehiculo(vehiculo2);
        Vehiculo vehiculo3 = new Vehiculo("GAE7779", "Blanco", "Ford Focus", categoria1, propietario3);
        propietario3.agregarVehiculo(vehiculo3);
        Vehiculo vehiculo4 = new Vehiculo("JAC0312", "Negro", "Chevrolet Cruze", categoria1, propietario4);
        propietario4.agregarVehiculo(vehiculo4);
        Vehiculo vehiculo5 = new Vehiculo("MAD3345", "Plateado", "Volkswagen Golf", categoria1, propietario5);
        propietario5.agregarVehiculo(vehiculo5);
        Vehiculo vehiculo6 = new Vehiculo("PAG6748", "Gris", "BMW X5", categoria3, propietario6);
        propietario6.agregarVehiculo(vehiculo6);
        Vehiculo vehiculo7 = new Vehiculo("SAA9701", "Verde", "Jeep Wrangler", categoria3, propietario7);
        propietario7.agregarVehiculo(vehiculo7);
        Vehiculo vehiculo8 = new Vehiculo("SAB2334", "Amarillo", "Fiat 500", categoria1, propietario8);
        propietario8.agregarVehiculo(vehiculo8);
        Vehiculo vehiculo9 = new Vehiculo("SAC3567", "Naranja", "Mini Cooper", categoria2, propietario9);
        propietario9.agregarVehiculo(vehiculo9);
        Vehiculo vehiculo10 = new Vehiculo("SAH3890", "Celeste", "Nissan Sentra", categoria2, propietario10);
        propietario10.agregarVehiculo(vehiculo10);

        FachadaServicios.getInstancia().agregar(vehiculo1);
        FachadaServicios.getInstancia().agregar(vehiculo2);
        FachadaServicios.getInstancia().agregar(vehiculo3);
        FachadaServicios.getInstancia().agregar(vehiculo4);
        FachadaServicios.getInstancia().agregar(vehiculo5);
        FachadaServicios.getInstancia().agregar(vehiculo6);
        FachadaServicios.getInstancia().agregar(vehiculo7);
        FachadaServicios.getInstancia().agregar(vehiculo8);
        FachadaServicios.getInstancia().agregar(vehiculo9);
        FachadaServicios.getInstancia().agregar(vehiculo10);

        Notificacion notificacion1 = new Notificacion("¡Pago exitoso! Se ha registrado el pago de peaje para tu vehículo.", fecha5);
        Notificacion notificacion2 = new Notificacion("Aviso: Tu cuenta de peaje está baja. Por favor, recárgala para continuar usando el servicio.", fecha7);
        Notificacion notificacion3 = new Notificacion("Se ha detectado un vehículo sin pagar el peaje. Por favor, regulariza tu situación.", fecha10);
        Notificacion notificacion4 = new Notificacion("Recuerda que el peaje aumentará a partir del próximo mes. Mantente informado.", fecha13);
        Notificacion notificacion5 = new Notificacion("Notificación: Cambio en el horario de atención en la cabina de peaje principal.", fecha16);
        Notificacion notificacion6 = new Notificacion("¡Felicidades! Eres uno de nuestros usuarios más frecuentes. Obtén beneficios exclusivos.", fecha19);
        Notificacion notificacion7 = new Notificacion("Alerta: Se ha registrado un uso inusual de tu cuenta de peaje. Verifica tus transacciones.", fecha22);
        Notificacion notificacion8 = new Notificacion("Tu vehículo ha sido suspendido temporalmente por infracciones de pago de peaje.", fecha25);
        Notificacion notificacion9 = new Notificacion("Nueva función disponible: Pago de peaje automático. Activa esta opción en tu cuenta.", fecha28);
        Notificacion notificacion10 = new Notificacion("Aviso importante: Realizaremos mantenimiento en las cabinas de peaje. Pueden haber demoras.", fecha30);
        Notificacion notificacion11 = new Notificacion("Se ha vencido el plazo de pago del peaje. Evita multas y regulariza tu situación.", fecha27);
        Notificacion notificacion12 = new Notificacion("Actualización de términos y condiciones: Por favor, revisa y acepta los nuevos términos.", fecha24);
        Notificacion notificacion13 = new Notificacion("Recordatorio: El próximo lunes será feriado y se aplicará tarifa especial de peaje.", fecha21);
        Notificacion notificacion14 = new Notificacion("Información de tráfico: Se reporta congestión en la autopista cerca del peaje. Planifica tu viaje.", fecha18);
        Notificacion notificacion15 = new Notificacion("Tu cuenta de peaje ha sido bloqueada. Comunícate con nuestro servicio de atención al cliente.", fecha15);
        Notificacion notificacion16 = new Notificacion("¡Bienvenido al nuevo sistema de peajes electrónicos! Disfruta de un pago rápido y sin efectivo.", fecha12);
        Notificacion notificacion17 = new Notificacion("Aviso de descuento: Obtén un 20% de descuento en peajes durante este fin de semana.", fecha9);
        Notificacion notificacion18 = new Notificacion("Se ha registrado un cambio en la ubicación de la cabina de peaje. Sigue las indicaciones.", fecha6);
        Notificacion notificacion19 = new Notificacion("Actualización de la app: Descarga la última versión para acceder a nuevas funciones y mejoras.", fecha3);
        Notificacion notificacion20 = new Notificacion("Aviso de mantenimiento: El sistema de peajes estará temporalmente fuera de servicio mañana de 2 AM a 5 AM.", fecha1);

        propietario1.agregarNotificacion(notificacion1);
        propietario1.agregarNotificacion(notificacion2);
        propietario2.agregarNotificacion(notificacion3);
        propietario2.agregarNotificacion(notificacion4);
        propietario3.agregarNotificacion(notificacion5);
        propietario3.agregarNotificacion(notificacion6);
        propietario4.agregarNotificacion(notificacion7);
        propietario4.agregarNotificacion(notificacion8);
        propietario5.agregarNotificacion(notificacion9);
        propietario5.agregarNotificacion(notificacion10);
        propietario6.agregarNotificacion(notificacion11);
        propietario6.agregarNotificacion(notificacion12);
        propietario7.agregarNotificacion(notificacion13);
        propietario7.agregarNotificacion(notificacion14);
        propietario8.agregarNotificacion(notificacion15);
        propietario8.agregarNotificacion(notificacion16);
        propietario9.agregarNotificacion(notificacion17);
        propietario9.agregarNotificacion(notificacion18);
        propietario10.agregarNotificacion(notificacion19);
        propietario10.agregarNotificacion(notificacion20);

        Transito transito1 = new Transito(fecha29, bonificacion3, puesto1, vehiculo1);
        Transito transito2 = new Transito(fecha27, bonificacion4, puesto2, vehiculo10);
        Transito transito3 = new Transito(fecha25, bonificacion5, puesto3, vehiculo2);
        Transito transito4 = new Transito(fecha23, bonificacion6, puesto4, vehiculo2);
        Transito transito5 = new Transito(fecha21, bonificacion17, puesto1, vehiculo3);
        Transito transito6 = new Transito(fecha19, bonificacion18, puesto2, vehiculo3);
        Transito transito7 = new Transito(fecha17, bonificacion19, puesto3, vehiculo4);
        Transito transito8 = new Transito(fecha15, bonificacion20, puesto4, vehiculo4);
        //estos transitos corresponden a exonerados
        vehiculo1.agregarTransito(transito1);

        Transito transito9 = new Transito(fecha13, bonificacion1, puesto1, vehiculo1);
        Transito transito10 = new Transito(fecha11, bonificacion2, puesto2, vehiculo5);
        Transito transito11 = new Transito(fecha9, bonificacion7, puesto10, vehiculo5);
        Transito transito12 = new Transito(fecha7, bonificacion8, puesto11, vehiculo6);
        Transito transito13 = new Transito(fecha5, bonificacion10, puesto8, vehiculo6);
        Transito transito14 = new Transito(fecha3, bonificacion11, puesto9, vehiculo7);
        Transito transito15 = new Transito(fecha1, bonificacion12, puesto5, vehiculo7);
        Transito transito16 = new Transito(fecha28, bonificacion13, puesto6, vehiculo8);
        Transito transito17 = new Transito(fecha26, bonificacion14, puesto7, vehiculo8);
        Transito transito18 = new Transito(fecha24, bonificacion15, puesto8, vehiculo9);
        Transito transito19 = new Transito(fecha22, bonificacion16, puesto9, vehiculo9);
        Transito transito20 = new Transito(fecha20, bonificacion7, puesto10, vehiculo10);
        vehiculo1.agregarTransito(transito9);

        //Falta que tenga sentido lo que pagaron. Las bonificaciones y puestos corresponden. 
        //No revise que las fechas tengan sentido con las fechas de adjudicacion de las bonificaciones usadas con la de los transitos.
    }

}
