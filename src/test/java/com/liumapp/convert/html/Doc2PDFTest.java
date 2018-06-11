package com.liumapp.convert.html;

import junit.framework.TestCase;
import org.junit.Test;

import java.io.FileNotFoundException;

/**
 * @author liumapp
 * @file Doc2PDFTest.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 4/25/18
 */

public class Doc2PDFTest extends TestCase {

    private String pdfPath = "/usr/local/tomcat/project/convert-html-to-pdf/test.pdf";

    private String docPath = "/usr/local/tomcat/project/convert-html-to-pdf/html/test.html";

    private String htmlContent = "<!DOCTYPE html>
<html>
<head>
</head>
<body>
<h1 style=\"text-align: center;\">测试文档</h1>
<p>&nbsp;</p>
<ul>
<li style=\"text-align: left;\">内容1内容1内容1内容1内容1内容1内容1内容1内容1内容1内容1内容1内容1内容1内容1内容1内容1内容1内容1内容1内容1内容1内容1内容1内容1内容1内容1</li>
<li>内容2内容2内容2内容2内容2内容2内容2内容2内容2内容2内容2内容2内容2内容2内容2内容2内容2内容2内容2内容2内容2内容2内容2内容2内容2内容2</li>
<li style=\"text-align: left;\">内容3内容3内容3内容3内容3内容3内容3内容3内容3内容3内容3内容3内容3内容3内容3内容3内容3内容3内容3内容3内容3内容3内容3内容3内容3内容3内容3内容3内容3内容3内容3内容3内容3内容3内容3</li>
</ul>
<p>&nbsp;</p>
<h2>二号标题</h2>
<ol>
<li>内容1</li>
<li>内容2</li>
<li>内容3</li>
</ol>
<h2>&nbsp;</h2>
</body>
</html>"

    @Test
    public void testConvert () throws FileNotFoundException {

        Doc2PDF doc2PDF = new Doc2PDF();
        doc2PDF.doc2pdf(pdfPath,docPath);
    }

}
