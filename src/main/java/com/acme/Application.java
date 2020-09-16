package com.acme;

import nl.siegmann.epublib.epub.EpubReader;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Application {

  public static void main(String[] args) throws IOException {
    // lets read `*.epub` files
    var epubBook = new EpubReader().readEpub(new BufferedInputStream(new FileInputStream(new File("<epub path>"))));
    System.out.println(epubBook);
  }

}
