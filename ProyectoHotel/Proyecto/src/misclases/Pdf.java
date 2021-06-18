/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misclases;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Image;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Pdf {

    public Pdf() {
    }

    public Pdf(Huesped x,String ing, String sal,int servicios) throws FileNotFoundException, DocumentException {
     String tiposervicios[]={"Servicio de comida al cuarto","Servicio de Bar","Tintoreria","SPA","Niñera"};
     int costo=x.getTipohab()*2000;
     int costo2=costo*x.getEstancia();
     Document documento = new Document();
     FileOutputStream ficheroPdf = new FileOutputStream("Recibo.pdf");
     PdfWriter.getInstance(documento,ficheroPdf).setInitialLeading(20);
     documento.open();   

     try
     {
         String ing2 ="",sal2 ="";
             char []ing1 =ing.toCharArray();
             char []sal1 =sal.toCharArray();
             for (int i = 0; i < 10; i++) {
             ing2=ing2+ing1[i];
             sal2=sal2+sal1[i];
         }
             SimpleDateFormat ft = new SimpleDateFormat ("E MM.dd hh:mm:ss");
             Date fecha = new Date();
             String fecha1=ft.format(fecha);
	     Image foto = Image.getInstance("pdf1.jpg");
             Image foto2 = Image.getInstance("firma.png");
	     foto2.scaleToFit(100, 100);
	     foto2.setAlignment(Chunk.ALIGN_MIDDLE);
             foto.setAlignment(Chunk.ALIGN_MIDDLE);
	     documento.add(foto);
             documento.add(new Paragraph(" "));
             documento.add(new Paragraph(" "));
             documento.add(new Paragraph("                                                          "+fecha1));
             documento.add(new Paragraph(" "));
             documento.add(new Paragraph("Nombre del huesped: "+x.getNombre()));
  
             documento.add(new Paragraph("Ciudad de origen: "+x.getCiudadOrigen()));
          
             documento.add(new Paragraph("Fecha de ingreso: "+ing2));
             
             documento.add(new Paragraph("Fecha de salida: "+sal2));
             
             documento.add(new Paragraph("Tipo de habitacion: "+x.getTipohab()));
             
             documento.add(new Paragraph("Costo de habitacion: "+costo));
           
             documento.add(new Paragraph("Estancia: "+x.getEstancia()));
             
             documento.add(new Paragraph("Total a pagar sin cargos extras: "+costo2));
             
             documento.add(new Paragraph("Total a pagar con cargos extras: "+x.getExtra()));
             for (int i = 0; i < servicios; i++) {
                    documento.add(new Paragraph(tiposervicios[i]+"=100"));
                }    
             documento.add(new Paragraph(" "));
             documento.add(new Paragraph(" "));
             documento.add(foto2);
             documento.add(new Paragraph("                                              ______________________________________"));
             documento.add(new Paragraph("                                                  Juan Carlos Ramirez (Gerente Ejecutivo)"));
             documento.add(new Paragraph("                                              ¡Muchas Gracias por elegirnos, vuelva pronto!"));
             documento.add(new Paragraph("                                                                     Salida Completada"));
             
     }
      catch ( Exception e )
     {
	     e.printStackTrace();
     }
     documento.close();
    }
    
}
