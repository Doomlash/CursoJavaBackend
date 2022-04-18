package com.maven_proyect;

import java.util.Scanner;

import com.mongodb.BasicDBObject;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import org.bson.Document;

public class App 
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int opcion;
        MongoClient client = MongoClients.create("mongodb://localhost:27017");
        MongoDatabase database = client.getDatabase("Challenge");
        MongoCollection<Document> usuarios = database.getCollection("Usuarios");
        while (true) {
            System.out.println("1.Ingresar\n2.Consultar\n3.Eliminar\n4.Listar\n5.Salir");
            opcion = s.nextInt();
            if(opcion==1){
                ingresar(usuarios);
            } else if(opcion==2){
                consultar(usuarios);
            } else if(opcion==3){
                eliminar(usuarios);
            } else if(opcion==4){
                listar(usuarios);
            } else {
                break;
            }
        }
    }

    private static void listar(MongoCollection<Document> usuarios) {
        for (Document d : usuarios.find()) {
            System.out.println(d.toJson());
        } 
    }

    private static void eliminar(MongoCollection<Document> usuarios) {
        Scanner s = new Scanner(System.in);
        BasicDBObject query = new BasicDBObject();
        query.put("dni",s.next());
        usuarios.deleteOne(query);
    }

    private static void consultar(MongoCollection<Document> usuarios) {
        Scanner s = new Scanner(System.in);
        BasicDBObject query = new BasicDBObject();
        query.put("dni",s.next());
        Document result = usuarios.find(query).first();
        if(result!=null){
            System.out.println(result.toJson());
        }
        
    }

    private static void ingresar(MongoCollection<Document> usuarios) {
        Scanner s = new Scanner(System.in);
        Document document = new Document("dni", s.next())
            .append("nombre", s.next())
            .append("apellido", s.next())
            .append("direccion", s.next());
        usuarios.insertOne(document);
    }


}
