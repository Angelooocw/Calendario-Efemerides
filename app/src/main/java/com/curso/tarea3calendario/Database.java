package com.curso.tarea3calendario;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.widget.Toast;

import com.curso.tarea3calendario.modelo.Celebracion;

import java.util.ArrayList;

/**
 * Created by Juan on 28-06-2018.
 */

public class Database {

    // Nombre de la base de datos, y tabla asociada
    private static final String DATABASE_NAME = "DBEfemerides";
    private static final String DATABASE_TABLE = "Celebracion";
    private static final int DATABASE_VERSION = 1;


    // Las constantes que representan las columnas de la tabla
    private static final String FILAID = "_id";
    private static final String DIA = "dia";
    private static final String MES = "mes";
    private static final String AÑO = "año";
    private static final String DESCRIPCION = "descripcion";
    private static final String TAG = "DBHelper";

    // Este String contiene el comando SQL para la creación de la base de datos
    private static final String DATABASE_CREATE = "create table " + DATABASE_TABLE +
            "(" + FILAID + " integer primary key autoincrement, " + DIA +
            " text not null, " + MES + " text not null, "+ AÑO + " text, "+ DESCRIPCION +
            " text not null);";



    private final Context contexto; // Contexto de la aplicacion
    private DatabaseHelper Helper; // Clase interna para acceso a base de datos SQL
    private SQLiteDatabase db; // La base de datos SQL

    public Database(Context contexto){
        this.contexto = contexto;
        Helper = new DatabaseHelper(contexto);
    }


