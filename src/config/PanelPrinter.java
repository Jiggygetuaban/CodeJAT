
package config;
import java.awt.*;
import java.awt.print.*;
import javax.swing.JPanel;

public class PanelPrinter implements Printable {

    private JPanel panelToPrint;

    public PanelPrinter(JPanel panelToPrint) {
        this.panelToPrint = panelToPrint;
    }

   @Override
public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
    if (pageIndex > 0) {
        return Printable.NO_SUCH_PAGE;
    }

    Graphics2D g2d = (Graphics2D) graphics;
    g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

    // Page settings (8.5 x 11 inches bond paper)
    pageFormat.setOrientation(PageFormat.PORTRAIT);
    Paper paper = new Paper();
    double width = 8.5 * 72;  // inches to points
    double height = 11 * 72;
    paper.setSize(width, height);
    paper.setImageableArea(36, 36, width - 72, height - 72);  // 1-inch margins
    pageFormat.setPaper(paper);

    // Calculate scale
    double panelWidth = panelToPrint.getWidth();
    double panelHeight = panelToPrint.getHeight();
    double imageableWidth = pageFormat.getImageableWidth();
    double imageableHeight = pageFormat.getImageableHeight();
    double scaleX = imageableWidth / panelWidth;
    double scaleY = imageableHeight / panelHeight;
    double scale = Math.min(scaleX, scaleY);

    // Apply scaling and positioning
    g2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
    g2d.scale(scale, scale);

    // Print the panel using Graphics2D
    panelToPrint.printAll(g2d);

    return Printable.PAGE_EXISTS;
}


    public void printPanel() {
        PrinterJob job = PrinterJob.getPrinterJob();
        job.setPrintable(this);
        if (job.printDialog()) {
            try {
                job.print();
            } catch (PrinterException ex) {
                ex.printStackTrace();
            }
        }
    }

}

