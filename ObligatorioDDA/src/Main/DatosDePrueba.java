package Main;

import Dominio.Administrador;
import Dominio.Bonificacion;
import Dominio.Categoria;
import Dominio.Cuenta;
import Dominio.Propietario;
import Dominio.Recarga;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class DatosDePrueba {

    public static void cargar() {

        Administrador admin1 = new Administrador("Gerardo Silva", "gera123", 5123456);
        Administrador admin2 = new Administrador("Ana Lopez", "ana123", 5123456);
        Administrador admin3 = new Administrador("Santiago Lacretta", "santi123", 3245678);
        Administrador admin4 = new Administrador("Diego Gregoraz", "diego123", 2456789);
        Administrador admin5 = new Administrador("Alejandro González", "ale123", 2156789);
        Administrador admin6 = new Administrador("Valentina López", "vale123", 1345678);
        Administrador admin7 = new Administrador("Diego Ramírez", "diegor123", 3245678);
        Administrador admin8 = new Administrador("Juan Morales", "juan123", 4356789);
        Administrador admin9 = new Administrador("Isabella Castro", "isa123", 5324567);
        Administrador admin10 = new Administrador("Camila Silva", "cami123", 4234567);

        Categoria categoria1 = new Categoria("Sedán");
        Categoria categoria2 = new Categoria("SUV");
        Categoria categoria3 = new Categoria("Camioneta");
        Categoria categoria4 = new Categoria("Camión");
        Categoria categoria5 = new Categoria("Autobús");
        Categoria categoria6 = new Categoria("Coupé");
        Categoria categoria7 = new Categoria("Convertible");

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

        //faltan notificaciones 
//
//        Bonificacion bonificacion1 = new Bonificacion(fecha29, null, propietario1, null);
//        Bonificacion bonificacion2 = new Bonificacion(fecha27, null, propietario1, null);
//
//        propietario1.agregarBonificacion(bonificacion1);
//        propietario1.agregarBonificacion(bonificacion2);
//
//        Bonificacion bonificacion3 = new Bonificacion(fecha25, null, propietario2, null);
//        Bonificacion bonificacion4 = new Bonificacion(fecha23, null, propietario2, null);
//        Bonificacion bonificacion5 = new Bonificacion(fecha22, null, propietario2, null);
//        Bonificacion bonificacion6 = new Bonificacion(fecha19, null, propietario2, null);
//
//        propietario2.agregarBonificacion(bonificacion3);
//        propietario2.agregarBonificacion(bonificacion4);
//        propietario2.agregarBonificacion(bonificacion5);
//        propietario2.agregarBonificacion(bonificacion6);
//
//        Bonificacion bonificacion7 = new Bonificacion(fecha28, null, propietario3, null);
//        Bonificacion bonificacion8 = new Bonificacion(fecha5, null, propietario3, null);
//        Bonificacion bonificacion9 = new Bonificacion(fecha16, null, propietario3, null);
//        propietario3.agregarBonificacion(bonificacion7);
//        propietario3.agregarBonificacion(bonificacion8);
//        propietario3.agregarBonificacion(bonificacion9);
//
//        Bonificacion bonificacion10 = new Bonificacion(fecha14, null, propietario4, null);
//        Bonificacion bonificacion11 = new Bonificacion(fecha18, null, propietario4, null);
//
//        propietario4.agregarBonificacion(bonificacion10);
//        propietario4.agregarBonificacion(bonificacion11);
//
//        Bonificacion bonificacion12 = new Bonificacion(fecha6, null, propietario5, null);
//        Bonificacion bonificacion13 = new Bonificacion(fecha2, null, propietario5, null);
//        propietario5.agregarBonificacion(bonificacion12);
//        propietario5.agregarBonificacion(bonificacion13);
//
//        Bonificacion bonificacion14 = new Bonificacion(fecha4, null, propietario6, null);
//        Bonificacion bonificacion15 = new Bonificacion(fecha19, null, propietario6, null);
//        propietario6.agregarBonificacion(bonificacion14);
//        propietario6.agregarBonificacion(bonificacion15);
//
//        Bonificacion bonificacion16 = new Bonificacion(fecha11, null, propietario7, null);
//        propietario7.agregarBonificacion(bonificacion16);
//
//        Bonificacion bonificacion17 = new Bonificacion(fecha13, null, propietario8, null);
//        propietario8.agregarBonificacion(bonificacion17);
//
//        Bonificacion bonificacion18 = new Bonificacion(fecha15, null, propietario9, null);
//        propietario9.agregarBonificacion(bonificacion18);
//
//        Bonificacion bonificacion19 = new Bonificacion(fecha30, null, propietario10, null);
//        Bonificacion bonificacion20 = new Bonificacion(fecha1, null, propietario10, null);
//
//        propietario10.agregarBonificacion(bonificacion19);
//        propietario10.agregarBonificacion(bonificacion20);

        //falta puesto y tipoBonificacion
    }

}
