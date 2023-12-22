import ij.ImagePlus;
import ij.plugin.filter.PlugInFilter;
import ij.process.ByteProcessor;
import ij.process.ImageProcessor;

public class Create_New_Image implements PlugInFilter {
 
 ImagePlus im;

 public int setup(String arg, ImagePlus im) {
   this.im = im;
   return DOES_8G + NO_CHANGES;
 }

 public void run(ImageProcessor ip) {
   // obtain the histogram of ip:
   int[] hist = ip.getHistogram();
   int K = hist.length;
  
   // create the histogram image:
   ImageProcessor hip = new ByteProcessor(K, 100);
   hip.setValue(255); // white = 255
   hip.fill();
  
   // draw the histogram values as black bars in hip here,
   // for example, using hip.putpixel(u, v, 0)
   // ...
  
   // compose a nice title:
   String imTitle = im.getShortTitle();
   String histTitle = "Histogram of " + imTitle;
  
   // display the histogram image:
   ImagePlus him = new ImagePlus(imTitle, hip);
   him.show();
 }
}