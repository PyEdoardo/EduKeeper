/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.projedoardo.edukeeper;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Arrays;
import java.util.List;
import java.io.IOException;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.ByteArrayOutputStream;
/**
 *
 * @author edoar
 */
public class Utilidades {
    public static String listaParaJson(List<String> lista) {
        ObjectMapper mapper = new ObjectMapper();
        String json = null;

        try {
            // Converte a lista para uma string JSON
            json = mapper.writeValueAsString(lista);
        } catch (JsonProcessingException e) {
            System.out.println("Erro ao converter a lista para JSON: " + e.getMessage());
        }

        return json;
    }
    public static List<String> jsonParaLista(String json) {
        ObjectMapper mapper = new ObjectMapper();
        List<String> lista = null;

        try {
            // Converte a string JSON para uma lista de strings
            lista = mapper.readValue(json, new TypeReference<List<String>>() {});
        } catch (IOException e) {
            System.out.println("Erro ao converter JSON para lista: " + e.getMessage());
        }

        return lista;
    }
    public static BufferedImage blobParaBufferedImage(byte[] blob) throws IOException {
        if (blob == null) {
            return null;
        }

        try (ByteArrayInputStream bais = new ByteArrayInputStream(blob)) {
            return ImageIO.read(bais);
        }
    }
    public static byte[] bufferedImageParaBlob(BufferedImage image) throws IOException {
        if (image == null) {
            return null;
        }

        try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
            ImageIO.write(image, "png", baos); // Use o formato desejado (ex: png, jpg)
            return baos.toByteArray();
        }
    }
}