    // Clase privada interna para acceso a base de datos SQL
    private static class DatabaseHelper extends SQLiteOpenHelper {
        DatabaseHelper(Context contexto) {
            super(contexto, DATABASE_NAME, null, DATABASE_VERSION);
        }
        @Override
        public void onCreate(SQLiteDatabase db) {
            try {
                Log.w(TAG, "Creando la base de datos");
            // Emite el comando SQL para crear la base de datos
                db.execSQL(DATABASE_CREATE);
                
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('1','1', '1554',' Muerte de Pedro de Valdivia ')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('3','1', '',' Día del reportero gráfico')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('6','1', '1839',' Combate del puente de Buin ')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('16','1', '1884',' Promulgación de la ley de Matrimonio Civil ')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('20','1', '',' Día del Roto Chileno')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('27','1', '',' Día Internacional de Conmemoración en Memoria de las Víctimas del Holocausto')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('2','2', '',' Día Mundial de los Humedales')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('4','2', '',' Día Mundial contra el Cáncer')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('7','2', '1866',' Combate Naval de Abtao ')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('8','2', '',' Día Nacional de la Piscola')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('9','2', '1821',' Fundación de San Bernardo ')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('9','2', '1552',' Fundación de Valdivia ')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('12','2', '1817',' Batalla de Chacabuco ')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('12','2', '1567',' Fundación de Castro ')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('12','2', '1853',' Fundación de Puerto Montt ')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('12','2', '1541',' Fundación de Santiago ')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('12','2', '1818',' Proclamación de la Declaración de la Independencia de Chile ')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('13','2', '1812',' Fundación de La Aurora de Chile ')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('13','2', '',' Día Mundial de la Radio')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('14','2', '',' Día de los Enamorados')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('14','2', '1879',' Ocupación de Antofagasta ')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('15','2', '',' Día Nacional del Brigadista Forestal')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('18','2', '',' Día de la Mujer de las Américas')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('20','2', '',' Día Mundial de la Justicia Social')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('21','2', '',' Día Internacional de la Lengua Materna')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('24','2', '1881',' Fundación de Temuco ')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('7','3', '',' Día del Experto en Prevención de Riesgos')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('8','3', '',' Día Internacional de la Mujer')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('12','3', '1550',' Batalla de Penco ')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('12','3', '1896',' Fundación de la Comuna de Río Negro ')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('13','3', '1904',' Inauguración del Cristo Redentor ')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('14','3', '1859',' Batalla de Los Loros ')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('16','3', '1817',' Fundación de la Escuela Militar ')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('19','3', '1818',' Batalla de Cancha Rayada ')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('20','3', '',' Día Internacional de la Francofonía')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('20','3', '1814',' Batalla de Membrillar ')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('21','3', '',' Día Internacional de la Eliminación de la Discriminación Racial')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('21','3', '',' Día Internacional de la Poesía')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('21','3', '',' Día Mundial del Síndrome de Down')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('21','3', '',' Día de la Fuerza Aérea')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('21','3', '',' Día Internacional de los Bosques')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('21','3', '1930',' Fundación de la Fuerza Aérea de Chile ')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('22','3', '',' Día Mundial del Agua')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('23','3', '1879',' Conquista de Calama por Tropas Chilenas ')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('23','3', '',' Día Metereológico Mundial')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('24','3', '',' Día Mundial de la Tuberculosis')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('25','3', '',' Día del que Está por Nacer y de la Adopción')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('31','3', '',' Día Internacional de la Visibilidad Transgénero')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('31','3', '',' Día Internacional para la Abolición de la Esclavitud')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('2','4', '',' Día Nacional de la Familia')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('2','4', '',' Día Nacional de la Concienciación del Autismo y del Asperger')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('5','4', '1818',' Batalla de Maipú ')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('5','4', '1879',' Declaración de guerra a Bolivia y Perú ')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('5','4', '',' Día del Terapeuta Educacional')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('5','4', '1910',' Inauguración del Ferrocarril Transandino Los Andes - Mendoza ')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('6','4', '',' Día Nacional del Deporte para el Desarrollo y la Paz')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('7','4', '',' Día Mundial de la Salud')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('7','4', '',' Día Nacional de la Educación Rural')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('8','4', '1814',' Combate de Quechereguas ')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('9','4', '1960',' Estreno del musical La Pérgola de las Flores ')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('12','4', '1879',' Combate Naval de Chipana ')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('14','4', '',' Día de las Américas')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('14','4', '',' Día del Locutor')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('15','4', '',' Día de la Cocina Chilena')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('17','4', '',' Día Mundial de la Hemofilia')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('19','4', '',' Día Mundial de la Bicicleta')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('21','4', '1831',' Fundación de Ovalle ')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('22','4', '',' Día de la Tierra')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('23','4', '',' Día Mundial del Libro y del Derecho de Autor')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('24','4', '',' Día Mundial de los Animales de Laboratorio')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('25','4', '',' Día Mundial del Paludismo')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('25','4', '1844',' España reconoce la Independencia de Chile ')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('25','4', '1541',' Fundación de la Villa San Marcos de Arica ')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('26','4', '1813',' Combate de Yerbas Buenas ')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('26','4', '',' Día Mundial de la Propiedad Intelectual')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('26','4', '',' Día Nacional del Bife a lo Pobre')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('27','4', '',' Día Mundial del Diseño')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('27','4', '',' Día del Carabinero')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('28','4', '',' Día Mundial de la Salud y Seguridad en el Trabajo')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('29','4', '',' Día Mundial de la Danza')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('29','4', '',' Día Nacional del Emprendimiento')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('1','5', '',' Día Internacional del Trabajo')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('2','5', '1820',' Ocupación del Puerto de Talcahuano por Fuerzas Realistas ')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('3','5', '',' Día Mundial de la Libertad de Prensa')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('3','5', '1814',' Tratado de Lircay ')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('4','5', '',' Día Internacional del Bombero')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('5','5', '',' Día Internacional del Celíaco')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('6','5', '',' Día Nacional del Laboratorista Dental')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('6','5', '',' Día del Kinesiólogo')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('6','5', '',' Día del Nutricionista')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('7','5', '',' Día Mundial del Asma')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('8','5', '',' Día Internacional de la Cruz Roja y la Media Luna Roja')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('10','5', '',' Día Mundial del Lupus')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('10','5', '',' Día Nacional de la Madre')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('11','5', '',' Día Nacional del Teatro')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('11','5', '',' Día del Alumno')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('12','5', '',' Día Internacional de la Fibromialgia')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('12','5', '',' Día de la Enfermería')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('12','5', '',' Día de la Madre')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('12','5', '',' Día Mundial de los Elefantes')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('14','5', '',' Día Panamericano')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('14','5', '',' Día Nacional de la Ingeniería')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('15','5', '',' Día Nacional del Pisco')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('15','5', '',' Día de la Familia')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('17','5', '',' Día Internacional contra la Homofobia y Transfobia')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('17','5', '',' Día Mundial de las Telecomunicaciones y la Sociedad de la Información')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('17','5', '',' Día Nacional del Reciclaje')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('17','5', '',' Día de Internet')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('18','5', '',' Día Nacional de la Lucha Contra la Explotación Sexual Comercial Infantil')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('18','5', '',' Día del Soldado Conscripto')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('19','5', 'Comuna de Coquimbo',' Día del Pescador Artesanal ')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('21','5', '1879',' Combate Naval de Iquique ')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('21','5', '',' Día Mundial de la Diversidad Cultural para el Diálogo y El Desarrollo')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('22','5', '',' Día Internacional de la Diversidad Biológica')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('25','5', '',' Día del Completo')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('25','5', '',' Día Internacional de África')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('25','5', '',' Día Nacional del Suplementero')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('26','5', '',' Día Nacional del Patrimonio Cultural de Chile')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('26','5', '',' Día Nacional del Relacionador Público')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('26','5', '1818',' Muerte de Manuel Rodriguez ')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('31','5', '',' Día Mundial sin Tabaco')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('1','6', '',' Día Nacional de la Operadora Telefónica')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('1','6', '',' Día Nacional del Productor Lechero')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('4','6', '',' Día Internacional de los Niños Víctimas Inocentes de Agresión')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('5','6', '',' Día Mundial del Medio Ambiente')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('6','6', '',' Día del Comercio')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('6','6', '1837',' Muerte de Diego Portales ')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('7','6', '1880',' Asalto y Toma del Morro de Arica ')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('7','6', '',' Día de las Glorias de la Infantería')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('7','6', '1494',' Tratado de Tordesillas ')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('8','6', '',' Día Mundial del Océano')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('9','6', '',' Día del Barros Luco')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('11','6', '',' Día Nacional de la Guardadora de Colocación Nacional')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('12','6', '',' Día Mundial contra el Trabajo Infantil')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('14','6', '',' Día Mundial del Donante de Sangre')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('17','6', '',' Día Mundial de la Lucha contra la Desertificación y la Sequía')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('18','6', '',' Día del Orgullo Autista')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('19','6', '',' Día Nacional del Padre')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('19','6', '',' Día de la Policía de Investigaciones de Chile')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('20','6', '',' Día Mundial del Refugiado')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('21','6', '',' Día Nacional del Cine')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('21','6', '',' Día Internacional del Yoga')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('21','6', '',' Fiesta de la Música')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('24','6', '',' Día Nacional de los Pueblos Indígenas')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('24','6', '',' We Tripantu')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('26','6', '',' Día Internacional de la Lucha Contra el uso Indebido y el Tráfico Ilícito de Drogas')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('26','6', '',' Día Internacional en Apoyo de las Víctimas de la Tortura')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('26','6', '',' Día Nacional Contra la Tortura')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('26','6', '',' Día Nacional de la Marina Mercante')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('28','6', '',' Día del Orgullo Gay')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('29','6', '',' Día del Pescador')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('30','6', '',' Día del Bombero')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('4','7', '',' Día del Congreso Nacional')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('6','7', '',' Día del Árbol')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('9','7', '1882',' Combate de la Concepción ')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('9','7', '',' Día Oficial de la Bandera Nacional')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('10','7', '1882',' Combate de la Concepción ')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('11','7', '',' Día del Periodista')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('12','7', '1904',' Natalicio de Pablo Neruda ')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('23','7', '',' Día del Pisco')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('28','7', '',' Día del Campesino')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('28','7', '',' Día Mundial de la prevención de la Hepatitis')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('30','7', 'Región del Maule',' Día de la Región del Maule ')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('1','8', '',' Día del Ministerio de Agricultura')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('3','8', '',' Aniversario del Sistema Nacional de Servicios de Salud')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('3','8', '1813',' Sitio de Chillán ')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('6','8', '',' Día Nacional de la Miel')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('7','8', '',' Día Nacional del Dirigente de Juntas de Vecinos')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('10','8', '',' Día del Minero')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('12','8', '',' Día Internacional de la Juventud')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('13','8', '',' Día Internacional del Zurdo')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('14','8', 'Provincia de Cauquenes',' Día de la Provincia de Cauquenes ')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('18','8', '',' Día de la Solidaridad')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('19','8', '',' Día Escolar por la Paz y la No Violencia')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('19','8', '',' Día Mundial de la Asistencia Humanitaria')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('20','8', '',' Día de los Funcionarios del Ministerio del Interior')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('20','8', '1778',' Natalicio de Bernardo O Higgins ')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('21','8', '',' Día Oficial de la Dirección General de Aeronáutica Civil')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('21','8', '1839',' Término de la Guerra contra la Confederación Perú-Boliviana ')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('22','8', '',' Día Nacional del Folclor')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('26','8', '',' Día de la Educación Técnico-Profesional')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('26','8', 'Provincia de Curicó',' Día de la Provincia de Curicó ')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('26','8', '',' Día del Profesor Normalista')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('29','8', '',' Día Internacional Contra los Ensayos Nucleares')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('30','8', '',' Día Nacional del Detenido Desaparecido')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('30','8', 'Provincia de Talca',' Día de la Provincia de Talca ')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('30','8', '1916',' Expedición del Piloto Pardo a la Antártida ')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('4','9', '1821',' Muerte de José Miguel Carrera ')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('4','9', '',' Día Nacional del Vino')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('5','9', '',' Día del Reservista')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('6','9', '',' Día de la Atención Primaria de Salud')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('9','9', '1888',' Toma de Posesión de Isla de Pascua ')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('15','9', '',' Día Nacional de la Cultura Tradicional y Popular Chilena ')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('17','9', '',' Día Nacional de la Cueca')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('17','9', '',' Día del Huaso y de la Chilenidad')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('18','9', '1810',' Primera Junta de Gobierno ')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('19','9', '',' Día de la Glorias del Ejército')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('21','9', '',' Día Internacional de la Paz')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('21','9', '',' Día Nacional del Trabajador de la Radiodifusión Sonora')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('21','9', '1843',' Toma Posesión del Estrecho de Magallanes ')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('27','9', '',' Día Mundial del Turismo')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('27','9', '',' Día Nacional del Donante de Órganos y Tejidos del Cuerpo Humano')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('30','9', '',' Día Nacional del Guardaparques')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('1','10', '1814',' Batalla de Rancagua ')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('1','10', '',' Día de los Trabajadores de la Educación')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('1','10', '5',' Día del Adulto ')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('2','10', '1814',' Batalla de Rancagua ')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('2','10', '',' Día del Tecnólogo Médico')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('2','10', '',' Día Internacional de la No Violencia')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('3','10', '',' Día del Hospital')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('5','10', '',' Día Internacional contra la Prostitución')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('8','10', '1879',' Combate Naval de Angamos ')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('9','10', '',' Día Mundial del Correo')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('10','10', '',' Día Nacional de la Protección Civil')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('12','10', '1492',' Descubrimiento de América. Día de la Hispanidad ')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('12','10', '',' Día del Patrullero Escolar')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('13','10', '1914',' Fundación Cruz Roja Chilena Santiago Mujeres ')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('14','10', '',' Día de Conmemoración del Ministerio de Salud')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('15','10', '',' Día Nacional del Anciano y del Abuelo')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('16','10', '',' Día del Profesor')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('17','10', '',' Día Nacional del Niño')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('17','10', '',' Día Nacional para la Erradicación de la Pobreza')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('18','10', '',' Día de Celebración al Escudo y Bandera Nacionales')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('20','10', '',' Día del Churrasco')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('21','10', '',' Día Nacional del Deporte y la Recreación')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('24','10', '1842',' Muerte de Bernardo O Higgins ')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('24','10', '',' Día de las Naciones Unidas')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('28','10', '1818',' Captura de la María Isabel por Blanco Encalada ')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('28','10', '',' Día Internacional de la Animación')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('28','10', '',' Día de los Funcionarios Municipales')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('29','10', '',' Día Internacional del Internet')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('30','10', '',' Día Nacional del Ejecutado Político')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('31','10', '',' Día Nacional de las Iglesias Cristianas Evangélicas y Protestantes de Chile')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('2','11', '1879',' Desembarco y Toma de Pisagua ')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('3','11', '',' Día Internacional del Sandwich')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('5','11', '1820',' Captura de la Esmeralda en El Callao ')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('6','11', '',' Día de la Antártida Chilena')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('7','11', '',' Día Nacional del Artesano')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('8','11', '',' Día Mundial del Urbanismo')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('8','11', '',' Día Internacional de la Radiología ')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('8','11', '',' Día Mundial sin Wifi')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('9','11', '',' Día del Psicólogo')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('11','11', '',' Día Mundial de la Ciencia para la Paz y el Desarrollo  ')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('11','11', '',' Día del Asistente Social')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('15','11', '',' Día de la Cruz Roja Chilena')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('16','11', '',' Día Internacional para la Tolerancia')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('16','11', '',' Día de la Filosofía')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('18','11', ' Archivos y Museos y el de sus Trabajadores',' Día de la Dirección de Bibliotecas')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('19','11', '1842',' Aniversario de la Universidad de Chile ')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('20','11', '',' Día Universal de la Infancia')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('21','11', '',' Día Internacional del Saludo')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('21','11', '',' Día Mundial de la Televisión')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('22','11', '',' Día de la Educación Parvularia y del Educador de Párvulos')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('22','11', '',' Día del Fonoaudiólogo')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('22','11', '',' Día Nacional del Trasplante de Órganos')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('25','11', '',' Día Nacional para la Eliminación de la Violencia Contra la Mujer')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('25','11', '',' Día del Paramédico')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('26','11', '1865',' Combate de Papudo ')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('29','11', '',' Día Mundial del Niño Nacido Prematuro')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('30','11', '',' Día del Ministerio de Educación')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('30','11', '',' Día Nacional de la Gendarmería en Chile')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('1','12', '',' Día Mundial de la Lucha Contra el SIDA')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('1','12', '',' Día del Químico Farmaceútico')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('2','12', '',' Día Internacional para la Abolición de la Esclavitud')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('3','12', '',' Día Nacional de la Discapacidad')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('3','12', '',' Día de la Secretaria')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('3','12', '',' Día del Médico')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('4','12', '',' Día Mundial de la Publicidad')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('5','12', '',' Día Internacional del Voluntario')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('7','12', '',' Día de la Aviación Civil Internacional')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('9','12', '',' Día Internacional contra la Corrupción')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('10','12', '',' Día Internacional de los Derechos Humanos')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('10','12', '',' Día del Maestro')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('11','12', '',' Día Internacional de las Montañas')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('11','12', 'Provincia de Linares',' Día de la Provincia de Linares ')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('12','12', '',' Día de la Aeronáutica Civil')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('15','12', '',' Día Internacional del Té')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('18','12', '1903',' Fundación de la Cruz Roja Chilena ')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('18','12', '',' Día Internacional de la Lengua Árabe')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('20','12', '',' Día Internacional de la Solidaridad Humana')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('28','12', '',' Día de los Inocentes')");
                db.execSQL("insert into Celebracion(dia,mes,año,descripcion) values ('28','12', '',' Día del Escritor')");


            }
            catch(SQLException e) {
                e.printStackTrace();
            }
        }
        @Override
        public void onUpgrade(SQLiteDatabase db, int versionAnterior, int versionNueva) {
            Log.w(TAG, "Actualizando la base de datos desde la versión " + versionAnterior +
                    " a la versión " + versionNueva);
            db.execSQL("DROP TABLE IF EXISTS Celebracion");
            onCreate(db);
        }
    }

