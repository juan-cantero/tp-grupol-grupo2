package ar.edu.unahur.facade.mockdata;


import com.google.common.collect.ImmutableList;
import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import org.apache.commons.io.IOUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class MockData {

  public static ImmutableList<LibroMock> getLibroMocks() throws IOException {
    InputStream inputStream = new FileInputStream("/home/juanqui/unahurObj2/tp-grupol-grupo2/src/resources/book.json");
    String json = IOUtils.toString(inputStream);
    Type listType = new TypeToken<ArrayList<LibroMock>>() {
    }.getType();
    List<LibroMock> libros = new Gson().fromJson(json, listType);
    return ImmutableList.copyOf(libros);
  }



}
