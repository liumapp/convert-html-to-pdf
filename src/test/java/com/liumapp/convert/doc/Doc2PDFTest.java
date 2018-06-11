package com.liumapp.convert.doc;

import junit.framework.TestCase;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * @author liumapp
 * @file Doc2PDFTest.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 4/25/18
 */

public class Doc2PDFTest extends TestCase {

    private String pdfPath = "/usr/local/tomcat/project/convert-doc-to-pdf/test.pdf";

    private String docPath = "/usr/local/tomcat/project/convert-doc-to-pdf/doc/test.doc";

    @Test
    public void testConvert () throws FileNotFoundException {

        Doc2PDF doc2PDF = new Doc2PDF();
        doc2PDF.doc2pdf(pdfPath,docPath);
    }

}