    // Abre la base de datos para escritura
    public Database abre() throws SQLException {
// Abre la base de datos para escritura
        db = Helper.getWritableDatabase();
        return this;
    }
    // Cierra la base de datos
    public void cierra() {
        Helper.close();
    }

    // Agrega Celebracion
    public long agregaCelebracion(String dia, String mes, String año, String descripcion) {
        // Objeto ContentValues es una linea de la base de datos
        ContentValues valores = new ContentValues();
        valores.put(DIA, dia);
        valores.put(MES, mes);
        valores.put(AÑO, año);
        valores.put(DESCRIPCION, descripcion);
        return db.insert(DATABASE_TABLE, null, valores);
    }

    public Cursor recuperaCelebracion() {
// Realiza una consulta a la base de datos para recuperar todos los contactos
        return db.query(DATABASE_TABLE, new String[] {FILAID, DIA, MES,AÑO, DESCRIPCION}, null, null,
                null, null, null);
    }

    // Recupera la celebracion del filaId dada como argumento
    public Cursor recuperaCelebracionPorId(long filaId) throws SQLException {
        Cursor c = db.query(DATABASE_TABLE, new String[]
                {FILAID, DIA, MES, AÑO, DESCRIPCION}, FILAID + "=" + filaId, null, null, null, null);
        if (c != null) {
            c.moveToFirst();
        }
        return c;
    }
    /*Recupera por mes y dia*/
    public ArrayList<Celebracion> recuperaCelebracionesEnDiaMes(int dia, int mes){

        ArrayList<Celebracion> listC = new ArrayList<>();
        abre();

        Cursor cursor = db.query(DATABASE_TABLE, new String[] {FILAID, DIA, MES,AÑO, DESCRIPCION},
                DIA + "=" + DatabaseUtils.sqlEscapeString(Integer.toString(dia))+ " AND "+MES+ "=" + DatabaseUtils.sqlEscapeString(Integer.toString(mes)), null, null, null, null);
        if(cursor.moveToFirst()){
            do {
                Log.d("db","1-"+cursor.getString(1));
                Log.d("db","2-"+cursor.getString(2));
                Log.d("db","3-"+cursor.getString(3));
                Log.d("db","4-"+cursor.getString(4));


               Celebracion celeb = new Celebracion(Integer.parseInt(cursor.getString(1)),Integer.parseInt(cursor.getString(2)),obtenerAño(cursor.getString(3)),cursor.getString(4));

               Log.d("db",celeb.getDescripción());
               listC.add(celeb);
            }while(cursor.moveToNext());
        }
        cierra();
        return listC;
    }
/*
    // Recupera el contacto con el nombre dado como argumento
    public Cursor recuperaCelebracion(String nombre) throws SQLException {
        Cursor c = db.query(DATABASE_TABLE, new String[] {FILAID, DIA, MES, DESCRIPCION},
                DIA + "=" + DatabaseUtils.sqlEscapeString(nombre), null, null, null, null);
        if (c != null) {
            c.moveToFirst();
        }
        return c;
    }
*/

private int obtenerAño(String a){
    int aa;
    try {
        aa=  Integer.parseInt(a);
    } catch (NumberFormatException | NullPointerException ex) {
         aa = -99;
    }

        return aa;
    }
}

