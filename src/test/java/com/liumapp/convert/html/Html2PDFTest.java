package com.liumapp.convert.html;

import com.liumapp.qtools.file.basic.FileTool;
import junit.framework.TestCase;
import org.junit.Test;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author liumapp
 * @file Html2PDFTest.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 4/25/18
 */

public class Html2PDFTest extends TestCase {

    private String pdfPath = "/usr/local/tomcat/project/convert-html-to-pdf/test.pdf";

    private String htmlContent = "<!DOCTYPE html>\n<html>\n<head>\n</head>\n<body>\n<h1 style=\"text-align: center;\">测试文档</h1>\n<p>&nbsp;</p>\n<ul>\n<li style=\"text-align: left;\">内容1内容1内容1内容1内容1内容1内容1内容1内容1内容1内容1内容1内容1内容1内容1内容1内容1内容1内容1内容1内容1内容1内容1内容1内容1内容1内容1</li>\n<li>内容2内容2内容2内容2内容2内容2内容2内容2内容2内容2内容2内容2内容2内容2内容2内容2内容2内容2内容2内容2内容2内容2内容2内容2内容2内容2</li>\n<li style=\"text-align: left;\">内容3内容3内容3内容3内容3内容3内容3内容3内容3内容3内容3内容3内容3内容3内容3内容3内容3内容3内容3内容3内容3内容3内容3内容3内容3内容3内容3内容3内容3内容3内容3内容3内容3内容3内容3</li>\n</ul>\n<p>&nbsp;</p>\n<h2>二号标题</h2>\n<ol>\n<li>内容1</li>\n<li>内容2</li>\n<li>内容3</li>\n</ol>\n<h2>&nbsp;</h2>\n</body>\n</html>";

    @Test
    public void testConvert () throws FileNotFoundException {
        Html2PDF html2PDF = new Html2PDF();
        html2PDF.html2pdf(pdfPath,htmlContent);
    }

    @Test
    public void testHtmlFile () throws IOException {
        Html2PDF html2PDF = new Html2PDF();
        String htmlFilePath = Html2PDFTest.class.getClassLoader().getResource("01.html").getFile();
        String htmlContents = FileTool.readFileAsString(htmlFilePath);
        html2PDF.html2pdf("./test5.pdf", htmlContents);//样式出现异常
    }

    @Test
    public void testHtmlFileByFlyingsaucer () throws IOException {

    }

}
