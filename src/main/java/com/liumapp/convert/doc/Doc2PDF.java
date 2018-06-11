package com.liumapp.convert.doc;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import com.aspose.words.*;

/**
 * @author liumapp
 * @file Doc2PDF.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 4/25/18
 */
public class Doc2PDF {

    public boolean getLicense() {
        boolean result = false;
        try {
            InputStream is = Doc2PDF.class.getClassLoader().getResourceAsStream("license.xml");
            License aposeLic = new License();
            aposeLic.setLicense(is);
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public void doc2pdf(String pdfPath , String wordPath) {
        // 验证License 若不验证则转化出的pdf文档会有水印产生
        if (!getLicense()) {
            return;
        }
        try {
            long old = System.currentTimeMillis();
            File file = new File(pdfPath);//新建一个空白pdf文档
            FileOutputStream os = new FileOutputStream(file);
            Document doc = new Document(wordPath);//Address是将要被转化的word文档
            doc.save(os, SaveFormat.PDF);//全面支持DOC, DOCX, OOXML, RTF HTML, OpenDocument, PDF, EPUB, XPS, SWF 相互转换
            long now = System.currentTimeMillis();
            System.out.println("共耗时：" + ((now - old) / 1000.0) + "秒");  //转化用时
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}